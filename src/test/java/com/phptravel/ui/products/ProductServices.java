package com.phptravel.ui.products;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://phptravels.com/")
public class ProductServices extends PageObject {

	/**
	 * Targets for Menu items.
	 */
	public static final Target MAIN_PAGE = Target.the("Product Services Landing Page").located(By.id("Main"));
	public static final Target INSTALL_WEP_APP_RATE = Target.the("Installation web app rate")
			.locatedBy("//div[@id='installation']//strong");
	

}