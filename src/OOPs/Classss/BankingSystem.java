package OOPs.Classss;

class Account {
    int accountNo;
    String name;
    float amount;

    void insert(int acNo, String n, float amt) {
        accountNo = acNo;
        name = n;
        amount = amt;
    }

    void deposit(int amt) {
        amount = amount + amt;
        System.out.println(amt+" is deposited ");
    }

    void withdraw(int amt) {
        if(amount < amt) {
            System.out.println("Insufficient Balance");
        }
        else {
            amount = amount - amt;
            System.out.println(amt+"is withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("You have "+amount+" in your acount");
    }

    void display() {
        System.out.println(accountNo+" "+name+" Rupees "+amount);

    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account a = new Account();
        a.display();
        a.insert(12546,"Vaibhav",4574);
        a.checkBalance();
        a.deposit(100000);
        a.checkBalance();
        a.withdraw(1000);
        a.checkBalance();
        a.display();
    }
}
