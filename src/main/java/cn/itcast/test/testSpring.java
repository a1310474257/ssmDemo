package cn.itcast.test;

import cn.itcast.daomain.Account;
import cn.itcast.service.AccountService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //调用方法
       List<Account> accountList =   as.findAll();
        for (Account account:accountList){
            System.out.println(accountList);
        }
    }
}
