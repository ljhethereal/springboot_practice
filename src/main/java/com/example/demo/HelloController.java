//处理前端http请求的入口
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//请求处理器
public class HelloController {

    //绑定url
    @GetMapping("/api/hello")
    public ResponseMessage hello(){
        return new ResponseMessage("hello, world", 200);
    }

}
