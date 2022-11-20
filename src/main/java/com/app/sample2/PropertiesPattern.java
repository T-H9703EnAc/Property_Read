package com.app.sample2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Propertiesを使用して
 * プロパティファイルを読み込む方法
 *
 */
public class PropertiesPattern {
	public void excute() {
		Properties properties = new Properties();

		//プロパティファイルのパスを指定する
		String strpass = Paths.get("").toAbsolutePath().toString() +"\\src\\main\\resources\\test.properties";

		try {
			InputStream istream = new FileInputStream(strpass);
			properties.load(istream);
			System.out.println(properties.getProperty("id"));
			System.out.println(properties.getProperty("pass"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
