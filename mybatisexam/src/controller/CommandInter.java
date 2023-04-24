package controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface CommandInter {
	String showData(HttpServletRequest request, HttpServletResponse response) throws Exception;
}



