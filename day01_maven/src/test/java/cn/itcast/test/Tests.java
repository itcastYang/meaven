package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需要的dao的代理对象
      /* ItemsDao bean = a.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());*/
        ItemsService i = a.getBean(ItemsService.class);
        Items byId = i.findById(1);
        System.out.println(byId.getName());

    }
}
