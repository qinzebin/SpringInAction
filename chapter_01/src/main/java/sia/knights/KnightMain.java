package sia.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;
import sia.knights.config.KnightConfig;

/**
 * Spring容器的控制台输出：
 *
 九月 21, 2017 4:22:42 下午 org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
 信息: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@384cd32e: startup date [Thu Sep 21 16:22:42 CST 2017]; root of context hierarchy
 九月 21, 2017 4:22:42 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
 信息: Loading XML bean definitions from class path resource [META-INF/spring/knight.xml]
 Embarking on quest to slay the dragon!
 九月 21, 2017 4:22:42 下午 org.springframework.context.support.ClassPathXmlApplicationContext doClose
 信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@384cd32e: startup date [Thu Sep 21 16:22:42 CST 2017]; root of context hierarchy
 九月 21, 2017 4:22:42 下午 org.springframework.context.annotation.AnnotationConfigApplicationContext prepareRefresh
 信息: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@4f669ea1: startup date [Thu Sep 21 16:22:42 CST 2017]; root of context hierarchy
 Embarking on quest to slay the dragon!
 */
public class KnightMain {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext(
            "META-INF/spring/knight.xml");


    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();

    //注解上下文
    AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(KnightConfig.class);
    knight = context1.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}
