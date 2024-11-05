
import java.util.Random;

class ExercicioPratico
{
    Random numeroAleatorio = new Random();
    
    ExercicioPratico()
    {
        int aleatorio = numeroAleatorio.nextInt(41);
        System.out.println("A temperatura sorteada foi: " + aleatorio);
        condicao(aleatorio);
    }

    void condicao(int numero)
    {
        if (numero >= 0 && numero <=10){
            System.out.println("Muito frio");
        } else if (numero >= 11 && numero <= 20){
            System.out.println("Temperatura Moderada");
        } else if (numero >= 21 && numero <= 30){
            System.out.println("Está quente");
        } else if (numero >= 31 && numero <= 40){
            System.out.println("Que calor dos diabos!");
        }
    }
}
