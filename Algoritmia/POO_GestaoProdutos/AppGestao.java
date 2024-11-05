import java.util.ArrayList;

public class AppGestao
{
    ArrayList<Produto> produtos = new ArrayList<>();

    public AppGestao()
    {
        System.out.println("Bem-vindo/a à Aplicação de Gestão!");
        
        listarProdutos();
        
        // Inserindo produtos automaticamente ao iniciar a aplicação
        inserirProduto("Arroz", 5.99f);
        inserirProduto("Feijão", 4.89f);
        inserirProduto("Macarrão", 3.50f);
        inserirProduto("Óleo", 7.25f);
        
        listarProdutos();
        totalPrecos();
    }
    
    // Método para inserir um produto na lista
    public void inserirProduto(String nome, Float preco){
        produtos.add(new Produto(nome, preco));
    }
    
    // Método para listar todos os produtos
    public void listarProdutos(){
        if (produtos.isEmpty()) {
            System.out.println("Não existem produtos!");
        } else {
            for (Produto p : produtos) {
                System.out.println("Nome: " + p.nome + " - Preço: " + p.preco);
            }
        }
    }
    
    // Método para calcular o total dos preços
    public void totalPrecos()
    {
        if (produtos.isEmpty()) {
            System.out.println("Não existem produtos!");
        } else {
            float total = 0;
            for (Produto p : produtos) {
                total += p.preco;
            }
            System.out.println("Total dos preços: " + total);
        }
    }
}

