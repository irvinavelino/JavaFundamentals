package com.encora.expenses.domain;

public class ExpenseItem
{
    private int id;
    private int claimId;
    private ExpenseType expenseTime;
    private String description;
    private Double amount;

    public ExpenseItem(int id, int claimId, ExpenseType expenseTime, String description, Double amount) {
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

    public ExpenseType getExpenseTime() {
        return expenseTime;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }
}