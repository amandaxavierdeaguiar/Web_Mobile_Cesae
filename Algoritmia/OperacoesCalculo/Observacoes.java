class Observacoes
{
    Observacoes()
    {
        int valorX = 6;
        int valorY = 3;
        
        int valorZ = 3 + valorY - 1 + valorX;
        
        float valorReal = 8.3f;
        float valorReal2 = valorX;
        // A variavel é float, valorX é um inteiro. Nao da erro 
        // pois facilmente consegue um numero inteiro num float. 
        // automaticamente. conversao implicita
        
        float valorReal3 = 6.2f;
        // int numeroInteiro = valorReal3;
        // Da erro pois esta implementando um float para uma variavel inteira.
        //Conversao de dados CAST
        
        int numeroInteiro = (int)valorReal3;
        //Convertendo o numero real para inteiro. entao o 6.2 vai ficar 6 CAST
        System.out.println("CAST - Convertendo um float para inteiro \nNumero Convertido: "
                            +numeroInteiro);
                            
        

    }
}