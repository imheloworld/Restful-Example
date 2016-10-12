/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweather.restful.example;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author zack
 */
public class RestAppConfig extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resource = new HashSet<>();
        resource.add(DepartmentService.class);
        return resource;
        
    }
}
