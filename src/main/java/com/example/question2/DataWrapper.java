package com.example.question2;

import java.util.List;

public class DataWrapper {
    private List<EmployeeDepartmentDTO> data;
    public DataWrapper(List<EmployeeDepartmentDTO> data) { this.data = data; }
    public List<EmployeeDepartmentDTO> getData() { return data; }
    public void setData(List<EmployeeDepartmentDTO> data) { this.data = data; }
}
