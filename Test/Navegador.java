import org.junit.BeforeClass;
import org.junit.Test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Navegador {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void configura(){
		System.setProperty("webdriver.chrome.driver","/ice/workspace/TS_Chr_2018/Librarises/chromedriver");
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com.br%2Fsearch%3Fei%3DSnPaWt_KMsKUwATx2L7oBA%26q%3DMHmarvin%26oq%3DMHmarvin%26gs_l%3Dpsy-ab.3..0i13k1l10.17215.27605.0.27941.8.8.0.0.0.0.138.946.2j6.8.0....0...1.1.64.psy-ab..0.8.943...0j0i13i10k1j0i10k1j0i30k1.0.aa8n07YP6bI&hl=pt-BR&flowName=GlifWebSignIn&flowEntry=SignUp");
		
	}
	@Test
	public void testaPagina(){
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Luis Felipe");
	}
}
