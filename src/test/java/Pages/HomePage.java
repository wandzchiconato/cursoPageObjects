package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    private final String TERMO = "Mantis";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "searchtext")
    private WebElement termo;

    @FindBy(id = "btn_form_search")
    private WebElement btnLupa;

    public void escreverTermo(String termo) {
        this.termo.clear();
        this.termo.sendKeys(termo);
    }

    public void escreverTermo(){
        this.termo.sendKeys(TERMO);
    }

    public void clicarEnter(){
        termo.sendKeys(Keys.ENTER);
    }

    public void clicarLupa() {
        btnLupa.click();
    }
}


/*

package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
    private final String TERMO = "Mantis";

    // Textbox de busca
    @FindBy(id = "searchtext")
    private WebElement termo;

    // Botão da Lupa
    @FindBy(id = "btn_form_search")
    private WebElement btnLupa;

    public Home(WebDriver driver) {
        super(driver);
    }

    public void limparTermo(){
        this.termo.clear();
    }

    public void escreverTermo(String termo){
        this.termo.sendKeys(termo);
    }

    public void escreverTermo(){
        this.termo.sendKeys(TERMO);
    }

    public void pressionarEnter(){
        this.termo.sendKeys(Keys.ENTER);
    }

    public void clicarBotaoLupa(){
        this.btnLupa.click();
    }

}
*/
