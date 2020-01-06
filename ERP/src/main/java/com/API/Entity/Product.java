package com.API.Entity;

import javax.persistence.*;

@Entity(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaSP")
	int maSP;
	@Column(name = "TenSP")
	String tenSP;
	@Column(name = "DonGia")
	String donGia;
	@Column(name = "DonVi")
	String donVi;
	@Column(name = "SoLuong")
	int soLuong;
	@Column(name = "Size")
	String Size;
	@Column(name = "PhanLoai")
	String phanLoai;
	public Product() {
		super();
	}
	public Product(int maSP, String tenSP, String donGia, String donVi, int soLuong, String size, String phanLoai) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.donVi = donVi;
		this.soLuong = soLuong;
		Size = size;
		this.phanLoai = phanLoai;
	}
	
	public Product(int maSP) {
		this.maSP = maSP;
	}

	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getDonGia() {
		return donGia;
	}

	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getPhanLoai() {
		return phanLoai;
	}
	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}
	

	
	
	

}
