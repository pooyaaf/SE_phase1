package com.Payroll;

import lombok.ToString;

@ToString
public class EmployeeWithOverWork {
    public Long id;
    public String name;
    public Integer overtime;

    public EmployeeWithOverWork(Long id, String name, Integer overtime) {
        this.id = id;
        this.name = name;
        this.overtime = overtime;
    }


}
