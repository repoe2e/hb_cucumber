package projeto_hb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CompraTeste {
	
	private WebDriver driver;
	
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
	    
	    
	}

	@When("insiro um preco e uma quantidade")
	public void insiro_um_preco_e_uma_quantidade() {
	    
	   
	}

	@When("clico no botao {string}")
	public void clico_no_botao(String string) {
	  
	    
	}

	@Then("o valor total da compra deve reduzir o saldo")
	public void o_valor_total_da_compra_deve_reduzir_o_saldo() {
	    
	   
	}

	@Then("a quantidade atualizada na carteira")
	public void a_quantidade_atualizada_na_carteira() {
	    
	   
	}

	@Then("a quantidade reduzida no livro de oferta")
	public void a_quantidade_reduzida_no_livro_de_oferta() {
	   
	    
	}

}
