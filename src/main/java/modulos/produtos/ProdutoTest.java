package modulos.produtos;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@DisplayName("Testes Mobile do Módulo de Produtos")
public class ProdutoTest {
    @DisplayName("Validação de Valor de Produto Não Permitido")
    @Test
    public void testValidacaodeValordeProdutoNaoPermitido() throws MalformedURLException {
        // Abrir o App
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName","Google Pixel 3");
        capacidades.setCapability("platform","Android");
        capacidades.setCapability("udid","192.168.150.101:5555");
        capacidades.setCapability("appPackage","com.lojinha");
        capacidades.setCapability("appActivity","com.lojinha.ui.MainActivity");
        capacidades.setCapability("app","C:\\Users\\Acer\\lojinha-nativa.apk");

        WebDriver app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capacidades);


        // Fazer Login

        // Abrir o Formulário de Novo Produto

        // Cadastrar um produto com valor inválido

        // Validar que a mensagem de valor inválido foi apresentada
    }

}
