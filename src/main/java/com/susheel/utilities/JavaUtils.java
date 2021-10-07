package com.susheel.utilities;

import org.openqa.selenium.WebElement;

public class JavaUtils {
	
	public void clearAndEnterText(WebElement element , String str) {
		element.clear();
		element.sendKeys(str);
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	}

}
