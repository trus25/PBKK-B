package com.farhan.profile;

public class Manager {
	
	private int id;
	private String nama;
	private String alamat;
	private String gender;
	private int tahunmasuk;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int id, String nama, String alamat, String gender, int tahunmasuk) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.gender = gender;
		this.tahunmasuk = tahunmasuk;
	}
	
	public int getId() {
		return id;
	}
	
	
	
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
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

	public int getTahunmasuk() {
		return tahunmasuk;
	}

	public void setTahunmasuk(int tahunmasuk) {
		this.tahunmasuk = tahunmasuk;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", gender=" + gender + ", tahunmasuk="
				+ tahunmasuk + "]";
	}
	
	
}
