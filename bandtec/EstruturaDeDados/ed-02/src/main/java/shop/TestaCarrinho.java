package shop;

import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        int option;
        Integer codigo, qtdHoras;
        Double precoCusto, valorHora;
        String nome, autor, isbn, gravadora, descricao;
        String optionBook, optionDvd, optionService;
        Scanner readerInt = new Scanner(System.in);
        Scanner readerDouble = new Scanner(System.in);
        Scanner readerNL = new Scanner(System.in);
        boolean end = false;
        Carrinho c = new Carrinho();

        while (!end) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Serviço");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir total de venda");
            System.out.println("6. Fim");
            System.out.println("\n Digite uma opção: ");
            option = readerInt.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nDigite os valores de Código, Preço de Custo, Nome, Autor e ISBN");
                    Livro book = new Livro( readerInt.nextInt(), readerDouble.nextDouble(),
                            readerNL.nextLine(),readerNL.nextLine(),readerNL.nextLine());
                    c.addVendavel(book);
                    break;
                case 2:
                    System.out.println("\nDigite os valores de Código, Preço de Custo, Nome e Gravadora");
                    DVD dvd = new DVD( readerInt.nextInt(), readerDouble.nextDouble(),
                            readerNL.nextLine(),readerNL.nextLine());
                    c.addVendavel(dvd);
                    break;
                case 3:
                    System.out.println("\nDigite os valores de Descrição, Código, Quantidade de Horas e Valor da Hora");
                    Servico service = new Servico(readerNL.nextLine(), readerInt.nextInt(),
                            readerInt.nextInt(), readerDouble.nextDouble());
                    c.addVendavel(service);
                case 4:
                    c.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println(c.calculaTotalVenda());
                    break;
                case 6:
                    end = true;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}