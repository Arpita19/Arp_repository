package com.test.service;

import com.test.model.ErrorExample;


public class HelloWorld {
	public static void main(String[] args)
	{
		System.out.println("Hello,World!");
		ErrorExample errorExample = new ErrorExample();
		errorExample.printMyName();
		String s = "Hello!!!";
		System.out.println(s);
	}

}
