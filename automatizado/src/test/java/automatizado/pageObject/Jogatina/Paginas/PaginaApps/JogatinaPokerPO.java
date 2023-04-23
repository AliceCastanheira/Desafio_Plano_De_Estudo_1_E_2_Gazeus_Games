package automatizado.pageObject.Jogatina.Paginas.PaginaApps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaPokerPO extends BasePO {

    /**Texto: O melhor Poker online*/
    @FindBy(xpath  = "/html/body/div[3]/div[4]/div[2]/h3")
    public WebElement textoOMelhroPoker;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaPokerPO(WebDriver driver) {
        super(driver);     
    }
}
