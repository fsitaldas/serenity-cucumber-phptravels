package com.phptravel.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://phptravels.com/")
public class LandingPage extends PageObject {

	/**
	 * Targets for Menu items.
	 */
	public static final Target FEATURE_MENU = Target.the("Features").locatedBy("//span[text()='Features']");
	public static final Target PRODUCT_MENU = Target.the("Product")
			.locatedBy("//span/descendant::span[text()=\"Product\"]");
	public static final Target DOCS_MENU = Target.the("Product").locatedBy("//span[text()='Docs']");
	public static final Target HOSTING_MENU = Target.the("Product").locatedBy("//span[text()='Hosting']");
	public static final Target COMPANY_MENU = Target.the("Product").locatedBy("//span[text()='Company']");
	public static final Target CLOSE_MODAL = Target.the("CloseAD")
			.locatedBy("//div[@id='PopupSignupForm_0']/descendant::div[@class='mc-closeModal']");
	
	/**
	 * Targets for Check Pricing and Explore Demo links
	 */
	public static final Target CHECK_PRICING_LINK = Target.the("Check Pricing")
			.locatedBy("//a[@class='btn btn-hero btns btn-success hero-right']");
	public static final Target EXPLORE_DEMO_LINK = Target.the("Explore Demo")
			.locatedBy("//a[@class='btn btn-hero btns btn-light-blue']");

	/**
	 * Targets for Buy Now per Offer
	 */
	public static final Target WEBAPP_BUYNOW = Target.the("Web App: Buy Now button")
			.located(By.className("paddle_button wow fadeIn btn btn-primary btn-block web animated"));
	public static final Target WEBMOBAPPS_BUYNOW = Target.the("Web App: Buy Now button	")
			.locatedBy("//div[contains(text(),'Web + Mob Apps')]/following::button[1]");
	public static final Target TRAVEL_API_BUYNOW = Target.the("Web App: Buy Now button")
			.locatedBy("//div[contains(text(),'Travel API')]/following::button[1]");

	/**
	 * Targets for Feature sub-menus.
	 */
	public static final Target HOTEL_MODULE_LINK = Target.the("Hotel Module").located(By.linkText("Hotels Module"));
	public static final Target FLIGHTS_MODULE_LINK = Target.the("Flights Module")
			.located(By.linkText("Flights Module"));
	public static final Target TOURS_MODULE_LINK = Target.the("Tours Module").located(By.linkText("Tours Module"));
	public static final Target CARS_MODULE_LINK = Target.the("Cars Module").located(By.linkText("Cars Module"));
	public static final Target OFFERS_MODULE_LINK = Target.the("Offers Module").located(By.linkText("Offers Module"));
	public static final Target BLOG_MODULE_LINK = Target.the("Blog Module").located(By.linkText("Blog Module"));
	public static final Target NEWSLETTER_MODULE_LINK = Target.the("Newsletter Module")
			.located(By.linkText("Newsletter Module"));
}
