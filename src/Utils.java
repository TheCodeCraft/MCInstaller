package me.reddev;

public class Utils {

    public static void install() {
        FileUtils.createFolder(Values.getClientFolder());
        HttpUtils.downloadFile(Values.getServerJarPath(), Values.getClientJarPath(), "Jar");
        if(!Values.isError()) {
            HttpUtils.downloadFile(Values.getServerJsonPath(), Values.getClientJsonPath(), "Json");
            new GUIDone();
        }
    }

}
