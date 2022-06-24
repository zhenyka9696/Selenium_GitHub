package IStockPhotos;



import IStockPhotos.IStockPhoto_Chrome_Test;
import org.junit.jupiter.api.*;// именно этот всегда надо подключать
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public  class IStockPhoto_Opera_Test extends IStockPhoto_Chrome_Test {
    // protected static WebDriver driver = null;
    // protected final String baseUrl="https://www.istockphoto.com/ru/";

    @Test
    @Order(1)
    public void openBrowser(){
        System.setProperty("webdriver.opera.driver", "d:/гк/operadriver.exe");
        driver=new OperaDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
}