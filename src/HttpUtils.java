package me.reddev;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

    public static void downloadFile(String link, String out, String name) {
        try {
            GUI.getStatus().setText("Downloading " + name);
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            int fileSize = http.getContentLength();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            FileOutputStream fileOutputStream = new FileOutputStream(out);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);
            byte[] buffer = new byte[1024];
            int downloaded = 0;
            int read = 0;
            int percentDownload = 0;
            while ((read = in.read(buffer, 0, 1024)) >= 0) {
                bufferedOutputStream.write(buffer, 0, read);
                downloaded += read;
                percentDownload = (downloaded * 100) / fileSize;
                GUI.getProgressBar().setValue(percentDownload);
            }
            bufferedOutputStream.close();
            in.close();
            GUI.getStatus().setText("Downloaded " + name);
        } catch (Exception e) {
            GUI.getStatus().setText(e.getMessage());
            e.printStackTrace();
        }
    }

}
