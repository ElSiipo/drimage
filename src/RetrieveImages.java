
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chrille on 2016-05-03.
 */
public class RetrieveImages {

    // Try to implement test.
    // Also, implement:
    // * regexp
    public HttpURLConnection createConnection(String address) {
        //HttpURLConnection conn;
        //List<String> listOfUrls;

        if (!address.startsWith("http://") || !address.startsWith("https://")) {
            address = "http://" + address;
        }

        try {
            URL url = new URL(address);
            URLConnection urlConn = url.openConnection();

            if (urlConn instanceof HttpURLConnection) {
                return (HttpURLConnection) urlConn;

                //listOfUrls = readFromConnection(conn);
                //extractImageUrls(listOfUrls);

            } else if (urlConn instanceof HttpsURLConnection) {
                return (HttpsURLConnection) urlConn;
            }

            else {
                return null;
                // Not HttpURLConnection!
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CHANGE THIS TO SOMETHING USEFUL!
        // Perhaps an exception?
        //return conn;

        return null;
    }

    public List<String> readFromConnection(HttpURLConnection conn) {
        List<String> tempList = new LinkedList<>();
        String line;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            while ((line = br.readLine()) != null) {
                tempList .add(line);
            }

            return tempList;

            // Time to kick ass and chew bubble gum.
            // And also extract some image URLs.
            // <-- NOT IMPLEMENTED YET --> //

            //imageUrls = extractImageUrls(listOfLines);


            // Either return the image urls to UI,
            // or run a loop/method to retrieve the images.
            // Have not decided yet.

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Handle null with exception instead of returning null value.
        return null;
    }

    public void extractImageUrls(List<String> listOfLines) {

    }
}
