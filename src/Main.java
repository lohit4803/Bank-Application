public class Main
{
    public static void main(String[] args)
    {
        HDFC bank = new HDFC("Lohith", 500);

        System.out.println(bank.addMoney(100));

        System.out.println(bank.checkBalance());

        System.out.println(bank.getAccountNo());

        System.out.println(bank.withdrawMoney(250));

        System.out.println(bank.checkBalance());

        bank.setRateOfInterest(9.2);

        System.out.println(bank.getRateOfInterest());
    }
}
