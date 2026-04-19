package CH_13_OOPs;

class  BankAccount {
    public String userName ;
    private String password ;
    public void setPassword (String pwd) {
        password = pwd;
    }
    public String getPassword() {
        return password;
    }
}

public class _3_Access_Modifiers {
    public static void main(String[] args) {
        BankAccount myAccount =  new BankAccount();
        myAccount.userName = "Md Irshad Alam";
        System.out.println(myAccount.userName);
        myAccount.setPassword ("sdbfsbgdshb");
        System.out.println(myAccount.getPassword());
    }
}

