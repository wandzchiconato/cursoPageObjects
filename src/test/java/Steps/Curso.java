package Steps;

import Pages.BuscaPage;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Curso {
    WebDriver driver;
    HomePage home;
    BuscaPage busca;
    CarrinhoPage carrinho;
//    HomePage home = new HomePage(driver);
//    BuscaPage busca = new BuscaPage(driver);
//    CarrinhoPage carrinho = new CarrinhoPage(driver);

    @Before
    public void iniciar() {

        System.setProperty("webdriver.chrome.driver", Utils.caminhoChromeDriver);
        driver = new ChromeDriver();
        home = new HomePage(driver);
        busca = new BuscaPage(driver);
        carrinho = new CarrinhoPage(driver);

        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        /*
        System.setProperty("webdriver.chrome.driver", Utils.caminhoChromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        home = new HomePage(driver);
        busca = new BuscaPage(driver);
        carrinho = new CarrinhoPage(driver);

         */
    }

    @Dado("^que o visitante acessa o site da Iterasys PO$")
    public void que_o_visitante_acessa_o_site_da_Iterasys_PO() throws Throwable {
        driver.get(Utils.url);
    }

    @E("^preenche o termo de busca como \"([^\"]*)\" PO$")
    public void preenche_o_termo_de_busca_como_PO(String termo) throws Throwable {
        home.escreverTermo(termo);
    }

    @E("^clica no icone da lupa PO$")
    public void clica_no_icone_da_lupa_PO() throws Throwable {
        home.clicarLupa();
    }

    @Entao("^vizualiza a lista de cursos relacionado a \"([^\"]*)\" PO$")
    public void vizualiza_a_lista_de_cursos_relacionado_a_PO(String termo) throws Throwable {
        Assert.assertEquals(busca.obterTitulo(), "Cursos" + termo);
    }

    @Quando("^seleciona o curso \"([^\"]*)\" na lista PO$")
    public void seleciona_o_curso_na_lista_PO(String titulo) throws Throwable {
        busca.clicarMatriculeSe();
    }

    @Entao("^visualiza o titulo como \"([^\"]*)\" e preco como \"([^\"]*)\" PO$")
    public void visualiza_o_titulo_como_e_preco_como_PO(String titulo, String preco) throws Throwable {
        Assert.assertEquals(titulo, carrinho.getNomeCurso());
        Assert.assertEquals(preco, carrinho.getPrecoCurso());
    }

    @After
    public void finalizar() {
        driver.quit();
    }
}


/*
package Steps;

import Pages.Busca;
import Pages.Carrinho;
import Pages.Home;
import Pages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class CursoPageObject {

    WebDriver driver;

    // Referencia a todas as páginas envolvidas no teste
    Home home;
    Busca busca;
    Carrinho carrinho;

    @BeforeSuite
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", Utils.caminhoChromeDriver);
        driver = new ChromeDriver();
        home = new Home(driver);
        busca = new Busca(driver);
        carrinho = new Carrinho(driver);

        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void finalizar(){
        driver.quit();
    }

    @Dado("^que o visitante acessa o site da Iterasys PO$")
    public void que_o_visitante_acessa_o_site_da_Iterasys_PO() throws Throwable {
        driver.get("https://www.iterasys.com.br");
    }

    @E("^preenche o termo de busca como \"([^\"]*)\" PO$")
    public void preenche_o_termo_de_busca_como_PO(String termo) throws Throwable {
        home.escreverTermo(termo);
    }

    @E("^clica no botao Lupa PO$")
    public void clica_no_botao_Lupa_PO() throws Throwable {
        home.clicarBotaoLupa();
    }

    @Entao("^visualiza a lista de cursos relacionados a \"([^\"]*)\" PO$")
    public void visualiza_a_lista_de_cursos_relacionados_a_PO(String termo) throws Throwable {
        Assert.assertEquals("Curso" + termo, busca.lerIndicadorPagina());
    }

    @Quando("^seleciona o curso \"([^\"]*)\" na lista PO$")
    public void seleciona_o_curso_na_lista_PO(String arg1) throws Throwable {
        busca.clicarEmMatriculeSe();
    }

    @Entao("^visualiza o titulo como \"([^\"]*)\" e o preco como \"([^\"]*)\" PO$")
    public void visualiza_o_titulo_como_e_o_preco_como_PO(String titulo, String preco) throws Throwable {
        Assert.assertEquals(titulo,carrinho.lerTituloCurso());
        Assert.assertEquals(preco,carrinho.lerPrecoCurso());
    }
}
*/