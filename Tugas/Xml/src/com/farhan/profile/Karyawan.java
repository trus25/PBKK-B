package com.farhan.profile;


public class Karyawan {
	
	private int id;
	private String nama;
	private String alamat;
	private String gender;
	private int tahunmasuk;
	private int gaji;
	
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Karyawan(int id, String nama, String alamat, String gender, int tahunmasuk, int gaji) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.gender = gender;
		this.tahunmasuk = tahunmasuk;
		this.gaji = gaji;
	}

	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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




	public int getGaji() {
		return gaji;
	}




	public void setGaji(int gaji) {
		this.gaji = gaji;
	}




	@Override
	public String toString() {
		return "Karyawan [id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", gender=" + gender + ", tahunmasuk="
				+ tahunmasuk + ", gaji=" + gaji + "]";
	}

	
	
	
}
