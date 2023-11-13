package payroll;

import java.util.Scanner;

public class PayrollComputation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
		String employeeNumber = in.next();

		System.out.println("ENTER THE EMPLOYEE NAME");
		String employeeName = in.next();
		System.out.println("ENTER THE EMPLOYEE DESIGNATION");
		String designation = in.next();
		System.out.println("ENTER THE NUMBER OF DAYS WORKED");
		int daysWorked = in.nextInt();
		System.out.println("ENTER THE PAY RATE");
		double payRate = in.nextDouble();
		System.out.println("ENTER THE GENERATION DATE");
		String generationDate = in.next();
		
		double basicPay = daysWorked * payRate;
		double pF = basicPay / 10;
		final double profTax = 0.2 * basicPay;
		double totalDeduct = profTax + pF;
		double netPay = basicPay - totalDeduct;
		System.out.println("");
		System.out.println("\t\t\t SHREE KRISHNA CHEMIST AND DRUGGIST");
		System.out.println("\t\t\t\t SALARY MONTH 9 2013");
		System.out.println("");
		System.out.print("EMP. NO.: " + employeeNumber);
		System.out.print("\t\t EMP. NAME: " + employeeName);
		System.out.println("\t\t DESIGNATION: " + designation);
		System.out.print("DAYS WORKED: " + daysWorked);
		System.out.print("\t\t PAY RATE: " + (int)payRate);
		System.out.println("\t\t\t GEN. DATE: " + generationDate);
		System.out.println("______________________________________________________________________________________");
		System.out.print("EARNINGS");
		System.out.print("\t\tAMOUNT(RS.)");
		System.out.print("\t\tDEDUCTIONS" );
		System.out.println("\t\tAMOUNT(RS.)");
		System.out.println("______________________________________________________________________________________");
		System.out.print("BASIC PAY");
		System.out.print("\t\t" + (int)basicPay);
		System.out.print("\t\t\tP.F. " );
		System.out.println("\t\t\t" + (int)pF);
		System.out.print("\t\t\t\t\t\tPROF TAX " );
		System.out.println("\t\t" + (int)profTax);
		System.out.println("______________________________________________________________________________________");
		System.out.print("GROSS EARN");
		System.out.print("\t\t" + (int)basicPay);
		System.out.print("\t\t\tTOTAL DEDUCT. " );
		System.out.println("\t\t" + (int)totalDeduct);
		System.out.print("\t\t\t\t\t\tNET PAY " );
		System.out.println("\t\t" + (int)netPay);
		System.out.println("______________________________________________________________________________________");
		in.close();
	}

	}

