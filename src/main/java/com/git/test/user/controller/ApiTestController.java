package com.git.test.user.controller;

import com.git.test.common.R;
import com.git.test.user.entity.User;
import com.git.test.user.service.IUserService;
import com.git.test.user.vo.QueryVo;
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
    public R<User> user1(Integer id) {
        return R.success(iUserService.getById(id));
    }

    /**
     * 获取用户信息2(restful风格)
     * @param id    用户id
     * @return
     */
    @RequestMapping("user2/{id}")
    public R<User> user2(@PathVariable Integer id) {
        return R.success(iUserService.getById(id));
    }

    /**
     * 获取用户信息3(封装参数)
     * @param queryVo   查询参数
     * @return
     */
    @PostMapping("user3")
    public R<User> user3(QueryVo queryVo) {
        return R.success(iUserService.getById(queryVo.getId()));
    }



    /**
     * 获取用户信息4(json类型)
     * @param queryVo   查询参数
     * @return
     */
    @PostMapping("user4")
    public R<User> user4(@RequestBody QueryVo queryVo) {
        return R.success(iUserService.getById(queryVo.getId()));
    }

    /**
     * 用户列表(无参数)
     *
     * @return
     */
    @RequestMapping("listUser")
    public R<List<User>> user() {
        return R.success(iUserService.list());
    }

}
