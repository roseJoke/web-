package cn.rose.webexpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*
 * ProjectName:  GrdDesDemo
 * Author:  小浪仙℡816
 * Date:  2018/5/4  10:29
 */
@RestController
public class ViewController {
    @ResponseBody
    @RequestMapping("/haha")
    public ModelAndView show(){
        ModelAndView mv=new ModelAndView("light");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value="/hh")
    public String ss(){
        return "hhhhhhhhh";
    }

}
