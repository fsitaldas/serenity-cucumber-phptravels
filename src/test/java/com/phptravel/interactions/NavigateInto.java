package com.phptravel.interactions;

import com.phptravel.ui.LandingPage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;;

public class NavigateInto extends UIInteractionSteps {

	@Step("Click on Hotels Module")
	public static Task hotelPage() {
		return Task.where("Click on Hotels Module", Click.on(LandingPage.HOTEL_MODULE_LINK));
	}

	@Step("Click on Flights  Module")
	public static Task flightPage() {
		return Task.where("Click on Flight Module", Click.on(LandingPage.FLIGHTS_MODULE_LINK));
	}

	@Step("Click on Tours  Module")
	public static Task tourstPage() {
		return Task.where("Click on Tours Module", Click.on(LandingPage.TOURS_MODULE_LINK));
	}

	@Step("Click on Cars  Module")
	public static Task carsPage() {
		return Task.where("Click on Cars Module", Click.on(LandingPage.CARS_MODULE_LINK));
	}

	@Step("Click on Offers  Module")
	public static Task offersPage() {
		return Task.where("Click on Offers Module", Click.on(LandingPage.OFFERS_MODULE_LINK));
	}
}
