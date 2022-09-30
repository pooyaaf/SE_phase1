package com.Payroll;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
class Employee {
    private static final Integer WORK_TIME = 200;
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    private Integer overtime = 0;

    public Employee() {
    }

    public Employee(String name, String role) {

        this.name = name;
        this.role = role;
    }

    public Employee(String name, String role, Integer overtime) {
        this.name = name;
        this.role = role;
        this.overtime = overtime;
    }

    public Employee(String name, Integer overtime) {
        this.name = name;
        this.overtime = overtime;
    }

    public Integer getOverTime() {
        return Math.max(0,overtime- WORK_TIME);
    }

    public EmployeeWithOverWork toEmployeeOvertime() {
        return new EmployeeWithOverWork( this.id,this.name, this.getOverTime());
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }


}
