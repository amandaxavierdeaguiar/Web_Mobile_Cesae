class ClasseY
{
    int pos;

    
    ClasseY()
    {
        pos=2;
    }

    void operacao(int paramContagem, boolean paramEstado)
    {
        if(paramContagem < 3 || paramEstado != false){
            System.out.println(paramContagem);
        } else {
            System.out.println(paramEstado);
        }
    }
}
