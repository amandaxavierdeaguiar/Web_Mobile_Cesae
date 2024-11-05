import java.util.ArrayList;
import java.util.Random; 

class Curso
{
    Aluno instanciaAluno;
    ArrayList<Aluno> listaAluno;

    Random sorteioIndex = new Random();
    
    int valorTotal;
    int media; 
    
    public Curso()
    {
        listaAluno = new ArrayList();
        
        System.out.println("Bem vindo/a à Alicação de operações sobre o curso!");
    }

    void inserirAlunos(String paramNome, float paramNota){
        instanciaAluno = new Aluno(paramNome, paramNota);
        listaAluno.add(instanciaAluno);
    }
    
    void ordenacaoAleatoriaAlunos(){
        ArrayList<Integer> listaTemporarios = new ArrayList();
        
        if(listaAluno.size() < 0){
            System.out.println("Não existem ainda alunos no curso!");
        } else{
            for (int i=0; i< listaAluno.size(); i++)
            {
                listaTemporarios.add(i);
            }
            for (int i=0; i < listaAluno.size(); i++)
            {
                int indexAleatorio = sorteioIndex.nextInt(listaTemporarios.size());
                
                System.out.println(listaAluno.get(listaTemporarios.get(indexAleatorio)).nome);
                listaTemporarios.remove(indexAleatorio);
            }
        }
    }
    
    void mediaNotasTurma(){
        if (listaAluno.size()<0){
            System.out.println("Não existem ainda alunos no curso!");
        } else { 
            for (int i=0; i < listaAluno.size(); i++)
            {
                valorTotal += listaAluno.get(i).nota;
            }            
            int media = valorTotal / listaAluno.size();
            
            System.out.println("A media dos alunos é: " + media);
        }
    }
}
