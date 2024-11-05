import java.util.ArrayList;
import java.util.Random;

class SalaJogoPoker
{
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    
    int numeroIdentificadorControlo = 0;
    
    // Criando baralho novo
    Carta _carta;
    ArrayList<Carta> novoBaralho = new ArrayList<>();
    
    // Random
    Random cartasAleatorias = new Random();
    
    
    SalaJogoPoker() 
    {
        listaJogadores = new ArrayList<>();
    }
    
    void adicionarJogador()
    {
        // mesmo se der mais de um jogador, tem que fazer o new jogador.
        //Cada Jogador tenha uma nomeclatura unica
        numeroIdentificadorControlo ++;
        jogadorPoker = new Jogador();
        jogadorPoker.setPontos(10);
        System.out.println(jogadorPoker.getPontos());
        jogadorPoker.nomeNoJogo = "Player_" + numeroIdentificadorControlo;
        listaJogadores.add(jogadorPoker);
        //System.out.println("Entrou na sala o: "+ jogadorPoker.nomeNoJogo);
   
        /*jogadorPoker = new Jogador();
        jogadorPoker.no
        
        meNoJogo = "Player_" + (listaJogadores.size()+1);
        listaJogadores.add(jogadorPoker);*/
    }
    
    void contarJogadores()
    {
        System.out.println("Existem " + listaJogadores.size() + " jogadores na Sala");
    }
    
    void imprimirJogadores(){ // apresentarJogadoresNaSala
        for (int i=0; i<listaJogadores.size(); i++){    
            System.out.println(listaJogadores.get(i).nomeNoJogo);
        }
        
        if(listaJogadores.size() < 1){
            System.out.println("Não existem jogadores na sala!");
        }
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
                _carta = new Carta(i, j);
                //System.out.println(_carta.rank + " de " + _carta.naipe); // Para imprimir todos os baralhos
                novoBaralho.add(_carta); //Como se fosse o .push do js e o append do Python
            }
        }
        System.out.println("Um novo baralho foi colocado na mesa!");
    }
    
    void flopComprar3CartasComunidade()
    {
        System.out.println("O flop (3 cartas da comunidade) é o seguinte: ");
    
        for (int i=0; i<3 ; i++){
            //int indexRandomRetirar = cartasAleatorias.nextInt(novoBaralho.size());
            
            //Carta cartaComprada = novoBaralho.get(indexRandomRetirar);
            //novoBaralho.remove(indexRandomRetirar);
            Carta cartaComprada = tirarCartaDoBaralho();
            
            System.out.println(cartaComprada.rank + " de " + cartaComprada.naipe);  
        }

    }  
    
    void todosJogadoresCompramUmaCarta()
    {
        for(int i=0; i<listaJogadores.size(); i++)
        {
            // int indexCartaQueSaiuNaSorte = cartasAleatorias.nextInt(novoBaralho.size());
            // Carta cartaComprada = novoBaralho.get(indexCartaQueSaiuNaSorte);
            // novoBaralho.remove(indexCartaQueSaiuNaSorte);
            // System.out.println(cartaComprada.rank + " de " + cartaComprada.naipe);  
            
            listaJogadores.get(i).comprarCarta(tirarCartaDoBaralho());
        }
        
        System.out.println("Todos os jogadores compraram uma carta! ");
        
    }
    
    // Carta é o tipo de retorno.
    private Carta tirarCartaDoBaralho()
    {
        int indexCartaQueSaiuNaSorte = cartasAleatorias.nextInt(novoBaralho.size());
            
        Carta cartaComprada = novoBaralho.get(indexCartaQueSaiuNaSorte);
        novoBaralho.remove(indexCartaQueSaiuNaSorte);
        
        return cartaComprada;
    }
    
    
    void todosOsJogadoresMostramASuaMao()
    {
        for (int i=0; i<listaJogadores.size(); i++)
        {
            listaJogadores.get(i).mostrarMao();
        }
    }
    
    void todosOsJogadoresDiscartamUmaCarta()
    {
        for (int i=0; i<listaJogadores.size(); i++)
        {
            listaJogadores.get(i).descartarCarta();
        }
        
        /*for (int i = 0; i < listaJogadores.size(); i++) {
            Jogador jogadorAtual = listaJogadores.get(i);
            
            int indexCartaAleatoria = cartasAleatorias.nextInt(jogadorAtual.cartasNaMao.size());
                
            Carta cartaDescartada = jogadorAtual.cartasNaMao.get(indexCartaAleatoria);
            jogadorAtual.descartarCarta(cartaDescartada);
    
            System.out.println(jogadorAtual.nomeNoJogo + " descartou: " + cartaDescartada.escritaCompletaDaCarta());
            }
        }*/
    }
}
    

