#language: pt

@regressivo
Funcionalidade: Validar contrato no cadastro de entregas

  Cenario: Validar contrato cadastro de entregas bem sucedido
    Dado que eu tenha os seguintes dados de entrega:
      | campo          | valor        |
      | numeroPedido   | 1            |
      | nomeEntregador | Leonardo B   |
      | statusEntrega  | EM_SEPARACAO |
      | dataEntrega    | 2024-10-23   |
    Quando eu enviar a requisicao para o endpoint "/entregas" para cadastro de entrega
    Então o status code deve retornar 201
    E que o arquivo de contrato esperado é o "Cadastro bem-sucedido de entrega"
    Então a resposta da requisição deve estar em conformidade com o contrato selecionado
