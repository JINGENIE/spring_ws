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
class DeleteTest {
    @Autowired
    CustService service;
    @Test
    void contextLoads() {
        try {
            service.remove("id01");
        } catch (Exception e) {
               log.info("시스템 장애입니다.");
        }
    }
}
