package automatizado.pageObject.Jogatina.Paginas.PaginaApps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaDominoPO extends BasePO {

    /**Texto: O melhor jogo de Dominó online!*/
    @FindBy(xpath  = "/html/body/div[3]/div[4]/h2")
    public WebElement textoOMelhorDomino;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaDominoPO(WebDriver driver) {
        super(driver);     
    }
}
