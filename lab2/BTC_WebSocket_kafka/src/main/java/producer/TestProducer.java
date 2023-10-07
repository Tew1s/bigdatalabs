package producer;

import org.json.JSONObject;
import websocket_client.BitstampWebSocketClient;

import java.net.URISyntaxException;

public class TestProducer {
    public static void main(String[] args){
        String serverUri = "wss://ws.bitstamp.net";
        String channelName = "live_orders_btcusd";
        try {
        Producer producer = new Producer(serverUri, channelName);
        producer.connectToWebSocket();
        }catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }

    }
}
