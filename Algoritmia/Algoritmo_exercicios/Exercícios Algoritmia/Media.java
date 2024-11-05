
/**
 * Objetivo: Calcular a média de apenas 3 notas de avaliação fornecidas 
 * pelo utilizador.  
 * Requisitos: 
 * Pedir ao utilizador que forneça a nota de uma unidade que obteve no curso. 
 * Para este exercício não serão necessárias validações. Assuma que o utilizador vai fornecer um número inteiro positivo entre 0 a 20. 
 * Em seguida, o programa deverá pedir continuamente por mais notas até atingir o total de 3 notas. Mais uma vez não será necessário fazer validações.
 * Por fim, apresente a média final das notas. Não necessita de arredondamentos. 
 */

import java.util.Scanner;


class Media
{
    Scanner inputNumber = new Scanner(System.in);   
    Media()
    {
        System.out.println("Media aluno");
        System.out.println("Digite a nota: ");
        calcularImprimir();
    }
    
    void calcularImprimir()
    {
        int nota1 = inputNumber.nextInt();
        System.out.println("Digite a nota");
        int nota2 = inputNumber.nextInt();
        System.out.println("Digite a nota");
        int nota3 = inputNumber.nextInt();
            
        int somaNotas = nota1 + nota2 + nota3;
        int mediaAluno = somaNotas / 3;
        System.out.println("Nota 1: " + nota1 + " Nota 2: " + nota2 + " Nota 3: " + nota3 + "Sua média foi: " + mediaAluno);
        }
    }

