package Spring.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class BeanB {

    String beanMsg;
    public String getBeanMsg(){
        return beanMsg;
    }
    public void setBeanMsg(String n){
        beanMsg = n;
    }
    public String toString(){
        return beanMsg;
    }

}
