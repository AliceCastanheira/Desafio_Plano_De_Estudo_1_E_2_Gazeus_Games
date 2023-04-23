package automatizado.pageObject.Jogatina;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JogatinaSitePO extends BasePO {


    /**Texto: Jogadores nas salas*/
    @FindBy(xpath  = "/html/body/div[1]/div/div[1]")
    public WebElement textJogadoresNaSala;

   
    /**Texto e botão JOGAR*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[1]/a")
    public WebElement textAndButtonJogar;


    /**Texto e botão NOSSOS JOGOS*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[2]/a")
    public WebElement textAndButtonNossosJogos;

    /**Texto da pagina NOSSOS JOGOS*/
    @FindBy(xpath  = "/html/body/div[2]/div/h1")
    public WebElement textNossosJogos;


    

    /**Texto e botão NOSSOS APLICATIVOS*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[3]/a")
    public WebElement textAndButtonNossosAplicativos;

    /**Texto da pagina NOSSOS APLICATIVOS*/
    @FindBy(xpath  = "/html/body/div[3]/h2[1]")
    public WebElement textNossosAplicativos;



    
    /**Texto e botão MAIS*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[4]/a")
    public WebElement textAndButtonMais;

    /**Texto e botão SUPORTE*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[4]/ul/li[1]/a")
    public WebElement textAndButtonMAISSuporte;

    /**Texto e botão ACORDO*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[4]/ul/li[2]/a")
    public WebElement textAndButtonMAISAcordo;

    /**Texto e botão POLITICA DE PRIVACIDADE*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[4]/ul/li[3]/a")
    public WebElement textAndButtonMAISPolitica;

    /**Texto e botão MAPA DO SITE*/
    @FindBy(xpath  = "/html/body/div[1]/div/ul/li[4]/ul/li[4]/a")
    public WebElement textAndButtonMAISMapa;


    
    /**Texto e botao CADASTRE-SE*/
    @FindBy(xpath  = "/html/body/div[3]/div/div/a")
    public WebElement textAndButtonCadastrase;



    /**Texto Crie sua conta e Jogue Grátis!*/
    @FindBy(xpath  = "/html/body/div[3]/div/div/h4")
    public WebElement textCrieSuaConta;

    /**Texto Jogue Dominó, Tranca e Truco e diversos outros jogos.*/
    @FindBy(xpath  = "/html/body/div[3]/div/div/p")
    public WebElement textJogueDomino;

    /**Texto Jogue Online com Seus Amigos no Jogatina! Divirta-se com Buraco, Truco, Tranca, Poker e muito mais.*/
    @FindBy(xpath  = "/html/body/div[4]/h1")
    public WebElement textJogueOnline;



    /**Texto e botao descricao Buraco */
    @FindBy(xpath  = "/html/body/ul/li[1]/a/p")
    public WebElement textAndButtonDescricaoBuraco;

    /**Texto e botao descricao Domino */
    @FindBy(xpath  = "/html/body/ul/li[2]/a/p")
    public WebElement textAndButtonDescricaoDomino;

    /**Texto e botao descricao Bingo */
    @FindBy(xpath  = "/html/body/ul/li[3]/a/p")
    public WebElement textAndButtonDescricaoBingo;

    /**Texto e botao descricao Tranca */
    @FindBy(xpath  = "/html/body/ul/li[4]/a/p")
    public WebElement textAndButtonDescricaoTranca;

    /**Texto e botao descricao Truco */
    @FindBy(xpath  = "/html/body/ul/li[5]/a/p")
    public WebElement textAndButtonDescricaoTruco; 

    /**Texto e botao descricao Poker*/
    @FindBy(xpath  = "/html/body/ul/li[7]/a/p")
    public WebElement textAndButtonDescricaoPoker;

    /**Texto e botao descricao Paciencia*/
    @FindBy(xpath  = "/html/body/ul/li[6]/p[1]")
    public WebElement textAndButtonDescricaoPaciencia;
    


    /**Texto suporte*/
    @FindBy(xpath  = "/html/body/div[6]/div/ul/li[1]/a")
    public WebElement textAndButtonSuporte;
    

    /**Texto  AcordoDeUtilizacao*/
    @FindBy(xpath  = "/html/body/div[6]/div/ul/li[2]/a")
    public WebElement textAndButtonAcordo;

    /**Texto Politica de privacidade*/
    @FindBy(xpath  = "/html/body/div[6]/div/ul/li[3]/a")
    public WebElement textAndButtonPoliticaDePrivacidade;

    /**Texto Mapa do Site*/
    @FindBy(xpath  = "/html/body/div[6]/div/ul/li[4]/a")
    public WebElement textAndButtonMapaDoSite;

    /**Texto Siga-nos*/
    @FindBy(xpath  = "/html/body/div[6]/div/div[2]/span")
    public WebElement textSigaNos;

    /**Texto Todos os direitos*/
    @FindBy(xpath  = "/html/body/div[7]/div/div")
    public WebElement textTodosOsDireiros; 
    
    
    /**Imagem Logo Reclame Aqui*/
    @FindBy(xpath = "/html/body/div[6]/div/div[1]/img")
    public WebElement srcLogoReclameAquiFright;
    
    /**Imagem Logo Jogatina*/
    @FindBy(xpath = "/html/body/div[1]/div/a")
    public WebElement headerLogoJogatina;
    
    /**Imagem Logo Gazeus*/
    @FindBy(xpath = "/html/body/div[7]/div/a")
    public WebElement logoGazeus;

    
    /**Botao Entrar*/
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/a")
    public WebElement buttonEntrar;

    /**Imput Email*/
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/form/div[1]/input")
    public WebElement inputEmail;
    
    /**Imput Senha*/
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/form/div[3]/input")
    public WebElement inputSenha;

    /**Botao para realizar o login*/
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/form/input")
    public WebElement buttonLogin;

    /**Span do sistema sobre Erro*/
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/form/div[1]")
    public WebElement spanAlertaErro;

    /**Span do sistema exibindo uma mensagem*/
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/form/div[1]/label[2]")
    public WebElement spanMensagemLogin;

    /**Botao para deslogar*/
    @FindBy(xpath = "/html/body/div[1]/div/ul/li[6]/ul/li[13]/a")
    public WebElement buttonDeslogar;

    /**Botao da Setinha para baixo*/
    @FindBy(xpath = "/html/body/div[1]/div/ul/li[6]/a/i")
    public WebElement buttonSetinha;
    
    
    
    
    /**Construtor que vai criar a pagina da jogatina. 
     * @param driver Driver da pagina jogatina.
    */
    public JogatinaSitePO(WebDriver driver) {
        super(driver);     
    }

    /**metodo para sempre voltar para a pagina HOME Jogatina*/
    public void voltarAPaginaJogatina() {
        String URLjogatina = "https://www.jogatina.com/";
        driver.get(URLjogatina);
    }

    /**Metodo para escrever e apertar no tab e sempre limpar o campo*/
    public void escrever(WebElement input, String texto){
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }

    /**metodo para executar a acao de logar, ele vai clicar no botao de entrar, vai colocar o email e a senha, nos alteramos apenas o parametro no teste*/
    public void executarAcaoDeLogar(String email, String senha){
        buttonEntrar.click();
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
    
        buttonLogin.click();
    }

    /**metodo para executar a acao de deslogar, ele vai clicar na setinha para baixo na aba perfil e vai clicar em sair DESENVOLVIMENTO*/
    public void executarAcaoDeDesLogar(){
        buttonSetinha.click();
        buttonDeslogar.click();
    }

    /**metodo para sempre pegar o texto do alerta de erro no login*/
    public String obterAlertaErro() {
        return this.spanAlertaErro.getText();
    }
    

    /**metodo para sempre pegar o texto da caixa span de login*/
    public String obterMensagemLogin() {
        return this.spanMensagemLogin.getText();
    }
}

