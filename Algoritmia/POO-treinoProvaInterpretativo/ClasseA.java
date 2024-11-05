import java.util.ArrayList;

class ClasseA
{
    int z;
    int y;
    
    ArrayList<String> texto = new ArrayList();
    
    ClasseB instancia;

    ClasseA()
    {
        z = 4;
        y = z + 3;
        instancia = new ClasseB(y);
        z +=instancia.valor;
        System.out.println(z);
        texto.add(instancia.info());
        texto.add("Olá Mundo");
        System.out.println(texto.get(0) + "terminar");
    }
}
