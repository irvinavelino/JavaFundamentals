package com.encora.expenses.domain;

public class ExpenseClaim {
    private int id;
    private int employeeId;
    private String dateOfClaim;
    private Double totalAmount;
    private boolean approved;
    private boolean paid;

    public ExpenseClaim(int id, int employeeId, String dateOfClaim, Double totalAmount)
    {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        this.totalAmount = totalAmount;
        approved=false;
        paid=false;
    }

    public void setApproved(boolean approved)
    {
        this.approved = approved;
    }

    public void setPaid(boolean paid)
    {
        if(paid && !approved)
        {
            System.out.println("This item cannot be payed");
        }
        else
        {
            this.paid=paid;
        }
    }

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDateOfClaim() {
        return dateOfClaim;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
    public boolean getPaid() {
        return paid;
    }

    public boolean isApproved() {
        return approved;
    }

    public boolean isPaid() {
        return paid;
    }
}