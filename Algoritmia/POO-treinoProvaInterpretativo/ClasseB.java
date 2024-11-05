class ClasseB
{
    int valor;

    ClasseB(int param)
    {
        valor = param - 2;
        System.out.println("Criada instancia com valor " + valor);
    }
    String info()
    {
        valor++;
        String resultado = "A resposta foi: " + valor;

        return resultado;
    }
}
