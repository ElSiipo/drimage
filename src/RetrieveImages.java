/**
 * Created by chrille on 2016-05-03.
 */
public class RetrieveImages {

    // Try to implement test.
    // Also, implement:
    // * regexp
    // * socket (http receive)
    public void GetInputAddress(String address) {
        if(!address.startsWith("http://") || !address.startsWith("https://")) {
            address = "http://" + address;
        }

    }
}
