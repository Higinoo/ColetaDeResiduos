#language: pt

@regressivo
Funcionalidade: Deletar entrega

  Contexto: Cadastro de entregas com sucesso
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor        |
      | numeroPedido   | 1            |
      | nomeEntregador | Leonardo B   |
      | statusEntrega  | EM_SEPARACAO |
      | dataEntrega    | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 201

    Cenario: Deve ser possivel deletar uma entrega
      Dado que eu recupere o ID da entrega criado no contexto
      Quando eu enviar a requisicao com o ID para o endpoint "/entregas" de delecao de entrega
      Então o status code deve retornar 204
