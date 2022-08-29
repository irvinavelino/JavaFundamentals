package com.encora.expenses.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExpenseClaim {
    private int id;
    private int employeeId;
    private LocalDate dateOfClaim;
    private boolean approved;
    private boolean paid;

    private List<ExpenseItem> expenseItems;
    public ExpenseClaim(int id, int employeeId, LocalDate dateOfClaim)
    {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        approved=false;
        paid=false;
        this.expenseItems=new ArrayList<>();
    }

    public void addExpenseItem(ExpenseItem item)
    {
        expenseItems.add(item);
    }
    public void printExpenseItems()
    {
        for (ExpenseItem ei:expenseItems)
        {
            System.out.println(ei);
        }
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

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public Double getTotalAmount()
    {
        Double total=0d;
        for (ExpenseItem ei:expenseItems)
        {
            total+=ei.getAmount();
        }
        return total;
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

    @Override
    public String toString() {
        return "ExpenseClaim{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", dateOfClaim=" + dateOfClaim +
                ", approved=" + approved +
                ", paid=" + paid +
                ", expenseItems=" + expenseItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseClaim that = (ExpenseClaim) o;
        return id == that.id && employeeId == that.employeeId && approved == that.approved && paid == that.paid && Objects.equals(dateOfClaim, that.dateOfClaim) && Objects.equals(expenseItems, that.expenseItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, dateOfClaim, approved, paid, expenseItems);
    }
}