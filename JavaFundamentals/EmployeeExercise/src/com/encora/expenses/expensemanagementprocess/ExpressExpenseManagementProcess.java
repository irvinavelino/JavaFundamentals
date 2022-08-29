package com.encora.expenses.expensemanagementprocess;

import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.ExpenseClaim;

public class ExpressExpenseManagementProcess implements ExpressManagementProcess
{
    private ExpenseClaim claim;
    @Override
    public int registerExpenseClaim(ExpenseClaim claim)
    {
        this.claim=claim;
        return -1;
    }

    @Override
    public boolean approveClaim(int id, Employee employee)
    {
        return (claim.getTotalAmount()<50);
    }
}
