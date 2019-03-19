package com.farhan.main;
import com.farhan.profile.Karyawan;
import com.farhan.profile.Manager;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Scanner;
@SuppressWarnings("deprecation")
public class MainApp {
	public static void main (String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Masukkan 1 untuk list manager \nMasukkan 2 untuk list karyawan");
		int choice = myObj.nextInt();  // Read user input
		
		if(choice == 1) {
			ClassPathXmlApplicationContext
			context1 = new ClassPathXmlApplicationContext("Managerbean.xml");
			Manager manager = context1.getBean("M1",Manager.class);
			System.out.println(manager.toString());
			context1.close();
		}
		
		else if(choice == 2) {
			ClassPathXmlApplicationContext
			context2 = new ClassPathXmlApplicationContext("Karyawanbean.xml");
			for(int i=1;i<6;i++) {
				Karyawan karyawan = context2.getBean("K"+Integer.toString(i),Karyawan.class);
				System.out.println(karyawan.toString());
			}
			context2.close();
		}
		
		else {
			System.out.println("Input Salah");
		}
		
		
	}
}
