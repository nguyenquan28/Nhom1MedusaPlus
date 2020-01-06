package com.API.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int license;
	Date dateSales;
	String khachHang;
	String nhanVienBan;
	String tenCuaHang;
	String maCa;
	String maSP;
	int soLuong;
	String tongTien;

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public Date getDateSales() {
		return dateSales;
	}

	public void setDateSales(Date dateSales) {
		this.dateSales = dateSales;
	}

	public String getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(String khachHang) {
		this.khachHang = khachHang;
	}

	public String getNhanVienBan() {
		return nhanVienBan;
	}

	public void setNhanVienBan(String nhanVienBan) {
		this.nhanVienBan = nhanVienBan;
	}

	public String getTenCuaHang() {
		return tenCuaHang;
	}

	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}

	public String getMaCa() {
		return maCa;
	}

	public void setMaCa(String maCa) {
		this.maCa = maCa;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTongTien() {
		return tongTien;
	}

	public void setTongTien(String tongTien) {
		this.tongTien = tongTien;
	}

	public Sales(int license, Date dateSales, String khachHang, String nhanVienBan, String tenCuaHang, String maCa,
			String maSP, int soLuong, String tongTien) {
		super();
		this.license = license;
		this.dateSales = dateSales;
		this.khachHang = khachHang;
		this.nhanVienBan = nhanVienBan;
		this.tenCuaHang = tenCuaHang;
		this.maCa = maCa;
		this.maSP = maSP;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}

	public Sales() {
		super();
	}

}
