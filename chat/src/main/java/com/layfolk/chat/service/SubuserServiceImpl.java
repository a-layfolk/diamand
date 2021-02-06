package com.layfolk.chat.service;


import com.layfolk.chat.mapper.SubuserMapper;
import com.layfolk.chat.pojo.Subuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SubuserServiceImpl implements SubuserService {

    @Autowired
    SubuserMapper subuserMapper;

    @Override
    public List<Subuser> queryAllSubusers() {
        return subuserMapper.queryAllSubusers();
    }

    @Override
    public Subuser querySubuserById(String subuserId) {
        return subuserMapper.querySubuserById(subuserId);
    }

    @Override
    public Subuser querySubuserByName(String username) {
        return subuserMapper.querySubuserByName(username);
    }


    @Override
    public int addSubuser(Subuser subuser) {
        return subuserMapper.addSubuser(subuser);
    }

    @Override
    public int deleteSubuser(String subuserId) {
        return subuserMapper.deleteSubuser(subuserId);
    }

    @Override
    public int updateSubuser(String username, String password, Date last_modified_time) {
        return subuserMapper.updateSubuser(username, password, last_modified_time);
    }

}
