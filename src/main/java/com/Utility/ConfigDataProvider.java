package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String configpath="C:\\Users\\Dell\\eclipse-workspace\\Vision_Nov\\Config\\Config.Properties";
		FileInputStream file=new FileInputStream(configpath);
		pro=new Properties();
		pro.load(file);
	}

	public String  getStageUrl() {
		return pro.getProperty("StageUrl");
	}
}
