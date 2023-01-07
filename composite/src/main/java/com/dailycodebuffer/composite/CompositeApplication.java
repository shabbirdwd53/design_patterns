package com.dailycodebuffer.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CompositeApplication.class, args);
		Department salesDepartment = new SalesDepartment(
				1, "Sales department");
		Department financialDepartment = new FinancialDepartment(
				2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(
				3, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();
	}

}
