package com.uwp.constants;

import java.nio.file.Paths;

/**
 * This Class is to define all the constants
 * 
 * @author Optimus
 *
 */
public class Constants {
	
    // File Path Constants
    public static final String PATH_ROOT = System.getProperty("user.dir");
	public static final String CONFIG_FILE_PATH = "\\config.properties";
	public static final String PATH_LOGGER = Paths.get(PATH_ROOT, "log4j.properties").toString();

}