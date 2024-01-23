#language:pt

@wip
Funcionalidade: Casdastrar novo cliente seu barriga

  Contexto: Como usuário de aplicativo desejo cadastrar um cliente no app.

  Cenario: Logar seu barriga nativo com dados validos
    Dado que acesso a tela de login seu barriga nativo
    E preencho as informações obrigatorias da tela de login
    Quando seleciono opcao entrar
    Entao deve validar um novo cliente cadastrado com lista

  Cenario: Nao permitir logar seu barriga nativo dados invalidos
    Dado que acesso a tela de login seu barriga nativo
    E preencho as informações obrigatorias da tela de login dados invalidos
    Quando seleciono opcao entrar
    Entao devera exibir mensagem que usuario e invalido