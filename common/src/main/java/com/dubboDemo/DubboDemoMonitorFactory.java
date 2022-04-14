package com.dubboDemo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.monitor.Monitor;
import org.apache.dubbo.monitor.MonitorFactory;

/**
 * @date: 2022-04-14
 * @author: yangniuhaojiang
 * @title: DubboDemoMonitorFactory
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class DubboDemoMonitorFactory implements MonitorFactory {
    @Override
    public Monitor getMonitor(URL url) {
        DubboDemoMonitor dubboDemoMonitor = new DubboDemoMonitor();
        dubboDemoMonitor.collect(url);
        return dubboDemoMonitor;
    }
}
