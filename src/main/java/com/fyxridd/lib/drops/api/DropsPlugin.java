package com.fyxridd.lib.drops.api;

import com.fyxridd.lib.core.api.ConfigApi;
import com.fyxridd.lib.core.api.CoreApi;
import com.fyxridd.lib.core.api.FormatApi;
import com.fyxridd.lib.drops.DropsMain;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class DropsPlugin extends JavaPlugin{
    public static boolean strengthHook;
    public static DropsPlugin instance;
    public static File file;
    public static String pn;
    public static String dataPath;
    public static String ver;

    @Override
    public void onLoad() {
        try {
            Class.forName("com.fyxridd.strength.api.StrengthApi");
            strengthHook = true;
        } catch (ClassNotFoundException e) {
            strengthHook = false;
        }
        instance = this;
        file = getFile();
        pn = getName();
        dataPath = getDataFolder().getAbsolutePath();
        ver = CoreApi.getPluginVersion(file);

        //生成文件
        ConfigApi.generateFiles(file, pn);
    }

    @Override
    public void onEnable() {
        new DropsMain();

        //成功启动
        CoreApi.sendConsoleMessage(FormatApi.get(pn, 1, pn, ver).getText());
    }

    @Override
    public void onDisable() {
        //显示插件成功停止信息
        CoreApi.sendConsoleMessage(FormatApi.get(pn, 2, pn, ver).getText());
    }
}
