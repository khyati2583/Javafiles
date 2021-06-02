package SeleniumLearning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("testing");
    }
    @Test

        public void testLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(2000);


        driver.findElement(By.id("Email")).sendKeys("kk@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khyati@123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

}
    @AfterMethod
    public void afterMethod(){
        driver.close();
        System.out.println("test finish");
    }
}
