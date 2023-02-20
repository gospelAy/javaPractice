package Chapter3;

public class Account {
    private String name;
    private double balance;
    private String pin;

    public Account(String name, double balance, String pin){
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        if (pin.equals(this.pin)){
            this.pin = pin;
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Withdrawal amount exceeded account balance");

        balance = balance - amount;
    }
}
