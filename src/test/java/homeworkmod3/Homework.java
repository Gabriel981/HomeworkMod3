package homeworkmod3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework {

    static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gabriel\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        System.out.println("The current url of the webpage: ");
        System.out.println(driver.getCurrentUrl());
        System.out.println("The title of the webpage: ");
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();

        //wait.until(ExpectedConditions.elementToBeClickable(By.id(id))) //not yet
    }

    @Test(priority = 0, groups = "search")
    public void test1() {
        // To repair this tommorrow
        Webpage_Important webImport = new Webpage_Important();
        webImport.searchBarTesting1();
    }

    @Test(priority = 1, groups = "search")
    public void test12() {

        //To repair this tommorrow
        Webpage_Important searchTesting = new Webpage_Important();
        searchTesting.searchBarTesting2();
    }

    @Test(priority = 2,groups = "search2")
    public void test2() {
        //To repair this tommorrow
        Webpage_elements textOnPageDestination = new Webpage_elements();
        textOnPageDestination.CompareText();
    }

    @AfterMethod
    public void closeUp() {
        driver.quit();
    }
}
