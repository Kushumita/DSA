public class AccessModifiers {
    public static void main(String[] args) {
    BankAccount myAcc=new BankAccount();
    myAcc.username="KushumitaMahato";
    myAcc.setPassword("asdfgh");

    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}