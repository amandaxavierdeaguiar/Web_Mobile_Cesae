
import java.util.Random;

class NumerosAleatorios
{
    Random aleatorioRandom = new Random();
    
    NumerosAleatorios()
    {
        for (int i=0; i<20; i++){
            int numeroRandom = aleatorioRandom.nextInt(101);
            System.out.println("Os numeros aleatórios são " + numeroRandom);
        }
    }
}
