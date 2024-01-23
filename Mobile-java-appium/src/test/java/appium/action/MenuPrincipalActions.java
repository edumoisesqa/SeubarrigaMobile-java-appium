package appium.action;

import appium.page.MasterPageFactory;
import appium.page.MenuPrincipalPage;

public class MenuPrincipalActions {

    public static MenuPrincipalPage menuPrincipalPage() {
        return MasterPageFactory.getPage(MenuPrincipalPage.class);
    }

    public static void selecionarMenuFormulario() {
        menuPrincipalPage().getFormulario().click();
    }

    public static void selecionarMenuCadastroSeuBarrigaNativo(){

        menuPrincipalPage().getSeuBarrigaNativo().click();

    }
}