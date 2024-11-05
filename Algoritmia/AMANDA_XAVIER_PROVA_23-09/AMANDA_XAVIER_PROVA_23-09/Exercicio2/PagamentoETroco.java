import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; 

class PagamentoETroco
{
    int troco; 
    int valorPago; 
    int valorDoPerfume;
    
    ArrayList<Integer> valorPerfume = new ArrayList<>();
    Random sorteioNumeros = new Random();
    Scanner scanUser = new Scanner(System.in);
    public PagamentoETroco()
    {
        System.out.println("Bem-vindo/a à Loja de Perfumes");
         
        valorPerfume(); 
         
        System.out.println("Digite um valor inteiro e positivo:  ");
        
        int escritaUtilizador = scanUser.nextInt();
        valorCliente(escritaUtilizador);
    }
    
    void valorPerfume(){
        // ADICIONANDO A LISTA O VALOR DO PERFUME.        
        for(int i=1; i < 21; i++){
            valorPerfume.add(i);
        }
        
        int indexAleatorio = sorteioNumeros.nextInt(valorPerfume.size());
        valorDoPerfume = valorPerfume.remove(indexAleatorio);
        System.out.println("O perfume tem o valor de: " + valorDoPerfume + " €");
    }
    
    void valorCliente(int escritaUtilizador){
        if(escritaUtilizador > valorDoPerfume){
            int trocoUser = escritaUtilizador - valorDoPerfume;
            
            System.out.println("O valor de troco será: " + trocoUser + "€");
        } else{
            trocoUtilizador(escritaUtilizador);
        }
    }
    
    void trocoUtilizador(int escritaUtilizador){
        while(valorDoPerfume > valorPago){
            valorPago += escritaUtilizador;
            int deve = valorDoPerfume - valorPago;
            
            if(deve > 0){
                System.out.println("Ainda deve: " + deve);
                System.out.println("Favor pague a diferença:"); 
                escritaUtilizador = scanUser.nextInt();
            }
            else{
                System.out.println("Obrigada por ter comprado em nossa loja! "); 
            }
        } 
    }
}
