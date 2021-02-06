package com.layfolk.chat.service;

import com.layfolk.chat.pojo.Avatar;

import java.util.List;

public interface AvatarService {
    List<Avatar> queryPageAvatar(Integer end);
}
