package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automations {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Open IndiaBIX
            driver.get("https://www.indiabix.com/");
            Thread.sleep(3000);

            // Click Login button
            driver.findElement(By.id("btnLogin")).click();
            Thread.sleep(2000);

            // Enter Login Credentials
            driver.findElement(By.id("inp_username")).sendKeys("nandan0198");
            driver.findElement(By.id("inp_pass")).sendKeys("@Nandan123");
            Thread.sleep(1500);

            // Click Submit
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);

            // Open Logical Reasoning
            driver.findElement(By.xpath("/html/body/aside/nav/ul/li[6]/a/span[2]")).click();
            Thread.sleep(2000);

            // Auto-scroll
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600)");
            Thread.sleep(1500);

            // Open Logical Deduction section
            driver.findElement(By.xpath("//a[contains(text(),'Logical Deduction')]")).click();
            Thread.sleep(2000);

            // Enable Dark Mode if available
            try {
                driver.findElement(By.xpath("//*[@id='btnTheme']/i")).click();
                System.out.println("Dark mode enabled.");
            } catch (Exception e) {
                System.out.println("Dark mode button not found.");
            }

            Thread.sleep(2000);
            System.out.println("Login attempted with provided credentials.");

        } finally {
            driver.quit();
        }
    }
}
