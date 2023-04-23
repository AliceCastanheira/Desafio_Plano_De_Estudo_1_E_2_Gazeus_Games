package automatizado.test.Jogatina.SiteJogatina;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import automatizado.pageObject.Jogatina.JogatinaSitePO;
import automatizado.pageObject.Jogatina.Paginas.JogatinaWelcomePO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginSiteJogatina extends BaseTesteJogatinaSite {
    
    private static JogatinaSitePO jogatinaLogin;
    private static JogatinaWelcomePO jogatinaSiteWelcome;

    @BeforeClass
    public static void prepararTestes(){
        jogatinaLogin = new JogatinaSitePO(driver);
        jogatinaSiteWelcome = new JogatinaWelcomePO(driver);

    }

    /**Nestes testes a seguir iremos fazer verificacoes simples::
     * Vamos utilizar o metodo Executar Acao de Logar, que vai sempre colocar strings nos inputs senha e login,
     * vai clicar no botao para realizar login, nos so precisamos alterar o que vai ser escrito;
     * Primeira acao e colocar algo nos inputs;
     * Fazer o sistema de comparacoes nas mensagens de erro;
    */
    
    @Test
    public void TC001_naoDeveLogarComEmailESenhaVazios(){
        
        /**Inserindo o texto nos inputs email e senha*/
        jogatinaLogin.executarAcaoDeLogar("", "");
        
        /**Pegando a mensagem e fazendo uma comparacao*/
        String mensagem1 = jogatinaLogin.obterMensagemLogin();
        assertEquals(mensagem1, "Este campo é requerido.");

    }

    @Test
    public void TC002_naoDeveLogarComSenhaVazio(){

        /**Inserindo o texto nos inputs email e senha*/
        jogatinaLogin.executarAcaoDeLogar("testeaaa", "");
        
        /**Pegando a mensagem e fazendo uma comparacao*/
        String mensagem1 = jogatinaLogin.obterMensagemLogin();
        assertEquals(mensagem1, "Forneça um e-mail válido.");
    
    }

    @Test
    public void TC003_naoDeveLogarComLoginESenhaInvalidos(){

        /**Inserindo o texto nos inputs email e senha*/
        jogatinaLogin.executarAcaoDeLogar("teste", "teste");
        
        /**Pegando a mensagem e fazendo uma comparacao*/
        String mensagem1 = jogatinaLogin.obterMensagemLogin();
        assertEquals(mensagem1, "Forneça um e-mail válido.");
    
    }

    @Test
    public void TC004_naoDeveLogarComSenhaInvalido(){

        /**Inserindo o texto nos inputs email e senha*/
        jogatinaLogin.executarAcaoDeLogar("lili.castanheira12101@gmail.com", "teste");
        
        /**Pegando a mensagem e fazendo uma comparacao*/
        String mensagem1 = jogatinaLogin.obterAlertaErro();
        assertEquals(mensagem1, "Email ou senha incorretos. Por favor, tente novamente.");

    }

   @Test
    public void TC005_deveLogarComEmailESenhaValido(){

        /**Inserindo o texto nos inputs email e senha*/
        jogatinaLogin.executarAcaoDeLogar("lili.castanheira12101@gmail.com", "Alicehehe12");

        /**Comparando o link o qual fomos redirecionados apos realizar login com sucesso*/
        String strUrl = driver.getCurrentUrl();
        assertEquals(strUrl, "https://www.jogatina.com/welcome.do");
    
        /**Comparando um elemento da pagina a qual somos redirecionados*/
        String resultado = jogatinaSiteWelcome.textoEBotaoSejaVip.getText();
        assertEquals(resultado, "SEJA VIP!");
    }
    
}
