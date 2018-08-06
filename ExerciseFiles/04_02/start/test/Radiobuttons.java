import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        WebElement radioButton2 = ((ChromeDriver) driver).findElementByCssSelector("input[value='option2]");
        radioButton2.click();

        WebElement radiButton3= ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[3]/input");
        radiButton3.click();

        driver.quit();
    }
}

