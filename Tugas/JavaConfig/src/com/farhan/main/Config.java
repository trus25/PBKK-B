package com.farhan.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.farhan.profile.Karyawan;
import com.farhan.profile.Manager;
import com.farhan.profile.Profiles;

@Configuration
@PropertySource("classpath:Profile.Properties")
public class Config {
	
	@Bean
	public Profiles Manager(
			 @Value("${ManagerProf.Id}") int id,
			 @Value("${ManagerProf.Al}") String alamat,
			 @Value("${ManagerProf.Gd}") String gender,
			 @Value("${ManagerProf.Tm}") int tahunmasuk) {
		
		Manager iniManager = new Manager(id,alamat,gender,tahunmasuk);
		return iniManager;
	}
	@Bean
	public Profiles Karyawan(
			 @Value("${KaryawanProf.Id}") int id,
			 @Value("${KaryawanProf.Al}") String alamat,
			 @Value("${KaryawanProf.Gd}") String gender,
			 @Value("${KaryawanProf.Tm}") int tahunmasuk) {
		
		Karyawan iniKaryawan = new Karyawan(id,alamat,gender,tahunmasuk);
		return iniKaryawan;
	}
}