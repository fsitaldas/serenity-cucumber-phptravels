package com.phptravel.ui;

import java.time.Duration;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OffersModulePage {

	/**
	 * Targets for Hotels Module Content.
	 */
	public static final Target OFFERS_MODULE_HEADER = Target.the("Offers Module Header")
			.locatedBy("//h2[@class='wow fadeIn upper animated'][text()='Offers module features']")
			.waitingForNoMoreThan(Duration.ofSeconds(10));
	public static final Target OFFERS_MODULE_LINE1 = Target.the("Offers Module Paragraph")
			.locatedBy("//p[@class='wow fadeIn animated']").waitingForNoMoreThan(Duration.ofSeconds(10));
}
