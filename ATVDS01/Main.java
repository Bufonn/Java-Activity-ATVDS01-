import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();
        int op;

        do {
            System.out.println("\nMenu Administrativo da Empresa Temdetudo!");
            System.out.println("Escolha uma Opção:");
            System.out.println("1 - Criar um Produto");
            System.out.println("2 - Alterar um Produto");
            System.out.println("3 - Listar todos os Produtos");
            System.out.println("4 - Excluir um Produto");
            System.out.println("5 - Sair.");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {

                case 1:

                    System.out.println("\nOpção Escolhida: 1 - Criar Produto");
                    System.out.print("Digite o Nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Digite o Preço: ");
                    String preco = scan.nextLine();

                    System.out.print("Digite Quantos tem em Estoque: ");
                    int estoque = scan.nextInt();

                    System.out.print("Digite quantos já foram Vendidos: ");
                    int vendidos = scan.nextInt();

                    System.out.print("Digite o ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Produto novoProduto = new Produto(nome, preco, estoque, vendidos, id);
                    listaProdutos.add(novoProduto);

                    System.out.println("\nSeu Produto foi cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nOpção Escolhida: 2 - Alterar Produto");

                    if (listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Digite o ID do Produto que deseja alterar: ");
                    int idAlterar = scan.nextInt();
                    scan.nextLine();

                    Produto produtoAlterar = null;

                    for (int i = 0; i < listaProdutos.size(); i++) {
                        if (listaProdutos.get(i).getId() == idAlterar) {
                            produtoAlterar = listaProdutos.get(i);
                            break;
                        }
                    }

                    if (produtoAlterar == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println("Produto encontrado!");
                    
                        System.out.print("Novo Nome (ou 'Ok' para manter): ");
                        String novoNome = scan.nextLine();

                        if (!novoNome.equals("Ok") && !novoNome.equals("ok")) {
                            produtoAlterar.setNome(novoNome);
                        }
                    
                        System.out.print("Novo Preço (ou 'Ok' para manter): ");
                        String novoPreco = scan.nextLine();

                        if (!novoPreco.equals("Ok") && !novoPreco.equals("ok")) {
                            produtoAlterar.setPreco(novoPreco);
                        }
                    
                        System.out.print("Nova Quantidade em Estoque (ou 'Ok' para manter): ");
                        String novoEstoque = scan.nextLine();

                        if (!novoEstoque.equals("Ok") && !novoEstoque.equals("ok")) {
                            estoque = Integer.parseInt(novoEstoque);
                            produtoAlterar.setEstoque(estoque);
                        }
                    
                        System.out.print("Nova Quantidade Vendida (ou 'Ok' para manter): ");
                        String novosVendidos = scan.nextLine();

                        if (!novosVendidos.equals("Ok") && !novosVendidos.equals("ok")) {
                            vendidos = Integer.parseInt(novosVendidos);
                            produtoAlterar.setVendidos(vendidos);
                        }
                    
                        System.out.print("Novo ID (ou 'Ok' para manter): ");
                        String novoId = scan.nextLine();
                        
                        if (!novoId.equals("Ok") && !novoId.equals("ok")) {
                            id = Integer.parseInt(novoId);
                            produtoAlterar.setId(id);
                        }
                    
                        System.out.println("Produto atualizado com sucesso!");
                    }

                case 3:

                System.out.println("\nOpção Escolhida: 3 - Listar Produtos");
                if (listaProdutos.size() == 0) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        System.out.println(listaProdutos.get(i));
                    }
                }

                break;

                case 4:

                    System.out.println("\nOpção Escolhida: 4 - Excluir Produto");

                    if (listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Digite o ID do Produto que deseja excluir: ");
                    int idExcluir = scan.nextInt();
                    scan.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < listaProdutos.size(); i++) {
                        if (listaProdutos.get(i).getId() == idExcluir) {
                            listaProdutos.remove(i);
                            removido = true;
                            break;
                        }
                    }
                    
                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                case 5:

                    System.out.println("Saindo do programa...");

                    break;

                default:

                    System.out.println("Essa opcão não existe, tente novamente.");

                    break;
                }

            } while (op != 5);
    }
}
