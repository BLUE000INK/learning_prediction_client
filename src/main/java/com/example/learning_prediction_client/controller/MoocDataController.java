package com.example.learning_prediction_client.controller;

import com.example.learning_prediction_client.entity.MoocData;
import com.example.learning_prediction_client.mapper.MoocDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
//log API接口
@Slf4j
@RequestMapping("/moocData")
public class MoocDataController {
    //自动装解
    @Autowired
    private  MoocDataMapper moocDataMapper;
    @RequestMapping("/getAllData")
    @ResponseBody
    public List<MoocData> getAllData(){
        return moocDataMapper.getAllData();
    }
}
