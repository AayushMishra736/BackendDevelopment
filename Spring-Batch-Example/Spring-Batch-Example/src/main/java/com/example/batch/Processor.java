package com.example.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.Model.User;


@Component
public class Processor implements ItemProcessor<User, User>{
	
	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("101","IT");
		DEPT_NAMES.put("102","Technology");
		DEPT_NAMES.put("103","Sales");
		DEPT_NAMES.put("104","HR");
	}

	@Override
	public User process(User user) throws Exception {
		String deptCode = user.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		user.setDept(dept);
		System.out.println(String.format("Converted from [%s] to [%s]"  ,deptCode, dept));
		return user;
	}

	

}
