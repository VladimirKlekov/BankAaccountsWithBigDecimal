import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner big = new Scanner(System.in);

        BigDecimal balance = new BigDecimal(0.0);
        BigDecimal amount = new BigDecimal(0.0);
        BigDecimal pay = new BigDecimal(0.0);
        BigDecimal transfer = new BigDecimal(0.0);

        CreditAccount creditAccount = new CreditAccount(balance);
        CheckingAccount checkingAccount = new CheckingAccount(balance);
        SavingsAccount savingsAccount = new SavingsAccount(balance);
        while (true) {
            System.out.println("__________________________________");
            System.out.println("Добро пожаловать в онлайн банк!!!");
            System.out.println("Баланс сберегательного счета составляет: " + savingsAccount.balanceSavings + " рублей");
            System.out.println("Баланс расчетного счета составляет: " + checkingAccount.balanceCheck + " рублей");
            System.out.println("Баланс кредитного счета составляет: " + creditAccount.balanceCredit + " рублей");
            System.out.println("Задолженность по кредитам составляет: " + creditAccount.sumCredit + " рублей");
            System.out.println("__________________________________");
            System.out.println("Выберите операцию и введите соответствующую цифру: ");
            System.out.println("1. Пополнение счета");
            System.out.println("2.Совершить платеж");
            System.out.println("3.Перевести деньги на сберегательный счет");
            System.out.println("4.Погасить кредит со сберегательного счета");
            System.out.println("Введите end для завершения программы");

          String input = scanner.nextLine();

            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {
// пополнение баланса
                case 1: {
                    System.out.println("Выберите счет для пополнения");
                    System.out.println("1. Сберегательный");
                    System.out.println("2. Расчетный");
                    System.out.println("3. Кредитный");
                    String read = scanner.nextLine();
                    int chek = Integer.parseInt(read);

                    if (chek == 1) {
                        System.out.println("Введите сумму для зачисления");
                        amount = big.nextBigDecimal();
                        savingsAccount.addMoney(amount);
                        break;

                    } else if (chek == 2) {
                        System.out.println("Введите сумму для зачисления");
                        amount = big.nextBigDecimal();
                        checkingAccount.addMoney(amount);
                        break;
                    } else {
                        System.out.println("Введите сумму для зачисления");
                        amount = big.nextBigDecimal();
                        creditAccount.addMoney(amount);
                        break;
                    }
                }
                    //Платежи
                    case 2: {
                        System.out.println("Выберите счет для произведения оплаты");
                        System.out.println("1. Расчетный");
                        System.out.println("2. Кредитный");
                        String read1 = scanner.nextLine();
                        int chek1 = Integer.parseInt(read1);

                        if (chek1 == 1) {
                            System.out.println("Введите сумму для списания");
                            pay = big.nextBigDecimal();
                            checkingAccount.pay(pay);
                            break;

                        } else  {
                            System.out.println("Введите сумму для списания");
                            pay = big.nextBigDecimal();
                            creditAccount.pay(pay);
                            break;
                        }


                    }
                    //перевод денег
                case 3: {
                    System.out.println("Перевод денег на сберегательный счет: ");

                    System.out.println("Выберите счет с которого перевести деньги: ");
                    System.out.println("1. Расчетный");
                    System.out.println("2. Кредитный");
                    String read4 = scanner.nextLine();
                    int inputt = Integer.parseInt(read4);
                    if (inputt == 1) {
                        System.out.println("Баланс расчетного счета составляет: " + checkingAccount.balanceCheck + " рублей");
                        System.out.println("Введите сумму для перевода: ");
                        transfer = big.nextBigDecimal();
                        checkingAccount.transfer(transfer);
                    }
                    if (inputt == 2) {
                        System.out.println("Баланс кредитного счета составляет: " + creditAccount.balanceCredit + " рублей");
                        transfer = big.nextBigDecimal();
                        creditAccount.transfer(transfer);
                    }
                }
                case 4: {
                    Credit.credit(creditAccount.sumCredit);
                }

                default:



            }

        }
    }
}

