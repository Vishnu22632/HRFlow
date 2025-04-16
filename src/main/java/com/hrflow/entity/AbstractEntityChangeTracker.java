/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hrflow.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vishnu
 */
@MappedSuperclass
public class AbstractEntityChangeTracker extends AbstractLongPKEntity{
     private static final long serialVersionUID = 1L;
    
    @Column(name="created_at")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date createdAt;
    
    
    @Column(name="updated_at")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @PrePersist
    public void prePersist(){
        createdAt = new Date();
    }
    
    @PreUpdate
    public void preUpdate(){
        updatedAt = new Date();
    }
    
    
}
