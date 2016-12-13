import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import java.io.*;
import java.net.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by USER on 2016-12-14.
 */
public class BOJ7287 {
    public static void main(String args[]) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        /*
        URL website = new URL("http://www.acmicpc.net");
        URLConnection connection = website.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();


        System.out.println(response.toString());
        */
        String myId = "jyj3312";
        URL url = new URL("https://www.acmicpc.net/user/" + myId);
        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        connection.setHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession sslSession) {
                return true;
            }
        });

        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, null, null);
        connection.setSSLSocketFactory(context.getSocketFactory());

        connection.connect();
        connection.setInstanceFollowRedirects(true);

        InputStream in = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();

        String target = "<th>푼 문제</th>\t\t\t\t\t\t\t\t\t\t<td><a href='/status/?user_id=" + myId + "&amp;result_id=4'>";
        int targetIndex = response.indexOf(target);
        targetIndex = targetIndex + target.length();
        System.out.println(response.substring(targetIndex, targetIndex + 2));
        System.out.println(myId);
    }
}
