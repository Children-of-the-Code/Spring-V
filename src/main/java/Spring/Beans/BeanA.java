package Spring.Beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

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
