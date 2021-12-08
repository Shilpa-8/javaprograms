package com.xworkz.crud.dao.pg;

public class PgDAOInterface {

	public static void main(String[] args) {
				PgDAO pgDAO = new PgDAO();
				pgDAO.save("Bhuvaneshwari PG");
				pgDAO.save("Gajanana PG");
				pgDAO.save("Deepika PG");
				pgDAO.save("Akshatha PG");
				pgDAO.save("Kushi PG ");
				
				System.out.println("Comparing values");
				boolean found = pgDAO.find("Gajananai PG");
				boolean found1 = pgDAO.find("Akshatha pg");
				System.out.println(found + "\n" + found1);
				
				System.out.println("Comparing values and neglating cases");
				found = pgDAO.findPgByIgnoringCases("Deepika PG");
				found1 = pgDAO.findPgByIgnoringCases("Akshatha PG");
				System.out.println(found + "\n" + found1);
				
				System.out.println("Comparing values, neglating cases and spaces");
				found = pgDAO.findPgByIgnoringCasesAndSpaces("Kushi PG ");
				found1 = pgDAO.findPgByIgnoringCasesAndSpaces("Kushi PG");
				System.out.println(found + "\n" + found1);
				}
		}
	
	


