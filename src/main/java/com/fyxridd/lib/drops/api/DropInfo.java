package com.fyxridd.lib.drops.api;

import com.fyxridd.lib.core.api.inter.FancyMessage;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class DropInfo {
    //money
    private int money;

    //exp
    private boolean expInstant;
    private int exp;

    //item
    private List<ItemStack> item;//可为null

    //entity
    private EntityType entityType;//可为null
    private String strength;//可为null
    private int entityAmount;

    //tip
    private FancyMessage tip;//可为null
    private boolean tipRange;

    public DropInfo(int money, boolean expInstant, int exp, List<ItemStack> item, EntityType entityType, String strength, int entityAmount, FancyMessage tip, boolean tipRange) {
        this.money = money;
        this.expInstant = expInstant;
        this.exp = exp;
        this.item = item;
        this.entityType = entityType;
        this.strength = strength;
        this.entityAmount = entityAmount;
        this.tip = tip;
        this.tipRange = tipRange;
    }

    public int getMoney() {
        return money;
    }

    public boolean isExpInstant() {
        return expInstant;
    }

    public int getExp() {
        return exp;
    }

    public List<ItemStack> getItem() {
        return item;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public String getStrength() {
        return strength;
    }

    public int getEntityAmount() {
        return entityAmount;
    }

    public FancyMessage getTip() {
        return tip;
    }

    public boolean isTipRange() {
        return tipRange;
    }
}
