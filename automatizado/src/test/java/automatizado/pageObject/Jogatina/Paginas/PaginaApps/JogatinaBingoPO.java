package automatizado.pageObject.Jogatina.Paginas.PaginaApps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaBingoPO extends BasePO{

    /**Texto: O melhor bingo online*/
    @FindBy(xpath  = "/html/body/div[3]/div[4]/div[2]/h3")
    public WebElement textoOMelhorBingo;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaBingoPO(WebDriver driver) {
        super(driver);     
    }
}
