package com.vikas.SpringMVCDemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called.");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//
//        session.setAttribute("result",result);
//
//        return "result.jsp";
//
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
//        int result = num1 + num2;
//
//        mv.addObject("result",result);
//        mv.setViewName("result");
//        return mv;
//
//    }

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien) {
        return "result";
    }

}
