package com.example.question2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDepartmentDTO {
    @JsonProperty("EMP_ID")
    private int empId;

    @JsonProperty("FIRST_NAME")
    private String firstName;

    @JsonProperty("LAST_NAME")
    private String lastName;

    @JsonProperty("DEPARTMENT_NAME")
    private String departmentName;

    @JsonProperty("YOUNGER_EMPLOYEES_COUNT")
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

    public static void main(String[] args) {
        String jwt = "eyJhbGciOiJIUzI1NiJ9.eyJyZWdObyI6IjA4ODdDUzIzM0QwNiIsIm5hbWUiOiJSaXRlc2ggU29uaSIsImVtYWlsIjoicml0ZXNoc29uaTExMzhAZ21haWwuY29tIiwic3ViIjoid2ViaG9vay11c2VyIiwiaWF0IjoxNzU4NTMyMzIyLCJleHAiOjE3NTg1MzMyMjJ9.WM2735awjwHU7dpyNLv8jowAk_RVdaVp2jXKCTJy1cg";
    }
}
