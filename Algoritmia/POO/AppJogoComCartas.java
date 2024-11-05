import java.util.Random;
import java.util.ArrayList;
// ArrayLista é obrigatório ser importado.

class AppJogoComCartas
{
    // Declaracao. Chamando a carta que é a classe do outro arquivo da nova package


    Carta instanciaCarta;
    Random valorAleatorio = new Random();
    
    ArrayList<Carta> baralho = new ArrayList<>();
    
    // Definir a listagem de carta
    // ArrayList do tipo que esta a carta e o nome da variavel sera baralho e inicializa um array vazio
    // Lista de elementos que o tipo dos elementos vai estar dentro do maior e menor
    // criar arrays dinâmicos, ou seja, arrays que podem crescer ou 
    // diminuir de tamanho conforme necessário
    
    
    AppJogoComCartas()
    {
        instanciaCarta = new Carta();
        // Entra no construtor do Construtor do Carta()
        // Instanciaçãp do objecto - Criacao dele - Inicialização
        // Faz um novo objeto - nova instancia
        // Objeto mais complexo tem que ser instanciado
        // A partir daqui consegue trabalhar com a instancia carta
        
        // Para aceder os atributos da classe carta
        // instanciaCarta.naipe = new String("Espadas");
        //instanciaCarta.naipe = "Espadas";  
        //Deixa de funcionar o que esta no construtor da Classe e reatribui este valor
        //instanciaCarta.rank = "Valete";
        
        //System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe); 
        criarNovoBaralho();
    }
    
    void criarNovoBaralho()
    {
        // Criar todas as cartas disponiveis 
        // Como tem static, nao precisa instanciar(fazer o new)
        
        //Matrizes: 
        
        for(int i=0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j=0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCarta = new Carta(i, j);
                // System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe); // Para imprimir todos os baralhos
                baralho.add(instanciaCarta); //Como se fosse o .push do js e o append do Python
            }
        }
    }
    
    void comprarCartas(int numeroDeCartasComprar)
    {
        // Usuario pode comprar cartas
        
        for(int i=0; i < numeroDeCartasComprar; i++)
        {
            if(baralho.size() > 0){
                int indexAleatorio = valorAleatorio.nextInt(baralho.size());
                // .size() Size é o metodo do array list (é o length do array lista);
                System.out.println(baralho.get(indexAleatorio).rank + " de " + baralho.get(indexAleatorio).naipe);
                // .get é o metodo de buscar o valor no Array List
                baralho.remove(indexAleatorio);
                // Remove para remover o baralho da lista.
            } else {
                System.out.println("Não tem mais cartas no Baralho!");
                break;
            }
        }
    }
    
    
    void tirarUmaCarta()
    {        
        int naipeAleatorio = valorAleatorio.nextInt(4);
        int rankAleatorio = valorAleatorio.nextInt(13);
        
        instanciaCarta = new Carta(naipeAleatorio, rankAleatorio);
            
        System.out.println("Baralhar e vai ser dada uma carta : ");

        System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
    }
}
