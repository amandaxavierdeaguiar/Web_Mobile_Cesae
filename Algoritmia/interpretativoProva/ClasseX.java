
public class ClasseX
{
    int contagem;
    boolean estado;
    
    ClasseY instanciaY;
    ClasseX()
    {
        contagem = 0;
        estado = false;
        instanciaY = new ClasseY();
        contagem++;
        instanciaY.pos += contagem;
        instanciaY.operacao(contagem, estado);
        
        for(int i=0; i<=2; i++){
            contagem = i + instanciaY.pos;
            instanciaY.operacao(contagem, estado);
            estado=true;
        }
    }
}
