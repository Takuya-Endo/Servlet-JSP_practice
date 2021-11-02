package exercise_11;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class NoAppScopeListener implements ServletContextAttributeListener {

    public NoAppScopeListener() {
    	
    }

    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	
    	System.out.println("アプリケーション利用は禁止されています。");
    	
    }

    public void attributeRemoved(ServletContextAttributeEvent scae)  { 

    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 

    }
	
}
