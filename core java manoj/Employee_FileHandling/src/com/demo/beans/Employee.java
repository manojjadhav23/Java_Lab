package com.demo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
	private int id;
	private String name;
	private double salary;
	private double bonus;
	
	public Employee() {
		super();
	}
	

	public Employee(int id) {
		super();
		this.id = id;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		System.out.println("in employee equals method "+this.id+"-----"+((Employee)obj).id);
		return id == other.id;
	}


	public Employee(int id, String name, double salary, double bonus) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
