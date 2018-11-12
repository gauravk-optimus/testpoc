# UWP App UI Test Automation

Main objective of this project is to create the automation test framework for UWP App UI Test Automation with Appium using WinAppDriver as target driver with TestNG, Maven and Java Programming language. For POC purpose we have used Windows 10 Calculator app.

## Getting Started

These instructions will help to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

We would need following to setup in a Windows 10 machine:

1. Java 1.8

* Download and install Java 1.8 JDK
* Configure environment variables and define Java_Home variable
* Launch command prompt and run 'Java -version' command
* Java version information should be displayed

2. Maven

* Download Apache Maven zip file
* Setup environment variables for Maven
* Launch command prompt and run 'mvn -version' command
* Maven version information should be displayed

3. Third Party dependencies

* WinAppDriver.exe
* Inspect.exe

### Installing and Running Windows Application Driver

* Download Windows Application Driver installer from https://github.com/Microsoft/WinAppDriver/releases and install it on Windows 10 machine where your application under test is installed
* Run 'WinAppDriver.exe' from the installation directory (E.g. C:\Program Files (x86)\Windows Application Driver) as administrator
* Windows Application Driver will run on the test machine listening to requests on the default IP address and port (127.0.0.1:4723)

### Following are the steps to run sample tests

1. Test script execution in eclipse through Maven

* Download source code from Repository
* Import source code in Eclipse IDE as Maven project
* Right click on pom.xml file
* Execute pom.xml file as maven 'clean test -DsuiteXmlFile=TestNG.xml allure:report'
* Allure report will be generated in /allure-report folder/index.html

2. Test script execution in eclipse through TestNG.xml

* Download source code from Repository
* Import source code in Eclipse IDE as Maven project
* Right click on testng-xml file
* Execute testng.xml file as testNG Suite
* Default testng report will be generated in the 'test-output' folder

3. Test script execution using command line interface

* Download source code from Repository
* Launch command prompt in Windows
* Navigate to root directory of Test Automation Framework
* Run 'clean test -DsuiteXmlFile=TestNG.xml allure:report'
* Allure report will be generated in /allure-report folder/index.html

4. Execution of Test cases with single setUp and tearDown 

* Test cases are grouped as per the 'Smoke', 'Regression', 'Combined' for testing purpose
* Right click on pom.xml file
* Execute pom.xml file as maven 'clean test -Dgroups=Combined allure:report'

5. Execution of Test cases with single setUp and tearDown using command line interface

* Navigate to root directory of Test Automation Framework
* Run 'mvn clean test -Dgroups=Combined allure:report'

### Create test cases for your application

* Navigate to "src\config.properties"
* Update the value of 'appID' as per your application
* Create test classes for your application similar to 'TestClass.java'
* Create screen classes similar to 'TestScreen.java'
* To locate the elements you will need 'Inspect.exe' tool which comes with Windows SDK or you can find at 'src/test/resources' the project 

Note: You can find the Application Id of your application as follows:
* From UWP project-> Move to 'AppX\vs.appxrecipe' file. Note the value of 'RegisteredUserModeAppID' key
* From installed app-> Navigate to 'C:\Users\\<user>\AppData\Local\Packages' location. Here look for you application and copy the name of the installation folder