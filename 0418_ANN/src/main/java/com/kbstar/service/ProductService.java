package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import com.kbstar.frame.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("pservice")
public class ProductService implements MyService<String, ProductDTO> {
//aop방식
    @Autowired
    ProductDAO dao;
    @Qualifier("pdao")
    //ann방식
//    MyDao<String, ProductDTO> dao;
//    public ProductService(MyDao dao){
//        this.dao = dao;
//    }
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
    public ProductService() {} // 기본 생성자 추가
}
