package com.API.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int maKH;
	String tenKH;
	String diaChi;
	String sdt;
	String soThue;
	String stk;
	String nganHang;
	String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		super();
	}
	
	public Customer(int maKH, String tenKH, String diaChi, String sdt, String soThue, String stk, String nganHang,
			String email) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.soThue = soThue;
		this.stk = stk;
		this.nganHang = nganHang;
		this.email = email;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getSoThue() {
		return soThue;
	}
	public void setSoThue(String soThue) {
		this.soThue = soThue;
	}
	public String getStk() {
		return stk;
	}
	public void setStk(String stk) {
		this.stk = stk;
	}
	public String getNganHang() {
		return nganHang;
	}
	public void setNganHang(String nganHang) {
		this.nganHang = nganHang;
	}
	
}
