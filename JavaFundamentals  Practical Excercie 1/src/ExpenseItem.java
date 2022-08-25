public class ExpenseItem
{
    private int id;
    private int claimId;
    private String expenseTime;
    private String description;
    private Double amount;

    public ExpenseItem(int id, int claimId, String expenseTime, String description, Double amount) {
        this.id = id;
        this.claimId = claimId;
        this.expenseTime = expenseTime;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getClaimId() {
        return claimId;
    }

    public String getExpenseTime() {
        return expenseTime;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }
}
