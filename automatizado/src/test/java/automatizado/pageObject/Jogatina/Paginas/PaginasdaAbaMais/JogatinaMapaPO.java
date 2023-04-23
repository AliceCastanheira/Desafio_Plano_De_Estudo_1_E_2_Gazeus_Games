package automatizado.pageObject.Jogatina.Paginas.PaginasdaAbaMais;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaMapaPO extends BasePO {
    
    /**Texto: Nossos Jogos*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[1]/h2")
    public WebElement textoNossosJogos;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaMapaPO(WebDriver driver) {
        super(driver);     
    }
}
