class EstruturasCondicionais
{
    String username = new String("abc");
    // literal - instância mais rápida.
    String password = new String("xyz");
    
    EstruturasCondicionais()
    {
        // Aplicação de ujm AND lógico (&&)
        
        /*if(username.equals("abc") == true) {
            if (password.equals("xyz") == true){
            System.out.println("Username Correto!");
            } 
        }*/
        if (username.equals("abc") == true && password.equals("xyz") == true)
        {
            System.out.println("Username e Password Corretos!");
        } else{
            System.out.println("Alguma coisa falhou!");
        }
        // (6 > 9 || 4 == 3 && 9 <= 0 || 3 >= 1) true
        // if ((6 > 9 || 4 == 3) && 9 <= 0 || 3 >= 1) false
        // prioridade das expressoes. mais revelevante () e em seguida o end &&
        if ((6 > 9 || 4 == 3) && 9 <= 0 || retornoBool())
        {
            System.out.println("Aprendizagem sobre o procedencia do &&");            
        }
        
        
        boolean estado = true; // criou uma expressao boolean
        
        // Operador logico NOT apenas inverte o resultado de um valor booleano
        if(!estado == true)
        {
            System.out.println("Entrou no IF");
        }  
        // Trocou o estado de verdadeiro para falso
        if( !username.equals("abc") == true)
        {
            System.out.println("Entrou no IF");
        }
        
        
        
        // Estrutura Condicional Switch Case
        
        int notaAvaliacao = 3;
        
        
        switch (notaAvaliacao)
        {
            case 1:
                System.out.println("A sua nota foi bastante insuficiente");
                break; // Sair da estrutura condicional. Dizer que acabou
            case 2:
                System.out.println("A sua nota foi insuficiente");
                break;
            case 3:
                System.out.println("A sua nota foi suficiente");
                break; // Obrigatorio para sair
            case 4:
                System.out.println("A sua nota foi muito bom");
                break;
            case 5:
                System.out.println("A sua nota foi Excelente!");
                break;
            default: //como se fosse o else. caso nao aconteça os outros
                System.out.println("Sua nota não foi válida - Não pertence a escala! ");
                break;
        }        
        
        int notaUniversidade = 13;
        
        switch (notaUniversidade)
        {
            case 1: //Se nao tiver break, solta para a seguinte.
            case 2: 
            case 3:
                System.out.println("A sua nota foi muito ruim");
                break; // Obrigatorio para sair
            case 4:
            case 5:
            case 6:
                System.out.println("A sua nota negativa");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("A sua foi quase positiva");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                System.out.println("Sua nota foi positiva");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("A sua nota foi muito boa");
                break;
            case 18:
            case 19:
            case 20:
                System.out.println("A sua nota foi extraordinaria");
                break;
            default: //como se fosse o else. caso nao aconteça os outros
                System.out.println("Sua nota não foi válida - Não pertence a escala!");
                break;
        }
        
        String diaSemana = new String("quarta");
        
        // consegue comparar string, nao precisa equals
        switch (diaSemana)
        {
            case "segunda":
                System.out.println("O horário é das 9h as 18h");
                break;
            case "terca":
                System.out.println("O horário é das 11h as 20h");
                break;   
            case "quarta":
                System.out.println("O horário é das 10h as 19h");
                break;
            case "quinta":
                System.out.println("O horário é das 8h as 19h");
                break;
            case "sexta":
                System.out.println("O horário é das 13h as 21h");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Fechado");
                break;
            default: //convem sempre ter
                System.out.println("Dia da semana não identificado");
                break;
        }
    
    }
    
    boolean retornoBool()
    {
        return true;
    }
}
