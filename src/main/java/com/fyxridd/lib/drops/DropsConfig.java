package com.fyxridd.lib.drops;

import com.fyxridd.lib.core.api.ConfigApi;
import com.fyxridd.lib.core.api.event.ReloadConfigEvent;
import com.fyxridd.lib.drops.api.DropsPlugin;
import com.fyxridd.lib.items.api.ItemsApi;
import com.fyxridd.lib.types.api.TypesApi;
import org.bukkit.Bukkit;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import java.io.File;

public class DropsConfig implements Listener {
    //配置

    public DropsConfig() {
        //读取配置
        loadConfig();
        //注册事件
        Bukkit.getPluginManager().registerEvents(this, DropsPlugin.instance);
    }

    @EventHandler(priority= EventPriority.LOW)
    public void onReloadConfig(ReloadConfigEvent e) {
        if (e.getPlugin().equals(DropsPlugin.pn)) loadConfig();
    }

    private void loadConfig() {
        YamlConfiguration config = ConfigApi.getConfig(DropsPlugin.pn);

        //重新读取类型
        TypesApi.reloadTypes(DropsPlugin.pn, new File(DropsPlugin.dataPath, "types.yml"));
        //重新读取物品
        ItemsApi.reloadItems(DropsPlugin.pn, (MemorySection) config.get("items"));
    }
}
