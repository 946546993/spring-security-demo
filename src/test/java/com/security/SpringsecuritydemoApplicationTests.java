package com.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

/**
 * @ActiveProfiles("logging-test") 设置日志打印等级
 */
@SpringBootTest
@ActiveProfiles("logging-test")
class SpringsecuritydemoApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试加密
     */
    @Test
    public void test01(){
        // 创建密码解析器
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        // 对密码进行加密
        String password = bCryptPasswordEncoder.encode("password");
        // 打印加密之后的数据
        System.out.println("加密之后数据：\t"+password);
        //判断原字符加密后和加密之前是否匹配
        boolean result = bCryptPasswordEncoder.matches("password", password);
        // 打印比较结果
        System.out.println("比较结果：\t"+result);
    }

}
