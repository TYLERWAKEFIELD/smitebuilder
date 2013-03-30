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
@WebServlet(name = "ProcessItemArray", urlPatterns = {"/ProcessItemArray"})
public class ProcessItemArray extends HttpServlet {

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

        String[] items = request.getParameter("item").split(",");
        String gid = request.getParameter("g");
        String level = request.getParameter("l");
        //Get God ID and retrieve information
        CharacterDBDAO dao = new CharacterDBDAO();

        if (items != null) {
            JSONObject jObj = new JSONObject();
            JSONArray ja = new JSONArray();
            try {
                //Get item data
                for (int j = 0; j < items.length; j++) {
                    System.out.println("Item: " + items[j]);
                    if (Integer.parseInt(items[j]) != 0) {
                        Item i = dao.getItem(Integer.parseInt(items[j]));

                        JSONObject jo = new JSONObject();
                        jo.put("slot", j + 1);
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
                        ja.put(jo);
                    }
                }
                jObj.put("items", ja);

                //Get God data
                if (!gid.equals("")) {
                    God g = dao.getAttributes(Integer.parseInt(gid), Integer.parseInt(level));
                    JSONObject jog = new JSONObject();
                    jog.put("name", g.getName());
                    jog.put("sub_desc", g.getSub_desc());
                    jog.put("origin", g.getOrigin());
                    jog.put("tags", g.getTags());
                    jog.put("health_base", g.getHealth_base());
                    jog.put("health_per", g.getHealth_per());
                    jog.put("mana_base", g.getMana_base());
                    jog.put("mana_per", g.getMana_per());
                    jog.put("speed_base", g.getSpeed_base());
                    jog.put("speed_per", g.getSpeed_per());
                    jog.put("range_base", g.getRange_base());
                    jog.put("range_per", g.getRange_per());
                    jog.put("attack_sec_base", g.getAttack_sec_base());
                    jog.put("attack_sec_per", g.getAttack_sec_per());
                    jog.put("power_magical_base", g.getPower_magical_base());
                    jog.put("power_magical_per", g.getPower_magical_per());
                    jog.put("power_physical_base", g.getPower_physical_base());
                    jog.put("power_physical_per", g.getPower_physical_per());
                    jog.put("prot_magical_base", g.getProt_magical_base());
                    jog.put("prot_magical_per", g.getProt_magical_per());
                    jog.put("prot_physical_base", g.getProt_physical_base());
                    jog.put("prot_physical_per", g.getProt_physical_per());
                    jog.put("hp5_base", g.getHp5_base());
                    jog.put("hp5_per", g.getHp5_per());
                    jog.put("mp5_base", g.getMp5_base());
                    jog.put("mp5_per", g.getMp5_per());
                    jog.put("level", g.getLevel());
                    jog.put("health", g.getHealth());
                    jog.put("mana", g.getMana());
                    jog.put("speed", g.getSpeed());
                    jog.put("range", g.getRange());
                    jog.put("attack_sec", g.getAttack_sec());
                    jog.put("power_magical", g.getPower_magical());
                    jog.put("power_physical", g.getPower_physical());
                    jog.put("prot_magical", g.getProt_magical());
                    jog.put("prot_physical", g.getProt_physical());
                    jog.put("hp5", g.getHp5());
                    jog.put("mp5", g.getMp5());
                    jog.put("portrait_name", g.getPortrait_name());
                    jog.put("god_id", g.getGod_id());
                    jog.put("mag_lifesteal", g.getLifesteal_magical());
                    jog.put("mag_penetration", g.getPenetration_magical());
                    jog.put("cooldown", g.getCooldown());
                    jog.put("focus", g.getFocus());
                    jog.put("physical_lifesteal", g.getLifesteal_physical());
                    jog.put("physical_penetration", g.getPenetration_physical());
                    jog.put("critical_chance", g.getCrit_chance());
                    jObj.put("god", jog);
                }
                out.println(jObj);

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
