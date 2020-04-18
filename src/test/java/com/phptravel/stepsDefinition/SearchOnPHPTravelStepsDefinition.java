package com.phptravel.stepsDefinition;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phptravel.interactions.NavigateInto;
import com.phptravel.ui.CarsModulePage;
import com.phptravel.ui.FlightsModulePage;
import com.phptravel.ui.HotelsModulePage;
import com.phptravel.ui.LandingPage;
import com.phptravel.ui.OffersModulePage;
import com.phptravel.ui.ToursModulePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Steps;

public class SearchOnPHPTravelStepsDefinition {
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchOnPHPTravelStepsDefinition.class);
	@Steps
	NavigateInto navigateInto;

	@Before
	public void prepareTests() {
		setTheStage(new OnlineCast());
	}

	@Given("^(.*) opens the PHP Travel Page")
	public void opens_the_Todo_Application(String actorName) {

		theActorCalled(actorName).attemptsTo(Open.browserOn().the(LandingPage.class));
		LOGGER.info("User navigates to PHP Travel portal");
	}

	@When("he navigates to Hotel Module")
	public void navigate_to_hotel() {
		OnStage.withCurrentActor(MoveMouse.to(LandingPage.FEATURE_MENU), NavigateInto.hotelPage());
	}

	@When("he navigates to Flights Module")
	public void navigate_to_flight() {
		OnStage.withCurrentActor(MoveMouse.to(LandingPage.FEATURE_MENU), NavigateInto.flightPage());
	}

	@When("he navigates to Tours Module")
	public void navigate_to_tours() {
		OnStage.withCurrentActor(MoveMouse.to(LandingPage.FEATURE_MENU), NavigateInto.tourstPage());
	}

	@When("he navigates to Cars Module")
	public void navigate_to_cars() {
		OnStage.withCurrentActor(MoveMouse.to(LandingPage.FEATURE_MENU), NavigateInto.carsPage());
	}

	@When("he navigates to Offers Module")
	public void navigate_to_offers() {
		OnStage.withCurrentActor(MoveMouse.to(LandingPage.FEATURE_MENU), NavigateInto.offersPage());
	}

	@Then("he should see that Hotel Page is successfully loaded")
	public void assertHotelPageLoaded() {
		OnStage.withCurrentActor(Ensure.that(HotelsModulePage.HOTEL_MODULE_HEADER).isDisplayed(),
				Ensure.that(HotelsModulePage.HOTEL_MODULE_LINE1).isDisplayed());
	}

	@Then("he should see that Flight Page is successfully loaded")
	public void assertFlightPageLoaded() {
		OnStage.withCurrentActor(Ensure.that(FlightsModulePage.FLIGHTS_MODULE_HEADER).isDisplayed(),
				Ensure.that(FlightsModulePage.FLIGHTS_MODULE_LINE1).isDisplayed());
	}

	@Then("he should see that Tours Page is successfully loaded")
	public void assertTourPageLoaded() {
		OnStage.withCurrentActor(Ensure.that(ToursModulePage.TOURS_MODULE_HEADER).isDisplayed(),
				Ensure.that(ToursModulePage.TOURS_MODULE_LINE1).isDisplayed());
	}

	@Then("he should see that Cars Page is successfully loaded")
	public void assertCarsPageLoaded() {
		OnStage.withCurrentActor(Ensure.that(CarsModulePage.CARS_MODULE_HEADER).isDisplayed(),
				Ensure.that(CarsModulePage.CARS_MODULE_LINE1).isDisplayed());
	}

	@Then("he should see that Offers Page is successfully loaded")
	public void assertOffersPageLoaded() {
		OnStage.withCurrentActor(Ensure.that(OffersModulePage.OFFERS_MODULE_HEADER).isDisplayed(),
				Ensure.that(OffersModulePage.OFFERS_MODULE_LINE1).isDisplayed());
	}
}
