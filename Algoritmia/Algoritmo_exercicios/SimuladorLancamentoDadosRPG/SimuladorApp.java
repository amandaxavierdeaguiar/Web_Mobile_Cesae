// import da classe Random para gerar numeros aleários;
import java.util.Random;
// importacao do input
import java.util.Scanner;

class SimuladorApp
{
    // propriedade global
    // Scanner nao pode apenas ter (), tem que ser declarado dentro o System.in
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();

    /**
     * Construtor para objetos da classe SimuladorApp
     */
    SimuladorApp()
    {
        pedidoLancamento();
        
    }
    
    void pedidoLancamento(){
        //Dar boas vindas ao utilizador
        System.out.println("Bem vindo ao Programa de Lançamento de Dados");
        System.out.println("Esse programa permite lançar dados de 4, 6 e 8 lados");
        System.out.println("Por favor escreva 4, 6 ou 8 para determinar o gênero de dado e lançar: ");  
        
        //Para pedir dado para o utilizador:
        int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        System.out.println("Você digitou o número: " + valorUtilizadorGuardado);
        
        if (valorUtilizadorGuardado == 4 || 
            valorUtilizadorGuardado == 6 || 
            valorUtilizadorGuardado == 8)
        {
            escreveResultado(valorUtilizadorGuardado);
        }
        else{
            System.out.println("Dados inválidos.");
            pedidoLancamento();
        }
        
    }
    
    void escreveResultado(int res){
        int resultadoDoLancamento = objetoNumeroAleatorio.nextInt(res) + 1;
        System.out.println("O numero sorteado pela máquina foi " + resultadoDoLancamento);
    }
}
