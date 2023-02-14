import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.dell.com";

        for (int i = 0; i < 1000; i++) {
            try {
                URL urlObj = new URL(url);
                HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
                int statusCode = conn.getResponseCode();
                System.out.println(statusCode);
                conn.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
