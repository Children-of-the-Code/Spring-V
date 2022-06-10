package Spring;

import Spring.Beans.BeanA;
import Spring.Beans.BeanB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {

    public static void main(String[] args) {
        /*
        A bean is an object managed by Spring's IOC
        IOC: inversion of control - control over beans is managed by Spring rather than directly by the developer
        Bean scope:

        (by default - singleton) -  a single bean is shared across the entire application
        prototype - a new bean is generated every time the bean is accessed from the applicationcontext

        http session scope
        http request scope
        global http session scope
        websocket scope
        application
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        BeanA ba1 = context.getBean(BeanA.class);
        BeanA ba2 = context.getBean(BeanA.class);
        ba1.setBeanMsg("bean A 1");
        System.out.println(ba1);
        System.out.println(ba2);
/*
        BeanB bb1 = context.getBean(BeanB.class);
        BeanB bb2 = context.getBean(BeanB.class);
        bb1.setBeanMsg("bean B 1");
        System.out.println(bb1);
        System.out.println(bb2);
*/
        BeanB bb3 = context.getBean("beanABean", BeanB.class);
        System.out.println(bb3);

        /*
        Spring boot will automatically undergo component scans, configure beans, and will also be configured to run
        Controllers at startup
         */

        /*
        Spring MVC
        model view controller
        spring MVC is one of spring's web frameworks that allow us to make rest API's very easily -
        using mapping for each http verb (getmapping, postmapping, etc),
        marking classes with a controller or restcontroller annotation (this is a stereotype that spring boot recognizes
        and runs automatically),
        as well as the ability to easily parse json request/response bodies, path variables, etc

        requestmapping is kind of a general mapping before we designate gets, posts, puts
        it's especially useful to put at the top of a controller class to designate all of its methods
        as starting from a certain url path

        Spring ORM
        ORM? object relational mapping -
        spring is able to map our java objects to rows in a database table, and this allow us to act as if we are directly
        modifying the persisted data while interacting with java objects
        @Entity annotation, @Id, @Column, etc

        Spring Data
        introduced JPARepositories for us to use, JPQL queries (java persistence query language)
        @Transactional? wraps a method, or all of a class's methods, inside of a DB transaction, so that the execution
        of one method doesn't impact the others in a query

        Spring AOP
        Aspect oriented programming
        we want to address 'cross cutting concerns' like logging, security - ie repetitive actions
        that are applied to a set of similar methods
        the way we resolve this is that we define an expression (pointcut expression) that is our formula
        for defining methods that fit a pattern to which we want to apply advice (eg, all methods of a certain class,
        all methods with a certain name, etc)
        joinpoint - where the code in our aspect's method will be actually applied to the recipient method
        advice annotations - @before, @after, @beforethrowing, @afterreturning @around (before+after)

         */


    }
    @Bean
    public BeanB beanABean(){
        BeanB b = new BeanB();
        b.setBeanMsg("This is Bean B");
        return b;
    }

}
