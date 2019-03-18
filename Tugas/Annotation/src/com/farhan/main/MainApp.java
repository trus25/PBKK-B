package com.farhan.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.farhan.profile.Karyawan;
import com.farhan.profile.Manager;
import com.farhan.profile.Profiles;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("ProfileAnnotation.xml"); 
		
		System.out.println("Profile Login");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Masukkan 1 untuk Manager \nMasukkan 2 untuk Karyawan");
		int choice = myObj.nextInt();  // Read user input
		
		
		if(choice==1) {
			Profiles profile= context.getBean("manager", Profiles.class);
			Manager iniManager = (Manager) profile;
			System.out.println("Profile: "+iniManager.getProfileName());
			System.out.println(iniManager.toString());
		}
		else if(choice==2) {
			Profiles profile = context.getBean("karyawan", Profiles.class);
			Karyawan iniKaryawan = (Karyawan) profile;
			System.out.println("Profile: "+iniKaryawan.getProfileName());
			System.out.println(iniKaryawan.toString());
		}
		else {
			System.out.println("Input salah");
		}
		
		
		context.close();
	}
}
