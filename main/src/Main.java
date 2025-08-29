
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            boolean parar = false;
            
            do {
                int opcao = menu(scanner);
                
                switch (opcao){
                    
                    case 9 -> {
                        System.out.println("Encerrando o programa...");
                        parar = true;
                    }
                    default -> System.out.println("inválida.");
                }
                
            } while (!parar); 
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n--- MENU ---");
        System.out.println("[1] Cadastrar Novo Item");
        System.out.println("[2] Listar Itens do Cardápio");
        System.out.println("[3] Cadastrar Novo Cliente");
        System.out.println("[4] Listar Clientes");
        System.out.println("[5] Registrar Novo Pedido");
        System.out.println("[6] Atualizar Status de um Pedido");
        System.out.println("[7] Gerar Relatório de Vendas");
        System.out.println("[8] Gerar Relatório de Vendas (Detalhado)");
        System.out.println("[9] Encerrar");
        System.out.print("Escolha uma opção: ");
    
        int opcao = scanner.nextInt();
       
        return opcao;
    }
}
