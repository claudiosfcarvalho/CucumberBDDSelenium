$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/integracaoHerokuSrBarriga.feature");
formatter.feature({
  "name": "Cadastro de contas",
  "description": "Como um usuário \nGostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@srbarriga"
    }
  ]
});
formatter.scenario({
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@srbarriga"
    }
  ]
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "srbarrigaSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o usuário \"teste@claudiowork.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "srbarrigaSteps.informoOUsuário(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.claudiowork.steps.srbarrigaSteps.informoOUsuário(srbarrigaSteps.java:25)\r\n\tat ✽.informo o usuário \"teste@claudiowork.com\"(src/test/resources/features/integracaoHerokuSrBarriga.feature:11)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "a senha \"teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "srbarrigaSteps.aSenha(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.match({
  "location": "srbarrigaSteps.selecionoEntrar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.match({
  "location": "srbarrigaSteps.visualizoAPáginaInicial()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.match({
  "location": "srbarrigaSteps.selecionoContas()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "srbarrigaSteps.selecionoAdicionar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "informo a conta \"Conta de Teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "srbarrigaSteps.informoAConta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.match({
  "location": "srbarrigaSteps.selecionoSalvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a conta é inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "srbarrigaSteps.aContaÉInseridaComSucesso()"
});
formatter.result({
  "status": "skipped"
});
});