package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Loginfacebook {
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement passw;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn_btn;
	
	
	public  Pom_Loginfacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void username(String un)
	{
		user.sendKeys("hello");
	}
	
	public void password(String pwd){
		passw.sendKeys("hello@123");
	}
	
	public void loginbtn(){
		lgn_btn.click();
	}
}
