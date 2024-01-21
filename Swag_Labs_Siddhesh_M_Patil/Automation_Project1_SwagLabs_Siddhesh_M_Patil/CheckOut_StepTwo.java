package Automation_Project1_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut_StepTwo {
	
	private WebDriver driver;
	private By FinishBtn=By.id("finish");
	private By cancelBtn=By.id("cancel");
	
	public CheckOut_StepTwo (WebDriver driver) {
		this.driver=driver;
	}
	public void ClickOnFinsih () {
		driver.findElement(FinishBtn).click();
	}
	public void ClickOnCancelBtn () {
		driver.findElement(cancelBtn).click();
	}
	

}
