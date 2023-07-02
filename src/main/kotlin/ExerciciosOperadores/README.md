### 1. Problema: Calculadora de Empréstimo

Você foi contratado para desenvolver uma calculadora de empréstimo simples em Kotlin. A calculadora deve solicitar ao usuário o valor do empréstimo, a taxa de juros anual e o prazo em anos. Com base nesses valores, a calculadora deve determinar se o empréstimo é aprovado ou não.

Regras:

* O valor do empréstimo deve estar entre R$1.000 e R$100.000.
* A taxa de juros anual deve estar entre 1% e 12%.
* O prazo em anos deve estar entre 1 e 10.
* A calculadora deve seguir as seguintes etapas:

  * Solicitar o valor do empréstimo ao usuário.
  * Verificar se o valor do empréstimo está dentro do intervalo válido. Caso contrário, exibir uma mensagem de erro.
  * Solicitar a taxa de juros anual ao usuário.
  * Verificar se a taxa de juros anual está dentro do intervalo válido. Caso contrário, exibir uma mensagem de erro.
  * Solicitar o prazo em anos ao usuário.
  * Verificar se o prazo em anos está dentro do intervalo válido. Caso contrário, exibir uma mensagem de erro.
  * Se todos os valores estiverem dentro dos intervalos válidos, exibir uma mensagem informando que o empréstimo foi aprovado.

Agora é sua tarefa implementar a função que resolverá esse problema em Kotlin. Utilize operadores booleanos para verificar as condições e exibir as mensagens adequadas.


### 2. Problema: Verificador de Dias de Semana
Você precisa desenvolver uma função em Kotlin que receba como entrada o nome de um dia da semana e verifique se ele é um dia útil ou um dia de fim de semana.

Regras:

* Os dias úteis são de segunda-feira a sexta-feira.
* Os dias de fim de semana são sábado e domingo.
* A função deve seguir as seguintes etapas:

  * Receber o nome do dia da semana como entrada.
  * Verificar se o dia fornecido é um dos dias úteis (segunda-feira a sexta-feira).
  * Se for um dia útil, exibir uma mensagem informando que é um dia útil.
  * Se for um dia de fim de semana, exibir uma mensagem informando que é um dia de fim de semana.
  * Se o dia fornecido não corresponder a nenhum dos dias da semana, exibir uma mensagem de erro informando que o dia é inválido.

Agora é sua tarefa implementar a função que resolverá esse problema em Kotlin. Utilize operadores booleanos para verificar as condições e exibir as mensagens adequadas.
  
### 3. Problema: Calculadora de IMC
Você foi solicitado a desenvolver uma calculadora de Índice de Massa Corporal (IMC) em Kotlin. A calculadora deve solicitar ao usuário o seu peso em quilogramas e a sua altura em metros. Com base nesses valores, a calculadora deve calcular o IMC e fornecer uma avaliação do estado nutricional.

Regras:

* O peso deve ser maior que zero.

* A altura deve ser maior que zero.

* O IMC é calculado dividindo o peso em quilogramas pela altura ao quadrado em metros.

* O resultado do IMC deve ser arredondado para uma casa decimal.

* A calculadora deve seguir as seguintes etapas:

  * Solicitar o peso do usuário em quilogramas.

  * Verificar se o peso é maior que zero. Caso contrário, exibir uma mensagem de erro.

  * Solicitar a altura do usuário em metros.

  * Verificar se a altura é maior que zero. Caso contrário, exibir uma mensagem de erro.

  * Calcular o IMC utilizando a fórmula: IMC = peso / (altura * altura).

  * Arredondar o resultado do IMC para uma casa decimal.

  * Fornecer uma avaliação do estado nutricional com base nos valores de referência a seguir:
     * IMC abaixo de 18,5: Abaixo do peso

     * IMC entre 18,5 e 24,9: Peso normal

     * IMC entre 25,0 e 29,9: Sobrepeso

     * IMC entre 30,0 e 34,9: Obesidade Grau I

     * IMC entre 35,0 e 39,9: Obesidade Grau II

     * IMC acima de 40,0: Obesidade Grau III

Agora é sua tarefa implementar a função que resolverá esse problema em Kotlin. Utilize operadores booleanos para verificar as condições e exibir as mensagens adequadas.


### 4.  Verificador de Tamanho de Senha
Você precisa desenvolver uma função em Kotlin que verifique se uma senha fornecida pelo usuário possui um tamanho mínimo exigido.

Regras:

* A senha deve ter no mínimo 6 caracteres.
* A função deve seguir as seguintes etapas:

  * Receber a senha como entrada.

  * Verificar se a senha possui no mínimo 6 caracteres.

  * Se a senha atender ao requisito de tamanho mínimo, exibir uma mensagem informando que a senha é válida.

  * Se a senha não atender ao requisito de tamanho mínimo, exibir uma mensagem informando que a senha é inválida.


Agora é sua tarefa implementar a função que resolverá esse problema em Kotlin. Utilize operadores booleanos, funções de manipulação de strings e estruturas de controle para verificar a condição e exibir as mensagens adequadas.



### 5. Verificador de Número Par
Desenvolva uma função em Kotlin que receba um número inteiro como entrada e verifique se ele é par ou ímpar.

Regras:

* Um número par é aquele que pode ser dividido por 2 sem deixar resto.

* Um número ímpar é aquele que, quando dividido por 2, deixa resto diferente de zero.

* A função deve seguir as seguintes etapas:

  * Receber o número inteiro como entrada.

  * Verificar se o número é divisível por 2 (ou seja, se o resto da divisão por 2 é igual a zero).

  * Se o número for divisível por 2, exibir uma mensagem informando que é um número par.

  * Se o número não for divisível por 2, exibir uma mensagem informando que é um número ímpar.



Agora é sua tarefa implementar a função que resolverá esse problema em Kotlin. Utilize operadores booleanos e operações matemáticas para verificar as condições e exibir as mensagens adequadas.