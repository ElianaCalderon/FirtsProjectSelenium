package EjerciciosSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestChrome {
	public static void main (String args []) {
		WebDriver driver;
		String baseURL="https://www.atm.cat/web/index.php";
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		driver.get(baseURL);
		String Titulo = driver.getTitle();
		String Url = driver.getCurrentUrl();
		System.out.println("El titulo de mi pagina es: "+Titulo);
		System.out.println("La URL actual es: "+Url);
		WebElement botonCerrar = driver.findElement(By.cssSelector("div.modal-header button.close"));
		System.out.println("boton cerrar Displayed: "+botonCerrar.isDisplayed());
		botonCerrar.click();
		WebElement menuAtm = driver.findElement(By.xpath("//a[contains(text(), 'ATM')]"));		
		System.out.println("Menu Displayed: "+menuAtm.isDisplayed());
		System.out.println("Menu Enabled: "+menuAtm.isEnabled());
		System.out.println("Texto del menú: "+menuAtm.getText());
		
		
		WebElement menuObservatori = driver.findElement(By.xpath("//a[contains(text(), 'Observatori')]"));		
		System.out.println("Menu Displayed: "+menuObservatori.isDisplayed());
		System.out.println("Menu Enabled: "+menuObservatori.isEnabled());
		System.out.println("Texto del menú: "+menuObservatori.getText());
		
		WebElement inputBuscar = driver.findElement(By.cssSelector("input.gsc-input"));
		inputBuscar.click();
		inputBuscar.sendKeys("Test");
		WebElement inputSearch = driver.findElement(By.cssSelector("button.gsc-search-button"));
		inputSearch.click();
		WebElement Resultats = driver.findElement(By.cssSelector("div.headline h1"));
		System.out.println("Menu Enabled: "+Resultats.isEnabled());
		System.out.println("Texto del menú: "+Resultats.getText());
		
		String UrlResultados = driver.getCurrentUrl();
		System.out.println("La URL actual es: "+UrlResultados);
		
		
		//driver.quit();
	
}
	}
