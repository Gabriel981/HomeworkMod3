import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Homework {

  WebDriver driver;


  @BeforeMethod
  public void setUp () {

    System.setProperty("webdriver.chrome.driver", "C:\\proiecte\\pentastagiu\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

    System.out.println("The current url of the webpage: ");
    System.out.println(driver.getCurrentUrl());
    System.out.println("The title of the webpage: ");
    System.out.println(driver.getTitle());

    driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, 1);
    //wait.until(ExpectedConditions.elementToBeClickable(By.id(id)))
  }


  @org.testng.annotations.Test(priority = 0)
  public void test1 () {

    System.out.println("Test1: ");
    driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
    // First test = search bar;
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("test");
    //testing if search bar reacts to ENTER/INVIO key
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(Keys.ENTER);
    //To repair this tommorrow
//        Webpage_Important searchTestingEnter = new Webpage_Important();
//        searchTestingEnter.searchBarTesting1();
  }


  @org.testng.annotations.Test(priority = 1)
  public void test12 () {

    System.out.println("Test 1.2: ");
    driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
    // First test = search bar (again)
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("test2");
    driver.findElement(By.xpath("//button[@name='submit_search']")).click();
    //To repair this tommorrow
//        Webpage_Important searchTesting = new Webpage_Important();
//        searchTesting.searchBarTesting2();
  }


  @org.testng.annotations.Test(priority = 2)
  public void test2 () {

    System.out.println("Test 2: ");
    //firstly: type something on search-bar
    driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("t");
    driver.findElement(By.xpath("//button[@name='submit_search']")).click();
    //validating if text get by browser is equal to TOP SELLERS
    String actual = driver.findElement(By.xpath("//a[contains(text(),'Top sellers')]")).getText();
    Assert.assertEquals(actual, "TOP SELLERS");
    //To repair this tommorrow
//        Webpage_elements textOnPageDestination = new Webpage_elements();
//        textOnPageDestination.CompareText();
  }


  @AfterMethod
  public void closeUp () {

    driver.quit();
  }
}
