package com.layfolk.chat.service;

import com.layfolk.chat.pojo.Subuser;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SubuserService {
    List<Subuser> queryAllSubusers();
    Subuser querySubuserById(String subuserId);
    Subuser querySubuserByName(String username);
    int addSubuser(Subuser subuser);
    int deleteSubuser(String subuserId);
    int updateSubuser(@Param("username") String username, @Param("password") String password, @Param("last_modified_time") Date last_modified_time);
}
