package springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class hello{

   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      

      return "hello";
   }

}