package com.layfolk.chat.service;

import com.layfolk.chat.pojo.Avatar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AvatarServiceTests {

    @Autowired
    AvatarServiceImpl avatarService;

    @Test
    public void queryPageAvatar() {
        for(Avatar avatar : avatarService.queryPageAvatar(5)) {
            System.out.println(avatar);
        }
    }
}
