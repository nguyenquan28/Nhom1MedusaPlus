package com.API.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity(name = "orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int maDH;
	String tenHD;
	Date ngayXuatHD;
	String tienTe;
	
}
