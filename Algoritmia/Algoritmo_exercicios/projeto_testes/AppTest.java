/**
    * Igual ao nome do Ficheiro em CamelCase
    */ 
class AppTest
{
    /**
       * Função construtora(Constructor) - tem que ser o mesmo nome
       * Função de Arranque da Classe
       * Um construtor nunca retorna nada.
    */
   
    /** Static void AppTest()
       * Static - Não instancia
       * void - sem retorno
       */
    AppTest()
    {
       /**
            * Função static tem que ter sempre retorno. 
       */
       String mensagem = "Do curso de Algoritmia";
       
       float numeroRealFloat = 6.87f; // 32bits Float tem que por sempre f no fim do numero
       double numeroRealDouble = 3.455972168736127321; //64bits
       char letra = 'A';
       boolean estado = true;
       String nome = "Amanda";
       
       // Declaração e instanciação de uma String com a invocação do seu construtor. 
       System.out.println(mensagem);
       
       String texto = new String("Esse é o texto!"); // não é atomico
       // classe comum String 
       
       System.out.println(texto + mensagem);
       // Invocar a função
      feriasAgosto();  
      
      System.out.println("A média é "+funcaoQueRetornaValor());
      
      
    }
    
    void feriasAgosto(){
        System.out.println("Estou a espera das férias de Agosto");
    }
    
    // função que retorna inteiro
    float funcaoQueRetornaValor()
    {
        float valor1 = 8;
        float valor2 = 3;
        float valor3 = 9;
        float valor4 = 8;
        float media = (valor1 + valor2 + valor3 + valor4)/ 4;
    
        return media;    
    }
}