package com.example.springorm.product.dao.impl;

import com.example.springorm.product.dao.ProductDao;
import com.example.springorm.product.entity.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProductDaoImpl implements ProductDao {

    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Product product) {
        return 0;
    }
}
