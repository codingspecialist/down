package down.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class 지구인 {
}

class 아시아인 extends 지구인 {
}

class 한국인 extends 아시아인 {
    public void 안녕() {
    }
}

public class Fetch {

    public static String get(String path) {
        String download = "";
        // 통신(http), 파싱(gson), 파일접근 -> I/O
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            while (true) {
                String data = br.readLine();
                if (data == null) {
                    break;
                } else {
                    download = download + data;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return download;
    }
}
