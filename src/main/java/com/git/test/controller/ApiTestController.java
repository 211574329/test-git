package com.git.test.controller;

import com.git.test.dto.RestBean;
import com.git.test.entity.User;
import com.git.test.service.IUserService;
import com.git.test.vo.QueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * yapi接口生成测试
 */
@RestController
@RequestMapping("yapi")
public class ApiTestController {

    @Resource
    private IUserService iUserService;

    /**
     * 获取用户信息(普通参数)
     *
     * @param id 用户id
     * @return
     */
    @RequestMapping("user1")
    public RestBean<User> user1(Integer id) {
        return RestBean.success(iUserService.getById(id));
    }

    /**
     * 获取用户信息2(restful风格)
     * @param id    用户id
     * @return
     */
    @RequestMapping("user2/{id}")
    public RestBean<User> user2(@PathVariable Integer id) {
        return RestBean.success(iUserService.getById(id));
    }

    /**
     * 获取用户信息3(封装参数)
     * @param queryVo   查询参数
     * @return
     */
    @PostMapping("user3")
    public RestBean<User> user3(QueryVo queryVo) {
        return RestBean.success(iUserService.getById(queryVo.getId()));
    }



    /**
     * 获取用户信息4(json类型)
     * @param queryVo   查询参数
     * @return
     */
    @PostMapping("user4")
    public RestBean<User> user4(@RequestBody QueryVo queryVo) {
        return RestBean.success(iUserService.getById(queryVo.getId()));
    }

    /**
     * 用户列表(无参数)
     *
     * @return
     */
    @RequestMapping("listUser")
    public RestBean<List<User>> user() {
        return RestBean.success(iUserService.list());
    }

}
