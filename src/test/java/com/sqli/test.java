package com.sqli;

import com.sqli.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

    @Test
    public void name() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("APjFqb")).sendKeys("automation"+ Keys.ENTER);
//        driver.findElement(By.linkText("Change to English")).click();
        driver.findElement(By.xpath("//span[text()='Wikipedia']")).click();
        String paragraph = driver.findElement(By.xpath("//div[@id='bodyContent']/div[3]/div/p[6]")).getText();
        String[] words = paragraph.split(" ");
        for (String word: words) {
            if (word.contentEquals("270")) {
                System.out.println("Earliest known date for automation is circa BC " + word);
            }
        }
    }
}
