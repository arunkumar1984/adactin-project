/**
 *   File Name: PropertiesDemo.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 27, 2016
 *   
 */

package com.sqa.av.props;

import java.io.*;
import java.util.*;

/**
 * PropertiesDemo //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// String fullFilePath = "src/main/resources/props.properties";
		String fileLocation = "src/main/resources/";
		String fileName = "props.properties";

		// ArrayList<String> dataLines = new ArrayList<String>();
		Map<String, String> props = readPropertiesFile(fileLocation, fileName);
		Properties propsAlternate = readPropetiesFileAlternate(fileLocation, fileName);
		propsAlternate.setProperty("baseURL", "http://amazon.com");
		propsAlternate.setProperty("username", "username123");
		propsAlternate.setProperty("password", "test1234");
		writeProperties(fileLocation + "updated-", fileName, propsAlternate);

	}

	/**
	 * @param fileLocation
	 * @param fileName
	 */
	private static Map<String, String> readPropertiesFile(String fileLocation, String fileName) {
		Map<String, String> props = new HashMap<String, String>();

		try {
			// FileReader reads text files in the default encoding.
			// FileReader fileReader = new FileReader(fileLocation);
			FileReader fileReader = new FileReader(fileLocation + fileName);
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// Create String to hold current line
			String line = bufferedReader.readLine();
			// While there is a line to read or not null line
			// (also setting line to current line)
			while (line != null) {
				// Pass current line to the gatherDataString Method
				// dataLines.add(line);

				// Split it as <Key, Value> as below:
				props.put(line.split("=")[0].trim(), line.split("=")[1].trim());

				line = bufferedReader.readLine();
			}
			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(dataLines);
		System.out.println(props);
		System.out.println("Test to search the website: " + props.get("baseURL"));
		System.out.println("Search for the text : " + props.get("searchterm"));
		System.out.println("Min image size: " + props.get("minSize") + "px wide");

		return props;
	}

	/**
	 * @param fileLocation
	 * @param fileName
	 * @return
	 */
	private static Properties readPropetiesFileAlternate(String fileLocation, String fileName) {
		// Create Properties instance and initialize it
		Properties props = new Properties();
		try {
			// FileReader fileReader = new FileReader(fileLocation);
			InputStream inputStream = new FileInputStream(fileLocation + fileName);
			// Load the properties
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(props);
		System.out.println("Test to search the website: " + props.get("baseURL"));
		System.out.println("Search for the text : " + props.get("searchterm"));
		System.out.println("Min image size: " + props.get("minSize") + "px wide");

		return props;
	}

	/**
	 * @param fileLocation
	 * @param string
	 * @param fileName
	 * @param propsAlternate
	 */

	private static void writeProperties(String fileLocation, String fileName, Properties propsAlternate) {

		try {
			OutputStream outputStream = new FileOutputStream(fileLocation + fileName);
			// Load the properties
			propsAlternate.store(outputStream, "AV New Properties File");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
