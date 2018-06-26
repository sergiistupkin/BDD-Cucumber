///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package stepDefinitions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
///**
// *
// * @author Sergii
// */
//public class LoginStepDefinition {
//     
//    WebDriver driver;
//    
//    @Given("^user is already on Login Page$")
//    public void user_already_on_login_page(){
//        System.setProperty("webdriver.chrome.driver", "D:/QA/Selenium/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.crmpro.com//index.html");
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//    
//    @When("^title of Login Page is CRM$")
//    public void title_of_Login_Page_is_CRM(){
//        String title=driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//    }
//    
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")  //      \"(.*)\"  -Regular Expression
//    public void user_enters_username_and_password(String username, String pwd){
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
//    }
//    @Then ("^user clicks on Login button$")
//    public void user_clicks_on_Login_button(){
//        //driver.findElement(By.xpath("//input[@type='submit']")).click();
//        
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();",loginBtn);
//    }
//    @Then ("^user is on Home Page$")
//    public void user_is_on_Home_Page(){
//    String title = driver.getTitle();
//    System.out.println(title);
//    Assert.assertEquals("CRMPRO", title);
//    }
//    
//    @Then ("^close the browser$")
//    public void close_the_browser(){
//        driver.quit();
//    }
//}
