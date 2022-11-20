package com.app;

import com.app.sample1.ResourceBundlePattern;
import com.app.sample2.PropertiesPattern;
import com.app.sample3.PropertiesWritePattern;
import com.app.sample4.PropertiesWriteXMLPattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("####################");
		new ResourceBundlePattern().excute();
		System.out.println("####################");
		new PropertiesPattern().excute();
		new PropertiesWritePattern().excute();
		new PropertiesWriteXMLPattern().excute();
	}

}
