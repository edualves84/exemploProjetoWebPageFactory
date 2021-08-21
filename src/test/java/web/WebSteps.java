package web;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Carrinho;
import pages.Home;
import pages.Resultado;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


public class WebSteps  {
    String casoDeTeste = "consultar curso mantis";
    String textoEsperado2 = "Mantis";
    String textoEsperado3=  "R$ 49,99";
    static String dataHora = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
    WebDriver driver;
    Evidencia evidencia;
    Logs logs;
    Home home;
    Resultado resultado;
    Carrinho carrinho;


    @Before
    public void iniciar() throws IOException {
        System.out.println("passo 1");
        System.setProperty("webdriver.chrome.driver", "driver/92/chromedriver.exe");
        driver = new ChromeDriver();
        home = new Home(driver);
        evidencia = new Evidencia();
        logs = new Logs();
        resultado = new Resultado(driver);
        carrinho = new Carrinho(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        logs.iniciarCSV(dataHora);
    }
    @After
    public void finalizando(){
        driver.quit();

    }


    @Given("^acesso o site da iterasys$")
    public void acessoOSiteDaIterasys() throws IOException {

       driver.get("https://iterasys.com.br/");
        evidencia.print(driver,dataHora, casoDeTeste,"passo 1 - abriu o site");
        logs.registrarCSV("consultar curso mantis", "iniciou o teste");
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String curso) throws IOException {
        home.pesquisarPorCurso(curso);
        evidencia.print(driver, dataHora,casoDeTeste, "passo 2 - pesquisou por curso");


    }

    @And("^clico na lupa$")
    public void clicoNaLupa() throws IOException {
        home.clicarNaLupa();
        evidencia.print(driver,dataHora, casoDeTeste,"passo 3 - clicou na lupa");
    }

    @Then("^vejo a lista de resultados para o curso \"([^\"]*)\"$")
    public void vejoAListaDeResultadosParaOCurso(String argh) throws IOException {
        String textoEsperado = "Cursos › \"mantis\"";
        assertEquals(resultado.lerIndicadorDeCurso(), textoEsperado);
        evidencia.print(driver,dataHora,casoDeTeste,"passo 4 - exibe lista de resultados do curso");

    }

    @When("^quando clico em matricule-se$")
    public void quandoClicoEmMatriculeSe() throws IOException {
        resultado.clicarMatriculese();
        evidencia.print(driver,dataHora,casoDeTeste,"passo 5 - clica em matricule-se");
    }

    @Then("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\"$")
    public void confirmoONomeDoCursoComoEOPrecoDe(String arg0, String arg1) throws IOException {
        assertEquals(carrinho.lerIndicadorDeCurso2(), textoEsperado2);
        assertEquals(carrinho.lerIndicadorDeCurso3(), textoEsperado3);
        evidencia.print(driver,dataHora, casoDeTeste,"passo 6 - verificar o resultado esperado do nome e preço do curso");
    }
}
