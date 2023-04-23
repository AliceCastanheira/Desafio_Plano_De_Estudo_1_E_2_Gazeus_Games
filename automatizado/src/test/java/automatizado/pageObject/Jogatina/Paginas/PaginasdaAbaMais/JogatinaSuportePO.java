package automatizado.pageObject.Jogatina.Paginas.PaginasdaAbaMais;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;


public class JogatinaSuportePO extends BasePO {
    
    /**Texto: Atividade recente*/
    @FindBy(xpath  = "/html/body/main/div/section[2]/div/div/h2")
    public WebElement textoAtividade;
    
    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaSuportePO(WebDriver driver) {
        super(driver);     
    }
}