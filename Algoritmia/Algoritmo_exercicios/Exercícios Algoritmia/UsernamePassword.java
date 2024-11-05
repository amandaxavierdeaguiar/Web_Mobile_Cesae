
/**
 * Objetivo: Desenvolver um programa que autentique o utilizador através de username e password. 
 * Informação adicional: O username é “utilizador” e a password é “abz”. 
 * Requisitos: 
 * Pedir ao utilizador que escreva a palavra para username e em seguida a palavra para a password. 
 * Se o utilizador escrever corretamente o username e a password, deverá aparecer a mensagem  “Autenticação Completa”
 * Caso contrário (username ou password incorrecta), deverá ser apresentada a mensagem “Autenticação Inválida”. 
 * O utilizador só terá 3 tentativas para acertar no username e password. Se as tentativas forem esgotadas, 
 * não serão permitidas mais introduções de texto e deverá ser apresentada a mensagem 
 * “Este computador será autodestruído em 5 segundos!”
 */
//import
import java.util.Scanner; 

class UsernamePassword
{
    String username = "utilizador";
    String password = "abz";
    int contador = 0;
    
    Scanner inputUtilizador = new Scanner(System.in);
    
    
    UsernamePassword()
    {
        System.out.println("Digite seus dados:");
        
        // Verificar
        verificaDados();
    }

    void verificaDados()
    {
        System.out.println("Username: ");
        // Pedir String
        String inputUsername = inputUtilizador.nextLine();
        
        System.out.println("Password: ");
        String inputPassword = inputUtilizador.nextLine();
        
        if (inputUsername == username && inputPassword == password){
            System.out.println("Autenticação Completa");
        } 
        if (contador >= 3){
            System.out.println("Este computador será autodestruído em 5 segundos");
            return; // Parar a recursão aqui
        } 
        if (inputUsername != username || inputPassword != password ){
            System.out.println("Autenticação Inválida");
            contador ++;
            verificaDados();
        }
        
    }
}
