package com.learning.model;

import java.time.LocalDate;

public class EmploymentAgreement {
    private String id;
    private String employeeName;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;
    private String terms;

    public EmploymentAgreement() {}

    public EmploymentAgreement(String id, String employeeName, String role, LocalDate startDate, LocalDate endDate, double salary, String terms) {
        this.id = id;
        this.employeeName = employeeName;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
        this.terms = terms;
    }

    // Getters & Setters
    public String getId() { return id; }
    public String getEmployeeName() { return employeeName; }
    public String getRole() { return role; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public double getSalary() { return salary; }
    public String getTerms() { return terms; }

    public void setId(String id) { this.id = id; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setRole(String role) { this.role = role; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setTerms(String terms) { this.terms = terms; }
}
