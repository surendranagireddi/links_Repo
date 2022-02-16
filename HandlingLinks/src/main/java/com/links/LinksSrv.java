package com.links;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinksSrv extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//General Setting
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		//read additional req param(s1)
		
		String pval = req.getParameter("s1");
		if(pval.equals("link1")) {
			Locale locale[] = Locale.getAvailableLocales();
			for(Locale loc: locale) {
				pw.println(loc.getDisplayCountry()+"&nbsp");
				
			}
		}else if(pval.equals("link2")){
			Locale locale[] =Locale.getAvailableLocales();
		  for(Locale loc: locale) {
			  pw.println(loc.getDisplayLanguage());
			  
		  }
			
		}
		else {
			pw.println("Date and Time "+ new Date());
		}
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
    doGet(req,res);	
    
	}

}
