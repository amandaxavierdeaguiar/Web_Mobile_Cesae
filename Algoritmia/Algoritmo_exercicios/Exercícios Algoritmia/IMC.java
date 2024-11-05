/**
* Objetivo: Desenvolver um programa que apresente o índice de massa corporal em função do peso
* e altura fornecidos. 
* Informação adial: O índice de massa corporal é calculado através da divisão do peso de uma 
* pessoa pelo quadrado da sua altura, ou seja, peso / (altura * altura). 
* Requisitos: 
* Pedir ao utilizador que forneça o seu peso em quilogramas e em seguida a sua altura em 
* metros. Para este exercício não serão necessárias validações. Assuma que o utilizador vai 
* fornecer números reais positivos. 
* Em seguida, o programa deverá apresentar o cálculo final do índice de massa corporal. 
*/

// import
import java.util.Scanner;

class IMC
{
    //Global
    Scanner pesoUtilizador = new Scanner(System.in);
    Scanner alturaUtilizador = new Scanner(System.in);
    
    IMC()
    {
        System.out.println("-- CALCULADOR IMC --");
        
        System.out.println("Digite seu peso:");
        float pesoInput = pesoUtilizador.nextFloat();
        System.out.println("Seu peso" + pesoInput);
        
        System.out.println("Digite sua Altura em metros:");
        float alturaInput = alturaUtilizador.nextFloat();
        System.out.println("Sua altura" + alturaInput);
        
        calcular(pesoInput, alturaInput);
    }
     
    void calcular(float peso, float altura)
    {
        
        float valorIMC = peso / (altura * altura) ;
                
        System.out.println("O valor IMC é:" + valorIMC);

    }
}
