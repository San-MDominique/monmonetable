package Security;

import com.example.atosetableweb.model.RoleUser;
import com.example.atosetableweb.model.User;
import com.example.atosetableweb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DomainUserService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {

        System.out.println("tes loadUserByUsername");

        final Optional<User> user = userRepository.findByPseudo(username);
        if (user.isEmpty()) {
            throw new IllegalArgumentException("User Not Found");
        }
        final List<GrantedAuthority> grantedAuthorities =user.get()
                .getRoleUser()
                .stream()
                .map(RoleUser::getRole)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return user.map(userRecover -> org.springframework.security.core.userdetails.User.builder()
                .username(userRecover.getPseudo())
                .password(userRecover.getPassword())
                .authorities(grantedAuthorities)
                .build()).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }
}
