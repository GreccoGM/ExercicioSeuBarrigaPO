package base;

import dados.DadosCadastrados;
import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import paginas.PaginaHome;
import paginas.PaginaLogin;

public class BaseTestes {

    private static WebDriver driver;
    protected static PaginaLogin pagLogin;
    protected static PaginaHome pagHome;
    protected static DadosCadastrados dadosCadastrados;

    @Before
    public void inicializarDriver() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");
        pagLogin = new PaginaLogin(driver);
        pagHome  = new PaginaHome(driver);
        dadosCadastrados  = new DadosCadastrados(driver);
    }

}
