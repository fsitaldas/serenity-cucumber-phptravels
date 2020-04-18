package com.phptravel.elementFinder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.serenitybdd.screenplay.targets.Target;

public class ElementFinder {
	static InputStream inputStream;
	static String elementLocated;

	public Target getLinkByLabel(String linkText) throws IOException {
		try {
			Properties prop = new Properties();
			String propFileName = "element-locator.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			elementLocated = prop.getProperty("link_locator").replace("%%", linkText);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return Target.the(linkText).locatedBy(elementLocated);
	}

	public Target getMenuByLabel(String menu) throws IOException {
		try {
			Properties prop = new Properties();
			String propFileName = "element-locator.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			elementLocated = prop.getProperty("menu_locator").replace("%%", menu);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return Target.the(menu).locatedBy(elementLocated);
	}
}
