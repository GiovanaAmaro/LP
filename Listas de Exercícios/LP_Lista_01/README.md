![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
     start(( inicio )) --> input1[\ Digite sua nota entre 0 e 100 \]
     input1 -->2[\ Digite sua frequencia em % \] 
     input2 -->a{ Nota >= 50 \n e \n frequencia>=100 }
      verification --> |Sim| ouput1[/Aprovado/]
      verification --> |Nao| ouput2[/Reprovado/]
      ouput1 --> finish([Final])
      ouput2 --> finish
      ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.

 ```mermaid
    flowchart TD
   A((Inicio))-->B[\Digite N1\]    
   B-->C[\Digite N2\]
   C-->D[Resultado = N1 + N2]
   D-->E[/Resultado/]
   E-->F((Final))
   ````
   

4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start((Inicio)) -->b[\Digite um numero\]
   b -->
      input{Numero >=0}
      input --> |Sim| ouput1[/Positivo/]
      input-->|Nao| ouput2[/Negativo/]
      ouput1-->finish((Fim))
      ouput2-->finish
   ```
   
5. Desenvolva um /luxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      A((Inicio))-->input1[\Digite a Idade\]
      input1 --> input2[\Tem titulo?\]
      input2 --> verification{Idade >= 16? \n E \n Tem titulo?}
      verification -->|Sim| output1[/Pode votar/]
      verification --> |Não| output2[/Não pode votar/]
      output1 --> finish((Fim))
      output2 --> finish
    ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    A((Inicio))-->B[\Digite N1\]    
    B-->C[\Digite N2\]
    C-->D{Número1 > Número2?}
    D--Sim-->E[\Número 1 é o maior\]
    D--Não-->F[\Núumero 2 é o maior?\]
    F--Sim-->G[\O  N2 é o maior\]
    F--Não-->H[\Os números são iguais\]
    E-->I[Fim]
    G-->I
    H-->I
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   A((Inicio))-->B[\Digite o N1\]
   B-->C[\Digite o N2\]
   C-->D[\Digite o N3\]
   D-->E{N1 > N2}
   E--Sim-->F{N2 > N3?}
   E--Não-->G{N2 >N3?}
   F--Sim-->H[\N1 é o maior\]
   F--Não-->I{N1 = n3?}
   I--Sim-->J[\N1 e N3 são iguais?\]
   I--Não-->K[\N3 é o maior\]
   G--Sim-->L[\N2 é o maior\]
   G--Não-->M{N2 = N3?}
   M--Sim-->N[\N2 e 3 são iguais?\]
   M--Não-->K
   H-->O((Fim))
   J-->O
   L-->O
   K-->O
   N-->O
   
   
   
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\digite o numero n\]
        B --> C{n >= 0?}
        C -- Não --> D[\Número inválido\]
        C -- Sim --> E[\Inicializar fatorial = 1\]
        E --> F{n > 0?}
        F -- Sim --> G[\fatorial = fatorial * n\]
        G --> H[\n = n - 1\]
        H --> F
        F -- Não --> I[\Exibir Fatorial = fatorial\]
        D --> J((fim))
        I --> J
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
        A((Início)) --> B[Digite um número]
        B --> C{Número % 2 = 0?}
        C -- Sim --> D[\O número é par'\]
        C -- Não --> E[\O número é ímpar'\]
        D --> F((fim))
     E --> F
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\Digite um número n\]
        B --> C{n <= 1?}
        C -- Sim --> D[\O número não é primo\]
        C -- Não --> E[\Iniciar divisor = 2\]
        E --> F{divisor < n?}
        F -- Sim --> G{n % divisor == 0?}
        G -- Sim --> H[\O número não é primo\]
        G -- Não --> I[\Incrementar divisor\]
        I --> F
        F -- Não --> J[\O número é primo\]
        D --> K((fim))
        H --> K
        J --> K
   ````