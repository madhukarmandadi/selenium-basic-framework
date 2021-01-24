package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	
	@FindBy(how=How.ID,using="nav_automobile")
	WebElement Automobile_Link;
	
	@FindBy(how=How.ID,using="nav_truck")
	WebElement Truck_Link;
	
	@FindBy(how=How.ID,using="nav_motorcycle")
	WebElement Motorcycle;
	
	@FindBy(how=How.ID,using="nav_camper")
	WebElement camper;
	
	public HomePOM() {
	
		PageFactory.initElements(driver, HomePOM.class);
	}

}
