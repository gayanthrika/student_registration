package registration_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/MUTHU/Desktop/Year 3 Semester 3/CS 3212/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("f_name")).sendKeys("Joseph Vijay");
		driver.findElement(By.name("lname")).sendKeys("Chandrasekhar");
		driver.findElement(By.name("dob")).sendKeys("06/22/1974");
		driver.findElement(By.id("email")).sendKeys("vijay@yahoo.com");
		driver.findElement(By.name("phnno")).sendKeys("+9167 765 4321");
		driver.findElement(By.id("adrs")).sendKeys("64, Kaveri Street, Saligramam, Chennai 600093, Tamil Nadu, India");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.name("hobby_1")).click();
		driver.findElement(By.name("hobby_2")).click();
		WebElement select1 =driver.findElement(By.className("crs3"));
		select1.click();
	
		
		WebElement ps1=driver.findElement(By.name("pswd"));
		ps1.sendKeys("vijay@123456");
		
		WebElement ps2=driver.findElement(By.id("repswd"));
		ps2.sendKeys("vijay@123456");
		
		String messg1="passwords are equal";
		String messg2="passwords are not equal";
		
		String pwd=ps1.getAttribute("value");
		String repwd=ps2.getAttribute("value");
		
		if(pwd.equals(repwd))
		{
			System.out.println(messg1);
		}
		
		else
		{
			System.out.println(messg2);
		}
		
		
		driver.findElement(By.name("result")).sendKeys("2A and B");
		
		driver.findElement(By.name("z_score")).sendKeys("1.225");
		driver.findElement(By.name("d_rank")).sendKeys("1");

	}

}
