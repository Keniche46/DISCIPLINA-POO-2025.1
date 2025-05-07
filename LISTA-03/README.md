# 📘 Exercícios de Programação Orientada a Objetos (POO)

Este repositório está estruturado para facilitar o acesso às questões organizadas em duas categorias:

- 📖 **Exercícios Resolvidos**: Questões que já possuem respostas e são disponibilizadas para estudo.  
- 📝 **Exercícios Propostos**: Questões que contêm apenas os enunciados e devem ser resolvidas pelos alunos.

Cada exercício foi desenvolvido para que possamos compreender e aplicar os conceitos fundamentais da Programação Orientada a Objetos (POO) na prática.

> **📌 As questões foram retiradas da apostila _"Fundamentos da Programação de Computadores"_ de Ana Fernanda Gomes Ascencio e Edilene Aparecida Veneruchi.  
> Todos os exercícios apresentados fazem parte do Capítulo 06 – Vetor e do Capítulo 08 - Sub-rotina.**

---

## 📚 Enunciados das Questões - CAP 06

### 📖 Exercícios Resolvidos

- [EXE1 - Números Primos e suas Posições](CAP-06/EXERCICIOS-RESOLVIDOS/Q01/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.


- [EXE2 - Relatório de Vendas e Comissão do Vendedor](CAP-06/EXERCICIOS-RESOLVIDOS/Q02/src/br/edu/principal/Principal.java)  
  Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.  
  O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição.  
  Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre:

| Objeto | Quantidade Vendida | Valor Unitário (R$) | Valor Total (R$) |
|--------|---------------------|----------------------|------------------|
| 1      | ...                 | ...                  | ...              |
| 2      | ...                 | ...                  | ...              |
| ...    | ...                 | ...                  | ...              |
| 10     | ...                 | ...                  | ...              |

> Ao final:  
> - Mostrar valor geral das vendas.  
> - Mostrar valor da comissão (5%).  
> - Indicar valor do objeto mais vendido e sua posição.

---

- [EXE3 - Intercalação de Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q03/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

| Posição | Vetor 1 | Vetor 2 | Intercalação |
|---------|---------|---------|--------------|
| 1       | 3       | 7       | 3            |
| 2       | 5       | 15      | 7            |
| 3       | 4       | 20      | 5            |
| ...     | ...     | ...     | ...          |

---

- [EXE4 - Separação de Números Positivos e Negativos](CAP-06/EXERCICIOS-RESOLVIDOS/Q04/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes:  
  - Um contendo os números positivos  
  - Outro contendo os números negativos.


- [EXE5 - Operações com Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q05/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre os seguintes vetores resultantes:

#### ▶ Vetores a serem exibidos:
- União de X com Y (sem repetições)  
- Diferença entre X e Y (X - Y)  
- Soma posição a posição entre X e Y



- [EXE6 - Ordenação Decrescente de Vetor](CAP-06/EXERCICIOS-RESOLVIDOS/Q06/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resultante de uma ordenação decrescente.


- [EXE7 - Preenchimento de Vetor em Ordem Crescente](CAP-06/EXERCICIOS-RESOLVIDOS/Q07/src/br/edu/principal/Principal.java)  
  Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene de forma crescente.


- [EXE8 - Junção e Ordenação de Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q08/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-os de maneira crescente.  
  Deverá ser gerado um terceiro vetor com dez posições, composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.


- [EXE9 - Sistema de Reserva de Passagens Aéreas](CAP-06/EXERCICIOS-RESOLVIDOS/Q09/src/br/edu/principal/Principal.java)  
  Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões.  

  Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
  - Consultar:
    - por número do voo;
    - por origem;
    - por destino;
  - Efetuar reserva;
  - Sair.

| Situação              | Resposta                        |
|----------------------|----------------------------------|
| Voo e lugar disponíveis | Reserva confirmada              |
| Voo cheio               | Voo lotado                      |
| Voo inexistente         | Voo inexistente                 |

---

- [EXE10 - Correção de Provas de Múltipla Escolha](CAP-06/EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
  Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto.  
  O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.

#### O programa deve calcular e mostrar:
| Aluno | Nota |
|-------|------|
| 001   | ...  |
| 002   | ...  |
| ...   | ...  |

> Além disso, mostrar a porcentagem de aprovação, considerando nota mínima 6.


## 📚 Enunciados das Questões - CAP 08

### 📖 Exercícios Resolvidos

- [EXE1 - Retorno de Número Positivo ou Negativo](CAP-08/EXERCICIOS-RESOLVIDOS/Q01/src/br/edu/principal/Principal.java)  
  Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se for negativo.

- [EXE2 - Soma de Números Inteiros Entre Dois Valores](CAP-08/EXERCICIOS-RESOLVIDOS/Q02/src/br/edu/principal/Principal.java)  
  Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro e retorne a soma dos N números inteiros existentes entre eles.

- [EXE3 - Soma de Números Divisíveis por Um Valor](CAP-08/EXERCICIOS-RESOLVIDOS/Q03/src/br/edu/principal/Principal.java)  
  Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar o resultado para ser impresso.


- [EXE4 - Estatísticas de Trânsito em Cidades](CAP-08/EXERCICIOS-RESOLVIDOS/Q04/src/br/edu/principal/Principal.java)  
  Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar o resultado para ser impresso.


- [EXE5 - Cálculo de Percentual de Acréscimo](CAP-08/EXERCICIOS-RESOLVIDOS/Q05/src/br/edu/principal/Principal.java)  
  Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que determine o percentual de acréscimo entre esses valores. O resultado deverá ser mostrado no programa principal.


- [EXE6 - Tabela de Multiplicação de um Número](CAP-08/EXERCICIOS-RESOLVIDOS/Q06/src/br/edu/principal/Principal.java)  
  Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte tabela de multiplicação (no exemplo, n = 9):
  

| 1 |    |    |    |    |    |    |    |    |
| - | -- | -- | -- | -- | -- | -- | -- | -- |
| 2 | 4  |    |    |    |    |    |    |    |
| 3 | 6  | 9  |    |    |    |    |    |    |
| 4 | 8  | 12 | 16 |    |    |    |    |    |
| 5 | 10 | 15 | 20 | 25 |    |    |    |    |
| 6 | 12 | 18 | 24 | 30 | 36 |    |    |    |
| 7 | 14 | 21 | 28 | 35 | 42 | 49 |    |    |
| 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 |    |
| 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |

---

- [EXE7 - Cálculo da Média de Notas de Aluno](CAP-08/EXERCICIOS-RESOLVIDOS/Q07/src/br/edu/principal/Principal.java)  
Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.


- [EXE8 - Cálculo da Média de Notas com Parâmetro](CAP-08/EXERCICIOS-RESOLVIDOS/Q08/src/br/edu/principal/Principal.java)  
Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.


- [EXE9 - Exibição de Data e Hora Formatadas](CAP-08/EXERCICIOS-RESOLVIDOS/Q09/src/br/edu/principal/Principal.java)  
Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.


- [EXE10 - Cálculo da Série com Fatoriais](CAP-08//EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S, obtido pelo seguinte cálculo:  
S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

---

## 🚀 Como usar
Para acessar e executar os exercícios, siga os seguintes passos:

### 1️⃣ Baixe e instale o Eclipse IDE:
- Faça o download do Eclipse em [eclipse.org/downloads](https://www.eclipse.org/downloads/).
- Instale o Eclipse em seu computador.

### 2️⃣ Crie um novo projeto no Eclipse:
- Abra o Eclipse e selecione **File > New > Java Project**.
- Dê um nome ao projeto (por exemplo, `POO-Atividades`).

### 3️⃣ Estrutura de pastas:
Dentro do projeto, os arquivos estão organizados em:
- 📂 `EXERCICIOS-RESOLVIDOS/` → Contém questões que já vêm com a resposta.
- 📂 `EXERCICIOS-PROPOSTOS/` → Contém apenas os enunciados das questões para serem resolvidas.

### 4️⃣ Crie o pacote e a classe:
- Clique com o botão direito sobre o `src` do seu projeto e selecione **New > Package**.
- Nomeie o pacote como `br.edu.principal`.
- Em seguida, clique com o botão direito no pacote `br.edu.principal` e selecione **New > Class**.
- Nomeie a classe como `Principal`.

### 5️⃣ Copie e cole o código da questão correspondente:
- Acesse a questão desejada e copie o código da classe `Principal` para o arquivo criado.

### 6️⃣ Execute o código:
- Após colar o código, clique com o botão direito na classe `Principal` e selecione **Run As > Java Application** para ver o resultado da execução.

Este repositório visa ajudar a organizar as atividades, separando as questões que já possuem resposta das questões que precisam ser resolvidas pelos alunos.

## 📬 Contato
Caso tenha dúvidas ou sugestões, sinta-se à vontade para contribuir ou entrar em contato! 😊

