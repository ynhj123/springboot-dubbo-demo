package com.dubboDemo;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.*;

import java.util.Map;

/**
 * @date: 2022-04-14
 * @author: yangniuhaojiang
 * @title: producerFilter
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@Slf4j
public class ConsumerFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Map<String, String> attachments = invocation.getAttachments();
        Result result = invoker.invoke(invocation);
        log.info("add traceId");
        return result;
    }
}
