package com.fyxridd.lib.drops;

import com.fyxridd.lib.core.api.hashList.ChanceHashList;
import com.fyxridd.lib.core.api.inter.FancyMessage;

/**
 * 掉落信息
 */
public class Info {
    private int moneyMin, moneyMax;

    private boolean expInstant;
    private int expMin, expMax;

    private String itemType;
    private String itemEnchants;

    private ChanceHashList<EntityInfo> entity;

    private FancyMessage tipMsg;
    private boolean tipRange;

    public Info(int moneyMin, int moneyMax, boolean expInstant, int expMin, int expMax, String itemType, String itemEnchants, ChanceHashList<EntityInfo> entity, FancyMessage tipMsg, boolean tipRange) {
        this.moneyMin = moneyMin;
        this.moneyMax = moneyMax;
        this.expInstant = expInstant;
        this.expMin = expMin;
        this.expMax = expMax;
        this.itemType = itemType;
        this.itemEnchants = itemEnchants;
        this.entity = entity;
        this.tipMsg = tipMsg;
        this.tipRange = tipRange;
    }

    public int getMoneyMin() {
        return moneyMin;
    }

    public int getMoneyMax() {
        return moneyMax;
    }

    public boolean isExpInstant() {
        return expInstant;
    }

    public int getExpMin() {
        return expMin;
    }

    public int getExpMax() {
        return expMax;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemEnchants() {
        return itemEnchants;
    }

    public ChanceHashList<EntityInfo> getEntity() {
        return entity;
    }

    public FancyMessage getTipMsg() {
        return tipMsg;
    }

    public boolean isTipRange() {
        return tipRange;
    }
}
