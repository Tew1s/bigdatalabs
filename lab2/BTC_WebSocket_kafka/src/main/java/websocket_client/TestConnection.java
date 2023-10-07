package websocket_client;

import org.apache.kafka.common.protocol.types.Field;
import org.json.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONObject;

public class TestConnection{
    public static void main(String[] args) throws URISyntaxException {
        String serverUri = "wss://ws.bitstamp.net";

        JSONObject test = BitstampWebSocketClient.madeJsonEvent("subscribe", "blabla");
        System.out.println(test.toString(4));
        BitstampWebSocketClient testConnection = new BitstampWebSocketClient((String message)->{
            System.out.println("Полученно сообщение Bitstamp");
            System.out.println(message);
        },serverUri, "live_orders_btcusd");
        testConnection.connect();
    }
}
