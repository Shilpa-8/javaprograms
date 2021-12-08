package com.xworkz.crud.dao.gym;

public class GymInterface {
	
	public static void main(String[] args) {
		GymDAO gymDAO = new GymDAO();
		gymDAO.save("Moveza Fitness, Rjajinagar");
		gymDAO.save("Quadz Fitness");
		gymDAO.save("F45 Training");
		gymDAO.save("Mania Fitness Bangalore");
		gymDAO.save("Absolute Fitness, Rajajinagar");
		
		System.out.println("Comparing values");
		boolean found = gymDAO.find("Quadz Fitness");
		boolean found1 = gymDAO.find("Mania fitness Bangalore");
		System.out.println(found + "\n" + found1);
		
		System.out.println("Comparing values and neglating cases");
		found = gymDAO.findByIgnoringCases("Moveza Fitness, Rajajinagar");
		found1 = gymDAO.findByIgnoringCases("Absolute fitness, Rajajinagar");
		System.out.println(found + "\n" + found1);
		
		System.out.println("Comparing values, neglating cases and spaces");
		found = gymDAO.findByIgnoringCasesAndSpaces("Absolute Fitness Bangalore");
		found = gymDAO.findByIgnoringCasesAndSpaces("Moveza Fitness,Sahakara Nagar");
		System.out.println(found + "\n" + found1);
	}
}


