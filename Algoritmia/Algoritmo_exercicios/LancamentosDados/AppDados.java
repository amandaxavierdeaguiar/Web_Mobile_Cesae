// Importar o package necessário
import java.util.Random;

// Definição da classe
class AppDados
{
    // Variável ou propriedade global 
    // pode so declarar e no máximo atribuir um valor. 
    int valor = 0; 
    

    //Construtor
    AppDados()
    {
        System.out.println("O programa vai lançar 5 dados:");
        
        /*for(int i = 0; i <= 4; i++){
            System.out.println("O número escolhido foi: "+lancarDado());
        }*/
        
        System.out.println("O número escolhido foi: "+ lancarDado());
        System.out.println("O número escolhido foi: "+ lancarDado());
        System.out.println("O número escolhido foi: "+ lancarDado());
        System.out.println("O número escolhido foi: "+ lancarDado());
        System.out.println("O número escolhido foi: "+ lancarDado());
        
        }
    
    int lancarDado(){
        Random numeroAleatorio = new Random();
        
        int dado = numeroAleatorio.nextInt(6) + 1;
        
        return dado;
    }
    
    /**String maneiraAndre(){
     * Random numeroAleatorio = new Random();
     * int dado = numeroAleatorio.nextInt(6) + 1;
     * 
     * return "O programa vai lançar um dado: " + dado;
     * }
     */
}