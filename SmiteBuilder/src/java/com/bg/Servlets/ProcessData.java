package com.bg.Servlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
@WebServlet(name = "ProcessData", urlPatterns = {"/ProcessData"})
public class ProcessData extends HttpServlet {

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


        //Get God ID and retrieve information
        String gid = request.getParameter("id");
        String level = request.getParameter("level");
        CharacterDBDAO dao = new CharacterDBDAO();

        if (gid != null && level != null) {
            God g = dao.getAttributes(Integer.parseInt(gid), Integer.parseInt(level));

            try {
                JSONObject jo = new JSONObject();
                jo.put("name", g.getName());
                jo.put("sub_desc", g.getSub_desc());
                jo.put("origin", g.getOrigin());
                jo.put("tags", g.getTags());
                jo.put("health_base", g.getHealth_base());
                jo.put("health_per", g.getHealth_per());
                jo.put("mana_base", g.getMana_base());
                jo.put("mana_per", g.getMana_per());
                jo.put("speed_base", g.getSpeed_base());
                jo.put("speed_per", g.getSpeed_per());
                jo.put("range_base", g.getRange_base());
                jo.put("range_per", g.getRange_per());
                jo.put("attack_sec_base", g.getAttack_sec_base());
                jo.put("attack_sec_per", g.getAttack_sec_per());
                jo.put("power_magical_base", g.getPower_magical_base());
                jo.put("power_magical_per", g.getPower_magical_per());
                jo.put("power_physical_base", g.getPower_physical_base());
                jo.put("power_physical_per", g.getPower_physical_per());
                jo.put("prot_magical_base", g.getProt_magical_base());
                jo.put("prot_magical_per", g.getProt_magical_per());
                jo.put("prot_physical_base", g.getProt_physical_base());
                jo.put("prot_physical_per", g.getProt_physical_per());
                jo.put("hp5_base", g.getHp5_base());
                jo.put("hp5_per", g.getHp5_per());
                jo.put("mp5_base", g.getMp5_base());
                jo.put("mp5_per", g.getMp5_per());
                jo.put("level", g.getLevel());
                jo.put("health", g.getHealth());
                jo.put("mana", g.getMana());
                jo.put("speed", g.getSpeed());
                jo.put("range", g.getRange());
                jo.put("attack_sec", g.getAttack_sec());
                jo.put("power_magical", g.getPower_magical());
                jo.put("power_physical", g.getPower_physical());
                jo.put("prot_magical", g.getProt_magical());
                jo.put("prot_physical", g.getProt_physical());
                jo.put("hp5", g.getHp5());
                jo.put("mp5", g.getMp5());
                jo.put("portrait_name", g.getPortrait_name());
                jo.put("god_id", g.getGod_id());
                jo.put("mag_lifesteal", g.getLifesteal_magical());
                jo.put("mag_penetration", g.getPenetration_magical());
                jo.put("cooldown", g.getCooldown());
                jo.put("focus", g.getFocus());
                jo.put("physical_lifesteal", g.getLifesteal_physical());
                jo.put("physical_penetration", g.getPenetration_physical());
                jo.put("critical_chance", g.getCrit_chance());

                out.println(jo.toString());
            } catch (JSONException je) {
                //log.error(je.getMessage());
            } finally {
                out.close();
            }
        }
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
