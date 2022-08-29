package com.encora.expenses;

import com.encora.expenses.Exceptions.EmployeeNotFound;
import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.Employees;
import com.encora.expenses.domain.ExpenseClaim;
import com.encora.expenses.expensemanagementprocess.ExpressExpenseManagementProcess;
import com.encora.expenses.expensemanagementprocess.ExpressManagementProcess;
import com.encora.expenses.expensemanagementprocess.RegularExpenseManagementProcess;
import com.encora.expenses.ui.UIFunctions;

import java.util.Scanner;

public class ExpenseManagementSystem
{
    public static void main(String[] args)
    {
        Employees employees=new Employees();

        Scanner scanner=new Scanner(System.in);
        UIFunctions uiFunctions=new UIFunctions();

        ExpressManagementProcess expressEMP=new ExpressExpenseManagementProcess();
        ExpressManagementProcess regularEMP=new RegularExpenseManagementProcess();
        boolean readyToExit=false;

        while(!readyToExit)
        {
            System.out.println("Expense management system:");
            System.out.println("e.Register employee");
            System.out.println("c.Register claim");
            System.out.println("p.Print all empoyees");
            System.out.println("a.Approve claim ");
            System.out.println("x.Exit");

            String option= scanner.nextLine();
            switch (option)
            {
                case"e":
                    Employee e=uiFunctions.registerNewEmployee();
                    employees.addEmployee(e);
                    break;
                case"c":
                    ExpenseClaim claim=uiFunctions.registerNewExpenseClaim();
                    try {
                        employees.addExpenseClaim(claim);
                        expressEMP.registerExpenseClaim(claim);
                        int id=regularEMP.registerExpenseClaim(claim);
                        System.out.println("The claim has been registered with id: "+id);
                    } catch (EmployeeNotFound ex) {
                        System.out.println("There was no employee with id: "+claim.getId());
                    }
                    break;
                case"p":
                    employees.printEmployees();
                    break;
                case "x":
                    readyToExit=true;
                    break;
                case "a":
                    System.out.println("Enter the claim id");
                    Integer claimId=scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the employee id");
                    Integer employeeId=scanner.nextInt();
                    scanner.nextLine();
                    Employee foundEmployee=employees.getById(employeeId);
                    System.out.println("Enter r for regular and e for express");
                    String claimType= scanner.nextLine();
                    ExpressManagementProcess requestedProcess;
                    if(claimType.equals("r"))
                    {
                        requestedProcess=regularEMP;
                    }
                    else
                    {
                        requestedProcess=expressEMP;
                    }
                    boolean result=requestedProcess.approveClaim(claimId,foundEmployee);
                    System.out.println(result);
                default:
                    System.out.println("Option not valid");
            }
        }
    }
}
