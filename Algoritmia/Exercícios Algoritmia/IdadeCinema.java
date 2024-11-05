
/**
* Objetivo: Desenvolver um programa que pergunte a idade e verifique se a pessoa pode entrar no cinema.
* Requisitos:
* Pedir ao utilizador que forneça a sua idade. Para este exercício não serão necessárias
* validações. Assuma que o utilizador vai fornecer um número inteiro positivo.
* No caso da sua idade ser menor que 18 anos, forneça a mensagem de “Proibido Entrar!”.
* Caso a sua idade seja maior ou igual que 18 anos, forneça a mensagem “Permitida a Entrada!”.
*/

//Imports
import java.util.Scanner;

class IdadeCinema
{
    // Pedir a idade do Utilizador
    Scanner idadeUtilizador = new Scanner(System.in);

    public IdadeCinema()
    {
        System.out.println("O filme As tranças atômicas da mulher carreca são para maiores de 18 anos.");
        System.out.println("Favor digite sua idade para ver se é permitida a entrada");

        //Pedir para o utilizador a inserção dos dados
        int idade = idadeUtilizador.nextInt();
        permiteEntrada(idade);
    }

    void permiteEntrada(int idadeSujeito)
    {
        if (idadeSujeito >= 18)
        {
            System.out.println("Permitida a Entrada!");
        } else{
            System.out.println("Proibido Entrar!");
        
        }
    }
}

