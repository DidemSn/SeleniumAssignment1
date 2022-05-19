import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
    public static void sleep(int saniye)
    {
        try {
            Thread.sleep(saniye*100);
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

    }
}
