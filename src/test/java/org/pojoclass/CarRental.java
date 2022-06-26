package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRental extends BaseClass {
	public CarRental() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//span[@class='bui-tab__text'])[4]")
	private WebElement clkCarRental;
	
	@FindBy(xpath="(//label[@class='bui-radio__label'])[2]")
	private WebElement differentLocation;
	
	@FindBy(id="ss_origin")
	private WebElement pickUpLocation;
	
	@FindBy(id="ss")
	private WebElement dropOff;
	
	
	@FindBy(xpath="(//button[@aria-label='Open calendar'])[1]")
	private WebElement clkDate;
	
	@FindBy(xpath="(//span[text()='30'])[2]")
	private WebElement inDate;
	
	@FindBy(xpath="(//span[text()='29'])[18]")
	private WebElement outDate;
	
	@FindBy(xpath="//span[@class='js-sb-submit-text ']")
	private WebElement searchCarTental;
	
	

	public WebElement getDropOff() {
		return dropOff;
	}

	public void setDropOff(WebElement dropOff) {
		this.dropOff = dropOff;
	}

	public WebElement getClkCarRental() {
		return clkCarRental;
	}

	public void setClkCarRental(WebElement clkCarRental) {
		this.clkCarRental = clkCarRental;
	}

	public WebElement getDifferentLocation() {
		return differentLocation;
	}

	public void setDifferentLocation(WebElement differentLocation) {
		this.differentLocation = differentLocation;
	}

	public WebElement getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(WebElement pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public WebElement getClkDate() {
		return clkDate;
	}

	public void setClkDate(WebElement clkDate) {
		this.clkDate = clkDate;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public void setInDate(WebElement inDate) {
		this.inDate = inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public void setOutDate(WebElement outDate) {
		this.outDate = outDate;
	}

	public WebElement getSearchCarTental() {
		return searchCarTental;
	}

	public void setSearchCarTental(WebElement searchCarTental) {
		this.searchCarTental = searchCarTental;
	}
	
	

}
