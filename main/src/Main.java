
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
       
        int escolha = menu(scanner);

        
        System.out.println("\nVocê escolheu a opção: " + escolha);
        
        scanner.close(); 
    }

    public static int menu(Scanner scanner) {
        System.out.println("Selecione:");

        
        System.out.println("[1] Cadastrar Novo Item");
        System.out.println("[2] Listar Itens do Cardápio");
        System.out.println("[3] Cadastrar Novo Cliente");
        System.out.println("[4] Listar Clientes");
        System.out.println("[5] Registrar Novo Pedido");
        System.out.println("[6] Atualizar Status de um Pedido");
        System.out.println("[7] Gerar Relatório de Vendas");
        System.out.println("[8] Gerar Relatório de Vendas (Detalhado)");

    
        int opcao = scanner.nextInt();

       
        return opcao;
    }
}