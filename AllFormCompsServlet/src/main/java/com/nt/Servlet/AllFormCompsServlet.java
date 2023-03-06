package com.nt.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AllFormCompsServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//set response content type
		res.setContentType("text/html");
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//read form data
		String name=req.getParameter("cname");
		float age=Float.parseFloat(req.getParameter("cage"));
		String addrs=req.getParameter("cadd");
		String gender=req.getParameter("gender");
		String ms=req.getParameter("ms");
		if(ms==null) {
			ms="single";//handling non-checked state for checkbox
		}
		String qlyf=req.getParameter("qlyf");
				if(qlyf==null)
					qlyf="no qualification is selected";//handling non-selected state for select fr selectboxes
				
		String hobies[]=req.getParameterValues("hb");
			if(hobies==null)
				hobies=new String[] {"no hobies is selected"};
			
		String favCousins[]=req.getParameterValues("favCousins");
			if(favCousins==null)
				favCousins=new String[] {"No  favoirites Cousins are selected"};//handling non selected state for list box
		
		int luckyno=Integer.parseInt(req.getParameter("luckyno"));
		String favColor=req.getParameter("favColor");
		int Salary=Integer.parseInt(req.getParameter("salary"));
		String email=req.getParameter("mail");
		String dob=req.getParameter("dob");
		String tob=req.getParameter("tob");
		String doj=req.getParameter("doj");
		String emonth=req.getParameter("eMonth");
		String favWeek=req.getParameter("favWWeek");
		long mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		String fbUrl=req.getParameter("fburl");
		String ss=req.getParameter("sString");
		
		//Write business logic
		if(gender.equalsIgnoreCase("M")) {
			if(age<5)
				pw.println("<h1>Master."+name+"u r baby boy</h1>");
			else if (age<=12) 
				pw.println("<h1>Master."+name+"u r small boy</h1>");
			else if (age<=19)
				pw.println("<h1>Master."+name+"u r teenage boy</h1>");
			else if (age<=35)
				pw.println("<h1>Master."+name+"u r young man</h1>");
			else if (age<=50)
				pw.println("<h1>Master."+name+"u r middle-aged man</h1>");
			else 
				pw.println("<h1>Master."+name+"u r budda</h1>");
			}
		else {
			if(age<5)
				pw.println("<h1>Master."+name+"u r baby girl</h1>");
			else if (age<=12) 
				pw.println("<h1>Master."+name+"u r small girl</h1>");
			else if (age<=19) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1>Mrs."+name+"u r teenage married girl</h1>");
				else 
					pw.println("<h1>Miss."+name+"u r teenage girl</h1>");
			}
			else if (age<=35) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1>Mrs."+name+"u r young marriedWomen</h1>");
				else 
					pw.println("<h1>Miss."+name+"u r young women</h1>");
			}
			else if (age<=50) {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1>Mrs."+name+"u r married middle-aged women </h1>");
				else 
					pw.println("<h1>Miss."+name+"u r middle-aged women</h1>");
			}
			else {
				if(ms.equalsIgnoreCase("married"))
					pw.println("<h1>Mrs."+name+"u r married buddi</h1>");
				else 
					pw.println("<h1>Miss."+name+"u r buddi</h1>");
				}		
		}//else
			//display form form data
	
			pw.println("<h1>form data is</h1>");
			pw.println("<b>name::"+name+"</b><br>");
			pw.println("<b>age::"+age+"</b><br>");
			pw.println("<b>address::"+addrs+"</b><br>");
			pw.println("<b>gender::"+gender+"</b><br>");
			pw.println("<b>Maarital status::"+ms+"</b><br>");
			pw.println("<b>mobileNo::"+mobileNo+"</b><br>");
			pw.println("<b>Qualification::"+qlyf+"</b><br>");
			pw.println("<b>Hobies::"+Arrays.asList(hobies)+"</b><br>");
			pw.println("<h1>favCousin::"+Arrays.asList(favCousins)+"</h1>");
			pw.println("<h1>DOB::"+dob+"</b><br>");
			pw.println("<h1>TOB::"+tob+"</b><br>");
			pw.println("<h1>DOJ::"+doj+"</b><br>");
			pw.println("<h1>Alergitic Month::"+emonth+"</b><br>");
			pw.println("<h1>Fav Week Day::"+favWeek+"</b><br>");
			pw.println("<h1>Fav Color::"+favColor+"</b><br>");
			pw.println("<h1>Email::"+email+"</b><br>");
			pw.println("<h1>fburl::"+fbUrl+"</b><br>");
			pw.println("<h1>Google Serch String::"+ss+"</b><br>");
			
			
			//Add home hyperlink
			pw.println("<br><br><a href='all_form_register.html'>home</a>");
			
	}//doget
	@Override
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				doGet(req, res);
			}	
}//class
				
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
