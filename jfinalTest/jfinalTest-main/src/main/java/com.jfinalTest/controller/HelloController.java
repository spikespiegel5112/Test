package com.jfinalTest.controller;

import com.jfinal.core.Controller;

/**
 * Created by pc on 2017/1/20.
 */
public class HelloController extends Controller{
    public void index(){
        renderText("hello world");
    }
}