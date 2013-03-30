/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SmiteBuilder;

/**
 *
 * @author bg
 */
public class Item {

    private int item_id;
    private String name;
    private int health_base;
    private int mana_base;
    private double speed_base;
    private int range_base;
    private double attack_sec_base;
    private int power_magical_base;
    private int power_physical_base;
    private int prot_magical_base;
    private int prot_physical_base;
    private double hp5_base;
    private double mp5_base;
    private String portrait_name;
    private int cost;
    private double lifesteal_magical = 0;
    private double lifesteal_physical = 0;
    private double penetration_magical = 0;
    private double penetration_physical = 0;
    private int focus = 0;
    private double crit_chance = 0;
    private double cooldown = 0;
    private String passive = "";
    private int max_stacks = 0;
    private String bonus_field_1;
    private double bonus_modifier_1;
    private String bonus_field_2;
    private double bonus_modifier_2;
    private String bonus_field_3;
    private double bonus_modifier_3;
    private String passive_bonus_from_1;
    private String passive_bonus_to_1;
    private double passive_modifier_1;
    private String passive_bonus_from_2;
    private String passive_bonus_to_2;
    private double passive_modifier_2;

    /**
     * @return the item_id
     */
    public int getItem_id() {
        return item_id;
    }

    /**
     * @param item_id the item_id to set
     */
    public void setItem_id(int item_id) {
        this.item_id = item_id;
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
     * @return the speed_base
     */
    public double getSpeed_base() {
        return speed_base;
    }

    /**
     * @param speed_base the speed_base to set
     */
    public void setSpeed_base(double speed_base) {
        this.speed_base = speed_base;
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
     * @return the prot_physical_base
     */
    public int getProt_physical_base() {
        return prot_physical_base;
    }

    /**
     * @param prot_physical_base the prot_physical_base to set
     */
    public void setProt_physical_base(int prot_physical_base) {
        this.prot_physical_base = prot_physical_base;
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
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the lifesteal_magical
     */
    public double getLifesteal_magical() {
        return lifesteal_magical;
    }

    /**
     * @param lifesteal_magical the lifesteal_magical to set
     */
    public void setLifesteal_magical(double lifesteal_magical) {
        this.lifesteal_magical = lifesteal_magical;
    }

    /**
     * @return the lifesteal_physical
     */
    public double getLifesteal_physical() {
        return lifesteal_physical;
    }

    /**
     * @param lifesteal_physical the lifesteal_physical to set
     */
    public void setLifesteal_physical(double lifesteal_physical) {
        this.lifesteal_physical = lifesteal_physical;
    }

    /**
     * @return the penetration_magical
     */
    public double getPenetration_magical() {
        return penetration_magical;
    }

    /**
     * @param penetration_magical the penetration_magical to set
     */
    public void setPenetration_magical(double penetration_magical) {
        this.penetration_magical = penetration_magical;
    }

    /**
     * @return the penetration_physical
     */
    public double getPenetration_physical() {
        return penetration_physical;
    }

    /**
     * @param penetration_physical the penetration_physical to set
     */
    public void setPenetration_physical(double penetration_physical) {
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
    public double getCrit_chance() {
        return crit_chance;
    }

    /**
     * @param crit_chance the crit_chance to set
     */
    public void setCrit_chance(double crit_chance) {
        this.crit_chance = crit_chance;
    }

    /**
     * @return the cooldown
     */
    public double getCooldown() {
        return cooldown;
    }

    /**
     * @param cooldown the cooldown to set
     */
    public void setCooldown(double cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * @return the passive
     */
    public String getPassive() {
        return passive;
    }

    /**
     * @param passive the passive to set
     */
    public void setPassive(String passive) {
        this.passive = passive;
    }

    /**
     * @return the max_stacks
     */
    public int getMax_stacks() {
        return max_stacks;
    }

    /**
     * @param max_stacks the max_stacks to set
     */
    public void setMax_stacks(int max_stacks) {
        this.max_stacks = max_stacks;
    }

    /**
     * @return the bonus_field_1
     */
    public String getBonus_field_1() {
        return bonus_field_1;
    }

    /**
     * @param bonus_field_1 the bonus_field_1 to set
     */
    public void setBonus_field_1(String bonus_field_1) {
        this.bonus_field_1 = bonus_field_1;
    }

    /**
     * @return the bonus_modifier_1
     */
    public double getBonus_modifier_1() {
        return bonus_modifier_1;
    }

    /**
     * @param bonus_modifier_1 the bonus_modifier_1 to set
     */
    public void setBonus_modifier_1(double bonus_modifier_1) {
        this.bonus_modifier_1 = bonus_modifier_1;
    }

    /**
     * @return the bonus_field_2
     */
    public String getBonus_field_2() {
        return bonus_field_2;
    }

    /**
     * @param bonus_field_2 the bonus_field_2 to set
     */
    public void setBonus_field_2(String bonus_field_2) {
        this.bonus_field_2 = bonus_field_2;
    }

    /**
     * @return the bonus_modifier_2
     */
    public double getBonus_modifier_2() {
        return bonus_modifier_2;
    }

    /**
     * @param bonus_modifier_2 the bonus_modifier_2 to set
     */
    public void setBonus_modifier_2(double bonus_modifier_2) {
        this.bonus_modifier_2 = bonus_modifier_2;
    }

    /**
     * @return the bonus_field_3
     */
    public String getBonus_field_3() {
        return bonus_field_3;
    }

    /**
     * @param bonus_field_3 the bonus_field_3 to set
     */
    public void setBonus_field_3(String bonus_field_3) {
        this.bonus_field_3 = bonus_field_3;
    }

    /**
     * @return the bonus_modifier_3
     */
    public double getBonus_modifier_3() {
        return bonus_modifier_3;
    }

    /**
     * @param bonus_modifier_3 the bonus_modifier_3 to set
     */
    public void setBonus_modifier_3(double bonus_modifier_3) {
        this.bonus_modifier_3 = bonus_modifier_3;
    }

    /**
     * @return the passive_bonus_from_1
     */
    public String getPassive_bonus_from_1() {
        return passive_bonus_from_1;
    }

    /**
     * @param passive_bonus_from_1 the passive_bonus_from_1 to set
     */
    public void setPassive_bonus_from_1(String passive_bonus_from_1) {
        this.passive_bonus_from_1 = passive_bonus_from_1;
    }

    /**
     * @return the passive_bonus_to_1
     */
    public String getPassive_bonus_to_1() {
        return passive_bonus_to_1;
    }

    /**
     * @param passive_bonus_to_1 the passive_bonus_to_1 to set
     */
    public void setPassive_bonus_to_1(String passive_bonus_to_1) {
        this.passive_bonus_to_1 = passive_bonus_to_1;
    }

    /**
     * @return the passive_modifier_1
     */
    public double getPassive_modifier_1() {
        return passive_modifier_1;
    }

    /**
     * @param passive_modifier_1 the passive_modifier_1 to set
     */
    public void setPassive_modifier_1(double passive_modifier_1) {
        this.passive_modifier_1 = passive_modifier_1;
    }

    /**
     * @return the passive_bonus_from_2
     */
    public String getPassive_bonus_from_2() {
        return passive_bonus_from_2;
    }

    /**
     * @param passive_bonus_from_2 the passive_bonus_from_2 to set
     */
    public void setPassive_bonus_from_2(String passive_bonus_from_2) {
        this.passive_bonus_from_2 = passive_bonus_from_2;
    }

    /**
     * @return the passive_bonus_to_2
     */
    public String getPassive_bonus_to_2() {
        return passive_bonus_to_2;
    }

    /**
     * @param passive_bonus_to_2 the passive_bonus_to_2 to set
     */
    public void setPassive_bonus_to_2(String passive_bonus_to_2) {
        this.passive_bonus_to_2 = passive_bonus_to_2;
    }

    /**
     * @return the passive_modifier_2
     */
    public double getPassive_modifier_2() {
        return passive_modifier_2;
    }

    /**
     * @param passive_modifier_2 the passive_modifier_2 to set
     */
    public void setPassive_modifier_2(double passive_modifier_2) {
        this.passive_modifier_2 = passive_modifier_2;
    }
}
