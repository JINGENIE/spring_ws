package com.app;

import com.dto.ProductDTO;
import com.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInsertTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>) factory.getBean("pservice");
//      거꾸로 주입하는

        ProductDTO u = new ProductDTO("id01","pwd01",3000,3);
        service.register(u);
    }

}
