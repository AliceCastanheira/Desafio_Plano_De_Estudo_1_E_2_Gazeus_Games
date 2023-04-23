package automatizado.test.Jogatina.SiteJogatina;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;



import automatizado.pageObject.Jogatina.JogatinaSitePO;
import automatizado.pageObject.Jogatina.Paginas.JogatinaLoginPO;
import automatizado.pageObject.Jogatina.Paginas.JogatinaGamesPO;
import automatizado.pageObject.Jogatina.Paginas.JogatinaAPPSPO;
import automatizado.pageObject.Jogatina.Paginas.PaginasdaAbaMais.*;
import automatizado.pageObject.Jogatina.Paginas.PaginaApps.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BotaoSiteJogatina extends BaseTesteJogatinaSite {
    
    private static JogatinaSitePO jogatinaSite;
    private static JogatinaLoginPO jogatinaSiteLogin;
    private static JogatinaGamesPO jogatinaSiteGames;
    private static JogatinaAPPSPO jogatinaSiteAPPS;
    private static JogatinaAcordoPO jogatinaSiteAcordo;
    private static JogatinaSuportePO jogatinaSiteSuporte;
    private static JogatinaPoliticaPO jogatinaSitePolitica;
    private static JogatinaBuracoPO jogatinaSiteBuraco;
    private static JogatinaDominoPO jogatinaSiteDomino;
    private static JogatinaBingoPO jogatinaSiteBingo;
    private static JogatinaTrancaPO jogatinaSiteTranca;
    private static JogatinaTrucoPO jogatinaSiteTruco;
    private static JogatinaPokerPO jogatinaSitePoker;

    @BeforeClass
    public static void prepararTestes(){
        jogatinaSite = new JogatinaSitePO(driver);
        jogatinaSiteLogin = new JogatinaLoginPO(driver);
        jogatinaSiteGames = new JogatinaGamesPO(driver);
        jogatinaSiteAPPS = new JogatinaAPPSPO(driver);
        jogatinaSiteAcordo = new JogatinaAcordoPO(driver);
        jogatinaSiteSuporte = new JogatinaSuportePO(driver);
        jogatinaSitePolitica = new JogatinaPoliticaPO(driver);
        jogatinaSiteBuraco = new JogatinaBuracoPO(driver);
        jogatinaSiteDomino = new JogatinaDominoPO(driver);
        jogatinaSiteBingo = new JogatinaBingoPO(driver);
        jogatinaSiteTranca = new JogatinaTrancaPO(driver);
        jogatinaSiteTruco = new JogatinaTrucoPO(driver);
        jogatinaSitePoker = new JogatinaPokerPO(driver);
    }

    
    /**Nestes testes iremos fazer 3 verificacoes: 
     * 1. testar o clique do botao;
     * 2. comparar o link que somos redirecionados;
     * 3. Validar um elemento da pagina redirecionada.
     * 
     * Observacao importante: Não consigo realizar o teste na classe toda, pois
     * os testes estão indo numa velocidade muito rapida, estou verificando uma forma de colocar
     * tempo entre cada teste. Caso voce rode um caso se cada vez vai funcionar perfeitamente
     * o contrario nao, um teste aleatorio vai dar error por nao achar um elemento de verificacao
    */

    @Test
    public void TC001_VerificacaoDoButtonJOGAR(){
        
        /**Clique no botao Jogar*/
        jogatinaSite.textAndButtonJogar.click(); 

        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/site/login");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteLogin.textoParaContinuar.getText();
        assertEquals(resultado, "Para continuar, acesse sua conta ou faça um cadastro rápido no Jogatina.com");

    }

    @Test
    public void TC002_VerificacaoDoButtonNOSSOSJOGOS(){
        
        /**Clique no botao Nossos Jogos*/
        jogatinaSite.textAndButtonNossosJogos.click(); 

        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/site/games/all");
        
        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteAPPS.textoNossosJogos.getText();
        assertEquals(resultado, "Nossos Jogos");

    }

    @Test
    public void TC003_VerificacaoDoButtonNOSSOSAPLICATIVOS(){
        
        /**Clique no botao Nossos Aplicativos*/
        jogatinaSite.textAndButtonNossosAplicativos.click(); 

        /**redirecionando para pagina de teste e fechando a segunda aba aberta DESENVOLIMENTO*/
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow); 
        
        
        /**Redirecionando a pagina atual para a pagina clicada*/
        String URL_NOSSOSJOGOS = "https://apps.jogatina.com/pt/";
        driver.get(URL_NOSSOSJOGOS);
        

        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://apps.jogatina.com/pt/");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteGames.textoEmDestaque.getText();
        assertEquals(resultado, "Em Destaque");
        
    }

    @Test
    public void TC004_VerificacaoDoButtonMAISuporte(){
        
        /**Neste teste iremos sempre retornar a pagina jogatina e clicar no botão MAIS*/
        jogatinaSite.textAndButtonMais.click(); 

        /**Clique no botao Suporte*/
        jogatinaSite.textAndButtonMAISSuporte.click();
       
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://ajuda.jogatina.com/hc/pt-br");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteSuporte.textoAtividade.getText();
        assertEquals(resultado, "Atividade recente");

    }

    @Test
    public void TC0041_VerificacaoDoButtonMAISAcordo(){
        
        /**Neste teste iremos sempre retornar a pagina jogatina e clicar no botão MAIS*/
        jogatinaSite.textAndButtonMais.click(); 

        /**Clique no botao Mais Acordo*/            
        jogatinaSite.textAndButtonMAISAcordo.click();
        
        /**Redirecionando a pagina para a pagina pai*/
        String URL_ACORDO = "https://www.jogatina.com/site/terms";
        driver.get(URL_ACORDO);

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteAcordo.textoAcordo.getText();
        assertEquals(resultado, "Acordo de Utilização");

    }

    @Test
    public void TC0042_VerificacaoDoButtonMAISPrivacidade(){
        
        /**Neste teste iremos sempre retornar a pagina jogatina e clicar no botão MAIS*/
        jogatinaSite.textAndButtonMais.click();

        
        /**Redirecionando a pagina para a pagina Privacidade*/
        String URL_POLITICA = "https://www.iubenda.com/privacy-policy/70989617";
        driver.get(URL_POLITICA); 
        
        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSitePolitica.textoResumoPolitica.getText();
        assertEquals(resultado, "Resumo da Política de privacidade");

    }

    @Test
    public void TC005_VerificacaoDoButtonCADASTRASE(){
        
        /**Clique no botao Cadastra se*/
        jogatinaSite.textAndButtonCadastrase.click(); 
        
    }

    @Test
    public void TC006_VerificacaoDoButtonBURACO(){
        
        /**Clique no botao Descricao Buraco*/
        jogatinaSite.textAndButtonDescricaoBuraco.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/buraco-online.html");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteBuraco.textoBuracoOnline.getText();
        assertEquals(resultado, "Buraco Online, saiba como jogar");
        
    }

    @Test
    public void TC007_VerificacaoDoButtonDOMINO(){
        
        /**Clique no botao Descricao Domino*/
        jogatinaSite.textAndButtonDescricaoDomino.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/domino-online.html");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteDomino.textoOMelhorDomino.getText();
        assertEquals(resultado, "O MELHOR JOGO DE DOMINÓ ONLINE!");
        
    }

    @Test
    public void TC008_VerificacaoDoButtonBINGO(){
        
        /**Clique no botao Descricao Bingo*/
        jogatinaSite.textAndButtonDescricaoBingo.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/bingo-online.html");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteBingo.textoOMelhorBingo.getText();
        assertEquals(resultado, "O MELHOR BINGO ONLINE");

    }

    @Test
    public void TC009_VerificacaoDoButtonTRANCA(){
        
        /**Clique no botao Descricao Tranca*/
        jogatinaSite.textAndButtonDescricaoTranca.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/tranca-online.html");
        
        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteTranca.textoOJogo.getText();
        assertEquals(resultado, "O jogo");
        
    }

    @Test
    public void TC0010_VerificacaoDoButtonTRUCO(){
        
        /**Clique no botao Descricao Truco*/
        jogatinaSite.textAndButtonDescricaoTruco.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/truco-online.html");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSiteTruco.textoTrucoOnline.getText();
        assertEquals(resultado, "Truco Online, saiba como jogar");
        
    }

    @Test
    public void TC0011_VerificacaoDoButtonPOKER(){
        
        /**Clique no botao Descricao Poker*/
        jogatinaSite.textAndButtonDescricaoPoker.click(); 
        
        /**Verificando o link que a pagina está sendo redirecionada*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/poker-online.html");

        /**Validando um elemento da pagina redirecionada*/
        String resultado = jogatinaSitePoker.textoOMelhroPoker.getText();
        assertEquals(resultado, "O MELHOR POKER ONLINE");

    }
}
