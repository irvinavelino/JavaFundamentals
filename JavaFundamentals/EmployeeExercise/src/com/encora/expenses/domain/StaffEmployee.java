package com.encora.expenses.domain;

import java.util.Objects;

public class StaffEmployee extends Employee
{
    private String username;
    private String password;

    public StaffEmployee(Employee e)
    {
        super(e.getId(),e.getTitle(),e.getFirstname(),e.getSurname(),e.getJobTitle(),e.getDepartment());

    }
    public StaffEmployee()
    {
    }

    public StaffEmployee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public StaffEmployee(int id, String jobTitle, String username, String password) {
        super(id, jobTitle);
        this.username = username;
        this.password = password;
    }

    public StaffEmployee(int id, String title, String firstName, String surname, String jobTitle, Department department, String username, String password) {
        super(id, title, firstName, surname, jobTitle, department);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StaffEmployee that = (StaffEmployee) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password);
    }
}
