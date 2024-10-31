#language: pt

@regressivo
Funcionalidade: Cadastro de Coleta

  Cenario: Cadastro de Coleta com sucesso
    Dado que eu tenha os seguintes dados de coleta:
      | campo          | valor        |
      | numeroColeta   | 1            |
      | nomeColeta     | Leonardo B   |
      | statusColeta   | COLETADO     |
      | dataColeta     | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 201

  Cenario: Cadastro de coletas sem sucesso
    Dado que eu tenha os seguintes dados de coleta:
      | campo          | valor        |
      | numeroColeta   | 1            |
      | nomeColeta     | Leonardo B   |
      | statusColeta   | HA_COLETAR   |
      | dataColeta     | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/coleta" para cadastro de coleta de residuos
    Então o status code deve retornar 400
    E o corpo de resposta de erro da api deve retornar a mensagem "Dados fornecidos estão em formato inválido."
