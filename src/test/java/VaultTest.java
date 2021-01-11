import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import org.junit.Test;

import java.io.IOException;

public class VaultTest {

    @Test
    public void googleCredentialsTest() throws IOException {
        System.out.println("Service Account ID: " + GoogleCredential.getApplicationDefault().getServiceAccountId());
    }
}
