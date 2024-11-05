
/**Objetivo: Desenvolver um programa que transforme um determinado número de dias em minutos.
* Requisitos:
* Pedir ao utilizador que forneça um determinado número de dias. Para este exercício não
* serão necessárias validações. Assuma que o utilizador vai fornecer um número inteiro
* positivo.
* Em seguida, o programa deverá apresentar o número total de minutos que todos esses dias têm.
*/

// Imports
import java.util.Scanner;

class TotalMinutos
{
    // Variavel Global
    Scanner scanUtilizador = new Scanner(System.in);

    TotalMinutos()
    {
        System.out.println("Bem vindo! \nO programa irá dizer quantos \nminutos tem os dias escolhidos");
        System.out.println("Escreva a quantidade de dias que seja converter para minutos: ");
        int dadoDigitado = scanUtilizador.nextInt();
        
        minutos(dadoDigitado);
    }

    void minutos(int dadoDigitado)
    {
        int dia = 24 * 60; // calculo de segundos para dia
        
        System.out.println("Valor dia" + dia);
        
        int diaEscolhidoQuant = dadoDigitado * dia;
        
        System.out.println("Um dia tem " + dia + "minutos" + 
            "\nA quantidade de minutos para " + dadoDigitado 
            + "dias são " + diaEscolhidoQuant + "minutos");
 
    }
}
