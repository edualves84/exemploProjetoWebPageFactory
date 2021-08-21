$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web.feature");
formatter.feature({
  "line": 1,
  "name": "Consultar curso",
  "description": "",
  "id": "consultar-curso",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2047332500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "consulta",
  "description": "",
  "id": "consultar-curso;consulta",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "acesso o site da iterasys",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso por \"Mantis\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clico na lupa",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "vejo a lista de resultados para o curso \"Mantis\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "quando clico em matricule-se",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "confirmo o nome do curso como \"Mantis\" e o preco de \"R$ 49,99\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WebSteps.acessoOSiteDaIterasys()"
});
formatter.result({
  "duration": 104617100,
  "error_message": "java.lang.NullPointerException\r\n\tat web.WebSteps.acessoOSiteDaIterasys(WebSteps.java:60)\r\n\tat ✽.Given acesso o site da iterasys(web.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 14
    }
  ],
  "location": "WebSteps.pesquisoPor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebSteps.clicoNaLupa()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 41
    }
  ],
  "location": "WebSteps.vejoAListaDeResultadosParaOCurso(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebSteps.quandoClicoEmMatriculeSe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 31
    },
    {
      "val": "R$ 49,99",
      "offset": 53
    }
  ],
  "location": "WebSteps.confirmoONomeDoCursoComoEOPrecoDe(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 674791500,
  "status": "passed"
});
});