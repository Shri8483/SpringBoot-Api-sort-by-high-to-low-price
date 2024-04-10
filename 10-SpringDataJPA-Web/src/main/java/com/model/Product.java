package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int pid;
	private String pname;
	private double pprice;
	private String pcategory;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pcategory=" + pcategory + "\n----------------------------------------------------------------------------------";
	}

	public Product(int pid, String pname, double pprice, String pcategory) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pcategory = pcategory;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
