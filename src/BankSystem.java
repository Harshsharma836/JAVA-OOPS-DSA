class CsiBank{
    int balance;
    String accoutNumber;
    CsiBank(int balance , String accoutNumber){
        this.balance = balance;
        this.accoutNumber = accoutNumber;
    }

    int getBalance(){
        return balance;
    }

    void withDrawl(int amount){
        if(balance < amount){
            System.out.println("Amount not deptied , Bank balance is low");
        }
        else{
            System.out.println("Amount is debited");
            balance = balance - amount;
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        CsiBank aman = new CsiBank(1400, "qazwsx");
        aman.withDrawl(6000);
        System.out.println("Current bank balance is  :" + aman.getBalance());

    }
}
