package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterLoginPage {

	WebDriver driver;

	By txt_email = By.id("email_create");
	By btn_createAnAccount = By.id("SubmitCreate");
	By radiobtn_Mr = By.id("id_gender1");
	By txt_firstName = By.id("customer_firstname");
	By txt_lastName = By.id("customer_lastname");
	By txt_password = By.id("passwd");
	By dropdown_days = By.id("days");
	By dropdown_months = By.id("months");
	By dropdown_years = By.id("years");
	By txt_addFirstName = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input");
	By txt_addLastName = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[2]/input");
	By txt_Address = By.id("address1");
	By txt_City = By.id("city");
	By dropdown_state = By.id("id_state");
	By txt_zipCode = By.id("postcode");
	By dropdown_Country = By.id("id_country");
	By txt_homePhone = By.id("phone");
	By txt_mobilePhone = By.id("phone_mobile");
	By btn_Register = By.id("submitAccount");

	By txt_emailCreated = By.id("email");
	By txt_passwordCreated = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
	By btn_Login = By.id("SubmitLogin");

	public RegisterLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void type_txt_email(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}

	public void click_btn_createAnAccount() {
		driver.findElement(btn_createAnAccount).click();
	}

	public void select_radiobtn_Mr() {
		driver.findElement(radiobtn_Mr).click();
	}

	public void type_txtfirstName(String nombre) {
		driver.findElement(txt_firstName).sendKeys(nombre);
	}

	public void type_txtlastName(String apellido) {
		driver.findElement(txt_lastName).sendKeys(apellido);
	}

	public void type_txtPassword(String password) {
		driver.findElement(txt_lastName).sendKeys(password);
	}

	public void select_days() {
		Select days = new Select(driver.findElement(dropdown_days));
		days.selectByValue("1");
	}

	public void select_months() {
		Select months = new Select(driver.findElement(dropdown_days));
		months.selectByValue("1");
	}

	public void select_years() {
		Select years = new Select(driver.findElement(dropdown_days));
		years.selectByValue("1980");
	}

	public void type_txtaddFirstName(String nombreDireccion) {
		driver.findElement(txt_addFirstName).sendKeys(nombreDireccion);
	}

	public void type_txtaddLastName(String apellidoDireccion) {
		driver.findElement(txt_addLastName).sendKeys(apellidoDireccion);
	}

	public void type_txtAddress(String direccion) {
		driver.findElement(txt_Address).sendKeys(direccion);
	}

	public void type_txtCity(String ciudad) {
		driver.findElement(txt_City).sendKeys(ciudad);
	}

	public void select_state() {
		Select state = new Select(driver.findElement(dropdown_state));
		state.selectByValue("1");
	}

	public void type_txtZipCode(String zipCode) {
		driver.findElement(txt_zipCode).sendKeys(zipCode);
	}

	public void select_Country() {
		Select country = new Select(driver.findElement(dropdown_Country));
		country.selectByValue("21");
	}

	public void type_txtHomePhone(String homePhone) {
		driver.findElement(txt_homePhone).sendKeys(homePhone);
	}

	public void type_txtMobilePhone(String mobilePhone) {
		driver.findElement(txt_mobilePhone).sendKeys(mobilePhone);
	}

	public void click_btnRegister() {
		driver.findElement(btn_Register).click();
	}

	public void type_loginUser(String user) {
		driver.findElement(txt_emailCreated).sendKeys(user);
	}

	public void type_loginPass(String pass) {
		driver.findElement(txt_passwordCreated).sendKeys(pass);
	}
	
	public void click_btnLogin() {
		driver.findElement(btn_Login).click();
	}
}
