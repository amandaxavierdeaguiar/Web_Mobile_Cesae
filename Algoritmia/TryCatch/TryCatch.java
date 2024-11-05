import java.util.Scanner;


class TryCatch
{
    Scanner inputUtilizador = new Scanner(System.in);
    
    TryCatch()
    {
        while(true)
        {
            try //tenta fazer este codigo
            {
                System.out.println("Por favor escreva um número inteiro: ");
                int valorInteiro = inputUtilizador.nextInt();
                break;
            } 
            //Se nao der, trate a excecao
            catch(Exception e) 
            {
                System.out.println("Você não escreveu um número inteiro!");
                System.out.println(e);
                inputUtilizador.nextLine(); // Para sair do loop infinito
            }
        }
    }
}
