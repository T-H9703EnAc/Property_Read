package com.app.sample1;

import java.util.ResourceBundle;

/**
 * ResourceBundleを使用して
 * プロパティファイルを読み込む方法
 *
 */
public class ResourceBundlePattern {
	public void excute() {
		ResourceBundle rb = ResourceBundle.getBundle("test");

		System.out.println(rb.getString("id"));
		System.out.println(rb.getString("pass"));
	}
}
