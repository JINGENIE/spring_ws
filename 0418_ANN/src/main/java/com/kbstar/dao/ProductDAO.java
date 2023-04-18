package com.kbstar.dao;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("pdao")
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
        user = new ProductDTO(s,"감자빵", 1000,2);
        return user;
    }
    @Override

    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList();
        list.add(new ProductDTO("id01","감자빵",3000,2));
        list.add(new ProductDTO("id02","크림빵",2000,3));
        list.add(new ProductDTO("id03","단판빵",2000,7));
        return list;
    }
}