package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JsonController {

    @RequestMapping(value = "/json1", produces = "application/json")
    @ResponseBody
    public String json1() {
        return "{\"name\":\"Jackson\"}";
    }


    @RequestMapping("/json2")
    @ResponseBody
    public Map json2() {
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("A", 1);
                put("B", 2);
            }
        };
        return map;
    }


    @RequestMapping("/json3")
    @ResponseBody
    public Map json3() {
        /*
        * 需添加jackson json的依赖,自动转换
        */
        Map<String, Object> map1 = new HashMap<String, Object>();

        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("b1",3);
        map2.put("b2",4);
        list.add(map2);

        map1.put("A",1);
        map1.put("b",list);

        return map1;
    }


    @RequestMapping("/json4")
    @ResponseBody
    public User json4() {
        /*
        * 需添加jackson json的依赖,自动转换
        */
        User user = new User();
        user.setName("Jackson");
        user.setAge(20);
        return user;
    }

}
