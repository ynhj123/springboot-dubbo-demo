package com.dubboDemo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.monitor.Monitor;

import java.util.List;

/**
 * @date: 2022-04-14
 * @author: yangniuhaojiang
 * @title: DubboDemoMonitor
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class DubboDemoMonitor implements Monitor {
    @Override
    public URL getUrl() {
        return null;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void collect(URL statistics) {

    }

    @Override
    public List<URL> lookup(URL query) {
        return null;
    }
}
