package automatizado.pageObject.Jogatina.Paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.Jogatina.BasePO;

public class JogatinaLoginPO extends BasePO {
    
    /**Texto: Para continuar, acesse sua conta ou faça um cadastro rápido no Jogatina.com*/
    @FindBy(xpath  = "/html/body/div[2]/div/h3")
    public WebElement textoParaContinuar;

    /**Construtor que vai criar a pagina da jogatina. 
    * @param driver Driver da pagina jogatina.
    */
    public JogatinaLoginPO(WebDriver driver) {
        super(driver);     
    }
}
