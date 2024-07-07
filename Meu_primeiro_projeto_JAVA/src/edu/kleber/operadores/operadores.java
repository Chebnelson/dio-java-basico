package edu.kleber.operadores;

public class operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        
        // UNÁRIO

        int numero = 5;
        System.out.println(- numero);
        System.out.println( numero);

        // TENÁRIO

        int a, b;

            a = 5;
            b = 6;

            String resultado = a==b ? "verdadeiro" : "false";
            System.out.println( resultado);

        // RELACIONAIS
        
        int numero1 = 2;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println( "numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println( "numeroUm é diferente ao numeroDois?" + simNao);

        simNao = numero1 >= numero2;
        System.out.println( "numeroUm é maior ou igual ao numeroDois?" + simNao);

        simNao = numero1 < numero2;
        System.out.println( "numeroUm é menor ao numeroDois?" + simNao);

        simNao = numero1 < numero2;
        System.out.println( "numeroUm é menor ou igual ao numeroDois?" + simNao);

        if(numero1 == numero2){
            
        System.out.println( "A NOSSA CONDIÇÃO É VERDADEIRA!!");
        }
       

    }

}
 /* Classificação de operadores
 
 
     Atribuição

     Representado pelo simbulo de igualdade =.

     o operador de atribuição é ultilizado para definir o valor inicial ou
     sobrescrever o valor de uma variavel. Em java definimos um tipo, nome e
     opcionalmente atribuimos um valor à variavel através do operador de atribuição
         Ex:
         1 // classes operadores.java
         2 String nome = "kleber";
         3 int idade = 29;
         4 double peso = 62.5; --------> numero quebrado separado por ponto.
         5 char sexo = 'M'; -----> somente 1 caractere.
         6 boolena doadorOrgao = false; ------> "sim" ou "nao"
         7 Date dataNascimento = new Date();

    Operadores Aritimeticos
        O operador aritimtico é ultilizado para realizar operações matematicas
        entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
        
        Os operadores aritimeticos são: + (adição), - (subtração), * (multiplicação)
        e / (divisão).
            Ex:
                1 double soma = 10.5 + 15.7;
                2 int subtração = 113 - 25;
                3 int multiplicação = 20 * 7;
                4 int divisão = 15 / 3;
                5 inte modulo = 18 % 3; -----> modulo significa o resto da divisão. 
                6 double resultado = (10 * 7) + ( 20 / 4);
        O OPERADOR DE ADIÇÃO (+), QUANDO ULTILIZADA EM VARIÁVEIS DO TIPO TEXTO,
        FAZ A CONCATENAÇÃO DE TEXTO (JUNTA AS PALAVRAS/TEXTOS)   
            Ex: 
                String nomeCompleto = "LINGUAGEM" + "JAVA";
                = LINGUAGEMJAVA


        Unários

        Esses operadores são aplicados juntamente com outro operador aritmético.
        Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter
        valores numéricos e  booleanos.

            (+) Operador unário de valor positivo - números são positivos sem esse
            operador explicitamente;
            (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
            (++) Operador unário de incremento de valor - incrementa valor em 1 unidade;
            (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
            (!) Operador unário lógico de negação - nega o valor de uma expressão booleana;

        
        Ternário
        O Operador de Condições Tenária é uma forma resumida para denfinir uma
        condição e escolhe por um dentre dois valores. Você deve pesar numa
        condição tenaria como se fosse uma condição IF normal, porem, de uma forma
        em que toda a sua estrutura estará escrita numa única linha.
        O operador ternário é representado pelos símbolos ?: ultilizados na 
        na seguinte estrutura de sintaxe:

            <Expressão condicional> ? <caso condição seja true> :<caso seja false> 

            Ex:

            int a, b:

            a = 5
            b = 6

            exmplo de condicional ultilizando um estrutura if/else

            if (a==b)
                resultado = "verdadeiro";

            else
                resultado = "falso";

            mesma condicional, mas dessa vez, ultilizando o operador

            String resultado = (a==b) ? "verdadeiro" : "false";

        RELACIONAIS
        Os operadores relacionais avaliam a relação entre duas variáveis ou
        expressões. Neste caso, mais precisamente, definem se o operador à esquerda
        é igual, diferente, menor, menor ou igaul, maior, maior ou igual ao da direita,
        retornando umvalor booleano como resultado.

        == Quando desejamos verificar se uma variavel é IGUAL A outra.

        != Quando desejamoes verificar se uma variável é diferente da outra.

        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        < Quando desejamos verificar se uma variável é MENOR QUE outra.

        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.



  * 
  */

   





