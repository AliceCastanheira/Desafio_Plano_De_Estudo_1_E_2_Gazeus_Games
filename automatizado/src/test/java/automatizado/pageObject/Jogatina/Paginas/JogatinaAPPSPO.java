package automatizado.pageObject.Jogatina.Paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaAPPSPO extends BasePO {
    
    /**Texto: Nossos Jogos*/
    @FindBy(xpath  = "/html/body/div[2]/div/h1")
    public WebElement textoNossosJogos;
        
    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaAPPSPO(WebDriver driver) {
        super(driver);     
    }
}
