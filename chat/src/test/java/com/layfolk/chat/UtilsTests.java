package com.layfolk.chat;


import com.alibaba.fastjson.JSON;
import com.layfolk.chat.utils.ResultUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UtilsTests {

    // ResultInfo 不是工具类, 但由于它经常和 fastjson 一起运用, 所以我放在这里测试

    @Test
    public void testResultUtils() {
        Map<String, String> map = new HashMap<>();
        map.put("token", "123456");

        ResultUtil r = ResultUtil.succ(map);
        System.out.println(JSON.toJSONString(r));
    }

    // 测试随机生成全局唯一的 id
    @Test
    public void generateId() {
        System.out.println(UUID.randomUUID().toString());
    }
}
