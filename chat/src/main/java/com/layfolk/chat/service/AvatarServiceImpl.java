package com.layfolk.chat.service;

import com.layfolk.chat.mapper.AvatarMapper;
import com.layfolk.chat.pojo.Avatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvatarServiceImpl implements AvatarMapper {

    @Autowired
    AvatarMapper avatarMapper;

    @Override
    public List<Avatar> queryPageAvatar(Integer end) {
        return avatarMapper.queryPageAvatar(end);
    }
}
