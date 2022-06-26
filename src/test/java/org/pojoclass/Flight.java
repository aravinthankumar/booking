package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight extends BaseClass {
	public Flight() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='bui-tab__text'])[2]")
	private WebElement clickFlights;
	
	@FindBy(xpath="(//div[@class='Text-module__root--variant-body_2___2G9QY'])[2]")
	private WebElement oneWay;
	
	@FindBy(xpath="//div[@class='Text-module__root--variant-body_2___2G9QY css-lilgi0']")
	private WebElement clkfrom;
	
	@FindBy(xpath="//div[@class='css-1eii3rq']")
	private WebElement clkfromCancel;
	
	@FindBy(xpath="//input[@class='css-1tl2oa1']")
	private WebElement from;
	
	@FindBy(xpath="//li[@class='css-qqvbcw']")
	private WebElement resfrom;
	
	@FindBy(xpath="(//input[@class='css-g0pg3f-SearchboxInput'])[2]")
	private WebElement clkto;
	
	@FindBy(xpath="//input[@data-testid='searchbox_destination_input']")
	private WebElement to;
	
	@FindBy(xpath="//li[@class='css-qqvbcw']")
	private WebElement resTo;

	
	
	

	@FindBy(xpath="(//div[@class='css-195ievx-inputContainer'])[3]")
	private WebElement clkDate;
	
	@FindBy(xpath="(//span[text()='30'])[1]")
	private WebElement inDate;
	
	@FindBy(xpath="(//span[text()='30'])[2]")
	private WebElement outDate;
	
	
	
	
	@FindBy(xpath="//select[@class='css-1k0jlfl']")
	private WebElement clkclass;
	
	@FindBy(xpath="//option[text()='Premium economy']")
	private WebElement premium;
	
	
	
	@FindBy(xpath="//div[text()='1 adult']")
	private WebElement clkAdults;
	
	@FindBy(xpath="(//button[@class='css-153jucu'])[1]")
	private WebElement incAdults;
	
	@FindBy(xpath="(//button[@class='css-ya5gr9'])")
	private WebElement clkDone;
	
	
	
	@FindBy(xpath="(//button[@class='css-ya5gr9 wide'])")
	private WebElement searchFlights;
	
	

	public WebElement getClkDone() {
		return clkDone;
	}

	public void setClkDone(WebElement clkDone) {
		this.clkDone = clkDone;
	}

	public WebElement getClickFlights() {
		return clickFlights;
	}

	public void setClickFlights(WebElement clickFlights) {
		this.clickFlights = clickFlights;
	}

	public WebElement getOneWay() {
		return oneWay;
	}

	public void setOneWay(WebElement oneWay) {
		this.oneWay = oneWay;
	}

	public WebElement getFrom() {
		return from;
	}

	public void setFrom(WebElement from) {
		this.from = from;
	}

	public WebElement getTo() {
		return to;
	}

	public void setTo(WebElement to) {
		this.to = to;
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

	public WebElement getClkclass() {
		return clkclass;
	}

	public void setClkclass(WebElement clkclass) {
		this.clkclass = clkclass;
	}

	public WebElement getPremium() {
		return premium;
	}

	public void setPremium(WebElement premium) {
		this.premium = premium;
	}

	public WebElement getClkAdults() {
		return clkAdults;
	}

	public void setClkAdults(WebElement clkAdults) {
		this.clkAdults = clkAdults;
	}

	public WebElement getIncAdults() {
		return incAdults;
	}

	public void setIncAdults(WebElement incAdults) {
		this.incAdults = incAdults;
	}

	public WebElement getSearchFlights() {
		return searchFlights;
	}

	public void setSearchFlights(WebElement searchFlights) {
		this.searchFlights = searchFlights;
	}

	public WebElement getClkfrom() {
		return clkfrom;
	}

	public void setClkfrom(WebElement clkfrom) {
		this.clkfrom = clkfrom;
	}

	public WebElement getResfrom() {
		return resfrom;
	}

	public void setResfrom(WebElement resfrom) {
		this.resfrom = resfrom;
	}

	public WebElement getClkfromCancel() {
		return clkfromCancel;
	}

	public void setClkfromCancel(WebElement clkfromCancel) {
		this.clkfromCancel = clkfromCancel;
	}

	public WebElement getClkto() {
		return clkto;
	}

	public void setClkto(WebElement clkto) {
		this.clkto = clkto;
	}
	
	public WebElement getResTo() {
		return resTo;
	}

	public void setResTo(WebElement resTo) {
		this.resTo = resTo;
	}
	
	
	
	

}
