package automatizado.pageObject.Jogatina.Paginas;

import automatizado.pageObject.Jogatina.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JogatinaWelcomePO extends BasePO {
    
    /**Texto e botao: Seja VIP*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[5]/a")
    public WebElement textoEBotaoSejaVip;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaWelcomePO(WebDriver driver) {
        super(driver);     
    }
}
