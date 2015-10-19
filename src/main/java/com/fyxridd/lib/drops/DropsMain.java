package com.fyxridd.lib.drops;

import com.fyxridd.lib.core.api.ConfigApi;
import com.fyxridd.lib.drops.api.DropsPlugin;
import org.bukkit.event.Listener;

public class DropsMain implements Listener {
    //缓存
    public static DropsMain instance;
    public static DropsConfig dropsConfig;

	public DropsMain() {
        //初始化
        instance = this;
        initConfig();

        dropsConfig = new DropsConfig();
    }

    private void initConfig() {
        ConfigApi.register(DropsPlugin.file, DropsPlugin.dataPath, DropsPlugin.pn, null);
        ConfigApi.loadConfig(DropsPlugin.pn);
    }
}
