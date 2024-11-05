import java.util.ArrayList;


class AppBiblioteca
{
    Livro livro;
    
    
    ArrayList<String> tituloArray = new ArrayList<>();
    ArrayList<String> autorArray = new ArrayList<>();
    ArrayList<Integer> anoPublicacaoArray = new ArrayList<>();
    
    AppBiblioteca()
    {
        
    }
    
    void adicionarLivros(String paramTitulo, String paramAutor, int paramAnoPublicacao)
    {
        tituloArray.add(paramTitulo);
        autorArray.add(paramAutor);
        anoPublicacaoArray.add(paramAnoPublicacao);
    }
    
    
    void pesquisarTitulo(String qualTitulo)
    {
        if (tituloArray.contains(qualTitulo))
        {
            int index = tituloArray.indexOf(qualTitulo);
            System.out.println("O titulo está no index: " + index);
            
            System.out.println("TITULO: " + tituloArray.get(index) + " AUTOR " + autorArray.get(index) + " ANO PUBLICACAO " + anoPublicacaoArray.get(index));
        }else{
            System.out.println("Não existem livros com este título em nosso Banco de Dados");
        }   
        
        
    }
    
    void listarLivrosCadastrados()
    {
        for(int i=0; i < tituloArray.size(); i++)
        {
            System.out.println("TITULO: " + tituloArray.get(i) + " AUTOR " + autorArray.get(i) + " ANO PUBLICACAO " + anoPublicacaoArray.get(i));
        }
        
    }
}
