package automatizado.test.Jogatina.SiteJogatina;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.pageObject.Jogatina.JogatinaSitePO;

public class ImagensJogatinaSite extends BaseTesteJogatinaSite {
    
    private static JogatinaSitePO jogatinaSite;
    @BeforeClass
    public static void prepararTestes(){
        jogatinaSite = new JogatinaSitePO(driver);

    }

    /**Verificacoes de imagemsem Link, verificacao de duas partes
     * Vou comparar os Atributos Src e Alt
     * Atraves do mesmo sistema de comparacao
    */

    /**Imagem sem link Logo Reclame Aqui*/
    @Test
    public void TC001_VerificaoDeImagemSemLink(){
        
        /**Comparando o atributo alt*/
        String resultado = jogatinaSite.srcLogoReclameAquiFright.getAttribute("alt");
        assertEquals(resultado, "Certificado RA1000 - Reclame Aqui");

        /**comparando a tributo src*/
        String resultado2 = jogatinaSite.srcLogoReclameAquiFright.getAttribute("src");
        assertEquals(resultado2, "https://s3.amazonaws.com/static.jogatina.com/img/logos/certificado-reclame-aqui.png");
             
    }
     
    /**Verificacoes de imagem com Link, verificao simples de Tres
     * Vou comparar o Atributo href
     * Atraves do mesmo sistema de comparacao;
     * Clicar para ver a pagina que o sistema vai redirecionar;
     * Pegar o Link que eu sou redirecionado e comparar ele tambem.
    */

    /**Imagem com link Logo Jogatina*/
    @Test
    public void TC002_VerificaoDeImagemComLinkJogatina(){

        /** Comparando a tributo href*/
        String resultado = jogatinaSite.headerLogoJogatina.getAttribute("href");
        assertEquals(resultado, "https://www.jogatina.com/");
        
        /**Clicando na imagem*/
        jogatinaSite.headerLogoJogatina.click(); 

        /**Verificando o link o qual a pagina foi redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/");
        
    }
     
    /**Imagem com link Logo Gazeus*/
    @Test
    public void TC004_VerificaoDeImagemComLinkGazeus(){
             
        /**Comparando o atributo href*/
        String resultado = jogatinaSite.logoGazeus.getAttribute("href");
        assertEquals(resultado, "http://www.gazeus.com.br/");
     
        /**Clicando na imagem*/
        jogatinaSite.logoGazeus.click();

        /**Verificando o link o qual a pagina foi redirecionad*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://gazeus.com/pt/");
 
    }
}
