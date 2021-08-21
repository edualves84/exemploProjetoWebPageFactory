Feature: Consultar curso
  Scenario: consulta
   Given  acesso o site da iterasys
    When   pesquiso por "Mantis"
    And    clico na lupa
    Then   vejo a lista de resultados para o curso "Mantis"
    When   quando clico em matricule-se
    Then   confirmo o nome do curso como "Mantis" e o preco de "R$ 49,99"