import java.util.Random;
import java.util.ArrayList;

public class SortNumeros
{
    /// Arrays para números e estrelas
    ArrayList<Integer> grelhaNumeros = new ArrayList<>();
    ArrayList<Integer> grelhaEstrelas = new ArrayList<>();
    
    // Lista para armazenar os números e estrelas sorteados
    ArrayList<Integer> arrayRandomAleatorioNumeros = new ArrayList<>();
    ArrayList<Integer> arrayRandomAleatorioEstrelas = new ArrayList<>();
    
    // Random para gerar números aleatórios
    Random sorteio = new Random();
    
    public SortNumeros()
    {
        sortearNumeros();
        sortearEstrelas();
        sortearNumerosRandom();
        sortearEstrelasRandom();
    }
    
    void sortearNumeros(){
        // Criando uma lista de numeros até 50
        for (int i = 1; i < 51; i++){
            grelhaNumeros.add(i);
        }
        System.out.println(grelhaNumeros);
        
    
    }
    
    void sortearEstrelas(){
        // Criando uma lista de numeros até 12
        for (int i = 1; i < 13; i++){
            grelhaEstrelas.add(i);
        }
        System.out.println(grelhaEstrelas);
    }
    
    void sortearNumerosRandom() {
        // Sorteia 12 números únicos da lista grelhaNumeros
        while (arrayRandomAleatorioNumeros.size() < 5) {
            int numeroSorteado = grelhaNumeros.get(sorteio.nextInt(grelhaNumeros.size()));
            
            if (!arrayRandomAleatorioNumeros.contains(numeroSorteado)) {
                arrayRandomAleatorioNumeros.add(numeroSorteado);
            }
        }
        
        System.out.println("Números sorteados: " + arrayRandomAleatorioNumeros);
    }
    
    void sortearEstrelasRandom() {
        while (arrayRandomAleatorioEstrelas.size() < 2) {
            int estrelaSorteada = grelhaEstrelas.get(sorteio.nextInt(grelhaEstrelas.size()));
            
            if (!arrayRandomAleatorioEstrelas.contains(estrelaSorteada)) {
                arrayRandomAleatorioEstrelas.add(estrelaSorteada);
            }
        }
        
        System.out.println("Estrelas sorteadas: " + arrayRandomAleatorioEstrelas);
    }
    
}
