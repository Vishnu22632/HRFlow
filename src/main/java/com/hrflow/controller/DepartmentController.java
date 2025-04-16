package com.hrflow.controller;

import com.hrflow.entity.Department;
import com.hrflow.entity.LazyLoadingDataModel;
import com.hrflow.facade.DepartmentFacade;
import java.io.Serializable;
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
public class DepartmentController implements Serializable {

    private static final long serialVersionUID = 1L;

    private Department department;
    private LazyLoadingDataModel<Department> lazyDepartment;

    @EJB
    private DepartmentFacade departmentFacade;

    @PostConstruct
    public void init() {
        department = new Department();
        lazyDepartment = new LazyLoadingDataModel<>(departmentFacade);
    }

    public void createDepartment() {
        departmentFacade.create(department);

    }

    public void deleteDepartment(Department department) {
        departmentFacade.remove(department);
    }

    public void beforeUpdate(Department department) {
        this.department = department;
    }

    public void updateDepartment() {
        departmentFacade.edit(department);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LazyLoadingDataModel<Department> getLazyDepartment() {
        return lazyDepartment;
    }

    public void setLazyDepartment(LazyLoadingDataModel<Department> lazyDepartment) {
        this.lazyDepartment = lazyDepartment;
    }

}
