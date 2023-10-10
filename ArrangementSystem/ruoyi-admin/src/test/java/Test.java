import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.RuoYiApplication;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.Demo;
import com.ruoyi.system.service.DemoService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest(classes= RuoYiApplication.class)
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    DemoService demoService;
  @org.junit.Test
   public void test(){
      System.out.println("=====================测试一 条件查询====================");
      LambdaQueryWrapper<Demo> queryWrapper = new LambdaQueryWrapper<>();
      queryWrapper.eq(Demo::getAge,10);
      Demo one = demoService.getOne(queryWrapper);
      System.out.println(one);
      System.out.println("=====================测试二 自带的简单查询====================");
      System.out.println(demoService.getById(1)); //根据id获取
      System.out.println(demoService.list()); //直接列出来
      System.out.println("=====================测试三 添加删除====================");
      Demo demo = new Demo();
      demo.setPassword("123456");
      demo.setName("lalala");
      demoService.save(demo); //id会自动生成
      System.out.println("demo的id===>"+demo.getId());
      demoService.removeById(demo.getId());
      System.out.println(SecurityUtils.getLoginUser());
  }
}
