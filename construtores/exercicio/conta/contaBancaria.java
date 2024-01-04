package exercicio.conta;

public class contaBancaria {
 private String name;
 private int numeroDaConta;
 private double saldo;
    public contaBancaria (String name, int numeroDaConta, double saldo) {
        this.name = name;
        this.numeroDaConta = numeroDaConta;
        double deposito=0;
        this.saldo = deposito;
        }
    public contaBancaria (String name, int numeroDaConta) {
        this.name = name;
        this.numeroDaConta = numeroDaConta;
        }
            public int getNumeroDaConta (){
                 return numeroDaConta;
            }
            public String getName () {
                return name;
            }
            public void setName (String name) {
                this.name=name;
            }
            public double getSaldo (){
                return saldo;
            }
    public void deposito (double valor) {
        saldo+=valor;
    }
    public void retirada (double montante){
        saldo-=montante+5.0;
    }
    public String toString (){
        return " dados da conta:  " 
                +name
                +"  "
                +numeroDaConta
                +" "
                +saldo;
    } 
}
