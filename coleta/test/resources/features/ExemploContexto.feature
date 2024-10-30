#language: pt

@regressivo
Funcionalidade: Deletar coleta

  Contexto: Cadastro de coletas de residuo com sucesso
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor        |
      | numeroColeta   | 1            |
      | nomeColeta     | Leonardo B   |
      | statusColeta   | CANCELADO    |
      | dataColeta     | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/coletas" para cadastro de coleta de residuo
    Então o status code deve retornar 201

    Cenario: Deve ser possivel deletar uma coleta
      Dado que eu recupere o ID da entrega criado no contexto
      Quando eu enviar a requisicao com o ID para o endpoint "/coleta" de delecao de entrega
      Então o status code deve retornar 204
