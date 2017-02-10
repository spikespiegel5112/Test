package com.test.swingtest;

import javax.swing.*;

/**
 * Created by spike on 2017/2/10.
 */
public class Test {
    String result = (String) JOptionPane.showInputDialog(null, "请输入一个整数", "输入对话框", JOptionPane.PLAIN_MESSAGE, null, null, null);

    public String getResult() {
        return result;
    }
}

    public static void main(String args[]) {
        Test testInstance = new Test();
        testInstance.getResult();
    }
