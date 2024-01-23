package appium.action;

import appium.page.LoginSeuBarrigaPage;
import appium.page.MasterPageFactory;
import appium.support.BaseScreen;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginSeuBarrigaActions extends BaseScreen {

    public static LoginSeuBarrigaPage loginSeuBarrigaPage() {
        return MasterPageFactory.getPage(LoginSeuBarrigaPage.class);
    }

    public static void InformarCamposObrigatoriosNovosClientes (){
        loginSeuBarrigaPage().getNome().sendKeys("Eduardo moises");
        loginSeuBarrigaPage().getSenha().sendKeys("1236445");
    }

    public static void SelecionarBotaoEntrar (){
        loginSeuBarrigaPage().getBtnEntrar().click();
    }

    public static void ValidarMensagemSucesso(){

    }

    public  static void ValidarMensagemError(){
        Assert.assertEquals("Problemas com o login", getText(By.xpath("//android.widget.TextView[@text=\"Problemas com o login\"]")));
    }
    public static void InformarCamposObrigatoriosNovosClientesInavalidos (){
        loginSeuBarrigaPage().getNome().sendKeys("Eduardo moises");
        loginSeuBarrigaPage().getSenha().sendKeys("ed");
    }


}
