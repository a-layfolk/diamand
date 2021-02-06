package com.layfolk.chat.controller;

import com.alibaba.fastjson.JSON;
import com.layfolk.chat.pojo.Avatar;
import com.layfolk.chat.service.AvatarServiceImpl;
import com.layfolk.chat.utils.ResultUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class AvatarController {

    @Autowired
    AvatarServiceImpl avatarService;

    @GetMapping("/avatar/getAvatarData")
    public String getAvatarData(int end) {

        List<Avatar> avatarList = avatarService.queryPageAvatar(end);

        Map<String, Object> map = new HashMap<>();
        map.put("avatarList", avatarList);
        return JSON.toJSONString(ResultUtil.succ(map));
    }
}
