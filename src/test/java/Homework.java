import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Homework {

  WebDriver driver;


  @BeforeMethod
  public void setUp () {

    System.setProperty(
        "webdriver.chrome.driver",
        "C:\\proiecte\\pentastagiu\\chromedriver.exe"
    );
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver, 1);
    /*driver.get("http://automationpractice.com/index.php");

    System.out.println("The current url of the webpage: ");
    System.out.println(driver.getCurrentUrl());
    System.out.println("The title of the webpage: ");
    System.out.println(driver.getTitle());



    WebDriverWait wait = new WebDriverWait(driver, 1);*/
    //wait.until(ExpectedConditions.elementToBeClickable(By.id(id)))
  }


  @org.testng.annotations.Test(priority = 0)
  public void test1 () {
    // To repair this tommorrow
    Webpage_Important webImport = new Webpage_Important();
    webImport.searchBarTesting1();
  }


  @org.testng.annotations.Test(priority = 1)
  public void test12 () {

    //To repair this tommorrow
    Webpage_Important searchTesting = new Webpage_Important();
    searchTesting.searchBarTesting2();
  }


  @org.testng.annotations.Test(priority = 2)
  public void test2 () {
    //To repair this tommorrow
    Webpage_elements textOnPageDestination = new Webpage_elements();
    textOnPageDestination.CompareText();
  }


  @AfterMethod
  public void closeUp () {

    driver.quit();
  }
}
