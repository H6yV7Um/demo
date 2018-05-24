package com.victor.spring.controller;

import com.victor.spring.entity.SceneCodeInfoEntity;
import com.victor.spring.mapper.SceneCodeInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangcs on 2018/5/24.
 */
@RestController
public class HomeController {

    @Autowired
    private SceneCodeInfoMapper sceneCodeInfoMapper;

    @RequestMapping("/index")
    public String index() {
        List<SceneCodeInfoEntity> sceneCodeInfoEntities = sceneCodeInfoMapper.list();
        return "hello world";
    }
}
