import java.util.ArrayList;
import java.util.Random;

class SalaJogoBlackJack extends SalaJogoPoker
{
    private int x;

    SalaJogoBlackJack()
    {
        
    }
    
    // Exemplo de Override - Vai sobrepor e anular a anterior.
    // Uma lista de 6 baralhos e anular a anterior que so fazia so uma.
    void criarNovoBaralho()
    {
        novoBaralho = new ArrayList<>();
        
        for (int b=0; b<6; b++) 
        {
            for(int i=0; i < Carta.arrayNaipes.length; i++)
            {
                for(int j=0; j < Carta.arrayRanks.length; j++)
                {
                    _carta = new Carta(i, j);
                    //System.out.println(_carta.rank + " de " + _carta.naipe); // Para imprimir todos os baralhos
                    novoBaralho.add(_carta); //Como se fosse o .push do js e o append do Python
                    System.out.println(_carta.escritaCompletaDaCarta());
                    System.out.println("Tamanho" + novoBaralho.size()); // Ver quantas cartas foram feitas
                }
            }
        }
    }
    
    void chamarFuncaoClasseMae()
    {
        super.criarNovoBaralho(); //Acesso a classe mae
        
        // this.criarNovoBaralho() é a propria fincao da classe interna
    }
}

