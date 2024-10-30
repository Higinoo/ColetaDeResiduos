#language: pt

@regressivo
Funcionalidade: Cadastro de entregas

  Cenario: Cadastro de entregas com sucesso
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor        |
      | numeroPedido   | 1            |
      | nomeEntregador | Leonardo B   |
      | statusEntrega  | EM_SEPARACAO |
      | dataEntrega    | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 201

  Cenario: Cadastro de entregas sem sucesso
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor      |
      | numeroPedido   | 1          |
      | nomeEntregador | Leonardo B |
      | statusEntrega  | EM_VOO     |
      | dataEntrega    | 2024-10-23 |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 400
    E o corpo de resposta de erro da api deve retornar a mensagem "Dados fornecidos estão em formato inválido."
