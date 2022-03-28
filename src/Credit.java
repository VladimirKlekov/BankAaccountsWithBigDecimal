import java.math.BigDecimal;

public class Credit {
    public static void credit(BigDecimal sumCredit) {
        if (sumCredit.compareTo(SavingsAccount.balanceSavings) <= 0) {
            SavingsAccount.balanceSavings = SavingsAccount.balanceSavings.subtract(sumCredit);
            CreditAccount.sumCredit = CreditAccount.sumCredit.subtract(sumCredit);
            System.out.println("Кредит погашен");

        } else {
            System.out.println("Недостаточно средств на сберегательном счете");
        }

    }
}
