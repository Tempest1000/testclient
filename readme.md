# Selenium WebDriver with Java Test Project

This test project uses the sample site http://newtours.demoaut.com and Selenium WebDriver to automate the Chrome browser. 

This was initially inspired by the Dallas QA Automation Meetup Group: https://www.meetup.com/meetup-group-CyNovAPE

Starting point was this code: https://github.com/brpublic/Selenium-Demo

Three approaches were used in this project: 

* The first is TestNgClientWebDriver test, which is a basic approach with all webdriver code in the unit tests. 
* The second is TestNgClientFramework, a different approach that encapsulates webdriver code in its Browser class. 
* The third approach uses a fluent interface and a builder pattern to create clear and easy to read unit tests. 

The inspiration for this code is these videos in PluralSight:

https://app.pluralsight.com/library/courses/automated-web-testing-selenium-webdriver-java

https://app.pluralsight.com/library/courses/automated-tests-java-fluent-interface-webdriver-selenium

### Tools

* Spring Boot starter - https://start.spring.io
* Selenium Java - org.seleniumhq.selenium (selenium.java)
* Selenium WebDriver - io.github.bonigarcia (webdrivermanager)
* TestNG for unit tests - org.testng
* Chrome Browser
