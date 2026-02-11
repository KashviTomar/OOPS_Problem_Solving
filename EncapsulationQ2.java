// Design a BankAccount class with a private balance. Implement deposit() and withdraw() methods that prevent negative inputs and insufficient fund withdrawals.

class BankAccount{
    private double balance = 0;

  //Deposit:
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
        else{
            System.out.println("Invalid amount.");
        }
    }

    //Withdraw:
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Zero balance/ Invalid balance");
        }
        else if(amount > balance){
            System.out.println("Insufficent balance.");
        }
        else{
            balance -= amount;
        }
    }

    //Getter:
    public double getBalance(){
        return balance;
    }
}

public class EncapsulationQ2{
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposit(50000);
        ba.withdraw(20000);
        System.out.println("Balance: "+ ba.getBalance());
    }
}
