package cn.iflyapi.ihungry.controller;

import cn.iflyapi.ihungry.annotation.Controller;
import cn.iflyapi.ihungry.annotation.GetMapping;
import cn.iflyapi.ihungry.model.User;
import cn.iflyapi.ihungry.util.JSONResult;

/**
 * @author: qfwang
 * @date: 2018-11-11 12:48 PM
 */
@Controller("UserController")
public class UserController {

    @GetMapping("/users")
    public JSONResult getUsers(String name, int age) {

        System.out.println(name + "-" + age);
        return JSONResult.success();
    }

    @GetMapping("/users1")
    public JSONResult getUsers1(User user) {

        System.out.println(user.getName() + "-" + user.getPhone());
        return JSONResult.success();
    }
}
