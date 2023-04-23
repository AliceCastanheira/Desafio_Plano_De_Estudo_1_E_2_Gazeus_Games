package automatizado.pageObject.Jogatina.Paginas.PaginaApps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaTrucoPO extends BasePO { 
    
    /**Texto: Truco Online, saiba como jogar*/
    @FindBy(xpath  = "/html/body/div[3]/div[1]/div[3]/h2")
    public WebElement textoTrucoOnline;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaTrucoPO(WebDriver driver) {
        super(driver);     
    }
}
