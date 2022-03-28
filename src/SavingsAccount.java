import java.math.BigDecimal;

    public class SavingsAccount extends Account {
        public static BigDecimal balanceSavings = new BigDecimal(0.0);

        public SavingsAccount(BigDecimal balance) {
            super(balance);

        }


        @Override
        void pay(BigDecimal pay) {
            //не работает
        }

        @Override
        void transfer(BigDecimal transfer) {
//            if (transfer.compareTo(balanceSavings) <= 0) {
//                balanceSavings = balanceSavings.subtract(transfer);
//                CreditAccount.sumCredit = CreditAccount.sumCredit.subtract(transfer);
//                System.out.println("Кредит погашен");
//
//            } else {
//                System.out.println("Недостаточно средств на сберегательном счете");
//            }
        }

        @Override
        void addMoney(BigDecimal amount) {
            balanceSavings = balanceSavings.add(amount);

            System.out.println("На сберегательный счет зачислена сумма в размере: " + amount + " рублей");
        }


    }

