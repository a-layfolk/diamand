package com.layfolk.chat.mapper;

import com.layfolk.chat.pojo.Subuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface SubuserMapper {

    // 查询所有的子用户
    List<Subuser> queryAllSubusers();

    // 根据 id 查询子用户
    Subuser querySubuserById(String subuserId);

    // 根据 姓名 查询子用户
    Subuser querySubuserByName(String username);

    // 增加子用户
    int addSubuser(Subuser subuser);

    // 根据 id 删除子用户
    int deleteSubuser(String subuser_id);

    // 修改子用户的信息
    int updateSubuser(@Param("username") String username, @Param("password")String password, @Param("last_modified_time")Date last_modified_time);

}
