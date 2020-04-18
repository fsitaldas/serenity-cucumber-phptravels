package com.phptravel.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://phptravels.com/")
public class ProductsServicesPage extends PageObject {

	/**
	 * Targets for Menu items.
	 */
	public static final Target PRODUCT_SERVICES_SUBMENU_LINK = Target.the("Product Services Link")
			.locatedBy("//ul[@class='menu reset']//a[contains(text(),'Product Services')]]");

}
