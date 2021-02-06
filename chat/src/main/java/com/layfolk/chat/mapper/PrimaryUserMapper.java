package com.layfolk.chat.mapper;

import com.layfolk.chat.pojo.PrimaryUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface PrimaryUserMapper {
    // 查询所有的主用户
    List<PrimaryUser> queryAllPrimaryUsers();

    // 根据 id 查询主用户
    PrimaryUser queryPrimaryUserById(String s);

    // 根据 手机号 查询主用户
    PrimaryUser queryPrimaryUserByPhone(String phone);

    // 增加主用户
    int addPrimaryUser(PrimaryUser primaryUser);

    // 根据 id 删除子用户
    int deletePrimaryUser(String pri_usr_id);

    // 修改主用户的信息
    int updatePrimaryUser(@Param("phone")String phone,
                          @Param("password")String password,
                          @Param("gender")Boolean gender,
                          @Param("last_modified_time") Date last_modified_time,
                          @Param("avatar_img_url")String avatar_img_url);
}
