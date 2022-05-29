package me.reddev;

public class Values {

    private static String clientFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\versions\\GirapClient";

    private static String serverJarPath = "GirapClientURLJar";
    private static String serverJsonPath = "GirapClientURLJar";

    private static String clientJarPath = clientFolder + "\\GirapClient.jar";
    private static String clientJsonPath = clientFolder + "\\GirapClient.json";

    private static int windowHeight = 160;
    private static int windowWidth = 270;

    private static boolean error;

    public static String getClientFolder() {
        return clientFolder;
    }

    public static String getServerJarPath() {
        return serverJarPath;
    }

    public static String getServerJsonPath() {
        return serverJsonPath;
    }

    public static String getClientJarPath() {
        return clientJarPath;
    }

    public static String getClientJsonPath() {
        return clientJsonPath;
    }

    public static int getWindowHeight() {
        return windowHeight;
    }

    public static int getWindowWidth() {
        return windowWidth;
    }

    public static boolean isError() {
        return error;
    }

    public static void setError(boolean error) {
        Values.error = error;
    }
}
