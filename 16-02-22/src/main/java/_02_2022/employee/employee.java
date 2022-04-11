package _02_2022.employee;

public class employee
{

	public static void main(String[] args) 
	{
		//package com.classAndObjects;

		/**
		 * class: it is a template to the object/instance
		 * 
		 * object/instance: it is a physical entity, which have memory allocation in RAM(Heap).
		 *
		 */	
				employee employee1 = new employee();		
				
				/**
				 * from line 16 in the program
				 * 
				 * 'Employee': is a class name
				 * 
				 * 'employee1': it is an object reference
				 * 
				 * '=': it is an assignment operator
				 * 
				 * 'new': it is a keyword, this keyword help us to allocate memory(RAM(Heap)) to the object
				 * 
				 * 'Employee()': it is a constructor, used to initialize an object.
				 */
				
				System.out.println(employee1.hashCode());
				
				employee employee2 = new employee();
				
				System.out.println(employee2.hashCode());
				
		    }
			
		}