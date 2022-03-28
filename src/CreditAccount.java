import java.math.BigDecimal;
import java.util.Scanner;

public class CreditAccount extends Account {
            public BigDecimal balanceCredit= new BigDecimal(0.0);
            public static BigDecimal credit = new BigDecimal(0.0);
            public static BigDecimal sumCredit = new BigDecimal(0.0);

        Scanner credidScanner = new Scanner(System.in);

        public CreditAccount(BigDecimal balance) {
            super(balance);
        }
        @Override
        void pay(BigDecimal pay) {
                if (pay.compareTo(balanceCredit) <= 0) {
                        balanceCredit = balanceCredit.subtract(pay);

                } else {
                        System.out.println("Недостаточно средств на кредитном счете");
                        System.out.println("Желаете оформить кредит?");
                        System.out.println("Введите 1 для оформления или 2 для выхода");
                        int read3 = credidScanner.nextInt();
                        if (read3 == 1) {
                                credit = pay.subtract(balanceCredit);
                                balanceCredit = balanceCredit.add(credit);
                                balanceCredit = balanceCredit.subtract(pay);
                                System.out.println("Кредит одобрен. Платеж в размере " + pay + " рублей исполнен");
                               sumCredit = sumCredit.add(credit);
                        }else {
                                System.out.println("Платеж в размере " + pay + " рублей не исполнен");
                              }

                }
        }
        @Override
        void transfer(BigDecimal transfer) {
                if (transfer.compareTo(balanceCredit) <= 0) {
                        balanceCredit = balanceCredit.subtract(transfer);
                        SavingsAccount.balanceSavings = SavingsAccount.balanceSavings.add(transfer);

                } else {
                        System.out.println("Недостаточно средств на счете");
                }
        }
        @Override
        void addMoney(BigDecimal amount) {
                balanceCredit = balanceCredit.add(amount);

                System.out.println("На кредитный счет зачислена сумма в размере: " + amount + " рублей");
        }
}
