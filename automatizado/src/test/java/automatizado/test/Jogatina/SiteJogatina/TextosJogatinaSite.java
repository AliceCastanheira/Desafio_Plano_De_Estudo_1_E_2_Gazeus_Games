package automatizado.test.Jogatina.SiteJogatina;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.pageObject.Jogatina.JogatinaSitePO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextosJogatinaSite extends BaseTesteJogatinaSite {
    
    private static JogatinaSitePO jogatinaSite;
    @BeforeClass
    public static void prepararTestes(){
        jogatinaSite = new JogatinaSitePO(driver);

    }

    /**Nestes testes iremos fazer uma verificacao simples, 
     * Comparar o textos:
     * Nos iremos pegar o texto atraves do "getText()" e fazer uma comparacao usando
     * o "asserEquals", vamos sempre ter que deixar no codigo o texto vamos comparar na aba "actual"
     * Teremos algumas excecoes pois o "asserEquals" pega o texto completo e em alguns casos os textos ficam atualizando
     * neste caso iremos utilizar o "assertTrue" que pega qualquer parte do texto.
    */
    
    @Test
    public void TC001_BotaoJogar(){
        String mensagem = jogatinaSite.textAndButtonJogar.getText();
        assertEquals(mensagem, "Jogar"); 
    }

    @Test
    public void TC002_BotaoNossosJogos(){
        String mensagem = jogatinaSite.textAndButtonNossosJogos.getText();
        assertEquals(mensagem, "Nossos jogos"); 
    }

    @Test
    public void TC003_BotaoNossosAplicativos(){
        String mensagem = jogatinaSite.textAndButtonNossosAplicativos.getText();
        assertEquals(mensagem, "Nossos aplicativos"); 
    }

    @Test
    public void TC004_BotaoMais(){
        String mensagem = jogatinaSite.textAndButtonMais.getText();
        assertEquals(mensagem, "Mais");
    }

    @Test
    public void TC005_BotaoJogueGratis(){
        String mensagem = jogatinaSite.textCrieSuaConta.getText();
        assertEquals(mensagem, "CRIE SUA CONTA E JOGUE GRÁTIS!");
    }

    @Test
    public void TC006_TextoJogueOnline(){
        String mensagem = jogatinaSite.textJogueOnline.getText();
        assertEquals(mensagem, "Jogue Online com Seus Amigos no Jogatina! Divirta-se com Buraco, Truco, Tranca, Poker e muito mais.");
    }

    @Test
    public void TC007_TextoDomino(){
        String mensagem = jogatinaSite.textAndButtonDescricaoBuraco.getText();
        assertEquals(mensagem, "Quem não conhece o Buraco? Também chamado de canastra e biriba, este jogo dispensa comentários: a diversão é garantida!");
    }

    @Test
    public void TC008_TextoBingo(){
        String mensagem = jogatinaSite.textAndButtonDescricaoDomino.getText();
        assertEquals(mensagem, "Clássico, Fechado ou Ponta de 5: aproveite este passatempo clássico em três modalidades!");
    }
    
    @Test
    public void TC009_TextoTruco(){
        String mensagem = jogatinaSite.textAndButtonDescricaoTruco.getText();
        assertEquals(mensagem, "Conhecido de Norte a Sul, o Truco tem milhares de fãs. Como o blefe é permitido, nem sempre a melhor carta vence.");
    }

    @Test
    public void TC0010_TextoPaciencia(){
        String mensagem = jogatinaSite.textAndButtonDescricaoPaciencia.getText();
        assertEquals(mensagem, "Indicada para treinar a concentração, diminuir a ansiedade e elevar o raciocínio lógico. Jogue quantas vezes quiser!");
    }

    @Test
    public void TC0011_TextoPoker(){
        String mensagem = jogatinaSite.textAndButtonDescricaoPoker.getText();
        assertEquals(mensagem, "Socialização e desafio: o Poker Texas Holdem é o jogo de cartas mais popular do mundo. As fichas são grátis e a diversão também!");
    }

    @Test
    public void TC0012_TextoSuporte(){
        String mensagem = jogatinaSite.textAndButtonSuporte.getText();
        assertEquals(mensagem, "Suporte");
    }

    @Test
    public void TC0013_TextoAcordo(){
        String mensagem = jogatinaSite.textAndButtonAcordo.getText();
        assertEquals(mensagem, "Acordo de Utilização");
    }

    @Test
    public void TC0014_TextoPolitica(){
        String mensagem = jogatinaSite.textAndButtonPoliticaDePrivacidade.getText();
        assertEquals(mensagem, "Política de Privacidade");
    }

    @Test
    public void TC0015_TextoMapa(){
        String mensagem = jogatinaSite.textAndButtonMapaDoSite.getText();
        assertEquals(mensagem, "Mapa do Site"); 
    }

    @Test
    public void TC0016_TextoSiga(){
        String mensagem = jogatinaSite.textSigaNos.getText();
        assertEquals(mensagem, "Siga-nos!"); 
    }

    @Test
    public void TC0017_TextoDiretos(){
        String mensagem = jogatinaSite.textTodosOsDireiros.getText();
        assertEquals(mensagem, "Jogatina.com © 2006-2023 Todos os direitos reservados");
    }

    @Test
    public void TC0018_TextoJogadoresNaSala(){
        String mensagem = jogatinaSite.textJogadoresNaSala.getText();
        assertTrue(mensagem, mensagem.contains("Jogadores nas salas"));
    }

    @Test
    public void TC0019_TextoDomino(){
        String mensagem = jogatinaSite.textJogueDomino.getText();
        assertTrue(mensagem, mensagem.contains("Jogue Dominó, Tranca e Truco e diversos outros jogos."));
    }

    @Test
    public void TC0020_TextoTranca(){
        String mensagem = jogatinaSite.textAndButtonDescricaoTranca.getText();
        assertTrue(mensagem, mensagem.contains("Na Tranca"));
    }

}


