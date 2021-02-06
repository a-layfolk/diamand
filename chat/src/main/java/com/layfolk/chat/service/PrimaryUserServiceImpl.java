package com.layfolk.chat.service;

import com.layfolk.chat.mapper.PrimaryUserMapper;
import com.layfolk.chat.pojo.PrimaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PrimaryUserServiceImpl implements PrimaryUserService{

    @Autowired
    PrimaryUserMapper primaryUserMapper;

    @Override
    public List<PrimaryUser> queryAllPrimaryUsers() {
        return primaryUserMapper.queryAllPrimaryUsers();
    }

    @Override
    public PrimaryUser queryPrimaryUserById() {
        return primaryUserMapper.queryPrimaryUserById("9b846625-705e-4dda-b09d-9ddc4e06ccb8");
    }

    @Override
    public PrimaryUser queryPrimaryUserByPhone(String phone) {
        return primaryUserMapper.queryPrimaryUserByPhone(phone);
    }

    @Override
    public int addPrimaryUser(PrimaryUser primaryUser) {
        return primaryUserMapper.addPrimaryUser(primaryUser);
    }

    @Override
    public int deletePrimaryUser(String pri_usr_id) {
        return primaryUserMapper.deletePrimaryUser(pri_usr_id);
    }

    @Override
    public int updatePrimaryUser(String phone, String password, Boolean gender, Date last_modified_time, String avatar_img_url) {
        return primaryUserMapper.updatePrimaryUser(phone, password, gender, last_modified_time, avatar_img_url);
    }
}
