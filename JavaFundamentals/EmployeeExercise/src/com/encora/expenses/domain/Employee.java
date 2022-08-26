package com.encora.expenses.domain;

public class Employee
{
    private int id;
    private String title;
    private String firstName;
    private String surname;
    private String jobTitle;
    private String department;
    private ExpenseClaim[] claims;

    public Employee()
    {}
    public Employee(int id, String jobTitle)
    {
        this.id=id;
        this.jobTitle=jobTitle;
    }

    public Employee(int id, String title, String firstName, String surname, String jobTitle, String department) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getMailingName()
    {
        return title + " "+firstName+" "+surname;
    }
    public String getMailingName(boolean firstInitialOnly)
    {
        if(firstInitialOnly)
        {
            return title+" "+firstName.substring(0,1);
        }
        else
        {
            return title + " " + firstName + " " + surname;
        }
    }
}