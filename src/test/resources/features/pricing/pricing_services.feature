@smoke 
Feature: Smoke Testing: PHP Travels Page 

Scenario: Open Hotels Menu Page 
	Given Francis opens the PHP Travel Page 
	Then he click 'Product Services' link under Products
	And Product Services landing page is displayed
	And Installation Web App Price is '$100'