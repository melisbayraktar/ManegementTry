package csd;

import csd.EmployeeManagement;
import csd.PartTimeWorker;
import csd.Employee;

import java.util.Date;
import java.util.Scanner;

import marathon2.Accounting;
import marathon2.FullTimeWorker;

public class MenuTest {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		boolean cont = true;
		EmployeeManagement emp = new EmployeeManagement();
		Accounting acc = new Accounting();

		emp.personCreation("Marek", "Hamsik", 35000, new Date(2021, 6, 10), null, "Full Time",45);
		emp.personCreation("Anthony", "Nwakaeme", 20000, new Date(2018, 9, 1), new Date(2022, 5, 10), "Full Time",45);
		emp.personCreation("Fatih", "Tekke", 1800, new Date(2008, 1, 1), new Date(2015, 6, 6), "Full Time",45);
		emp.personCreation("Burak", "Tosun", 1000, new Date(2021, 10, 10), null, "Full Time",45);
		emp.personCreation("Oscar", "Cardozo", 8000, new Date(2015, 3, 4), null, "Full Time",45);
		emp.personCreation("Jose", "Sosa", 15000, new Date(2018, 7, 11), new Date(2021, 2, 3), "Full Time",45);
		emp.personCreation("Mountasir", "Lahtimi", 5000, new Date(2018, 7, 11), null, "Full Time",45);
		emp.personCreation("Huseyin", "Cimsir", 1000, new Date(2014, 3, 6), null, "Part Time", 18);
		emp.personCreation("Ibrahima", "Yattara", 1000, new Date(2022, 2, 2), null, "Part Time", 20);
		emp.personCreation("Alan", "Zinho", 1000, new Date(2015, 7, 9), new Date(2020, 5, 5), "Part Time", 25);
		
		
		while (cont) {
			System.out.println("\n#########################################################");
			System.out.println("################## Company Management System #################");
			System.out.println("#########################################################");
			System.out.println("################## Press 1 to Display Employers #################");
			System.out.println("################## Press 2 to Calculate Employer Salary #################");
			System.out.println("################## Press 3 to Show Working Hours #################");
			System.out.println("################## Press 4 to Sort List By Hiring Date #################");
			System.out.println("################## Press 5 to Sort List By Name #################");
			System.out.println("################## Press 6 to Sort List By ID #################");
			System.out.println("################## Press 7 to Pay Salaries #################");
			System.out.println("#########################################################");

			int choice = a.nextInt();

			switch (choice) {

			case 1:

				emp.displayList();
				break;

			case 2:

				acc.salaryCalculation();

				break;

			case 3:

				acc.workHoursList();

				break;

			case 4:

				emp.sortingByDate();

				break;

			case 5:
				emp.sortingByName();

				break;

			case 6:

				emp.sortingById();

				break;

			case 7:

				emp.salaryPay();

				break;
			case 0:
				cont = false;
			default:
				System.out.println("Hatalı giriş yaptınız, yeniden deneyin.");
			}
		}
	}
}
