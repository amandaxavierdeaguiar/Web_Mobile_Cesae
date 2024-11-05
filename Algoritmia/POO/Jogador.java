import java.util.ArrayList;
import java.util.Random;

// Subclasse de Jogador 
// extends é uma keyword que implementa o conceito de herança (inheritance)
class Jogador extends Utilizador
{
    
    private int pontos;
    String nomeNoJogo;
    Carta cartaJogador;
    ArrayList<Carta> cartasNaMao;
    
    // Random
    Random retirarCartasDaMao = new Random();
    
    Jogador()
    {
        cartasNaMao = new ArrayList();
        pontos = 0;
    }
    
    // Regra de cassino que não permite ponotos inferior a zero
    // Setter
    public void setPontos(int paramPontos)
    {
        if (paramPontos < 0)
        {
            pontos = 0;
        } else 
        {
            pontos = paramPontos;
        }
    }
    
    //Getter apenas para leitura do atributo
    public int getPontos(){
        return pontos;
    }
    
    void comprarCarta(Carta paramCarta)
    {
        cartasNaMao.add(paramCarta);
    }
    
    void descartarCarta()
    { 
        if(cartasNaMao.size() <= 0)
        {
            System.out.println("O "+ nomeNoJogo + " não tem cartas na mão!");
        } else {
            int indexCartaAleatoria = retirarCartasDaMao.nextInt(cartasNaMao.size());
            cartasNaMao.remove(indexCartaAleatoria);
        }
    }
    
    void mostrarMao()
    {
        if(cartasNaMao.size() <= 0)
        {
            System.out.println("O "+ nomeNoJogo + " não tem cartas na mão!");
        } else {
            System.out.println("O "+ nomeNoJogo + " tem a seguinte mão: ");
            for(int i=0; i < cartasNaMao.size(); i++){
                System.out.println(cartasNaMao.get(i).escritaCompletaDaCarta());
                /* Carta instanciaCarta = cartasNaMao.get(i);
                System.out.println(instanciaCarta.escritaCompletaDaCarta()); */
            }
        }
    }
}
