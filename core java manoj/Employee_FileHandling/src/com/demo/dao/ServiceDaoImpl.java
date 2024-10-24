package com.demo.dao;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.Exception.EmployeeNotFound;
import com.demo.beans.Employee;

public class ServiceDaoImpl implements ServiceDao{
	
	static List<Employee> lst; 
	static {
		lst=new ArrayList<>();
	}

	@Override
	public void ReadFile(String fname) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));){
			while(true) {
			Employee e = (Employee) ois.readObject();
			lst.add(e);
			}
		}catch(EOFException exp) {
			System.out.println("File Read...");
		} 
		catch (IOException e) {
			System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public boolean AddNewEmployee(Employee e) {
		return lst.add(e);
		
	} 

	@Override
	public List<Employee> GetAll() {
		return lst;
	}

	@Override
	public void WriteFile(String fname) {
		try(BufferedWriter oos = new BufferedWriter(new FileWriter(fname));){
			for(Employee e:lst) {
				oos.write(e.getId()+" , "+e.getName()+" , "+e.getSalary()+" , "+e.getBonus()+"\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean RemoveEmployee(int id) throws EmployeeNotFound {
		boolean status= lst.remove(new Employee(id));
		if(status)
			return status;
		throw new EmployeeNotFound("Not Found"+id);
	}

	@Override
	public boolean UpdateEmployee(int id, double salary) throws EmployeeNotFound {
		int pos=lst.indexOf(new Employee(id));
		if(pos!=-1) {
			Employee e=lst.get(pos);
			e.setSalary(salary);
			return true;
		}
		throw new EmployeeNotFound("Not Found"+id);
	}

	

}