package automatizado.pageObject.Jogatina.Paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;


public class JogatinaGamesPO extends BasePO {
    
    /**Texto: Em Destaque*/
    @FindBy(xpath  = "/html/body/div[3]/h2[1]")
    public WebElement textoEmDestaque;
    
    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaGamesPO(WebDriver driver) {
        super(driver);     
    }
}
