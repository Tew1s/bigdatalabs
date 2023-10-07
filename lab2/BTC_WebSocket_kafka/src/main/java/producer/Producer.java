package producer;

import websocket_client.BitstampWebSocketClient;

import java.net.URISyntaxException;

public class Producer implements DataListener {
    private BitstampWebSocketClient webSocketClient;
    public Producer(String serverUri, String channelName) throws URISyntaxException {
        webSocketClient = new BitstampWebSocketClient(this, serverUri, channelName);
    }
    @Override
    public void onDataReceived(String message) {
        System.out.println("Полученно сообщение внутри Producer");
        System.out.println(message);

    }
    public void connectToWebSocket() {
        webSocketClient.connect();
    }

}
