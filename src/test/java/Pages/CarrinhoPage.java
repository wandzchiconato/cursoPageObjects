package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPage extends PageObject {

    public CarrinhoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "item-title")
    private WebElement nomeCurso;

    @FindBy(className = "new-price")
    private WebElement precoCurso;

    public String getNomeCurso() {
        return nomeCurso.getText();
    }

    public String getPrecoCurso() {
        return precoCurso.getText();
    }
}


/*
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrinho extends PageObject {
    @FindBy(css = "span.item-title")
    private WebElement tituloCurso;

    @FindBy(css = "span.new-price")
    private WebElement precoCurso;

    public Carrinho(WebDriver driver) {
        super(driver);
    }

    public String lerTituloCurso(){
        return this.tituloCurso.getText();
    }

    public String lerPrecoCurso(){
        return this.precoCurso.getText();
    }

}
*/

