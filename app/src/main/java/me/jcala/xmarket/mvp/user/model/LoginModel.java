package me.jcala.xmarket.mvp.user.model;

import me.jcala.xmarket.data.entity.ordinary.UserBean;

public interface LoginModel {
    void login(UserBean user,LoginModelImpl.OnRegisterListener listener);
}