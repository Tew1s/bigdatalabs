package producer;

/*
Интефейс для реализации callback функции, для передачи значений в класс Producer
 */
public interface DataListener {
    void onDataReceived(String data);
}
