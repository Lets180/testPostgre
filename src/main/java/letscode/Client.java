package letscode;

import java.sql.Connection;

public class Client extends Person {
    private int idAccount;
    private int balanceAccount;

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public int getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(int balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public Client(String name,int age, int weight, int height){
        super(name, age, weight, height);
        this.idAccount = 0;
        this.balanceAccount = 0;
    }
    public Client(String name,int age, int weight, int height,int idAccount, int balanceAccount) {
        super(name, age, weight, height);
        this.idAccount = idAccount;
        this.balanceAccount = balanceAccount;
    }
    public Client(){

    }

}
