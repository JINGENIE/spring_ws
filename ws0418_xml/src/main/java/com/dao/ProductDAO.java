package com.dao;
import com.dto.ProductDTO;
import com.frame.MyDao;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO implements MyDao<String, ProductDTO> {
    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle: " + productDTO);
    }
    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle: " + s);
    }
    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle:" + productDTO);
    }
    @Override
    public ProductDTO select(String s) {
        ProductDTO user = null;
        user = new ProductDTO(s, "pwd01", 3000,2);
        return user;
    }
    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<ProductDTO>();
        list.add(new ProductDTO("id01","pwd01",3000,3));
        list.add(new ProductDTO("id02","pwd02",3000,3));
        list.add(new ProductDTO("id03","pwd03",3000,3));
        return list;
    }
}