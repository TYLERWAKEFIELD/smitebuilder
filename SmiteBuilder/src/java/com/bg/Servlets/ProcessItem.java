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
@WebServlet(name = "ProcessItem", urlPatterns = {"/ProcessItem"})
public class ProcessItem extends HttpServlet {

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
            try {

                JSONObject jo = new JSONObject();
                jo.put("item_id", i.getItem_id());
                jo.put("name", i.getName());
                jo.put("health", i.getHealth_base());
                jo.put("mana", i.getMana_base());
                jo.put("speed", i.getSpeed_base());
                jo.put("range", i.getRange_base());
                jo.put("attack_sec", i.getAttack_sec_base());
                jo.put("power_magical", i.getPower_magical_base());
                jo.put("power_physical", i.getPower_physical_base());
                jo.put("prot_magical", i.getProt_magical_base());
                jo.put("prot_physical", i.getProt_physical_base());
                jo.put("hp5", i.getHp5_base());
                jo.put("mp5", i.getMp5_base());
                jo.put("portrait_name", i.getPortrait_name());
                jo.put("cost", i.getCost());
                jo.put("mag_lifesteal", i.getLifesteal_magical());
                jo.put("physical_lifesteal", i.getLifesteal_physical());
                jo.put("mag_penetration", i.getPenetration_magical());
                jo.put("physical_penetration", i.getPenetration_physical());
                jo.put("focus", i.getFocus());
                jo.put("critical_chance", i.getCrit_chance());
                jo.put("cooldown", i.getCooldown());
                jo.put("passive", i.getPassive());
                jo.put("max_stacks", i.getMax_stacks());
                jo.put("bonus_field_1", i.getBonus_field_1());
                jo.put("bonus_modifier_1", i.getBonus_modifier_1());
                jo.put("bonus_field_2", i.getBonus_field_2());
                jo.put("bonus_modifier_2", i.getBonus_modifier_2());
                jo.put("bonus_field_3", i.getBonus_field_3());
                jo.put("bonus_modifier_3", i.getBonus_modifier_3());
                jo.put("passive_bonus_from_1", i.getPassive_bonus_from_1());
                jo.put("passive_bonus_to_1", i.getPassive_bonus_to_1());
                jo.put("passive_modifier_1", i.getPassive_modifier_1());
                jo.put("passive_bonus_from_2", i.getPassive_bonus_from_2());
                jo.put("passive_bonus_to_2", i.getPassive_bonus_to_2());
                jo.put("passive_modifier_2", i.getPassive_modifier_2());
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
