package com.hrflow.entity;

import com.hrflow.facade.AbstractFacade;
import java.util.List;
import java.util.Map;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author Vishnu
 */
public class LazyLoadingDataModel<T> extends LazyDataModel<T> {

    private static final long serialVersionUID = 1L;

    private AbstractFacade<T> abstractFacade;

    public LazyLoadingDataModel(AbstractFacade<T> abstractFacade) {
        this.abstractFacade = abstractFacade;
    }

    @Override
    public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
        List<T> data = abstractFacade.findRange(first, pageSize, sortField, sortOrder, filters);
        setRowCount(abstractFacade.countFiltered(filters));
        return data;
    }

    
    @Override
    public T getRowData(String rowKey) {
        return abstractFacade.find(Long.parseLong(rowKey));
    }

    @Override
    public Object getRowKey(T Object) {
        try {
            return Object.getClass().getMethod("getId").invoke(Object);
        } catch (Exception e) {
            return null;
        }
    }

}
