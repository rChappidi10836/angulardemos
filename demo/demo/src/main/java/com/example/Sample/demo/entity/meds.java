package com.example.Sample.demo.entity;

//import javax.persistence.*;

import jakarta.persistence.*;

@Entity

public class meds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    String name;

   
    double mrp;

   
    double sp;

    
    int discount;

    
    String avail;

    
    public String getAvail() {
		return avail;
	}


	public void setAvail(String avail) {
		this.avail = avail;
	}

	String images;

    public meds(){
    	
    }
    
    
	public meds(int id, String name, double mrp, double sp, int discount, String avail, String images) {
		super();
		this.id = id;
		this.name = name;
		this.mrp = mrp;
		this.sp = sp;
		this.discount = discount;
		this.avail = avail;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getSp() {
		return sp;
	}

	public void setSp(double sp) {
		this.sp = sp;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

    // getters and setters
    
}