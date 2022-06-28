package IStockPhotos;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public  class IStockPhoto_Mozillla_Test extends IStockPhoto_Chrome_Test {
        // protected static WebDriver driver = null;
        // protected final String baseUrl="https://www.istockphoto.com/ru/";

        @Test
        @Order(1)
        public void openBrowser(){
            System.setProperty("webdriver.gecko.driver", "d:/гк/geckodriver.exe");
            driver=new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
        }
    }

