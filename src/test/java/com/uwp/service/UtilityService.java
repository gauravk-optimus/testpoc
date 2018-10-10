package com.uwp.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uwp.utils.Constants;

/**
 * This Class is used for reading files
 * 
 * @author Optimus
 *
 */
public class UtilityService {
	
	private static Logger log = LoggerFactory.getLogger(UtilityService.class);
	private static Properties config;
	private static FileInputStream inputFile;
	private static String propertyKey;
	
	static {
		 config = new Properties();		 
		 try {
			inputFile = new FileInputStream(Constants.PATH_ROOT + Constants.CONFIG_FILE_PATH);
			config.load(inputFile);
	     } catch (IOException exception) {
		    log.error("Exception occured while reading the " + propertyKey);
			exception.printStackTrace();
		 }		
	}
	
	/**
	 * Fetching property from properties file
	 * 
	 * @param propertyKey
	 * 			key to be read
	 * @return
	 * 			value corresponding to the key
	 */	
	public static String getPropertyFromFile(String propertyKey) {		
		String value = config.getProperty(propertyKey);
		log.info(value + " of property " + propertyKey + " is read by Properties Reader");		
		return value;
	}
}