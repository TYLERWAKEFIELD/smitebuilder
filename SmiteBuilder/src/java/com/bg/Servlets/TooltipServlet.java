package com.bg.Servlets;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import SmiteBuilder.*;
import org.json.*;

/**
 *
 * @author bg
 */
@WebServlet(name = "TooltipServlet", urlPatterns = {"/TooltipServlet"})
public class TooltipServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String item = request.getParameter("item");
        //Get God ID and retrieve information

        CharacterDBDAO dao = new CharacterDBDAO();

        if (item != null) {
            Item i = dao.getItem(Integer.parseInt(item));

            StringBuilder sb = new StringBuilder();
            sb.append("<div class='tooltip-pic'><img src='img/items/").append(i.getPortrait_name()).append("'/></div>");
            sb.append("<div class='tooltip-text'>");
            sb.append("<h2>").append(i.getName()).append("</h2>");
            sb.append("<p>");
            sb.append(getTTValues(i.getHealth_base(), "Health"));
            sb.append(getTTValues(i.getMana_base(), "Mana"));
            sb.append(getTTValues(i.getSpeed_base(), "Movement Speed"));
            sb.append(getTTValues(i.getAttack_sec_base(), "Attack Speed"));
            sb.append(getTTValues(i.getPower_magical_base(), "Magical Power"));
            sb.append(getTTValues(i.getPower_physical_base(), "Physical Power"));
            sb.append(getTTValues(i.getProt_magical_base(), "Magical Protection"));
            sb.append(getTTValues(i.getProt_physical_base(), "Physical Protection"));
            sb.append(getTTValues(i.getHp5_base(), "HP5"));
            sb.append(getTTValues(i.getMp5_base(), "MP5"));
            sb.append(getTTValues(i.getLifesteal_magical(),"Magical Lifesteal"));
            sb.append(getTTValues(i.getLifesteal_physical(), "Physical Lifesteal"));
            sb.append(getTTValues(i.getPenetration_magical(), "Magical Penetration"));
            sb.append(getTTValues(i.getPenetration_physical(), "Physical Penetration"));
            sb.append(getTTValues(i.getFocus(), "Focus"));
            sb.append(getTTValues(i.getCooldown(), "Cooldown"));
            sb.append(getTTValues(i.getCrit_chance(), "Critical Strike Chance"));
            sb.append("</br>").append(i.getPassive());       
            sb.append("</p></div>");
           
            out.println(sb.toString());
        }


    }

    public String getTTValues(int value, String desc) {
        StringBuilder sb = new StringBuilder("");
        if (value > 0) {
            sb.append("+").append(value).append(" ").append(desc).append("</br>");
        }
        return sb.toString();
    }

    public String getTTValues(double value, String desc) {
        StringBuilder sb = new StringBuilder("");
        if (value > 0) {
            if (value < 1) {
                sb.append("+").append(value * 100).append("% ").append(desc).append("</br>");
            } else {
                sb.append("+").append(value).append(" ").append(desc).append("</br>");
            }
        }
        return sb.toString();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
