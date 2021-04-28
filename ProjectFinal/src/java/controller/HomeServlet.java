/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ProductDAL;

/**
 *
 * @author Hung Trinh
 */
public class HomeServlet extends HttpServlet {

    HashMap<String, Integer> hashCart = new HashMap<String, Integer>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();

        ProductDAL pDAL = new ProductDAL();
        HttpSession session = request.getSession();
        //////////////////////////////////////////
        String username = (String) session.getAttribute("user");
        String category = request.getParameter("catid");
        String search = (String) request.getParameter("search");
        List<Product> bookList = new ArrayList<>();
        //////////////////////////////////////////
        if (category == null || category.equals("")) {
            bookList = pDAL.getAllProduct();
            if (search == null || search.equals("")) {
                bookList = pDAL.getAllProduct();
            } else {
                bookList = pDAL.getProductBySerch(search);
            }
        } else {
            bookList = pDAL.getProductByCategory(category);
        }

        request.setAttribute("bookList", bookList);
        ///////////////////////////////////////////
        try {
            String pid = request.getParameter("pid");
            int amount = Integer.parseInt(request.getParameter("amount"));
            if (pid == null || amount == 0) {
                request.getRequestDispatcher("shop.jsp").include(request, response);
            } else {
                if (username != null) {
                    hashCart = pDAL.getCart(username);
                }
                if (hashCart.containsKey(pid)) {
                    hashCart.put(pid, (hashCart.get(pid) + amount));
                    pDAL.updateCart(username, pid, hashCart.get(pid));
                    session.setAttribute("hashCart", hashCart);

                } else {
                    hashCart.put(pid, amount);
                    pDAL.addToCart(username, pid, hashCart.get(pid));
                    session.setAttribute("hashCart", hashCart);
                }
                request.getRequestDispatcher("shop.jsp").include(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("shop.jsp").include(request, response);
        }

//        request.getRequestDispatcher("shop.jsp").include(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();

    }

}
