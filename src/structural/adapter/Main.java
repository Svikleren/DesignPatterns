package structural.adapter;

public class Main {
    public static void main(String[] args) {
        AmericanSocket socket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocket euroSocket = new SocketAdapter(socket);
        radio.listenMusic(euroSocket);
    }
}
