package com.alibaba.test;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.util.text.AES256TextEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.jupiter.api.Test;


@Slf4j
public class JasyptTest {

    @Test
    void jasyptTest1() {
//
        AES256TextEncryptor textEncryptor = new AES256TextEncryptor();

        textEncryptor.setPassword("");
        // 加密后的数据（数据库的用户名或密码）
        String encData = textEncryptor.encrypt("");
        log.info("encData: " + encData);

        // 解密后的数据（原数据）
        String decData = textEncryptor.decrypt("");
        log.info("decData: " + decData);
//
    }
//
}

