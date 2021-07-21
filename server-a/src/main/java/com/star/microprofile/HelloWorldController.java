package com.star.microprofile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * hello world控制器
 *
 * @author star
 * @date 2021/07/21
 */
@Controller
public class HelloWorldController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @ResponseBody
    public String sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return "greeting";
//        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

}
