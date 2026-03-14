/*the problem with this code is that you didnt apply encapsulation
princible like the previous example and also repeated the 
transfer code when you could just make a method for it and also didnt check that the 
balance should be only +ve  , so the solution of this problem will be like the previous one*/

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    public void set_accountHolder(String accountholder){
        this.accountHolder=accountholder;
    }
    public void set_balance(int balance){
        if(balance>0)
        this.balance=balance;
        else System.out.println("You cant put negative money in your account");
    }
     public String get_accountHolder(){
        return accountHolder;
    }
    public double get_balance(){
        return balance;
    }
    public void transfer(BankAccount person,int transferedMoney){
        if(this.get_balance()<transferedMoney){
            System.out.print("no enough money in your account\n");
            
        }
        else{
        this.balance-=transferedMoney;
        person.balance+=transferedMoney;
        System.out.print("Money transfere successfully\n");
        }

    }

}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        BankAccount mohamed = new BankAccount();
        mohamed.set_accountHolder( "Mohamed"); 
        mohamed.set_balance(1000);

        BankAccount ahmed = new BankAccount();
        ahmed.set_accountHolder("Ahmed");
        ahmed.set_balance(500);
        

        int amount = sc.nextInt();
        sc.nextLine();

        mohamed.transfer(ahmed, amount);

        System.out.println("Mohamed balance: " + mohamed.get_balance()); 
        System.out.println("Ahmed balance: "+ ahmed.get_balance());
    }
}