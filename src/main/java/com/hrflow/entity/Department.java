package com.hrflow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Vishnu
 */
@Entity
@Table(name="department")
public class Department extends AbstractEntityChangeTracker {

    @Column(name = "dept_code")
    private String code;

    @Column(name = "dept_name")
    private String name;

    public Department() {
    }

    public Department(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + getId();
    }

}
