package com.test.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestCase {
    //System.out.println("----------------------" + this.getClass().getResource("/com/google/common/collect/Sets.class"));
    WebDriver driver;
    @BeforeTest
    public void init(){
        String url ="https://test.newhopescm.com/saas-web/#/login";
        driver = new Brower().chrome();
        driver.get(url);
    }
    @Test
    @Parameters({"name","password"})
    public void login(String name,String password) throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/form[1]/div[1]/div/div/input")).sendKeys(name);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/form[1]/div[2]/div/div/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/form[1]/div[4]/div/button/span")).click();
        //driver.findElement(By.xpath("/html/body/div/section/div/aside/ul/li[4]/div/div/span")).click();
        //driver.findElement(By.xpath("/html/body/div/section/div/aside/ul/li[4]/ul/li[1]/span")).click();
        //driver.findElement(By.xpath("/html/body/div/section/div/aside/ul/li[4]/ul/li[1]/span")).click();
        Thread.sleep(2000);
    }
    @Test
    public void warehouseIn( ) throws InterruptedException {
       driver.findElement(By.xpath("/html/body/div/section/div/aside/ul/li[4]/div/div/span")).click();
        Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div/section/div/aside/ul/li[4]/ul/li[1]/span")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div/section/section/div[1]/main/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/div/button[1]/span")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div/section/section/div[1]/header/div[2]/div/div[1]/div/div/div/div[3]/span")).click();
       //driver.findElement(By.xpath("")).click();
    }
    @Test
    public void warehouseOut(){

    }
    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    
}