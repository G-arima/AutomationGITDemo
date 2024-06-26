package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class OrdersPage extends AbstractComponent{
	WebDriver driver;
	
	public OrdersPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="td:nth-child(3)")
	List<WebElement> productNameMentioned;

	
	public Boolean verifyOrdersDisplay(String productName) 
	{
	Boolean match=productNameMentioned.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(productName));
	return match;
	}
	}


