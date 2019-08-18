package com.github.zk.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019-08-18 10:19
 */
@RestController
public class DemoController {
    @Value("${foo}")
    private String foo;
    @RequestMapping("/getConfig")
    public String getConfig() {
        return foo;
    }
}
