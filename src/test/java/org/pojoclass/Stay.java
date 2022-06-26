package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stay extends BaseClass{
	public Stay() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ss")
	private WebElement WRUG;
	
	@FindBy(xpath="(//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb'])[1]")
	private WebElement clickInAndOutDate;

	@FindBy(xpath="(//span[text()='30'])[1]")
	private WebElement indate;

	@FindBy(xpath="(//span[text()='30'])[2]")
	private WebElement outDate;
	
	@FindBy(xpath="(//span[@class='xp__guests__count'])")
	private WebElement roomAndAdults;

	@FindBy(xpath="//button[@aria-label='Increase number of Rooms']")
	private WebElement incRoom;
	
	@FindBy(xpath="//button[@aria-label='Increase number of Adults']")
	private WebElement incAdults;
	
	@FindBy(xpath="(//label[@class='bui-checkbox__label'])[2]")
	private WebElement Imtravelling;
	
	@FindBy(xpath="(//span[@class='js-sb-submit-text '])")
	private WebElement seacrhStays;

	public WebElement getWRUG() {
		return WRUG;
	}

	public void setWRUG(WebElement wRUG) {
		WRUG = wRUG;
	}

	public WebElement getIndate() {
		return indate;
	}

	public void setIndate(WebElement indate) {
		this.indate = indate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public void setOutDate(WebElement outDate) {
		this.outDate = outDate;
	}

	public WebElement getIncRoom() {
		return incRoom;
	}

	public void setIncRoom(WebElement incRoom) {
		this.incRoom = incRoom;
	}

	public WebElement getIncAdults() {
		return incAdults;
	}

	public void setIncAdults(WebElement incAdults) {
		this.incAdults = incAdults;
	}

	public WebElement getImtravelling() {
		return Imtravelling;
	}

	public void setImtravelling(WebElement imtravelling) {
		Imtravelling = imtravelling;
	}

	public WebElement getSeacrhStays() {
		return seacrhStays;
	}

	public void setSeacrhStays(WebElement seacrhStays) {
		this.seacrhStays = seacrhStays;
	}

	public WebElement getRoomAndAdults() {
		return roomAndAdults;
	}

	public void setRoomAndAdults(WebElement roomAndAdults) {
		this.roomAndAdults = roomAndAdults;
	}

	public WebElement getClickInAndOutDate() {
		return clickInAndOutDate;
	}

	public void setClickInAndOutDate(WebElement clickInAndOutDate) {
		this.clickInAndOutDate = clickInAndOutDate;
	}
	
	


	

}
