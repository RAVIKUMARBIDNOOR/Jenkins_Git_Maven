package New.github.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

import javax.xml.stream.events.Characters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class Practice {
  
	
	public void run(String usn, String pwd) throws InterruptedException
	{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.facebook.com/login.php?login_attempt=1&lwv=110");
		wd.findElement(By.id("email")).sendKeys(usn);
		wd.findElement(By.id("pass")).sendKeys(pwd);
		wd.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);

		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="x";
		data[0][1]="Y";
		data[1][0]="X1";
		data[1][1]="Y1";
		data[2][0]="ravi2rock11@yahoo.com";
		data[2][1]="007007";
	
		return data;
		
		}
}
	
