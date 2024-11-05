class Utilizador
{
    int id;
    String username;
    String email;
    String password;
    boolean autenticado = false;
    
    Utilizador()
    {
         username = "visitante";
    }
    
    void fazerLogin(String paramUsername, String paramPassword)
    {
        // Supondo um eventual acesso ao BD
        
        //username do global e password da global
        username = "Amanda"; 
        password = "teste";
        
        
        if (username.equals(paramUsername) && password.equals(paramPassword)){
            autenticado = true;
            System.out.println("BEM VINDA " + username);
        } else {
            System.out.println("ERRO!");
        }
        
        /*if (username == paramUsername && password == paramPassword){
            autenticado = true;
            System.out.println("BEM VINDA " + username);
        } else {
            System.out.println("ERRO!");
        }*/
    }
    
    void fazerLogout(){
        autenticado = false;
    }
    
    void fazerRegistro(){
    
    }
}
