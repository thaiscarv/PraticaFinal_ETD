package praticaFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutosB dao = new ProdutosB();


        Arvore supermercados = new Arvore();
        supermercados = dao.createTree("Supermercados");
        Arvore lacteos = new Arvore();
        lacteos = dao.createTree("Lacteos");
        Arvore frutas_y_verduras = new Arvore();
        frutaseverduras = dao.createTree("Frutaseverduras");
        Arvore carniceria = new Arvore();
        carnes = dao.createTree("Carnes");
        Arvore despensa = new Arvore();
        dispensa  = dao.createTree("Dispensa");



        Scanner ler = new Scanner(System.in);

        int menu = 0;

        while (menu != 4) {
            System.out.printf("=============MENU=============");
            System.out.println("(1) Pesquisar Produto: ");
            System.out.println("(2) Visualizar Produtos: ");
            System.out.println("(3) Excluir Produto");
            System.out.println("(4) Sair");
            System.out.println("================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    int idProduto = 0;
                    System.out.println("=============Categorias=============");
                    System.out.println("1 - Supermercado ");
                    System.out.println("2 - Lácteos ");
                    System.out.println("3 - Frutas e Verduras ");
                    System.out.println("4 - Açougue ");
                    System.out.println("5 - Despensa ");
                    System.out.println("6 - Voltar");
                    System.out.println("=====================================");
                    menu = ler.nextInt();
                    switch (menu){

                        case 1:
                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(supermercados.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));

                            }else {
                                System.out.println("Produto nao encontrado");
                            }
                            break;
                        case 2:

                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(lacteos.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto nao encontrado");
                            }

                            break;

                        case 3:
                            System.out.println("Digite o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(frutas_y_verduras.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto não encontrado");
                            }
                            break;

                        case 4:
                            System.out.println("Digite o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(carniceria.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto não encontrado");
                            }
                            break;

                        case 5:
                            System.out.println("Digite o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(despensa.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto não encontrado");
                            }
                            break;
                        case 6:
                            System.out.println("Voltando...");
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                            break;

                    }
                break;

                case 2:
                	System.out.println("=============Categorias=============");
                    System.out.println("1 - Supermercado ");
                    System.out.println("2 - Lácteos ");
                    System.out.println("3 - Frutas e Verduras ");
                    System.out.println("4 - Açougue ");
                    System.out.println("5 - Despensa ");
                    System.out.println("6 - Sair");
                    System.out.println("====================================");
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Imprimindo em ordem");
                            supermercados.imprimirInOrdem();
                            break;
                        case 2:
                            System.out.println("Imprimindo em ordem");
                            lacteos.imprimirInOrdem();
                            break;
                        case 3:
                            System.out.println("Imprimindo em ordem");
                            frutas_y_verduras.imprimirInOrdem();
                            break;
                        case 4:
                            System.out.println("Imprimindo em ordem");
                            carniceria.imprimirInOrdem();
                            break;
                        case 5:
                            System.out.println("Imprimindo em ordem");
                            despensa.imprimirInOrdem();
                            break;
                        case 6:
                            System.out.println("FIM!");
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                            break;
                    }
                    break;
                case 3:
                	System.out.println("=============Categorias=============");
                    System.out.println("1 - Supermercado ");
                    System.out.println("2 - Lácteos ");
                    System.out.println("3 - Frutas e Verduras ");
                    System.out.println("4 - Açougue ");
                    System.out.println("5 - Despensa ");
                    System.out.println("6 - Sair");
                    System.out.println("=====================================");
                    int idPRemover = 0;
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (supermercados.busca(idPRemover)==true){
                                supermercados.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto não encontrado ");
                            }
                            break;
                        case 2:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (lacteos.busca(idPRemover)==true){
                                lacteos.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto não encontrado ");
                            }
                            break;
                        case 3:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (frutas_y_verduras.busca(idPRemover)==true){
                                frutas_y_verduras.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto não encontrado ");
                            }
                            break;
                        case 4:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (carniceria.busca(idPRemover)==true){
                                carniceria.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto não encontrado ");
                            }
                            break;
                        case 5:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (despensa.busca(idPRemover)==true){
                                despensa.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;
                        case 6:
                            System.out.println("FIM!");
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("FIM!");

                    break;
                default:
                    System.out.println("Opção Inexistente");
                    break;

            }
        }
    }
}
