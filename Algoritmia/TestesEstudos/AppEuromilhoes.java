import java.util.ArrayList;
import java.util.Random;

class AppEuromilhoes
{
    ArrayList<Integer> grelhaNumeros = new ArrayList<>();
    ArrayList<Integer> grelhaEstrelas = new ArrayList<>();
    Random sorteioNumeros = new Random();
    

    public AppEuromilhoes()
    {
        //Loop para gerar numeros aleatorios
        
        for(int n=1; n < 51; n++){
            grelhaNumeros.add(n);
        }
        
        for(int n=1; n < 13; n++){
            grelhaEstrelas.add(n);
        } 
        
        System.out.println("Numeros Sorteados ");
        for (int n=0; n < 5; n++)
        {
            int indexAleatorio = sorteioNumeros.nextInt(grelhaNumeros.size());
            int numerosSorteados = grelhaNumeros.remove(indexAleatorio);
            System.out.println(numerosSorteados);
        }
        
        System.out.println("Estrelas Sorteadas ");
        for (int n=0; n < 2; n++)
        {
            int indexAleatorio = sorteioNumeros.nextInt(grelhaEstrelas.size());
            int estrelasSorteadas = grelhaEstrelas.remove(indexAleatorio);
            System.out.println(estrelasSorteadas);
        }
        
    }
}
