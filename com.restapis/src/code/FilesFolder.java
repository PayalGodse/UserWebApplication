package code;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FilesFolder")
public class FilesFolder extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hello!<br>");
		//Files.walk(Paths.get(request.getParameter("msg"))).forEach(filePath -> {
//		Files.walk(Paths.get("E:")).forEach(filePath -> {
//		    if (Files.isRegularFile(filePath)) {
//		    	try {
//					response.getWriter().println(filePath);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		    } 
//		});
		
		String dirPath = request.getAttribute("msg").toString();
		File dir = new File(dirPath);
		String[] files = dir.list();
		if (files.length == 0) {
			response.getWriter().println("The directory is empty");
		} else {
		    for (String aFile : files) {
		    	response.getWriter().println(aFile+"<br>");
		    }
		}
	}
	

}
