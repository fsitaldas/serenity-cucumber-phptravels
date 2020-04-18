package com.phptravel.stepsDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phptravel.interactions.NavigateInto;
import com.phptravel.ui.LandingPage;
import com.phptravel.ui.products.ProductServices;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ProductServicesPageStepDefs {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServicesPageStepDefs.class);

	@When("Product Services landing page is displayed")
	public void displayProductServicesMainPage() {
		OnStage.withCurrentActor(Ensure.that(ProductServices.MAIN_PAGE).isDisplayed());
	}

	@And("Installation Web App Price is '(.*)'")
	public void assert_installation_webApp_price(String expectedValue) {
		OnStage.withCurrentActor(Ensure.that(ProductServices.INSTALL_WEP_APP_RATE).value().contains(expectedValue));
	}

}
