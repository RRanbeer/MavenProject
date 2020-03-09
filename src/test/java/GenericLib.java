import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.autodesk.crm.genriclib.FileLib;
public class GenericLib {
	
	public class BaseTest
	{
		public WebdriverUtils lib = new WebdriverUtils(); //Global
		public FileLib flib = new FileLib();
		public WebDriver driver;
		
		@BeforeSuite
		public void configBs()
		{
			System.out.println("Connect to db");
		}
		
		@BeforeClass
		public void configBc() throws EncryptedDocumentException, IOException
		{
			String BrowserName = flib.getPropertyKeyValue("browser");
			System.out.println("============launch the browser==========");
			if(BrowserName.equals("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(BrowserName.equals("firefox"))
			{
				driver = new FirefoxDriver(); 
			}
		}

}
