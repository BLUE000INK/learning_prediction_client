package com.example.learning_prediction_client.controller;

import com.example.learning_prediction_client.entity.UserInfo;
import com.example.learning_prediction_client.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//log API接口
@Slf4j
@RequestMapping("/users")
public class UserInfoController {
    //自动装解
    @Autowired
    private UserInfoMapper userInfoMapper;
    @PostMapping("/findUser")
    @ResponseBody
    public int finduser(@RequestBody UserInfo userInfo){
        log.info(userInfo.getUsername() + " 在尝试登录...密码..." + userInfo.getPassword());
        if(userInfoMapper.selectByName(userInfo.getUsername()) == null){
            log.info("该用户不存在");
            return 2;
        }else if(userInfoMapper.selectByName(userInfo.getUsername()).getPassword().equals(userInfo.getPassword())){
            log.info("登录成功");
            return 1;
        }else{
            log.info("密码错误");
            return 0;
        }
    }
}
