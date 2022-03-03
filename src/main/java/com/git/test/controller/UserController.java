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
 *  前端控制器
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

    @RequestMapping("list")
    public List<User> list(){
        return iUserService.list();
    }
}
