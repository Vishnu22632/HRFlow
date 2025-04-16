package com.hrflow.facade;

import com.hrflow.entity.Employee;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishnu
 */
public class EmployeeFacade extends AbstractFacade<Employee> {

    @PersistenceContext(name = "hrflowPU")
    private EntityManager em;

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
