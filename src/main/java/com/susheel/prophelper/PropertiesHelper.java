package com.susheel.prophelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

	Properties prop;

	public PropertiesHelper() throws IOException {

		prop = getTestDataProperties();

	}

	public String getUsername() {
		return prop.getProperty("username");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}

	public String getFirstname() {
		return prop.getProperty("firstname");
	}

	public String getCountry() {
		return prop.getProperty("country");
	}

	public String getCard() {
		return prop.getProperty("card");
	}

	public String getMonth() {
		return prop.getProperty("month");
	}

	public String getYear() {
		return prop.getProperty("year");
	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	public Properties getTestDataProperties() throws IOException {
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/test/resources/testdata.properties"));
		p.load(file);
		return p;
	}

}
