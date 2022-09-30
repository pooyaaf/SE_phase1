package com.Payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {
    @Test
    void test_person1_has_full_details_with_overwork_134(){
        var employee = new Employee("Ali","Teacher",334);
        Integer overtime = employee.getOverTime();
        assertEquals(134,overtime);
    }

    @Test
    void test_person2_without_job_detail_with_overwork_0(){
        var employee = new Employee("Mosa",12);
        assertTrue(employee.getOverTime() == 0);
    }
    @Test
    void test_person3_with_job_details_with_overwork_0(){
        var employee = new Employee("Sima","Thief");
        assertEquals(0,employee.getOverTime());
    }
    @Test
    void test_person4_has_full_details_with_limitOverWork(){
        var employee = new Employee("Sanaz","Engineer",200);
        Integer overtime = employee.getOverTime();
        assertEquals(0,overtime);
    }

    @Test
    void test_person1_name(){
        var employee = new Employee("Ali","Teacher");
        String name = employee.getName();
        assertEquals("Ali",name);
    }
    @Test
    void test_person1_job(){
        var employee = new Employee();
        employee.setName("Ali");
        employee.setRole("Teacher");
        String job = employee.getRole();
        assertEquals("Teacher",job);
    }
}
