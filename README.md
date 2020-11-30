# Padrão Chain of Responsibility

## Centro Universitário UNIESP

### Professora: Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno: Yuri Christian Carvalho Costa
### Apresentação: https://drive.google.com/file/d/1VpeZj647J55li6TdL4w4gAp348SC5Qxi/view?usp=sharing

## Chain of Responsibility

#### Breve descrição do padrão:

Chain of Responsibility é um padrão comportamental e como tal ele é responsável nas relações entre objetos, assim facilitando a comunicação entre as entidades em uma programação orientada a objetos. Sua principal função é evitar a dependência entre as entidades receptoras e as entidades solicitantes, pois cada entidade de solicitação tem uma série lógica que separa quais serão as entidades receptoras que serão manipuladas. Como seu conceito é ter uma relação em cadeia entre as entidades, ele não possui uma ideia de alto acoplamento, pois permite que outras entidades tenham a oportunidade de tratar solicitação.

O padrão Chain of Responsibility representa uma solução para reduzir as dependências entre entidades, onde que seu maior propósito é permitir a navegação de dados entre diferentes objetos dentro de uma cadeia, dando a liberdade para a lógica que foi aplicada na entidade tratar a requisição e neutraliza a cadeia gerando um tipo de retorno ou tratar a requisição e prosseguir com a cadeia, assim só gerando algum tipo de retorno posteriormente.

Geralmente o padrão é utilizado em sistemas que possuem rotinas de tomadas de decisões complexas e que normalmente precisam respeitar uma hierarquia ou fluxo de processamento, sendo que encadeamos a requisição de processamento por N objetos, um chamando o próximo e assim sucessivamente até que seja concluído o processamento, com sucesso ou falha.

## Problema

Foi abordado um programa para tratamento de orçamento de uma loja, assim compondo classes representadas por hierarquias para tratamento de orçamento, onde o programa terá que identificar qual classe deverá fazer o tratamento mediante ao valor do orçamento informado e neutralizar a cadeia.

Representação do código mostrado nesse vídeo: https://www.youtube.com/watch?v=s7VeksnnpVA

## Solução

Aplicando o padrão descrito, foi necessário a criação de uma classe modelo para representar o total do orçamento e se o mesmo foi aprovado ou não, criação da classe para identificar quem fará manipulação e a criação das classes que representam a hierarquia.

## Consequências

O padrão Chain of Responsibility fornece uma maneira de tomar decisões com um fraco acoplamento. No exemplo a estrutura de cadeia não possui qualquer informação sobre as classes que compõem a cadeia. Da mesma forma, uma classe da cadeia não tem nenhuma noção sobre o formato da estrutura ou sobre elementos nela inseridos
