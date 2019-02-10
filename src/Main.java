
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) {
     
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bvtest.school.cubes.rs/login");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        
        WebElement logInButton = driver.findElement(By.className("btn-primary"));
        logInButton.click();
        
        WebElement categoriesField = driver.findElement(By.linkText("Categories"));
        categoriesField.click();
        
        WebElement addCategories = driver.findElement(By.className("btn-default"));
        addCategories.click();
        
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys("Protesti");
        
        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();
        
    //    driver.quit();
    
    }
    
}
