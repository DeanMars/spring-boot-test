package com.springboottest.config.config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchuqiang on 2017/3/9.
 */
public class Configration01 {

    private List<String> serverList=new ArrayList<String>();


    public List<String> getServerList() {
        return serverList;
    }

    public void setServerList(List<String> serverList) {
        this.serverList = serverList;
    }

}
