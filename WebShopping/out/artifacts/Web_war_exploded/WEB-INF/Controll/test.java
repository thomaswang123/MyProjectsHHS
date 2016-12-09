package com.chenyun.Controll;

import com.chenyun.dao.TestDao;
import com.chenyun.entity.AcessTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by thomas.wang on 2016/12/9.
 */
@Controller
public class test {
    @RequestMapping("login.do")
    public String test(){
        ApplicationContext act = new ClassPathXmlApplicationContext(
                "spring-mvc.xml");
        TestDao testdao = act.getBean(TestDao.class);
        System.out.println(act);
        ArrayList<AcessTest> list = testdao.findAll();
        for (AcessTest lists:list) {
            System.out.println(lists.getAs_ages()+","+lists.getAs_id()+","
                                    +lists.getAs_name()+","+lists.getAs_acess());
        }
        System.out.println("aaa");
        return "index";
    }
}
