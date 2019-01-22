package com.qs;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qs.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@Slf4j
public class AppTest {

    @Reference(version = "1.0.0")
    private SpringService springService;

    @Test
    public void testSayHello(){
        springService.sayHello();
    }
}
