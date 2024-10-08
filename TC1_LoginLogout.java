package testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.BaseTest;
import pages.HomePage;
import pages.LoginPage;

@Listeners(generics.Screenshot.class)
public class TC1_LoginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() throws IOException, InterruptedException
	{
		HomePage homePage=new HomePage(driver);
		homePage.logoutMethod();
	}
}