package appium.steps;

import appium.action.LoginSeuBarrigaActions;
import appium.action.MenuPrincipalActions;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
public class LoginSeuBarrigaSteps  {


    @Dado("^que acesso a tela de login seu barriga nativo$")
    public void que_acesso_a_tela_de_login_seu_barriga_nativo() throws Exception {
        MenuPrincipalActions.selecionarMenuCadastroSeuBarrigaNativo();
    }

    @Dado("^preencho as informações obrigatorias da tela de login$")
    public void preencho_as_informações_obrigatorias_da_tela_de_login() throws Exception {
        LoginSeuBarrigaActions.InformarCamposObrigatoriosNovosClientes();

    }

    @Quando("^seleciono opcao entrar$")
    public void seleciono_opcao_entrar() throws Exception {
     LoginSeuBarrigaActions.SelecionarBotaoEntrar();

    }

    @Entao("^deve validar um novo cliente cadastrado com lista$")
    public void deve_validar_um_novo_cliente_cadastrado_com_lista() throws Exception {
      LoginSeuBarrigaActions.ValidarMensagemSucesso();

    }

    @Dado("^preencho as informações obrigatorias da tela de login dados invalidos$")
    public void preencho_as_informações_obrigatorias_da_tela_de_login_dados_invalidos() throws Exception {
      LoginSeuBarrigaActions.InformarCamposObrigatoriosNovosClientesInavalidos();

    }

    @Entao("^devera exibir mensagem que usuario e invalido$")
    public void devera_exibir_mensagem_que_usuario_e_invalido() throws Exception {
        LoginSeuBarrigaActions.ValidarMensagemError();

    }


}
