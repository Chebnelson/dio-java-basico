package edu.kleber.tiposevariaveis;

public class TiposVariaveis {
        public static void main(String[] args) throws Exception{
            double salarioMinimo = 2500;
        }
}
/* Tipos de dados
No java, existem algumas palavras reservadas para a representação dos tipos
de dados básicos que precisam  ser manipulados para a construção de programas.
Estes tipos de dados sao reconhecidos como tipos primitivos (Primitive Types).

Os oitos tipos primitivos em JAVA são:

int, byte, short, long, float, double, boolean e char - esses tipos nao são
considerados objetos, e por tanto representam valores brutos.
Eles são armazenados deretamente na planilha de memória. (Memory stack)

TABELA DE TIPOS PRIMITIVOS E SEUS VALORES:

TIPO            | MEMORIA       | VALOR MÍNIMO    | VALOR MAXIMO

byte            |1 byte         | -128            | 127
short           |2 bytes        |-32.768          | 32.767
int             |4 bytes        | -2.147.483.648  | 2.147.483.647
long            |8 bytes        | -9.223.372.036.854.775.808   | 9.223.372.036.854.775.807  

Exemplos abaixos:

1 int idade; // Tipo "int", nome "idade", com nenhum valor atribuido.
2 int anoFabricacao = 2021; // tipo "int" nome "anoFabricacao", com o valor 2021
3 double salarioMinimo - 2.500; // tipo "double", nome"salarioMinimo" com valor "2.500"

Atençaõ: Existem algumas peculiaridades a trabalhar com alguns tipos especificos.
Observe o exemplo abaixo:

1 public class TiposDados{
    public static void main(String[] args){
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;// se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero talvez tenha q ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33              }}
O tipo long precisa terminar com "L" para nao dar erro e o java reconhecer o tipo.
mesma coisa o float, tem que terminar com "F" para reconhecimento.


             */  