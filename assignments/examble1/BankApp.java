/*the problem with the code was that you didnt apply
the encapsulation princible since you made the attributes(accountHolder ,balnce ) public
and didnt use getters & setters and also didnt check the validiation of transfer money 
like -ve balance*/


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
        }

    }

}

public class BankApp {
    public static void main(String[] args) {
        BankAccount mohamed = new BankAccount();
        mohamed.set_accountHolder( "Mohamed"); 
        mohamed.set_balance(1000);

        BankAccount ahmed = new BankAccount();
        ahmed.set_accountHolder("Ahmed");
        ahmed.set_balance(500);

        // Mohamed tries to send 1500 to Ahmed
        mohamed.transfer(ahmed, 300);

        System.out.println("Mohamed balance: " + mohamed.get_balance()); 
        System.out.println("Ahmed balance: "+ ahmed.get_balance());
    }
}