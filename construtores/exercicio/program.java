/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

package exercicio;
import java.util.Scanner;

import exercicio.conta.contaBancaria;
public class program{
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        contaBancaria conta;
        System.out.println ("digite o nome do titular da conta:");
        String name = sc.nextLine();
        System.out.println("Digite o numero da conta, sem barras ou asteriscos");
        int numeroDaConta=sc.nextInt();
        double saldo=0;
        System.out.println( "Existe um valor de depósito inicial (s/n)?");
        char resposta= sc.next().charAt(0);
            if (resposta=='s'){
            System.out.println(" qual o valor do depósito?");
            Double valor=sc.nextDouble();
            saldo+=valor;
           conta= new contaBancaria(name, numeroDaConta,saldo);
            } else {
            conta= new contaBancaria(name, numeroDaConta,saldo);
            }
System.out.println(conta.toString());
System.out.println(" digite o valor do depósito");
Double val=sc.nextDouble();
conta.deposito (val);
System.out.println("atualização:  ");
System.out.println(conta.toString ());
System.out.println();
System.out.println("digite o valor de retirada: ");
double montante=sc.nextDouble();
conta.retirada (montante);
System.out.println("atualização: ");
System.out.println(conta.toString());





        sc.close();
    }
}