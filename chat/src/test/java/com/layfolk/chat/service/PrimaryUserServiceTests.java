package com.layfolk.chat.service;

import com.layfolk.chat.mapper.PrimaryUserMapper;
import com.layfolk.chat.pojo.PrimaryUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

//@SpringBootTest 单元测试时需要解除注释
public class PrimaryUserServiceTests {

    @Autowired
    PrimaryUserMapper primaryUserMapper;

    @Test
    public void queryAllPrimaryUsers() {
        for(PrimaryUser primaryUser : primaryUserMapper.queryAllPrimaryUsers()) {
            System.out.println(primaryUser);
        }
    }

    @Test
    public void queryPrimaryUserById() {
        PrimaryUser user = primaryUserMapper.queryPrimaryUserById("9b846625-705e-4dda-b09d-9ddc4e06ccb8");
        System.out.println(user);
    }

    @Test
    public void queryPrimaryUserByPhone() {
        PrimaryUser user = primaryUserMapper.queryPrimaryUserByPhone("13988888888");
        System.out.println(user);
    }

    @Test
    public void addPrimaryUser() {
        PrimaryUser user = new PrimaryUser("77f33ecc-a469-4ad7-894f-ee2db4303e86",
                "15999999999", "123456", Boolean.TRUE, new Date(), new Date(),
                "https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed/img/technology/wx/20210113081413.png");
        System.out.println(primaryUserMapper.addPrimaryUser(user));
    }

    @Test
    public void deletePrimaryUser() {
        System.out.println(primaryUserMapper.deletePrimaryUser("77f33ecc-a469-4ad7-894f-ee2db4303e86"));
    }

    @Test
    public void updatePrimaryUser() {
        System.out.println(primaryUserMapper.updatePrimaryUser("13988888888", "111111", Boolean.TRUE,
                new Date(),
                "https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed/img/avatar/20210205220241.svg"));

    }
}
