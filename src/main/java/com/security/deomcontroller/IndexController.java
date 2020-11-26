package com.security.deomcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制层
 * @author hzx
 * @date 2020/11/26
 */
@Controller
public class IndexController {

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "success";
    }
}
