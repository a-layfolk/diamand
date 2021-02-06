package com.layfolk.chat.mapper;

import com.layfolk.chat.pojo.Avatar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AvatarMapper {
    // 分页查询, 从 0 开始查, 直到第 end - 1 条记录
    List<Avatar> queryPageAvatar(Integer end);
}
