package com.uwp.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uwp.constants.Constants;

/**
 * This Class contains all the methods to read config files and to store keys
 * 
 * @author Optimus
 *
 */
public class PropertyFileHandler {

	// Below fields should not be static
	private static Logger log = LoggerFactory.getLogger(PropertyFileHandler.class);
	private static Properties config;
	
	static {
		config = new Properties();
		try {
			FileInputStream inputFile = new FileInputStream(Constants.PATH_ROOT + Constants.CONFIG_FILE_PATH);
			config.load(inputFile);
		} catch (IOException exception) {
			log.error("Exception occured while reading the property");
			exception.printStackTrace();
		}
	}

	/**
	 * Fetching property from properties file
	 * 
	 * @param key is 'key' to be read from the file
	 * @return value corresponding to the key
	 */
	public static String getPropertyFromConfig(ConfigPropertyKeys key) {
		String value = config.getProperty(key.toString());
		return value;
	}
	
	/**
	 * Enum to to store config property keys
	 */
	enum ConfigPropertyKeys{		
		WinAppDriverURL("WinAppDriverURL"), appID("appID");
		
	    private ConfigPropertyKeys(String action){ 
	    } 
	}
}