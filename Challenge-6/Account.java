public class Account {
    protected int accountId;
    protected String accountHolder;
    protected String contactEmail;
    protected DataSource connection;


    public Account(int accId, String holderName, String email) {
        this.accountId = accId;
        this.accountHolder = holderName;
        this.contactEmail = email;
    }


    public void performOperation(DataSource ds) {
        this.connection = ds;
        connection.execute();
    }


    public void showInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + accountHolder);
        System.out.println("Email: " + contactEmail);
    }
}
