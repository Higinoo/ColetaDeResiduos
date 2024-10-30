#language: pt

@regressivo
Funcionalidade: Validar contrato no cadastro de coleta

  Cenario: Validar contrato cadastro de coleta de residuo bem sucedido
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor        |
      | numeroColeta   | 1            |
      | nomeColeta     | Leonardo B   |
      | statusColeta   | HA_COLETAR   |
      | dataColeta     | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 201
    E que o arquivo de contrato esperado é o "Cadastro bem-sucedido de coleta"
    Então a resposta da requisição deve estar em conformidade com o contrato selecionado
