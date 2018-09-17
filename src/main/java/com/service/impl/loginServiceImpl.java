package com.service.impl;

import com.service.loginService;
import com.dao.loginDao;
import com.model.login;
import org.springframework.stereotype.Service;
import com.service.loginService;

import javax.annotation.Resource;

//import dao.loginDaoImpl;

@Service("loginService")
public class loginServiceImpl implements loginService {
    @Resource(name = "loginDao")
   private loginDao lgin;
    public int loginCheck(String username,String passwd)
    {
        int state=0;//用户不存在，1密码错误；2登录成功

        //loginDao login=new loginDaoImpl();
        login lg=lgin.getPasswd(username);
        if (lg.getPassword().equals(passwd))
        {
            state=2;
        }else
        {
            state=0;
        }
        return state;
    }
}
