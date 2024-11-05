
class IncrementoDecremento
{
    IncrementoDecremento()
    {
        // Exemplos de incremento
        int valor = 3;
        int teste = 6;
        
        // Incremento em 1        
        valor ++; // 3+1 = 4
        
        //incremento em 1 de forma completa
        valor = valor + 1; //4 + 1 = 5
        
        // incremento em N
        valor += teste + valor - 4;
        //pegar primeiro este valor: teste + valor - 4 (6 + 5 - 4 = 7)
        // fica valor += 7 
        // 5 + 7 = 12
        
        
        // Exemplo de decremento
        // Decremento em 1
        valor --; // 11
        
        // Decremento em 1 de forma completa
        valor = valor -1;
        
        // Decremento em N
        valor -= 2;  
    }
}
