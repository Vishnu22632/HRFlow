package com.hrflow.controller;

import com.hrflow.entity.Department;
import com.hrflow.facade.DepartmentFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vishnu
 */
@ManagedBean(name = "departmentController")
@ViewScoped
public class DepartmentController implements Serializable{

    private static final long serialVersionUID = 1L;

    
    private Department department;
    private List<Department> departments;

    @EJB
    private DepartmentFacade departmentFacade;

    @PostConstruct
    public void init() {
        department = new Department();
        departments = departmentFacade.findAll();

    }

    public void createDepartment() {
        departmentFacade.create(department);
        departments = departmentFacade.findAll();
    }
    
    public void deleteDepartment(Department department){
        departmentFacade.remove(department);
        departments = departmentFacade.findAll();
    }
    
    public void beforeUpdate(Department department){
        this.department = department;
    }
    
    public void updateDepartment(){
        departmentFacade.edit(department);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    
}
