package test.stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import main.pages.PayPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import main.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class PaySteps {
    LoginPage loginPage;
    PayPage payPage;

    @Given("el usuario está en la página de login")
    public void abrirPaginaLogin() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        payPage = new PayPage(driver);
    }

    @When("el usuario ingresa su usuario {string} y contraseña {string}")
    public void ingresarCredenciales(String usuario, String password) {
        loginPage.enterUsername(usuario);
        loginPage.enterPassword(password);
    }

    @And("hace clic en el botón de iniciar sesión")
    public void hacerClickEnLogin() {
        loginPage.clickLogin();
    }

    @Then("el usuario debe ver la pagina principal con el mensaje {string}")
    public void validarHomePage(String mensajeEsperado) {
        loginPage.assertHomePage(mensajeEsperado);
    }

    @And("el usuario selecciona el producto y continua la compra")
    public void elUsuarioSeleccionaElProductoYContinuaLaCompra() {

        payPage.addProduct();
        payPage.clickShopingCart();
        payPage.getTextNamePrice();

    }

    @And("el usuario ingresa sus datos {string}, {string} y {string}")
    public void elUsuarioIngresaSusDatosY(String name, String lastname, String postal) {
        payPage.insertDate(name,lastname,postal);
    }

    @And("el usuario valida que el nombre de su producto y precio sea correcto")
    public void elUsuarioValidaQueElNombreDeSuProductoYPrecioSeaCorrecto() {
        payPage.validateProduct();
    }

    @Then("el usuario finaliza la compra y se muestra un mensaje al finalizar {string}")
    public void elUsuarioFinalizaLaCompraYSeMuestraUnMensajeAlFinalizar(String message) {
        payPage.payFinished(message);
    }

    @And("el usuario selecciona los productos {string} y continua la compra")
    public void elUsuarioSeleccionaLosProductosYContinuaLaCompra(String numbProducts) {
        payPage.addProducts(Integer.parseInt(numbProducts));
        payPage.clickShopingCart();
        payPage.getTextNamePrices(Integer.parseInt(numbProducts));
    }

    @And("el usuario valida que el nombre de sus productos y precio sea correcto {string}")
    public void elUsuarioValidaQueElNombreDeSusProductosYPrecioSeaCorrecto(String numbProducts) {
        payPage.validateProducts(Integer.parseInt(numbProducts));
    }
}
