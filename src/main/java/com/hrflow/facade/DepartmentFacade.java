package com.hrflow.facade;

import com.hrflow.entity.Department;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishnu
 */
@Stateless
public class DepartmentFacade extends AbstractFacade<Department> {

    @PersistenceContext(name = "hrflowPU")
    private EntityManager em;

    public DepartmentFacade() {
        super(Department.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
