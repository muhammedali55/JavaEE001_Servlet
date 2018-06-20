package com.vektorel.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/KayitServlet")
public class KayitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String ad,soyad,tckimlik;
	public KayitServlet() {
        super();    
    }
	protected void kayitislemi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter wr = response.getWriter()){
			wr.write("Kullanıcı Kayıt Edilmmiştir. <br />");
			wr.write("Kayıt Bilgileri: <br />");
			wr.write("Ad..: "+ad+", Soyad..: "+soyad+", TcNo..: "+ tckimlik);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		kayitislemi(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ad = request.getParameter("post_ad");
		soyad = request.getParameter("post_soyad");
		tckimlik = request.getParameter("post_tckimlik");		
		doGet(request, response);
	}
}
