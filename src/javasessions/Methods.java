package javasessions;

public class Methods {
	
	
	public int sum(int num1, int num2) {
		
		int result = num1+ num2;
		return result;
	}
	public float sub(float num1, int num2) {
		
		float result = num1- num2;
		return result;
	}
	public double mul(float num1, int num2) {
		
		double result = num1* num2;
		return result;
	}
	public float div(int num1, int num2) {
		float result = num1/ num2;
		return result;
		
		
	}
	public int min(int num1,int num2, int num3) {//7 2 1
		int minValue;
		if(num2 >= num1 && num3>=num1) {
			minValue = num1;
	
		}
		else if(num1>=num2 && num3>=num2) {
			minValue = num2;
			
		}
		else
			minValue = num3;
		
		return minValue;
	}
	
	//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
	public double cicleCircumference(float r){
		
		double circumference = 2 *3.14 *r;
		return circumference;
		
	}
	public double cicleArea(float r){
		
		double Area = 3.14 *r *r;
		return Area;
		
	}
	
	//Define two methods to print the maximum and the minimum number respectively among three numbers.
	public float maxValue( float arr1[]) {
		//float arr1[] = {3, 6.6f, 2, 7,1.1f,8};
		float maxNum = 0;
		for(int i =0; i<=arr1.length-1; i++)
		{
			if( arr1[i]>= maxNum) {
				maxNum = arr1[i];
			}
		}
		
		return maxNum;
	}
	
	//Def﻿ine a program to find out whether a given number is even or odd - return true/false.
	 public String checkNumber(float number) {
		 
		 if(number%2 == 0)
			 return " Given number is an even number";
		 else
			 return "Given number is an odd number";
		 
		  
	 }
	 
	 public boolean checkNumber(int number) {
		 
		 if(number%2 == 0)
			 return true;
		 else
			 return false;
		 
		  
	 }
	 
	/** A person is eligible to vote if his/her age is greater than or equal to 18.

	  Define a method to find out if he/she is eligible to﻿ vote. - return true/false**/
	 
	 public boolean voteEligiblity(int age) {
		 if(age >= 18)
			 return true;
		 else
			 return false;
		 
	 }
	 
	 /**
	  * 
	  * 7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade

91-100         AA

81-90          AB

71-80          BB﻿

61-70          BC

51-60          CD

41-50          DD

<=40          Fail
	  * */
	 
	 
	 
	public String gread( int marks) {
		
		if(marks >= 91 && marks <= 100)
			return "AA";
		else if(marks >= 81 && marks <= 90)
			return "AB";
		else if(marks >= 71 && marks <= 80)
			return "BB";
		else if(marks >= 61 && marks <= 70)
			return "BC";
		else if(marks >= 51 && marks <= 60)
			return "CD";
		else if(marks >= 41 && marks <= 50)
			return "DD";
		
		else
			return "Please enter the correcat marks....Fail";
		
		
		
	}
	
	

	public static void main(String[] args) {
		// Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method
		Methods obj = new Methods();// creating an object;
		System.out.println("Addition of two numbers is: "+obj.sum(122,100));
		System.out.println("Subtraction of two numbers is: "+obj.sub(102.2f,100));
		System.out.println("Multiplication of two numbers is: "+obj.mul(102.2f,100));
		System.out.println("Division of two numbers is: "+obj.div(200,10));
		System.out.println("Minimum value is: "+obj.min(23, 4, 66));
		System.out.println("Minimum value is: "+obj.min(4, 4, 3));
		System.out.println("circumference of a cicle is: "+obj.cicleCircumference(47.2f));
		System.out.println("circumference of a cicle is: "+obj.cicleArea(47.2f));
		
		float arr[] = {3, 6.6f, 2, 7,1.1f,8};
		System.out.println(" Max value is : "+obj.maxValue(arr));
		System.out.println();
		System.out.println(obj.checkNumber(9.0f));
		System.out.println();
		System.out.println(obj.checkNumber(9));
		
		System.out.println("Arti's age is 10;is she elegible for vote? \n"+obj.voteEligiblity(19));
		
		System.out.println(obj.gread(54));
		

	}
}
