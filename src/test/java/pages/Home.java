package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home  {


    WebDriver driver;



    @FindBy(id = "searchtext")
    WebElement caixaDePesquisa;

    @FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/div[1]/span[1]/button[1]/i[1]")
    WebElement botaoProcurar;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void pesquisarPorCurso(String curso){
        caixaDePesquisa.click();
        caixaDePesquisa.clear();
        caixaDePesquisa.sendKeys(curso);

    }
    public void clicarNaLupa() {

        botaoProcurar.click();
    }
}
