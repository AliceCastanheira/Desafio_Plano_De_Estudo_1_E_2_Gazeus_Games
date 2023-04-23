package automatizado.test.Jogatina.SiteJogatina;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTesteJogatinaSite {
    
    protected static WebDriver driver;
    private static final String URL_BASESITE = "https://www.jogatina.com/";
    
    
    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver","C:/Users/lilic/Documents/Automatizado/automatizado/src/test/java/automatizado/resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASESITE);
        
    }

    @After
    public void voltarJogatina(){
        String URLjogatina = "https://www.jogatina.com/";
        driver.get(URLjogatina);

    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}