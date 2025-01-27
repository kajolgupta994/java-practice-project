package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotFoundException extends Exception {
	public ElementNotFoundException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		try {
			driver.findElement(By.id("id")).click();
			throw new ElementNotFoundException("Element not found");
		} catch (ElementNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
