/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SmiteBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bg
 */
public class CharacterDBDAO extends MySQLDB {

    public God getAttributes(int id, int level) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        God god = new God();
        try {
            conn = getConn();
            System.out.println("Database connection established");
            String qry = "SELECT name, "
                    + "health_base, health_per, mana_base, mana_per, "
                    + "speed_base, speed_per, range_base, range_per, "
                    + "attack_sec_base, attack_sec_per, power_magical_base, power_magical_per, "
                    + "power_physical_base, power_physical_per, "
                    + "prot_magical_base, prot_magical_per, prot_physical_base, prot_physical_per, "
                    + "hp5_base, hp5_per, mp5_base, mp5_per, portrait_name, god_id, "
                    + "sub_desc, origin, tags "
                    + " FROM god WHERE god_id = ? ";

            stmt = conn.prepareStatement(qry);
            stmt.setInt(1, id);
            rset = stmt.executeQuery();
            System.out.println("Query executed");
            while (rset.next()) {
                god.setName(rset.getString(1));
                god.setHealth_base(rset.getInt(2));
                god.setHealth_per(rset.getInt(3));
                god.setMana_base(rset.getInt(4));
                god.setMana_per(rset.getInt(5));
                god.setSpeed_base(rset.getInt(6));
                god.setSpeed_per(rset.getInt(7));
                god.setRange_base(rset.getInt(8));
                god.setRange_per(rset.getInt(9));
                god.setAttack_sec_base(rset.getDouble(10));
                god.setAttack_sec_per(rset.getDouble(11));
                god.setPower_magical_base(rset.getInt(12));
                god.setPower_magical_per(rset.getInt(13));
                god.setPower_physical_base(rset.getInt(14));
                god.setPower_physical_per(rset.getInt(15));
                god.setProt_magical_base(rset.getInt(16));
                god.setProt_magical_per(rset.getInt(17));
                god.setProt_physical_base(rset.getDouble(18));
                god.setProt_physical_per(rset.getDouble(19));
                god.setHp5_base(rset.getInt(20));
                god.setHp5_per(rset.getDouble(21));
                god.setMp5_base(rset.getInt(22));
                god.setMp5_per(rset.getDouble(23));
                god.setPortrait_name(rset.getString(24));
                god.setGod_id(rset.getInt(25));
                god.setSub_desc(rset.getString(26));
                god.setOrigin(rset.getString(27));
                god.setTags(rset.getString(28));

                //all above attributes need to be set then set level
                god.setLevel(level);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            closeDBResources(conn, null, null);
            return god;
        }

    }

    public ArrayList<God> getGods() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        ArrayList<God> godList = new ArrayList<God>();
        try {
            conn = getConn();
            //System.out.println("Database connection established");
            String qry = "SELECT name, god_id, portrait_name FROM god ORDER BY name";
            stmt = conn.prepareStatement(qry);
            rset = stmt.executeQuery();
            //System.out.println("Query executed");
            while (rset.next()) {
                God g = new God();
                g.setName(rset.getString(1));
                g.setGod_id(rset.getInt(2));
                g.setPortrait_name(rset.getString(3));
                godList.add(g);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            closeDBResources(conn, null, null);
            return godList;
        }

    }

    public Item getItem(int itemId) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        Item item = new Item();
        try {
            conn = getConn();
            //System.out.println("Database connection established");
            String qry =
                    "SELECT "
                    + "item_id, name, health_base, mana_base, "
                    + "speed_base, range_base, attack_sec_base, "
                    + "power_magical_base, power_physical_base, "
                    + "prot_magical_base, prot_physical_base, "
                    + "hp5_base, mp5_base, portrait_name, cost, "
                    + "lifesteal_magical, lifesteal_physical, penetration_magical, "
                    + "penetration_physical, focus, crit_chance, cooldown, passive, "
                    + "max_stacks, bonus_field_1, bonus_modifier_1, "
                    + "bonus_field_2, bonus_modifier_2, "
                    + "bonus_field_3, bonus_modifier_3, "
                    + "passive_bonus_from_1, passive_bonus_to_1, passive_modifier_1, "
                    + "passive_bonus_from_2, passive_bonus_to_2, passive_modifier_2 "
                    + "FROM item WHERE item_id = ? ";

            stmt = conn.prepareStatement(qry);
            stmt.setInt(1, itemId);
            rset = stmt.executeQuery();
            //System.out.println("Query executed");
            while (rset.next()) {
                item.setItem_id(rset.getInt(1));
                item.setName(rset.getString(2));
                item.setHealth_base(rset.getInt(3));
                item.setMana_base(rset.getInt(4));
                item.setSpeed_base(rset.getDouble(5));
                item.setRange_base(rset.getInt(6));
                item.setAttack_sec_base(rset.getDouble(7));
                item.setPower_magical_base(rset.getInt(8));
                item.setPower_physical_base(rset.getInt(9));
                item.setProt_magical_base(rset.getInt(10));
                item.setProt_physical_base(rset.getInt(11));
                item.setHp5_base(rset.getDouble(12));
                item.setMp5_base(rset.getDouble(13));
                item.setPortrait_name(rset.getString(14));
                item.setCost(rset.getInt(15));
                item.setLifesteal_magical(rset.getDouble(16));
                item.setLifesteal_physical(rset.getDouble(17));
                item.setPenetration_magical(rset.getDouble(18));
                item.setPenetration_physical(rset.getDouble(19));
                item.setFocus(rset.getInt(20));
                item.setCrit_chance(rset.getDouble(21));
                item.setCooldown(rset.getDouble(22));
                item.setPassive(rset.getString(23));
                item.setMax_stacks(rset.getInt(24));
                item.setBonus_field_1(rset.getString(25));
                item.setBonus_modifier_1(rset.getDouble(26));
                item.setBonus_field_2(rset.getString(27));
                item.setBonus_modifier_2(rset.getDouble(28));
                item.setBonus_field_3(rset.getString(29));
                item.setBonus_modifier_3(rset.getDouble(30));
                item.setPassive_bonus_from_1(rset.getString(31));
                item.setPassive_bonus_to_1(rset.getString(32));
                item.setPassive_modifier_1(rset.getDouble(33));
                item.setPassive_bonus_from_2(rset.getString(34));
                item.setPassive_bonus_to_2(rset.getString(35));
                item.setPassive_modifier_2(rset.getDouble(36));
                
            }
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            closeDBResources(conn, null, null);
            return item;
        }

    }

    public ArrayList<Item> getItems() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        ArrayList<Item> itemList = new ArrayList<Item>();
        try {
            conn = getConn();
            System.out.println("Database connection established");
            String qry = "SELECT name, item_id, portrait_name, cost FROM item ORDER BY name";
            stmt = conn.prepareStatement(qry);
            rset = stmt.executeQuery();
            System.out.println("Query executed");
            while (rset.next()) {
                Item i = new Item();
                i.setName(rset.getString(1));
                i.setItem_id(rset.getInt(2));
                i.setPortrait_name(rset.getString(3));
                i.setCost(rset.getInt(4));
                itemList.add(i);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            closeDBResources(conn, null, null);
            return itemList;
        }

    }
}
