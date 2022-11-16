public class Account {
    String accNo;
    String accType;
    int amount;

    public Account() {
        System.out.println("Default constructor");
    }

    public Account(String accNo, String accType, int amount) {
        System.out.println("parameterized constructor");
        this.accNo = accNo;
        this.accType = accType;
        this.amount = amount;
    }


    boolean withDraw(int amt){
        if (amt>amount){return false;}
        else {
            amount=amount-amt;
            return true;
        }
    }

    boolean Deposit(int amt){
        if (amt<0)return false;
        else {
            amount+=amt;
            return true;
        }
    }

    //main method :entry point to the class
    public static void main(String[] args) {
       // System.out.println("String input passed are:"+args[0]+" : : "+args[1]);
        Account acc=new Account();
        Account acc1=new Account("SB_102","SB",200);
        acc.accNo="SB_10";
        acc.accType="SB";
        acc.amount=100;
        System.out.println("Accno. : "+acc.accNo+" AccType :"+acc.accType);
        System.out.println("Initial amt :"+acc.amount);
        acc.Deposit(100);
        System.out.println("After 1st deposit :"+acc.amount);
        acc.withDraw(50);
        System.out.println("After 1st withdraw :"+acc.amount);
        acc.withDraw(1000);
        System.out.println("After 2nd withdraw :"+acc.amount);

        System.out.println("Initial amount of acc1 :"+acc1.amount);

    }
}
