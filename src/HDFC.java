import java.util.UUID;

public class HDFC implements Bank
{
    private String accountNo;
    String name;
    private int balance;
    static double rateOfInterest;

    public HDFC(String name, int balance)
    {
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.name = name;
        this.balance = balance;
    }

    public String  getAccountNo()
    {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setRateOfInterest(double rateOfInterest)
    {
        HDFC.rateOfInterest = rateOfInterest;
    }

    public double getRateOfInterest()
    {
        return rateOfInterest;
    }

    @Override
    public int checkBalance()
    {
        return balance;
    }

    @Override
    public String addMoney(int money)
    {
        balance += money;
        return "money added and the current balance is "+balance;
    }

    @Override
    public String withdrawMoney(int money)
    {
        if(money <= balance)
            balance -= money;
        else return "Insufficient balance";

        return "money withdrawn and the current balance is "+balance;
    }

    @Override
    public double calculateInterest(int years)
    {
        return (balance*years*rateOfInterest)/100;
    }
}
