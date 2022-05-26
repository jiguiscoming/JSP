package com.js.main;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class M {

	public static void get(HttpServletRequest request) throws IOException {
	LocalDate now = LocalDate.now();
	
		
	String path =	request.getSession().getServletContext().getRealPath("filesaver");
	System.out.println(path);


	MultipartRequest mr = new MultipartRequest(request, path, 20*1024*1024, "utf-8", new DefaultFileRenamePolicy());
	
	String fName = mr.getFilesystemName("f");
	String id =	mr.getParameter("id");
	String pw =	mr.getParameter("pw");
	int birth = Integer.parseInt(mr.getParameter("birth"));
	int year = now.getYear();
	
	int age = year-birth;
	
	

	Info i = new Info(id, pw, fName, age);
	request.setAttribute("info", i);
	
	
	}

}
