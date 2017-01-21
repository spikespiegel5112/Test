package com.jfinalTest.config;

import com.jfinal.config.*;
import com.jfinalTest.controller.HelloController;

/**
 * Created by pc on 2017/1/20.
 */
public class jfinalTestConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("hello", HelloController.class, "/");
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
