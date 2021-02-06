package com.layfolk.chat.service;

import com.layfolk.chat.pojo.PrimaryUser;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PrimaryUserService {
    List<PrimaryUser> queryAllPrimaryUsers();
    PrimaryUser queryPrimaryUserById();
    PrimaryUser queryPrimaryUserByPhone(String phone);
    int addPrimaryUser(PrimaryUser primaryUser);
    int deletePrimaryUser(String pri_usr_id);
    int updatePrimaryUser(@Param("phone")String phone,
                          @Param("password")String password,
                          @Param("gender")Boolean gender,
                          @Param("last_modified_time") Date last_modified_time,
                          @Param("avatar_img_url")String avatar_img_url);
}
