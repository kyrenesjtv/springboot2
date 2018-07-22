package com.github.kyrenesjtv.springboot2.springboot2_withmail;

import com.github.kyrenesjtv.springboot2.springboot2_withmail.utils.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2WithMailApplicationTests {

	@Test
	public void contextLoads() {
        try {
//            for(int i = 0 ; i<10;i++){
                MailUtil.instance("401442190@qq.com","sjtv512@163.com","测试","不要玩手游了");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
