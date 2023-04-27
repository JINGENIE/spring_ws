package com.kbstar.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

@Slf4j
@SpringBootTest
class UpdateTest {
    @Autowired
    CustService service;
    @Test
    void contextLoads() {
        Cust obj = new Cust("id21","pwd010","james");
        try {
            service.modify(obj);
            log.info("수정정상");
        } catch (Exception e) {
     
               log.info("시스템장애입니다.");

        }
    }

}
