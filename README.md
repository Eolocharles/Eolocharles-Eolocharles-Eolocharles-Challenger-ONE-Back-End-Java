<h1 align="center"> Challenger_ONE-Backend_End_Java </h1>

![caixa de seleção com opções de conversão](https://user-images.githubusercontent.com/52092018/221362586-f56ce786-3ab7-4643-a892-107753fdfa22.gif)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=GREEN&style=for-the-badge)

![GitHub Org's stars](https://img.shields.io/github/stars/Eolocharles?style=social)

Neste desafio do programa Oracle Next Education(ONE) foi proposto a criação de um conversor de moedas usando a bliblioteca JavaSwing.

## O Desafio
As funcionalidades propostas foram de conversão de Reais para Dólar, Euro, Libra esterlina, Peso argentino e Peso chileno, o inverso também deveria ser possível e as taxas de convesão poderiam ser estáticas, além disso, pediu-se que implementassemos uma funcionalidade extra de conversão a nosso critério.

## Funcionalidades implementadas
Para este projeto além das funcionalidades exigidas optei por expandir o leque de conversões de moedas sendo possível converter de qualquer moeda para outra dentro das cinco possíveis e para isso ser possível faço uso da API Open Exchange Rates, que me permite consultar de forma gratuita a cotação dessas moedas em relação ao Dólar, dado que uso para fazer a convesão entre as demais moedas. Nas funcionalidades extras optei por dois conversores, de tempertura e de unidades de distância, no de temperatura podemos converter entre as três escalas: Celsius, Fahrenheit e Kelvin, já no de Unidades de distância podemos converter entre: kilometros, metros,  milímetros, milhas, jardas, pés e polegadas.

## Como Usar

Para testar basta clonar o repositorio abrir em sua IDE e adicionar um arquivo config.properties contendo, "app_id=valor da sua chave",  a chave da API Open Exchange Rates que você pode obter gratuitamente na página https://openexchangerates.org/ e adicionar o caminho do arquivo na classe ExchangeRatesApi. 

![Captura de tela_20230225_123407](https://user-images.githubusercontent.com/52092018/221365661-d789b865-e596-4007-bc89-f28ca0235966.png)

## Técnicas e tecnologias utilizadas
- Java
- Consumo de API
- Orientação a Objetos
- Java Swing
- InteliJ IDEA
