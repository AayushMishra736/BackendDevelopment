package com.oops.exceptioninpolymorphism;

import java.io.IOException;
import java.sql.SQLException;

class ParentClass8 {
	void testMethod() throws IOException {
		throw new IOException("IO exception");
	}
}
public class ParentCheckedExceptionChildCheckedException extends ParentClass8 {
	@Override
	void testMethod() throws IOException {
		throw new IOException("IO exception");
	}

	public static void main(String[] args) {
		ParentClass8 pc = new ParentCheckedExceptionChildCheckedException();
		try {
			pc.testMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
