package com.layfolk.chat.controller;

import com.alibaba.fastjson.JSON;
import com.layfolk.chat.pojo.Avatar;
import com.layfolk.chat.service.AvatarServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AvatarController {

    @Autowired
    AvatarServiceImpl avatarService;

    @Test
    // 测试数组能不能转换为 Json 字符串
    public void toJson() {

        List<Avatar> avatarList = avatarService.queryPageAvatar(5);
        String str = JSON.toJSONString(avatarList);
        System.out.println(str);
        System.out.println(avatarList);

    }
}
