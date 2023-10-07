package consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer consumer = new Consumer(3);
        BitCoinTransaction trade1 = new BitCoinTransaction("{ \"data\":{ \"id\":1, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":10.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade2 = new BitCoinTransaction("{ \"data\":{ \"id\":2, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":20.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade3 = new BitCoinTransaction("{ \"data\":{ \"id\":3, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":100.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade4 = new BitCoinTransaction("{ \"data\":{ \"id\":4, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":40.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade5 = new BitCoinTransaction("{ \"data\":{ \"id\":5, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":30.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade6 = new BitCoinTransaction("{ \"data\":{ \"id\":6, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":20.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        BitCoinTransaction trade7 = new BitCoinTransaction("{ \"data\":{ \"id\":7, \"id_str\":\"1297851689496576\", \"order_type\":1, \"datetime\":\"1605693298\", \"microtimestamp\":\"1605693298239000\", \"amount\":0.014, \"amount_str\":\"0.01400000\", \"price\":50.1, \"price_str\":\"18058.68\" }, \"channel\":\"live_orders_btcusd\", \"event\":\"order_deleted\" }");
        consumer.addTrade(trade1);
        consumer.addTrade(trade2);
        consumer.addTrade(trade3);
        consumer.addTrade(trade4);
        consumer.addTrade(trade5);
        consumer.addTrade(trade6);
        consumer.addTrade(trade7);
    }
}
