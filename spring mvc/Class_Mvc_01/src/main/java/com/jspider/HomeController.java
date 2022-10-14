package com.jspider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/display")
	public ModelAndView display(HttpServletRequest request, HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("num1"));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", i);
		modelAndView.setViewName("display.jsp");

		return modelAndView;
	}
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j) {
		int k=i+j;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", k);
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}
	@RequestMapping("obj")
	public ModelAndView passObj() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", new Car(1,"Q7","Audi"));
		modelAndView.setViewName("display.jsp");
		return modelAndView;
	}
	@RequestMapping("cardata")
	public ModelAndView saveCar(@ModelAttribute Car car) {
		System.out.println(car);
		ModelAndView modelAndView=new ModelAndView("carobj.jsp");
		modelAndView.addObject("car",car);
		modelAndView.setViewName("saveCar.jsp");
		return modelAndView;
		}
	@RequestMapping("data")
	public String data(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("brand")String brand) {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(brand);
		ModelAndView mv=new ModelAndView();
		return "saveCar.jsp";
	}
}

