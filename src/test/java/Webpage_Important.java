import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webpage_Important {
/*
    WebDriver driver;
*/


  //testing searchBar by typing a text and press INVIO / ENTER button
  public void searchBarTesting1 () {

    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

    System.out.println("Test1: ");
    driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
    // First test = search bar;
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("test");
    //testing if search bar reacts to ENTER/INVIO key
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(Keys.ENTER);
  }


  //testing searchBar by typing a value and press on button
  public void searchBarTesting2 () {

    WebDriver driver = new ChromeDriver();
    System.out.println("Test 1.2: ");
    driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
    // First test = search bar (again)
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("test2");
    driver.findElement(By.xpath("//button[@name='submit_search']")).click();
  }


}
