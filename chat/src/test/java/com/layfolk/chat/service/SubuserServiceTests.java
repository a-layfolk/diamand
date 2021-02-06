package com.layfolk.chat.service;

import com.layfolk.chat.pojo.Subuser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

//@SpringBootTest 想要进行单元测试时, 把注释取消
public class SubuserServiceTests {

    @Autowired
    SubuserServiceImpl subuserService;

    @Test
    public void queryAllSubusers() {
        for(Subuser subuser: subuserService.queryAllSubusers()) {
            System.out.println(subuser);
        }
    }

    @Test
    public void querySubuserById() {
        System.out.println(subuserService.querySubuserById("7beaefe5-2a19-4b0f-94f9-952d0cfb172d"));
    }

    @Test
    public void querySubuserByName() {
        Subuser subuser = subuserService.querySubuserByName("林冲");
        System.out.println(subuser);
    }

    @Test
    public void addSubuser() {
        Subuser subuser = new Subuser(UUID.randomUUID().toString(), "呼延灼", "123456", new Date(), new Date());
        subuserService.addSubuser(subuser);
    }

    @Test
    public void deleteSubuser() {
        System.out.println(subuserService.deleteSubuser("29feb345-06fb-489e-b448-ca90399abb2f"));
    }

    @Test
    public void updateSubuser() {
        System.out.println(subuserService.updateSubuser("吴用", "111111", new Date()));
    }
}
