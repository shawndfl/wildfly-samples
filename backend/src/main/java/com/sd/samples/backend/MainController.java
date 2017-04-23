package com.sd.samples.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController
{
   protected final Log logger = LogFactory.getLog(getClass());
   
   public ModelAndView HomePage(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException
   {
      logger.info("Returning hello view");

      return new ModelAndView("index");
   }
}
