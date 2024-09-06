package com.example.atosetableweb;

import com.example.atosetableweb.service.AppSettingService;
import com.example.atosetableweb.service.RoleUserService;
import com.example.atosetableweb.service.SchoolService;
import com.example.atosetableweb.service.UserService;
import com.example.atosetableweb.service.dto.AppSettingDTO;
import com.example.atosetableweb.service.dto.RoleUserDTO;
import com.example.atosetableweb.service.dto.SchoolDTO;
import com.example.atosetableweb.service.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor

@SpringBootApplication
public class AtosEtableWebApplication implements CommandLineRunner {
	private final AppSettingService appSettingService;
	private final SchoolService schoolService;
	private final RoleUserService roleUserService;
	private final UserService userService;

	private final BCryptPasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(AtosEtableWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AppSettingDTO appSettingDTO = new AppSettingDTO();
		appSettingDTO.setSmtpPassword("password");
		appSettingDTO.setSmtpPort(8080L);
		appSettingDTO.setSmtpUsername("username");
		appSettingDTO.setSmtpServer("host");
		System.out.println(appSettingDTO);
		AppSettingDTO settingDTO = appSettingService.initApp(appSettingDTO);
//
		SchoolDTO schoolDTO = new SchoolDTO();
		schoolDTO.setName("UPB");
		schoolDTO.setLogo("https://www.google.com/url?sa=i&url=https%3A%2F%2Fville-saint-gobain.fr%2Fpage-daccueil%2Flogo-ecole-2%2F&psig=AOvVaw2RGcw1mpgHA2w8aO9S6gAE&ust=1725357364930000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCIit0Jr_o4gDFQAAAAAdAAAAABAE");
		schoolDTO.setAppSetting(settingDTO);
		SchoolDTO school = schoolService.initSchool(schoolDTO);

		/*RoleUserDTO roleUserDTO = new RoleUserDTO();
		RoleUserDTO roleUserDTO2 = new RoleUserDTO();
		RoleUserDTO roleUserDTO3 = new RoleUserDTO();
		roleUserDTO.setRole("ADMIN");
		roleUserDTO2.setRole("USER");
		roleUserDTO3.setRole("OTHER");
		List<RoleUserDTO> roleUserDTOS = List.of(roleUserDTO, roleUserDTO2, roleUserDTO3);
		roleUserDTOS = roleUserService.initRoles(roleUserDTOS);

		/* Set<RoleUserDTO> roleUserDTOSet = new HashSet<>();
		roleUserDTOSet.add(roleUserDTOS.get(0));
		Set<RoleUserDTO> roleUserDTOSet2 = new HashSet<>();
		roleUserDTOSet2.add(roleUserDTOS.get(1));
		Set<RoleUserDTO> roleUserDTOSet3 = new HashSet<>();
		roleUserDTOSet3.add(roleUserDTOS.get(2));
*/
		String password = passwordEncoder.encode("admin");

		UserDTO userDTO = new UserDTO();
		userDTO.setPseudo("admin");
		userDTO.setPassword(password);
		userDTO.setCreationDate(Date.from(Instant.now()));
		//userDTO.setSchool(school);
		//userDTO.setRoleUser(roleUserDTOSet);
		userService.save(userDTO);

		String password2 = passwordEncoder.encode("user");

		UserDTO userDTO2 = new UserDTO();
		userDTO2.setPseudo("Dom");
		userDTO2.setPassword(password2);
		userDTO2.setCreationDate(Date.from(Instant.now()));
		userService.save(userDTO2);
		//userDTO2.setSchool(school);
		//userDTO2.setRoleUser(roleUserDTOSet2);

		/*UserDTO userDTO3 = new UserDTO();
		userDTO3.setPseudo("bahus");
		userDTO3.setPassword("bakus");
		userDTO3.setCreationDate(Date.from(Instant.now()));
		userDTO3.setSchool(school);
		userDTO3.setRoleUser(roleUserDTOSet3);

		userService.initUser(List.of(userDTO, userDTO2, userDTO3));



		// INFORMATION D'UN ETUDIANT
		/*StudentDTO student = new StudentDTO();
		student.setMatricule("12600W");
		student.setNom("John");
		student.setPrenom("Doe");
		student.setClasse("licence1");
		student.setTelephone("0707070707");
		student.setDateNaissance(java.sql.Date.valueOf("2000-01-01"));
		student.setVille("Paris");

			//  ****** INFORMATION D'UN ETUDIANT*****
		StudentDTO student1 = new StudentDTO();
		student1.setMatricule("12600W");
		student1.setNom("John");
		student1.setPrenom("Doe");
		student1.setClasse("master");
		student1.setDateNaissance(java.sql.Date.valueOf("2000-01-01"));
		student1.setVille("Paris");

		studentService.save(student);
		studentService.save(student1);


		//***************Création d'un nouvel teacher*******
		TeacherDTO teacher = new TeacherDTO();
		teacher.setNom("Smith");
		teacher.setPrenom("Jane");
		teacher.setVacant(true);
		teacher.setMatiereEnseigne("Mathematics");
		teacher.setProchainCours("Calculus");
		teacher.setSujetProchaineReunion("Curriculum Development");


		TeacherDTO teacher2 = new TeacherDTO();
		teacher2.setNom("AKE");
		teacher2.setPrenom("LOULOU");
		teacher2.setVacant(true);
		teacher2.setMatiereEnseigne("Mathematics");
		teacher2.setProchainCours("Calculus");
		teacher2.setSujetProchaineReunion("Curriculum Development");


		TeacherDTO teacher3 = new TeacherDTO();
		teacher3.setNom("Djenabou");
		teacher3.setPrenom("Diallo");
		teacher3.setVacant(true);
		teacher3.setMatiereEnseigne("Lv2");
		teacher3.setProchainCours("Physique");
		teacher3.setSujetProchaineReunion(" Development Personel");
		teacher3.setTelephone("0102030404");
		teacher3.setVille("Man");

		teacherService.save(teacher);
		teacherService.save(teacher2);
		teacherService.save(teacher3);
	} */
	}
}
