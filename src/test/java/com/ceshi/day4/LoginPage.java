package com.ceshi.day4;

import org.openqa.selenium.By;

/**
 * Created by ASUS on 2018/8/3.
 */
public class LoginPage {
    //定义Email文本框的定位方式
    public static By emailInput = By.name("email");
    //定义密码输入框的定位方式
    public static By pwdInput = By.name("password");
    //定义登陆按钮的定位方式
    public static By loginButton = By.id("dologin");
    //定义去注册的定位方式
    public static By registerButton = By.id("changepage");
}
