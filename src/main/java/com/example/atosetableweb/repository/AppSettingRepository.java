package com.example.atosetableweb.repository;

import com.example.atosetableweb.model.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppSettingRepository extends JpaRepository<AppSetting,Long> {
   List<AppSetting> findBySmtpUsername(String smtpUsername);

}
