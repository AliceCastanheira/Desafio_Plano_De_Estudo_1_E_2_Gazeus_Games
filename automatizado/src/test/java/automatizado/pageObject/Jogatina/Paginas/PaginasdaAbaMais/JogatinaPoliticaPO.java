package automatizado.pageObject.Jogatina.Paginas.PaginasdaAbaMais;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaPoliticaPO extends BasePO {

    /**Texto: Resumo da Política de privacidade*/
    @FindBy(xpath  = "/html/body/div/div/div/div/div[2]/div/h2")
    public WebElement textoResumoPolitica;
            
    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaPoliticaPO(WebDriver driver) {
        super(driver);     
    }
}
