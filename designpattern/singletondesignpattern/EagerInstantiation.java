package com.designpattern.singletondesignpattern;

public class EagerInstantiation {

private static EagerInstantiation obj = new EagerInstantiation();

private EagerInstantiation() {}

public static EagerInstantiation getInstance() {
	return obj;
}

     }
