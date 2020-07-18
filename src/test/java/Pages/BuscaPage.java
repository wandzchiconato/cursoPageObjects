package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaPage extends PageObject {

    public BuscaPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "h3")
    private WebElement titulo;

    @FindBy(className = "comprar")
    private WebElement btnMatricule;

    public String obterTitulo() {
        return driver.findElement(By.tagName("h3")).getText().replaceAll("[^a-zA-Z0-9]", "");
    }

    public void clicarMatriculeSe() {
        btnMatricule.click();
    }
}

/*
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Busca extends PageObject{
    private final String INDICADORPAGINA = "CursoMantis";

    @FindBy(tagName = "h3")
    private WebElement indicadorPagina;

    @FindBy(css = "span.comprar")
    private WebElement btnMatriculeSe;

    public Busca(WebDriver driver) {
        super(driver);
    }

    public String lerIndicadorPagina(){
        return this.indicadorPagina.getText().replaceAll("[^a-zA-Z0-9]", "");
    }

    public void clicarEmMatriculeSe(){
        this.btnMatriculeSe.click();
    }

}
*/