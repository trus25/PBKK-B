package com.farhan.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.farhan.profile.Karyawan;
import com.farhan.profile.Manager;
import com.farhan.profile.Profiles;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("Java Config");
		System.out.println("Profile Login");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Masukkan 1 untuk Manager \nMasukkan 2 untuk Karyawan");
		int choice = myObj.nextInt();  // Read user input
		
		
		if(choice==1) {
			Profiles profile = context.getBean("Manager", Profiles.class);
			Manager inimanager = (Manager) profile;
			System.out.println("Tipe Profile: "+inimanager.getProfileName());
			System.out.println(inimanager.toString());
		}
		else if(choice==2) {
			Profiles profile = context.getBean("Karyawan", Profiles.class);
			Karyawan inikaryawan = (Karyawan) profile;
			System.out.println("Tipe Profile: "+inikaryawan.getProfileName());
			System.out.println(inikaryawan.toString());
		}
		else {
			System.out.println("Input Salah");
		}

	
		context.close();
	}

}
