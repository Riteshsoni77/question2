package com.example.question2;

public class EmployeeDepartmentDTO {
    private int empId;
    private String firstName;
    private String lastName;
    private String departmentName;
    private int youngerEmployeesCount;

    // Getters and setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public int getYoungerEmployeesCount() { return youngerEmployeesCount; }
    public void setYoungerEmployeesCount(int youngerEmployeesCount) { this.youngerEmployeesCount = youngerEmployeesCount; }
}
