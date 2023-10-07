package consumer;

import org.json.JSONObject;

import java.util.Objects;

public class BitCoinTransaction implements Comparable<BitCoinTransaction> {
    BitCoinTransaction(String message){
        jsom = new JSONObject(message);
        parseData(jsom);
    }
    private void parseData(JSONObject impJson){
        //Parse data field
        JSONObject dataObject = impJson.getJSONObject("data");
        id = dataObject.getLong("id");
        id_str = dataObject.getString("id_str");
        order_type = dataObject.getInt("order_type");
        datetime = dataObject.getString("datetime");
        microtimestamp = dataObject.getString("microtimestamp");
        amount = dataObject.getDouble("amount");
        amountStr = dataObject.getString("amount_str");
        price = dataObject.getDouble("price");
        priceStr = dataObject.getString("price_str");

        //parse other field
        channel = impJson.getString("channel");
        event = impJson.getString("event");
    }

    private JSONObject jsom;
    private long id;
    private String id_str;
    private int order_type;
    private String datetime;
    private String microtimestamp;
    private double amount;
    private String amountStr;
    private double price;
    private String priceStr;
    private String channel;
    private String event;

    public JSONObject getJsom() {
        return jsom;
    }

    public long getId() {
        return id;
    }

    public String getId_str() {
        return id_str;
    }

    public int getOrder_type() {
        return order_type;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getMicrotimestamp() {
        return microtimestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getAmountStr() {
        return amountStr;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceStr() {
        return priceStr;
    }

    public String getChannel() {
        return channel;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return "BitCoinTransaction{" +
                "id=" + id +
                ", price=" + price +
                ", amount=" + amount +
                ", order_type=" + order_type +
                ", datetime='" + datetime + '\'' +
                ", microtimestamp='" + microtimestamp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitCoinTransaction that = (BitCoinTransaction) o;
        return getId() == that.getId() && getOrder_type() == that.getOrder_type() && Double.compare(that.getAmount(), getAmount()) == 0 && Double.compare(that.getPrice(), getPrice()) == 0 && Objects.equals(getId_str(), that.getId_str()) && Objects.equals(getDatetime(), that.getDatetime()) && Objects.equals(getMicrotimestamp(), that.getMicrotimestamp()) && Objects.equals(getAmountStr(), that.getAmountStr()) && Objects.equals(getPriceStr(), that.getPriceStr()) && Objects.equals(getChannel(), that.getChannel()) && Objects.equals(getEvent(), that.getEvent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public int compareTo(BitCoinTransaction in){
            return Double.compare(getPrice(), in.getPrice());
    }
}
