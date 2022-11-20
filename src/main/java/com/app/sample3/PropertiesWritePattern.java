package com.app.sample3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesWritePattern {
	public void excute() {
		Properties properties = new Properties();

		//プロパティファイルのパスを指定する
		String strpass = Paths.get("").toAbsolutePath().toString() + "\\src\\main\\resources\\test2.properties";
		// プロジェクト直下に作成
		//String strpass = "test2.properties";
		try {
			// 書き込み
			properties.setProperty("id", "SAMURAI2");
			properties.setProperty("pass", "ENGINEER2");
			properties.store(new FileOutputStream(strpass), "Comments");

			// 読み込み
			InputStream istream = new FileInputStream(strpass);
			properties.load(istream);
			istream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
