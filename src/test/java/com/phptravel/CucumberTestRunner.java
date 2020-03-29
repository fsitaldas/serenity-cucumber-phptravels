package com.phptravel;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {
		"pretty" }, features = "src/test/resources/features/OpenPHPTravel.feature", glue = "com.phptravel.stepsDefinition")
public class CucumberTestRunner {
}