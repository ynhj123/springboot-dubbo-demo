package com.dubboDemo.service;

import com.dubboDemo.ConsumerApplicationTest;
import com.dubboDemo.demo.entity.HelloDto;
import com.dubboDemo.demo.service.HelloService;
import com.dubboDemo.demo.service.HelloTwoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;

class HelloServiceImplTest extends ConsumerApplicationTest {
    //    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    @DubboReference(version = "1.0.0", url = "${dubbo.producer.url}", filter = {"consumerFilter"})
    HelloService helloService;
    @DubboReference(version = "1.0.0", url = "${dubbo.producer.url}", filter = {"consumerFilter"})
    HelloTwoService helloTwoService;

    @Test
    void test() {
        HelloDto helloDto = new HelloDto();
        helloDto.setName("zz");
        System.out.println(helloService.hello(helloDto).getHello());
        System.out.println(helloTwoService.hello(helloDto).getHello());
    }

}