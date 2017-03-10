package com.springboottest.domain.entity;


import org.springframework.data.annotation.Id;

/**
 * Created by zhangchuqiang on 2017/3/7.
 */
public class Test {

    @Id
    private  long id;

    private  String location;

    private  int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
