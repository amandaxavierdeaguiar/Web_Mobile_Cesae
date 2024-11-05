import java.util.ArrayList;
import java.util.Random;

class Euromilhoes
{
    ArrayList<Integer> grelhaNumeros;
    ArrayList<Integer> grelhaEstrelas;
    // Random para gerar números aleatórios
    Random valorAleatorio = new Random();
    
    Euromilhoes()
    {
        grelhaNumeros = new ArrayList<>();
        grelhaEstrelas = new ArrayList<>();
        
        // Preencher a tombola (ArrayList) com numeros
        for (int i = 1; i < 51; i++)
        {
            grelhaNumeros.add(i);
        }
        
        System.out.println("A grelha dos numeros é");
        // Ciclo para retirar numeros da tombola
        for(int i=0; i<5; i++)
        {
            int indexSorte = valorAleatorio.nextInt(grelhaNumeros.size());
            
            System.out.println(grelhaNumeros.get(indexSorte));
            grelhaNumeros.remove(indexSorte);
        }
        
        // Preencher a tombola (ArrayList) com estrelas
        for (int i = 1; i < 13; i++)
        {
            grelhaEstrelas.add(i);
        }
        
        System.out.println("A grelha das Estrelas são");
        // Ciclo para retirar numeros da tombola Estrelas
        for(int i=0; i<2; i++)
        {
            int indexSorte = valorAleatorio.nextInt(grelhaEstrelas.size());
            
            System.out.println(grelhaEstrelas.get(indexSorte));
            grelhaNumeros.remove(indexSorte);
        }

    }
}
