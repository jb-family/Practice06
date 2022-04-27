package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		
		User[] userArray = new User[3];
		
		User cust1 = new Customer("jws", "j1234", "정우성",1000);
		User cust2 = new Customer("yjs", "y2345", "이효리",2000);
		User emp1 = new Employee("master", "m7788", "운영자",500000);

		userArray[0] = cust1;
		userArray[1] = cust2;
		userArray[2] = emp1;
		
		
		
		  for(int i = 0; i < userArray.length; i++) {
			  userArray[i].showInfo();
			  }
		 
		
	}

}
