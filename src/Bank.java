public interface Bank
{
    public int checkBalance();
    String addMoney(int money);
    String withdrawMoney(int money);
    double calculateInterest(int years);
}
