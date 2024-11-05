import java.util.ArrayList;

class AppGestao
{
    Produto instanciaProduto;
    ArrayList<Produto> listaProduto;
    
    AppGestao()
    {
        listaProduto = new ArrayList();
        
        System.out.println(" Bem vindo ao Aplicação de Gestão ");
    }
    
    void inserirProdutos(String paramNome, float paramPreco)
    {
        instanciaProduto = new Produto(paramNome, paramPreco);
        listaProduto.add(instanciaProduto);
    }
    
    void listarProdutos()
    {
        for (int i=0; i < listaProduto.size(); i++)
        {
            System.out.println("Produto: " + listaProduto.get(i).nome + " Preço: " + listaProduto.get(i).preco);
        }
    }
    
    void totalPrecos()
    {
    
    }
}
