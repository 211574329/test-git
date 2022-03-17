package com.git.test.controller;


import com.git.test.entity.User;
import com.git.test.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  用户信息前端控制器
 * </p>
 *
 * @author  
 * @since 2022-03-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping("list")
    public List<User> list(){
        return iUserService.list();
    }

    /**
     * 获取单个用户信息
     * @param id    用户id
     * @return
     */
    @RequestMapping("id")
    public User user(Integer id){
        return iUserService.getById(id);
    }

}
