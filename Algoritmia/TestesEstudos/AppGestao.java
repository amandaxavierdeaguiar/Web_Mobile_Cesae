import java.util.ArrayList;


class AppGestao
{
    Produto produto;
    
    ArrayList<String> inserirProdutos = new ArrayList<>();
    ArrayList<Float> inserirPreco = new ArrayList<>();
    float valorTotal;
    
    AppGestao()
    {
        System.out.println("Bem-vindo/a à Aplicação de Gestão!");
        
    }
    
    void inserirProduto(String paramNome, float paramPreco)
    {        
        inserirProdutos.add(paramNome);
        inserirPreco.add(paramPreco);
    }
    
    void listarProdutos(){
        if (inserirProdutos.size()<=0){
            System.out.println(" NÃO EXISTEM PRODUTOS PARA APRESENTAR! ");
        } else {
            System.out.println("Lista Produtos: "); 
            for (int i=0; i < inserirProdutos.size(); i++)
            {
                System.out.println("PRODUTO: " + inserirProdutos.get(i) +" PRECO: " + + inserirPreco.get(i));
            }
        }
    }
    
    void totalPrecos(){
        if (inserirProdutos.size()<=0){
            System.out.println(" NÃO EXISTEM PRODUTOS PARA APRESENTAR! ");
        } else { 
            for (int i=0; i < inserirProdutos.size(); i++)
            {
                valorTotal += inserirPreco.get(i);
            }
            System.out.println(valorTotal);
        }
    }
}
