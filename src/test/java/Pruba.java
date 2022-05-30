import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pruba {
    @Test
    public void pruebita() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");

        Thread.sleep(8000);

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Login | Salesforce");
    }
}
