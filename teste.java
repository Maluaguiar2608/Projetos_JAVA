
import java.util.Scanner;

public class teste {
    public static void main(String [] args) {
        int conta;
        String nome, agencia;
    //Conhecer e importar a classe Scanner;
    //Exibir as mensagens para o usuário;
    //Obter pela Scanner os valores digitados no terminal;
    //Exibir a mensagem conta criada;

        Scanner sc = new Scanner(System.in);
            System.out.println("Por gentileza, informe seu nome: ");
            nome = sc.nextLine();
    
            System.out.println("\nInforme sua agência: ");
            agencia = sc.nextLine();
    
            System.out.println("\nInforme sua conta: ");
            conta = sc.nextInt();

            System.out.println("\nInforme seu saldo: ");
            Double saldo = sc.nextDouble();
    
            System.out.println("\nOlá " + nome + "! \nObrigado por criar uma conta em nosso banco!!\nSua agência é: " + agencia + "\nConta: " + conta + "\nSeu saldo:" + saldo + " já está disponível para saque!");
        
        }
    }

