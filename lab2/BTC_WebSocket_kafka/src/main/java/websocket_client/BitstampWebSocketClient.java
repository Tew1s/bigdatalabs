    package websocket_client;
    import org.java_websocket.client.WebSocketClient;
    import org.java_websocket.handshake.ServerHandshake;
    import java.net.URI;
    import java.net.URISyntaxException;

    import org.json.JSONObject;
    import producer.DataListener;

    public class BitstampWebSocketClient extends WebSocketClient {
        private String channelName;
        private DataListener dataListener;
        public BitstampWebSocketClient(DataListener dataListener, String serverUri, String channelName) throws URISyntaxException {
            super(new URI(serverUri));
            this.channelName = channelName;
            this.dataListener = dataListener;
        }
        @Override
        public void onOpen(ServerHandshake serverHandshake) {
            subscribeToChannel(channelName);
            System.out.println("Соединение установлено.");
        }
        @Override
        public void onMessage(String message) {
            //System.out.println("Получено сообщение: ");
            //System.out.println(new JSONObject(message).toString(12));
            //System.out.println(message);
            dataListener.onDataReceived(message);
        }
        @Override
        public void onClose(int code, String reason, boolean remote){
            System.out.println("Соединение закрыто.");
        }
        @Override
        public void onError(Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
        public void heartbeat(){
            JSONObject heartBeatMessage = new JSONObject();
            heartBeatMessage.put("event", "bts:".concat("heartbeat"));
            send(heartBeatMessage.toString());
        }

        static JSONObject madeJsonEvent(String event,String channelName) {
            JSONObject eventMessage = new JSONObject();
            eventMessage.put("event", "bts:".concat(event));
            JSONObject data = new JSONObject();
            data.put("channel", channelName);
            eventMessage.put("data", data);
            return eventMessage;
        }


        private void subscribeToChannel(String channelName) {
            JSONObject subscribeMessage = madeJsonEvent("subscribe" ,channelName);
            send(subscribeMessage.toString());
        }
        private void unsubscribeToChannel(String channelName) {
            JSONObject unsubscribeMessage = madeJsonEvent("unsubscribe" ,channelName);
            send(unsubscribeMessage.toString());
        }
    }
