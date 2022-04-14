package com.dubboDemo.demo.service;

import com.dubboDemo.demo.entity.HelloDto;
import com.dubboDemo.demo.entity.HelloVo;

public interface HelloService {
    HelloVo hello(HelloDto dto);
}