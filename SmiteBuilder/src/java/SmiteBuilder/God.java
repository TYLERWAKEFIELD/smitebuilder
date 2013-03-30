/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SmiteBuilder;

import java.util.ArrayList;

/**
 *
 * @author bg
 */
public class God {

    private int god_id;
    private String name;
    private String sub_desc;
    private String origin;
    private String tags;
    private int health_base;
    private int health_per;
    private int mana_base;
    private int mana_per;
    private int speed_base;
    private int speed_per;
    private int range_base;
    private int range_per;
    private double attack_sec_base;
    private double attack_sec_per;
    private int power_magical_base;
    private int power_magical_per;
    private int power_physical_base;
    private int power_physical_per;
    private int prot_magical_base;
    private int prot_magical_per;
    private double prot_physical_base;
    private double prot_physical_per;
    private double hp5_base;
    private double hp5_per;
    private double mp5_base;
    private double mp5_per;
    private String portrait_name;
    private String passive_portrait;
    private String passive_name;
    private String passive_desc;
    private String passive_stat;
    private double passive_mod;
    
    
    //instance variables for the build
    private int level = 1; //default 1
    private ArrayList<Item> items = new ArrayList<Item>();
    private int health = 0;
    private int mana = 0;
    private int speed = 0;
    private int range = 0;
    private double attack_sec = 0;
    private int power_magical = 0;
    private int power_physical = 0;
    private int prot_magical = 0;
    private double prot_physical = 0;
    private double hp5 = 0;
    private double mp5 = 0;
    private int lifesteal_magical = 0;
    private int lifesteal_physical = 0;
    private int penetration_magical = 0;
    private int penetration_physical = 0;
    private int focus = 0;
    private int crit_chance = 0;
    private int cooldown = 0;

    /**
     * @return the god_id
     */
    public int getGod_id() {
        return god_id;
    }

    /**
     * @param god_id the god_id to set
     */
    public void setGod_id(int god_id) {
        this.god_id = god_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health_base
     */
    public int getHealth_base() {
        return health_base;
    }

    /**
     * @param health_base the health_base to set
     */
    public void setHealth_base(int health_base) {
        this.health_base = health_base;
    }

    /**
     * @return the health_per
     */
    public int getHealth_per() {
        return health_per;
    }

    /**
     * @param health_per the health_per to set
     */
    public void setHealth_per(int health_per) {
        this.health_per = health_per;
    }

    /**
     * @return the mana_base
     */
    public int getMana_base() {
        return mana_base;
    }

    /**
     * @param mana_base the mana_base to set
     */
    public void setMana_base(int mana_base) {
        this.mana_base = mana_base;
    }

    /**
     * @return the mana_per
     */
    public int getMana_per() {
        return mana_per;
    }

    /**
     * @param mana_per the mana_per to set
     */
    public void setMana_per(int mana_per) {
        this.mana_per = mana_per;
    }

    /**
     * @return the speed_base
     */
    public int getSpeed_base() {
        return speed_base;
    }

    /**
     * @param speed_base the speed_base to set
     */
    public void setSpeed_base(int speed_base) {
        this.speed_base = speed_base;
    }

    /**
     * @return the speed_per
     */
    public int getSpeed_per() {
        return speed_per;
    }

    /**
     * @param speed_per the speed_per to set
     */
    public void setSpeed_per(int speed_per) {
        this.speed_per = speed_per;
    }

    /**
     * @return the range_base
     */
    public int getRange_base() {
        return range_base;
    }

    /**
     * @param range_base the range_base to set
     */
    public void setRange_base(int range_base) {
        this.range_base = range_base;
    }

    /**
     * @return the range_per
     */
    public int getRange_per() {
        return range_per;
    }

    /**
     * @param range_per the range_per to set
     */
    public void setRange_per(int range_per) {
        this.range_per = range_per;
    }

    /**
     * @return the attack_sec_base
     */
    public double getAttack_sec_base() {
        return attack_sec_base;
    }

    /**
     * @param attack_sec_base the attack_sec_base to set
     */
    public void setAttack_sec_base(double attack_sec_base) {
        this.attack_sec_base = attack_sec_base;
    }

    /**
     * @return the attack_sec_per
     */
    public double getAttack_sec_per() {
        return attack_sec_per;
    }

    /**
     * @param attack_sec_per the attack_sec_per to set
     */
    public void setAttack_sec_per(double attack_sec_per) {
        this.attack_sec_per = attack_sec_per;
    }

    /**
     * @return the power_magical_base
     */
    public int getPower_magical_base() {
        return power_magical_base;
    }

    /**
     * @param power_magical_base the power_magical_base to set
     */
    public void setPower_magical_base(int power_magical_base) {
        this.power_magical_base = power_magical_base;
    }

    /**
     * @return the power_magical_per
     */
    public int getPower_magical_per() {
        return power_magical_per;
    }

    /**
     * @param power_magical_per the power_magical_per to set
     */
    public void setPower_magical_per(int power_magical_per) {
        this.power_magical_per = power_magical_per;
    }

    /**
     * @return the power_physical_base
     */
    public int getPower_physical_base() {
        return power_physical_base;
    }

    /**
     * @param power_physical_base the power_physical_base to set
     */
    public void setPower_physical_base(int power_physical_base) {
        this.power_physical_base = power_physical_base;
    }

    /**
     * @return the power_physical_per
     */
    public int getPower_physical_per() {
        return power_physical_per;
    }

    /**
     * @param power_physical_per the power_physical_per to set
     */
    public void setPower_physical_per(int power_physical_per) {
        this.power_physical_per = power_physical_per;
    }

    /**
     * @return the prot_magical_base
     */
    public int getProt_magical_base() {
        return prot_magical_base;
    }

    /**
     * @param prot_magical_base the prot_magical_base to set
     */
    public void setProt_magical_base(int prot_magical_base) {
        this.prot_magical_base = prot_magical_base;
    }

    /**
     * @return the prot_magical_per
     */
    public int getProt_magical_per() {
        return prot_magical_per;
    }

    /**
     * @param prot_magical_per the prot_magical_per to set
     */
    public void setProt_magical_per(int prot_magical_per) {
        this.prot_magical_per = prot_magical_per;
    }

    /**
     * @return the prot_physical_base
     */
    public double getProt_physical_base() {
        return prot_physical_base;
    }

    /**
     * @param prot_physical_base the prot_physical_base to set
     */
    public void setProt_physical_base(double prot_physical_base) {
        this.prot_physical_base = prot_physical_base;
    }

    /**
     * @return the prot_physical_per
     */
    public double getProt_physical_per() {
        return prot_physical_per;
    }

    /**
     * @param prot_physical_per the prot_physical_per to set
     */
    public void setProt_physical_per(double prot_physical_per) {
        this.prot_physical_per = prot_physical_per;
    }

    /**
     * @return the hp5_base
     */
    public double getHp5_base() {
        return hp5_base;
    }

    /**
     * @param hp5_base the hp5_base to set
     */
    public void setHp5_base(double hp5_base) {
        this.hp5_base = hp5_base;
    }

    /**
     * @return the hp5_per
     */
    public double getHp5_per() {
        return hp5_per;
    }

    /**
     * @param hp5_per the hp5_per to set
     */
    public void setHp5_per(double hp5_per) {
        this.hp5_per = hp5_per;
    }

    /**
     * @return the mp5_base
     */
    public double getMp5_base() {
        return mp5_base;
    }

    /**
     * @param mp5_base the mp5_base to set
     */
    public void setMp5_base(double mp5_base) {
        this.mp5_base = mp5_base;
    }

    /**
     * @return the mp5_per
     */
    public double getMp5_per() {
        return mp5_per;
    }

    /**
     * @param mp5_per the mp5_per to set
     */
    public void setMp5_per(double mp5_per) {
        this.mp5_per = mp5_per;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
        health = health_base + (level - 1) * health_per;
        mana = mana_base + (level - 1) * mana_per;
        speed = speed_base + (level - 1) * speed_per;
        range = range_base + (level - 1) * range_per;
        attack_sec = attack_sec_base + (level - 1) * attack_sec_per;
        power_magical = power_magical_base + (level - 1) * power_magical_per;
        power_physical = power_physical_base + (level - 1) * power_physical_per;
        prot_magical = prot_magical_base + (level - 1) * prot_magical_per;
        prot_physical = prot_physical_base + (level - 1) * prot_physical_per;
        hp5 = hp5_base + (level - 1) * hp5_per;
        mp5 = mp5_base + (level - 1) * mp5_per;
    }

    /**
     * @return the items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public boolean addItem(Item i) {
        if (this.items.size() < 6) {
            items.add(i);
            health += i.getHealth_base();
            mana += i.getMana_base();
            speed += i.getSpeed_base();
            range += i.getRange_base();
            attack_sec += i.getAttack_sec_base();
            power_magical += i.getPower_magical_base();
            power_physical += i.getPower_physical_base();
            prot_magical += i.getProt_magical_base();
            prot_physical += i.getProt_physical_base();
            hp5 += i.getHp5_base();
            mp5 += i.getMp5_base();


            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the range
     */
    public int getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(int range) {
        this.range = range;
    }

    /**
     * @return the attack_sec
     */
    public double getAttack_sec() {
        return attack_sec;
    }

    /**
     * @param attack_sec the attack_sec to set
     */
    public void setAttack_sec(double attack_sec) {
        this.attack_sec = attack_sec;
    }

    /**
     * @return the power_magical
     */
    public int getPower_magical() {
        return power_magical;
    }

    /**
     * @param power_magical the power_magical to set
     */
    public void setPower_magical(int power_magical) {
        this.power_magical = power_magical;
    }

    /**
     * @return the power_physical
     */
    public int getPower_physical() {
        return power_physical;
    }

    /**
     * @param power_physical the power_physical to set
     */
    public void setPower_physical(int power_physical) {
        this.power_physical = power_physical;
    }

    /**
     * @return the prot_magical
     */
    public int getProt_magical() {
        return prot_magical;
    }

    /**
     * @param prot_magical the prot_magical to set
     */
    public void setProt_magical(int prot_magical) {
        this.prot_magical = prot_magical;
    }

    /**
     * @return the prot_physical
     */
    public double getProt_physical() {
        return prot_physical;
    }

    /**
     * @param prot_physical the prot_physical to set
     */
    public void setProt_physical(double prot_physical) {
        this.prot_physical = prot_physical;
    }

    /**
     * @return the hp5
     */
    public double getHp5() {
        return hp5;
    }

    /**
     * @param hp5 the hp5 to set
     */
    public void setHp5(double hp5) {
        this.hp5 = hp5;
    }

    /**
     * @return the mp5
     */
    public double getMp5() {
        return mp5;
    }

    /**
     * @param mp5 the mp5 to set
     */
    public void setMp5(double mp5) {
        this.mp5 = mp5;
    }

    /**
     * @return the portrait_name
     */
    public String getPortrait_name() {
        return portrait_name;
    }

    /**
     * @param portrait_name the portrait_name to set
     */
    public void setPortrait_name(String portrait_name) {
        this.portrait_name = portrait_name;
    }

    /**
     * @return the lifesteal_magical
     */
    public int getLifesteal_magical() {
        return lifesteal_magical;
    }

    /**
     * @param lifesteal_magical the lifesteal_magical to set
     */
    public void setLifesteal_magical(int lifesteal_magical) {
        this.lifesteal_magical = lifesteal_magical;
    }

    /**
     * @return the lifesteal_physical
     */
    public int getLifesteal_physical() {
        return lifesteal_physical;
    }

    /**
     * @param lifesteal_physical the lifesteal_physical to set
     */
    public void setLifesteal_physical(int lifesteal_physical) {
        this.lifesteal_physical = lifesteal_physical;
    }

    /**
     * @return the penetration_magical
     */
    public int getPenetration_magical() {
        return penetration_magical;
    }

    /**
     * @param penetration_magical the penetration_magical to set
     */
    public void setPenetration_magical(int penetration_magical) {
        this.penetration_magical = penetration_magical;
    }

    /**
     * @return the penetration_physical
     */
    public int getPenetration_physical() {
        return penetration_physical;
    }

    /**
     * @param penetration_physical the penetration_physical to set
     */
    public void setPenetration_physical(int penetration_physical) {
        this.penetration_physical = penetration_physical;
    }

    /**
     * @return the focus
     */
    public int getFocus() {
        return focus;
    }

    /**
     * @param focus the focus to set
     */
    public void setFocus(int focus) {
        this.focus = focus;
    }

    /**
     * @return the crit_chance
     */
    public int getCrit_chance() {
        return crit_chance;
    }

    /**
     * @param crit_chance the crit_chance to set
     */
    public void setCrit_chance(int crit_chance) {
        this.crit_chance = crit_chance;
    }

    /**
     * @return the cooldown
     */
    public int getCooldown() {
        return cooldown;
    }

    /**
     * @param cooldown the cooldown to set
     */
    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * @return the sub_desc
     */
    public String getSub_desc() {
        return sub_desc;
    }

    /**
     * @param sub_desc the sub_desc to set
     */
    public void setSub_desc(String sub_desc) {
        this.sub_desc = sub_desc;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return the passive_portrait
     */
    public String getPassive_portrait() {
        return passive_portrait;
    }

    /**
     * @param passive_portrait the passive_portrait to set
     */
    public void setPassive_portrait(String passive_portrait) {
        this.passive_portrait = passive_portrait;
    }

    /**
     * @return the passive_name
     */
    public String getPassive_name() {
        return passive_name;
    }

    /**
     * @param passive_name the passive_name to set
     */
    public void setPassive_name(String passive_name) {
        this.passive_name = passive_name;
    }

    /**
     * @return the passive_desc
     */
    public String getPassive_desc() {
        return passive_desc;
    }

    /**
     * @param passive_desc the passive_desc to set
     */
    public void setPassive_desc(String passive_desc) {
        this.passive_desc = passive_desc;
    }

    /**
     * @return the passive_stat
     */
    public String getPassive_stat() {
        return passive_stat;
    }

    /**
     * @param passive_stat the passive_stat to set
     */
    public void setPassive_stat(String passive_stat) {
        this.passive_stat = passive_stat;
    }

    /**
     * @return the passive_mod
     */
    public double getPassive_mod() {
        return passive_mod;
    }

    /**
     * @param passive_mod the passive_mod to set
     */
    public void setPassive_mod(double passive_mod) {
        this.passive_mod = passive_mod;
    }
}
