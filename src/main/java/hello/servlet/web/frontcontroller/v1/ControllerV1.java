package hello.servlet.web.frontcontroller.v1;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

    //프론트 컨트롤러 - 인터페이스를 구현해 클라이언트의 요청의 공통 처리 컨트롤러
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
