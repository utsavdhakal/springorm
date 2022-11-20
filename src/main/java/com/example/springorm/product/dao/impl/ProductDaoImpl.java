package com.example.springorm.product.dao.impl;

import com.example.springorm.product.dao.ProductDao;
import com.example.springorm.product.entity.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {

    private final HibernateTemplate hibernateTemplate;

    public ProductDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int create(Product product) {
        return 0;
    }
}
