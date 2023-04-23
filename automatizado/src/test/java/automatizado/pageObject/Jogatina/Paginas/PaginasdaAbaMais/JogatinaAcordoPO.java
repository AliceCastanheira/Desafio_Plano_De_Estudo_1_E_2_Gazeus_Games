package automatizado.pageObject.Jogatina.Paginas.PaginasdaAbaMais;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaAcordoPO extends BasePO {
    
    /**Texto: Acordo de Utilização*/
    @FindBy(xpath  = "/html/body/div[1]/div/div/h1")
    public WebElement textoAcordo;
            
    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaAcordoPO(WebDriver driver) {
        super(driver);     
    }
}
