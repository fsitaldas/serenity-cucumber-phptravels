package com.phptravel.stepsDefinition;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phptravel.elementFinder.ElementFinder;
import com.phptravel.interactions.NavigateInto;
import com.phptravel.ui.LandingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ElementFindStepsDef {
	private static final Logger LOGGER = LoggerFactory.getLogger(ElementFindStepsDef.class);
	ElementFinder findElement;

	@And("he click {string} link under Products")
	public void clickProductLink(String linkText) throws IOException {
		OnStage.withCurrentActor(Ensure.that(LandingPage.PRODUCT_MENU).isDisplayed(),
				MoveMouse.to(LandingPage.PRODUCT_MENU), Click.on(findElement.getLinkByLabel(linkText)));
	}

	@And("click '(.*)' menu")
	public void clickMenu(String menu) throws IOException {
		OnStage.withCurrentActor(Click.on(findElement.getLinkByLabel(menu)));
	}

}
