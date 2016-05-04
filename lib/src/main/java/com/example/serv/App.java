package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBAGpbsMNUA1vszSiGX_5ITLnrP6AO1b1k";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bFzcis819ztt7JtEHewGrmN-8l5e_eEi1u8nXPZBtF9MBTs9Gi1KRYOcxvDFO_sq4XwzySZzYYphEgRm2ID-YdLAiwfHOwBw50KvOawPitkX3FFQ-GSclQJCXPbm5wG-xz9PVgc");

        c.createData("Working!!", "Test message");

        return c;
    }
}

