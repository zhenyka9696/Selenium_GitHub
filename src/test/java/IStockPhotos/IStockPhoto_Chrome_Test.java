package IStockPhotos;

import org.junit.jupiter.api.*;// именно этот всегда надо подключать
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public  class IStockPhoto_Chrome_Test {
    protected static WebDriver driver = null;
protected final String baseUrl="https://www.istockphoto.com/ru/";

    @Test
    @Order(1)
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "d:/гк/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    @Order(2)
    @Disabled
    //Перейти по ссылке "Архитектура"
    public void getArchitecture(){
      driver.get(baseUrl+"/стоковое-видео/архитектура");

        // Thread.sleep(3000);
Assertions.assertTrue(driver.getTitle().toUpperCase().contains
        ("стоковые hd видеоклипы".toUpperCase()));
    }
    @Test
    @Order(3)
     public void register()
    {
        driver.get(baseUrl+"join");
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Регистрация".toUpperCase()));
    }

    @Test
    @Order(4)
    public void signUp() {
        //*[@id="register_email"]
        //*[@id="register_password"]
        //*[@id="register_password_confirmation"]
        WebElement email = driver.findElement(By.id("register_email"));
       email.sendKeys(generate());
        WebElement password = driver.findElement(By.id("register_password"));
        password.sendKeys("abc1234567890");
        WebElement passwordConfirm = driver.findElement(By.id("register_password_confirmation"));
        passwordConfirm.sendKeys("abc1234567890");
Select countries = new Select(driver.findElement(By.id
                        ("register_country_code")));
countries.selectByVisibleText("Российская Федерация");
WebElement checkbox = driver.findElement(By.id("checkbox"));
checkbox.click();
WebElement button = driver.findElement(By.xpath("//*[@id='register-button']"));
        button.click();
    }

    @Test
    @Order(5)
    public void SignOut(){
        driver.get(baseUrl+"sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Stock images".toUpperCase()));
    }

    @Test
    @Order(6)
    public String generate(){
        String s = "";
        Random random = new Random();
        for (int i=0; i<4; i++){
            int n = random.nextInt(122-97+1)+97;
            char c=(char)n;
            s+=c;
        }
        int number = random.nextInt(1000)+1000;
        s+=String.valueOf(number);

        s+="@gmail.com";
        System.out.println(s);
        return s;

    }

}
