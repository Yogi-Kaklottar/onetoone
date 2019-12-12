package com.main.java;
import javax.persistence.*;


@Entity
public class Emp1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column
	private String ename;
	
	@Column
	private String deg;
	
	@Column
	private double salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Dept1 d;

	public Emp1() {
		super();
		
	}

	public Emp1(int eid, String ename, String deg, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deg = deg;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Dept1 getD() {
		return d;
	}

	public void setD(Dept1 d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Emp1 [getEid()=" + getEid() + ", getEname()=" + getEname() + ", getDeg()=" + getDeg() + ", getSalary()="
				+ getSalary() +  "]";
	}
	
	
	
	
}
