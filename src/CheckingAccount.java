import java.math.BigDecimal;

public class CheckingAccount extends Account {

    public static BigDecimal balanceCheck = new BigDecimal(0.0);


    public CheckingAccount(BigDecimal balance) {

        super(balance);
    }

    @Override
    void pay(BigDecimal pay) {
        if (pay.compareTo(balanceCheck) <= 0) {
            balanceCheck = balanceCheck.subtract(pay);
        } else {
            System.out.println("Недостаточно средств на счете");
        }

    }

    @Override
    void transfer(BigDecimal transfer) {
        if (transfer.compareTo(balanceCheck) <= 0) {
            balanceCheck = balanceCheck.subtract(transfer);
            SavingsAccount.balanceSavings = SavingsAccount.balanceSavings.add(transfer);


        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    @Override
    void addMoney(BigDecimal amount) {
        balanceCheck = balanceCheck.add(amount);
        System.out.println("На расчетный счет зачислена сумма в размере: " + amount + " рублей");
    }


}

