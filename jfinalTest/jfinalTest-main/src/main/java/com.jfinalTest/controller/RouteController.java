package com.jfinalTest.controller;

import com.jfinal.core.Controller;

/**
 * Created by pc on 2017/1/24.
 */
public class RouteController extends Controller {
    public void index(){
        renderText("this is index");
    }

    public void hello(){
        renderText("hello world");
    }

    public void lololo(){
        renderText("lololo");
    }
}
