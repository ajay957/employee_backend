package com.example.employee_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue
    private int id;
    private int emp_code;
    private String emp_name;
    private String designation;
    private int salary;
    private String com_name;
    private String mob_no;
    private String username;
    private String password;

    public Employees() {
    }

    public Employees(int id, int emp_code, String emp_name, String designation, int salary, String com_name, String mob_no, String username, String password) {
        this.id = id;
        this.emp_code = emp_code;
        this.emp_name = emp_name;
        this.designation = designation;
        this.salary = salary;
        this.com_name = com_name;
        this.mob_no = mob_no;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(int emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
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
}
