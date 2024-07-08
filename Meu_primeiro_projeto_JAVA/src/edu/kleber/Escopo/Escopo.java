package edu.kleber.Escopo;

public class Escopo {
    //variavel de classe conta
    double saldo = 10.0;
    
    public void sacar(Double valorDouble){
        // variavel local de método
       // double novoSaldo = saldo - valor;

    }
    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o metodo sacar conhece esta variavel
       // System.out.println(novoSaldo);
    }


    
}
/** ESCOPO
    Ambiente aonde uma variavel pode ser acessada. 
    Em java o escopo de variaveis VAI DE ACORDO COM O BLOCOONDE ELA FOI DECLARADA.
    A variavel é criada no primeiro acesso à ela, se tornando inacessivel após o 
    interpretador sair do bloco de execução ao qual ela pertence. Portanto,
    esta variavel não pode ser lida ou manipulada por rotinas e códigos que estão
    fora do seu bloco de declaração, ou seja, fora do escopo da variavel.

    Em uma Classe, podemos vizualizar a diferença de escopos. Os atributos(variaveis)
    são declarados no corpo principal da Classe, sendo portanto acessivel por todos
    os métodos.
    Caso voce declare uma variavel DENTRO DE UM MÉTODO, o escopo dessa variavel
    esta limitado apenas ao corpo desse método, ou seja, dentro das chaves que
    limitam o método.

    Uma parte fundamental na elaboração de algoritmos simples ou complexos é derterminar
    a localização do código em questão. Sem um dominio sobre escopo de códigos seu projeto
    tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

 */