package projeto_hb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraTeste {

	private WebDriver driver;

	By asset = By.id("asset");
	By price = By.id("price");
	By quantity = By.id("quantity");
	By balance = By.id("balance");
	By portfolio = By.id("portfolio");

	@Given("que eu estou na página inicial")
	public void que_eu_estou_na_página_inicial() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		// options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/admin/Desktop/hb/hb.html");
	}

	@When("eu seleciono um ativo da lista")
	public void eu_seleciono_um_ativo_da_lista() {

		driver.findElement(asset).sendKeys("GOOGL");
	}

	@When("insiro um preco e uma quantidade")
	public void insiro_um_preco_e_uma_quantidade() {

		driver.findElement(price).sendKeys("28.00");
		driver.findElement(quantity).sendKeys("10");
	}

	@When("clico no botao {string}")
	public void clico_no_botao(String botao) {
		driver.findElement(By.xpath("//*[text()='" + botao + "']")).click();
	}

	@Then("o valor total da compra deve reduzir o saldo")
	public void o_valor_total_da_compra_deve_reduzir_o_saldo() {

		System.out.println(driver.findElement(balance).getText());
	}

	@Then("a quantidade atualizada na carteira")
	public void a_quantidade_atualizada_na_carteira() {
		System.out.println(driver.findElement(portfolio).getText());

	}

	@Then("a quantidade reduzida no livro de oferta")
	public void a_quantidade_reduzida_no_livro_de_oferta() {
		System.out.println(driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText());

	}

}
