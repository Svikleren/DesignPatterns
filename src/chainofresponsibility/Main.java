package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(
                new MessageCheckHandler(
                        new MessagePrintHandler(null)));
        messageHandler.handle("hello world");
    }
}
