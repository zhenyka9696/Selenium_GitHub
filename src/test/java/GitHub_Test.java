
import org.junit.jupiter.api.*;// именно этот всегда надо подключать
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public  class GitHub_Test {
    private static WebDriver driver = null;
private final String baseUrl="https://www.github.com/";

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
    public void getTitle(){
   // Thread.sleep(3000);
Assertions.assertTrue(driver.getTitle().toUpperCase().contains("Github".toUpperCase()));

}
    @Test
    @Order(3)
    public void GoToLink()
    {driver.get(baseUrl+"login");}

    @Test
    @Order(4)
    public void SignIn(){
        WebElement input = driver.findElement(By.id("login_field"));
        input.sendKeys("zhenyka9696");
        input = driver.findElement(
                By.id
                        ("password"));
        input.sendKeys("best_change38");
        input=driver.findElement(By.xpath("//input[@name='commit']"));
        input.click();
    }

    @Test
    @Order(5)
    public void SignOut(){
    driver.get(baseUrl+"logout");
        WebElement input = driver.findElement(By.xpath("//input[@value='Sign out']"));
        input.click();
    }


}
