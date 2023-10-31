package com.Abhishek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String myAddress;
	private String myState;
	private int myZip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMyAddress() {
		return myAddress;
	}
	public void setMyAddress(String myAddress) {
		this.myAddress = myAddress;
	}
	public String getMyState() {
		return myState;
	}
	public void setMyState(String myState) {
		this.myState = myState;
	}
	public int getMyZip() {
		return myZip;
	}
	public void setMyZip(int myZip) {
		this.myZip = myZip;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", fname=" + fname + ", lname=" + lname + ", myAddress=" + myAddress + ", myState="
				+ myState + ", myZip=" + myZip + "]";
	}
	
}
