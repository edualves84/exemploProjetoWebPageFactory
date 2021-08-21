package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrinho {



    WebDriver driver;

    @FindBy(css = "body.flat-theme:nth-child(2) div.container:nth-child(3) div.checkout-wrap div.checkout:nth-child(3) div.tab-content div.tab-pane.active.carrinho:nth-child(1) table.table.carrinho.list:nth-child(1) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) div.item > span.item-title")
    WebElement indicadorCurso2;

    @FindBy(css= "body.flat-theme:nth-child(2) div.container:nth-child(3) div.checkout-wrap div.checkout:nth-child(3) div.tab-content div.tab-pane.active.carrinho:nth-child(1) table.table.carrinho.list:nth-child(1) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) div.item > span.new-price")
     WebElement indicadorPreco;

    public Carrinho(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);
    }

    public String lerIndicadorDeCurso2(){
     return indicadorCurso2.getText();

    }

   public String lerIndicadorDeCurso3() {
     return indicadorPreco.getText();
   }

}
