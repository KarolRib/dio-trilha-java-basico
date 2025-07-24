import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Cria a ferramenta Scanner para ler os dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Pede ao cliente que informe o número da sua agência
        System.out.println(
                "Olá! Seja bem vindo (a)! Por favor, informe o número da sua agência com dígito (Exemplo: 1234-5): ");
        // Lê a agência informada como texto (String)
        var agencia = scanner.nextLine();

        // Pede ao cliente que informe o número da sua conta (somente números)
        System.out.println("Agora digite o número da sua conta com dígito (somente números): ");
        // Lê a conta informada como número inteiro (int)
        var numeroConta = scanner.nextInt();

        // Consome o "Enter" que ficou na memória após a leitura do número
        scanner.nextLine();

        // Pede ao cliente que informe o seu nome completo
        System.out.println("Muito bem! Agora digite o seu nome completo: ");
        // Lê o nome completo informado como texto (String)
        var nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial da conta ao cliente
        System.out.println("Para finalizar, informe o saldo inicial da conta: ");
        // Lê o valor do saldo como String, permitindo que o usuário digite "." ou ","
        String saldoTexto = scanner.nextLine();
        // Remove os pontos de milhar do texto (ex: "1.000" vira "1000")
        String textoSemPontos = saldoTexto.replace(".", "");
        // Substitui a vírgula do decimal por um ponto (ex: "1000,50" vira "1000.50")
        String textoFinal = textoSemPontos.replace(",", ".");
        // Converte o texto, agora limpo e padronizado, para um número do tipo double
        double saldo = Double.parseDouble(textoFinal);

        // Linha criada para separar e organizar a saída no terminal
        System.out.println("\n----------------------------------------");

        // Exibe a mensagem final formatada com os dados do cliente
        System.out.printf(
                "Olá %s, agradecemos por criar uma conta em nosso Banco, sua agência é %s,\n" + 
                "sua conta é %d e seu saldo de R$ %.2f já está disponível para saque.",
                nomeCliente,
                agencia,
                numeroConta,
                saldo);

        // Fecha o scanner para liberar os recursos do sistema
        scanner.close();
    }
}
