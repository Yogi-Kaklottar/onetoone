package com.main.java;
import javax.persistence.*;


@Entity
public class Dept1 {
	  
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int did;
	 
	 @Column
	 private String dname;
	 
	 public Dept1() {
		super();
	}

	public Dept1(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept1 [getDid()=" + getDid() + ", getDname()=" + getDname() + "]";
	}
	 
	 
	 
	 
}
