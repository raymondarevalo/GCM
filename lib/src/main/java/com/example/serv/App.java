package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyATznJrca6YUXrtAIlcLvXQ9hf6S0jMgHI";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bHzb0iK2i-bsxF3hTTL3osvkD9AWr8lTVc3LqLWpGNwSq2e12WzuZFZ40mlyKkBjxI4nCUKIb3cVrpoX78hHOr4a_EmeNoIneJaQ8EagiOUF11yJT-vGJ4hGJS9aExs18-2aiSK");

        c.createData("Working!!", "Test message");

        return c;
    }
}

