import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumTest {
    EdgeDriver edgeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        edgeDriver = new EdgeDriver();
    }
    @Test
    public void testSelenium(){
        edgeDriver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

        WebElement inputEmail = edgeDriver.findElement(By.xpath("//input[@id=\"email\"]"));
        inputEmail.sendKeys("ldragon3919@gmail.com");
        WebElement inputPass = edgeDriver.findElement(By.xpath("//input[@id=\"password\"]"));
        inputPass.sendKeys("LDTShark30/09/1009");

        WebElement inputLogin = edgeDriver.findElement(By.xpath("//input[@id=\"login\"]"));
        inputLogin.sendKeys("LDragon3926");
        WebElement btnCon = edgeDriver.findElement(By.xpath("//button[@type=\"button\"]//span[@class=\"Button-content\"]"));
        btnCon.click();


        edgeDriver.get("https://github.com/login");
        WebElement inputEmailLog = edgeDriver.findElement(By.xpath("//input[@id=\"login_field\"]"));
        inputEmailLog.sendKeys("ldragon3919@gmail.com");
        WebElement inputPassLog = edgeDriver.findElement(By.xpath("//input[@id=\"password\"]"));

        inputPassLog.sendKeys("LDTShark30/09/1009");
        WebElement btnConF = edgeDriver.findElement(By.xpath("//input[@name=\"commit\"]"));
        btnConF.click();
    }

}
