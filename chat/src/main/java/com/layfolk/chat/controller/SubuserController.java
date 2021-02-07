package com.layfolk.chat.controller;

import com.alibaba.fastjson.JSON;
import com.layfolk.chat.pojo.Subuser;
import com.layfolk.chat.service.SubuserServiceImpl;
import com.layfolk.chat.utils.ResultUtil;
import com.layfolk.chat.pojo.vo.SubVo;
import com.layfolk.chat.utils.TokenSubjectUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
public class SubuserController {

    @Autowired
    SubuserServiceImpl subuserService;

    @PostMapping ("/subuser/login")
    public String login(@RequestBody(required = true) SubVo subVo) {
        // 获取当前用户
        Subject subject = SecurityUtils.getSubject();
        // 封装用户获取的数据
        UsernamePasswordToken passwordToken = new UsernamePasswordToken(subVo.getUsername(), subVo.getPassword());

        // 执行登录方法, 没有异常就说明 OK, 具体验证密码的代码在 config/shiro/UserRealm 中
        try {
            subject.login(passwordToken);

            // 生成 token
            String randomKey = UUID.randomUUID().toString();

            TokenSubjectUtil.saveSubject(randomKey, subject);

            Map<String, Object> map = new HashMap<>();

            // 往返回数据中放入 token, 为了让一个浏览器可以有多个用户登录, 让 token + 用户名成为键
            map.put("username", subVo.getUsername());
            map.put("token", randomKey);

            // 往返回数据中放入 username 和 token
            return JSON.toJSONString(ResultUtil.succ(map));
        }
        catch (UnknownAccountException e) { // 用户名不存在
            return JSON.toJSONString(ResultUtil.fail("400", "用户名不存在", null));
        }
        catch (IncorrectCredentialsException e) {
            return JSON.toJSONString(ResultUtil.fail("400", "密码错误", null));
        }
    }

    @GetMapping("subuser/getAllSubusers")
    public String getAllSubusers() {
        List<Subuser> subusersList = subuserService.queryAllSubusers();

        Map<String, Object> map = new HashMap<>();
        map.put("subuserList", subusersList);

        return JSON.toJSONString(ResultUtil.succ(map));
    }
}
