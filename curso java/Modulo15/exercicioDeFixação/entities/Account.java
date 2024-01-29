package Modulo15.exercicioDeFixação.entities;
import Modulo15.exercicioDeFixação.entities.Exception;
public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withdawLimit;



    
    public Account(Integer number, String holder, double balance, double withdawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdawLimit = withdawLimit;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getWithdawLimit() {
        return withdawLimit;
    }
    public void setWithdawLimit(double withdawLimit) {
        this.withdawLimit = withdawLimit;
    }
    public void deposit (double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        validateWitcdraw(amount);
        balance-=amount;
    }
    public void validateWitcdraw (double amount){
            if (amount>getWithdawLimit()){
                throw new Exception("Erro de saque: A quantia excede o limite de saque");
		} 
		if (amount > getBalance()) {
			throw new Exception("Erro de saque: Saldo insuficiente");
		}
    }
}
