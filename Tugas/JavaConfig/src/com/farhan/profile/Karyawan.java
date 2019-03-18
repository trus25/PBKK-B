package com.farhan.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Karyawan implements Profiles {
	
	private int id;
	private String alamat;
	private String gender;
	private int tahunmasuk;
	
	
	public Karyawan() {
		super();
	}
	
	@Autowired
	public Karyawan(@Value("${KaryawanProf.Id}")int id,
					 @Value("${KaryawanProf.Al}")String alamat,
					 @Value("${KaryawanProf.Gd}") String gender,
					 @Value("${KaryawanProf.Tm}") int tahunmasuk) 
	{		
		super();
		this.id = id;
		this.alamat = alamat;
		this.gender = gender;
		this.tahunmasuk = tahunmasuk;
	}
	
	
	
	@Override
	public String getProfileName() {
		return "karyawan";
	}

	@Override
	public int getProfileTahunmasuk() {
		return tahunmasuk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Id=" + id + "\tAlamat=" + alamat + "\tGender=" + gender + "\tTahunMasuk=" + tahunmasuk;
	}

	
	
}
