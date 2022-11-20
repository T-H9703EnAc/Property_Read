package com.app.sample4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesWriteXMLPattern {
	public void excute() {
		Properties properties = new Properties();

		//プロパティファイルのパスを指定する
		String strpass = Paths.get("").toAbsolutePath().toString() + "\\src\\main\\resources\\test3.properties";
		// プロジェクト直下に作成
		//String strpass = "test3.properties";
		try {
			// 書き込み
            properties.setProperty("id", "侍");
            properties.setProperty("pass", "エンジニア");
            OutputStream ostream = new FileOutputStream(strpass);
            properties.storeToXML(ostream, "コメント");
            
            // 読み込み
            InputStream istream = new FileInputStream(strpass);
            properties.loadFromXML(istream);
            istream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
