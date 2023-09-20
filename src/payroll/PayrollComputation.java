package payroll;

import java.util.Scanner;

public class PayrollComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
		Scanner employeeNo = new Scanner(System.in);
		String employeeNumber = employeeNo.next();

		System.out.println("ENTER THE EMPLOYEE NAME");
		Scanner employeeNa = new Scanner(System.in);
		String employeeName = employeeNa.nextLine();
		System.out.println("ENTER THE EMPLOYEE DESIGNATION");
		Scanner design = new Scanner(System.in);
		String designation = design.nextLine();
		System.out.println("ENTER THE NUMBER OF DAYS WORKED");
		Scanner workDays = new Scanner(System.in);
		int daysWorked = workDays.nextInt();
		System.out.println("ENTER THE PAY RATE");
		Scanner rate = new Scanner(System.in);
		double payRate = rate.nextDouble();
		System.out.println("ENTER THE GENERATION DATE");
		Scanner date = new Scanner(System.in);
		String generationDate = date.nextLine();
		
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
	}

	}

