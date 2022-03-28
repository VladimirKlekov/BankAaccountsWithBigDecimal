import java.math.BigDecimal;

public abstract class Account {

    public static BigDecimal balance ;

    public Account(BigDecimal balance) {

        this.balance = balance;
    }

    abstract void pay(BigDecimal pay);

    abstract void transfer(BigDecimal transfer);

     abstract void addMoney(BigDecimal amount);

   }

//Создайте абстрактный класс Account с тремя методами: заплатить, перевести, пополнить
// (pay(int amount), transfer(Account account, int amount), addMoney(int amount))


