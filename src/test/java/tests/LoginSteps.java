package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterLoginPage;


public class LoginSteps {
	
	WebDriver driver=null;
	
	@Given("El navegador es abierto")
	public void el_navegador_es_abierto() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\eclipse-workspace\\RetoAutomationTesting\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("navega a la pagina principal")
	public void navega_a_la_pagina_principal() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}

	@When("el usuario da click en el boton Sign In")
	public void el_usuario_da_click_en_el_boton_sign_in() {
		HomePage homepage= new HomePage(driver);
		homepage.click_btn_SignIn();
	}

	@And("el usuario ingresa usuario y contrasena")
	public void el_usuario_ingresa_usuario_y_contrasena() throws InterruptedException {
		Thread.sleep(5000);
		RegisterLoginPage loginPage= new RegisterLoginPage(driver);
		loginPage.type_loginUser("acbd4321@yopmail.com");
		loginPage.type_loginPass("clave123");
		loginPage.click_btnLogin();
	}

	@Then("el usuario ingresa correctamente")
	public void el_usuario_ingresa_correctamente() {
		driver.quit();
	}
}