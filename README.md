# Conversor de Moedas em Java

Este é um projeto de um conversor de moedas em Java, que utiliza a API ExchangeRate para obter taxas de câmbio em tempo real. O programa é composto por três classes principais: `Principal`, `Consulta` e `Opcoes`.

## Estrutura do Projeto

- **Principal**
  - Classe principal que executa o programa e interage com o usuário.
- **Consulta**
  - Classe responsável por realizar consultas à API de taxas de câmbio.
- **Opcoes**
  - Classe que apresenta o menu de opções e executa as conversões de moedas.

## Classes

### Principal

A classe `Principal` é responsável por inicializar o programa e gerenciar a interação com o usuário.


### Consulta

A classe `Consulta` realiza as consultas à API de taxas de câmbio e retorna os resultados.


### Opcoes

A classe `Opcoes` apresenta o menu de opções e realiza as conversões de moedas com base na escolha do usuário.


## Dependências

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Gson](https://github.com/google/gson) (para converter JSON para objetos Java)
