package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFormControllerV3 implements ControllerV3 {


    @Override
    public ModelView process(HttpServletRequest request, HttpServletResponse response) {
        return new ModelView("new-form");
    }
}
