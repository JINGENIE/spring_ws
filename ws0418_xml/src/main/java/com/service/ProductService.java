package com.service;

import com.dto.ProductDTO;
import com.frame.MyDao;
import com.frame.MyService;

import java.util.List;

public class ProductService implements MyService<String, ProductDTO> {
    MyDao<String, ProductDTO> dao;
    public ProductService(MyDao dao){
        this.dao = dao;
    }
    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("SEND EMAIL");

    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public ProductDTO get(String s) {
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}
