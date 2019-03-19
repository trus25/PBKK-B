package com.farhan.main;
import com.farhan.profile.Karyawan;
import com.farhan.profile.Manager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Scanner;
public class MainApp {
	public static void main (String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Masukkan 1 untuk list manager \nMasukkan 2 untuk list karyawan");
		int choice = myObj.nextInt();  // Read user input
		
		if(choice == 1) {
			Resource resource = new ClassPathResource("Managerbean.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
				Manager emps= (Manager) factory.getBean("M1");
				System.out.println(emps.toString());
		}
		
		else if(choice == 2) {
			Resource resource = new ClassPathResource("Karyawanbean.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			for(int i=1;i<6;i++) {
				Karyawan emps= (Karyawan) factory.getBean("K"+Integer.toString(i));
				System.out.println(emps.toString());
			}
		}
		
		else {
			System.out.println("Input Salah");
		}
		
		
	}
}
