@smoke 
Feature: Smoke Testing: PHP Travels Page 

Scenario: Open Flight Page 
	Given Francis opens the PHP Travel Page
	When he navigates to Flights Module
	Then he should see that Flight Page is successfully loaded 
	
Scenario: Open Tours Page 
	Given Francis opens the PHP Travel Page 
	When he navigates to Tours Module 
	Then he should see that Tours Page is successfully loaded 
	
Scenario: Open Cars Page 
	Given Francis opens the PHP Travel Page 
	When he navigates to Cars Module 
	Then he should see that Cars Page is successfully loaded 
	
Scenario: Open Offers Page 
	Given Francis opens the PHP Travel Page 
	When he navigates to Offers Module 
	Then he should see that Offers Page is successfully loaded 
