package com.phptravel.ui;

import java.time.Duration;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightsModulePage {

	/**
	 * Targets for Hotels Module Content.
	 */
	public static final Target FLIGHTS_MODULE_HEADER = Target.the("Flights Module Header")
			.locatedBy("//h2[@class='wow fadeIn upper animated'][text()='Flights reservation module']")
			.waitingForNoMoreThan(Duration.ofSeconds(10));
	public static final Target FLIGHTS_MODULE_LINE1 = Target.the("Flights Module Paragraph")
			.locatedBy("//p[@class='wow fadeIn animated']").waitingForNoMoreThan(Duration.ofSeconds(10));
}
