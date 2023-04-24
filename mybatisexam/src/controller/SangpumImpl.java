package controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Board;

public class SangpumImpl implements CommandInter{

	static SangpumImpl impl = new SangpumImpl();
	public static SangpumImpl instance() {
		return impl;
	}

	@Override
	public String showData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SangpumModel model = SangpumModel.instance();
		ArrayList<Board> list = (ArrayList<Board>)model.selectSangpum();
		request.setAttribute("data", list);
		System.out.println("bb"+list.size());
		return "sangpum_list.jsp";
	}

}
