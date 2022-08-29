package com.encora.expenses.expensemanagementprocess;

import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.ExpenseClaim;
import com.encora.expenses.domain.StaffEmployee;

import java.util.ArrayList;
import java.util.List;

public class RegularExpenseManagementProcess implements ExpressManagementProcess
{
    List<ExpenseClaim>claims=new ArrayList<>();

    @Override
    public int registerExpenseClaim(ExpenseClaim claim)
    {
        claims.add(claim);
        return claims.size()-1;
    }

    @Override
    public boolean approveClaim(int id, Employee employee)
    {
        ExpenseClaim claim=claims.get(id);
        if (claim.getTotalAmount()<100)
        {
            return true;
        }
        if (employee instanceof StaffEmployee)
        {
            return true;
        }
        return false;
    }
}
