// Biblioteca Rondom
import java.util.Random;

class SlotMachine
{
    Random wordSort = new Random();
    int numeroRandom = ' ';
    
    SlotMachine()
    {
        Sort();
    }

    void Sort()
    {
        for (int i=0; i<3 ; i++)
        {
            numeroRandom = wordSort.nextInt(2)+1;
            System.out.println("Os numeros aleatórios são " + numeroRandom);
            if (numeroRandom == 1)
        }    
    }
}
