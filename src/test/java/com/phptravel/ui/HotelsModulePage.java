package com.phptravel.ui;

import java.time.Duration;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HotelsModulePage {

	/**
	 * Targets for Hotels Module Content.
	 */
	public static final Target HOTEL_MODULE_HEADER = Target.the("Hotel Module Header")
			.locatedBy("//h2[@class='wow fadeIn upper animated'][text()='Hotels module features']")
			.waitingForNoMoreThan(Duration.ofSeconds(10));
	public static final Target HOTEL_MODULE_LINE1 = Target.the("Hotel Module Paragraph")
			.locatedBy("//p[@class='wow fadeIn animated']").waitingForNoMoreThan(Duration.ofSeconds(10));
}
