package hello.servlet.web.springmvc.old;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ComponentScan("/springmvc/old-controller")
public class OldController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("/springmvc/old-controller");
        /* application.properties 에서 설정해서 자동으로 jsp 물리적 경로를 매핑해줌 ViewResolver*/
        /*spring.mvc.view.prefix=/WEB-INF/views/
          spring.mvc.view.suffix=.jsp*/
        return new ModelAndView("new-form");
    }

}
