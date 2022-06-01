package com.oops.exceptionininheritance;

import java.sql.SQLException;

class Parent1{
	void method1() throws SQLException{
		throw new SQLException("SQL Exception");
	}
}

public class ParentThrowingCheckedChildNotMandatory extends Parent1{
	@Override
	void method1() {
	    System.out.println("Method from child class...");
	    };
	public static void main(String[] args) {
		Parent1 pe = new ParentThrowingCheckedChildNotMandatory();
		try {
			pe.method1();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
