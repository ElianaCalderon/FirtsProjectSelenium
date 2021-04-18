package EjerciciosSelenium.scripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestIE {
	public static void main (String args []) throws InterruptedException {
		WebDriver driver;
		String baseURL="https://www.bbcearth.com/";
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		String Titulo = driver.getTitle();
		
		System.out.println("El titulo de mi pagina es: "+Titulo);
		driver.quit();
	
}
	}
