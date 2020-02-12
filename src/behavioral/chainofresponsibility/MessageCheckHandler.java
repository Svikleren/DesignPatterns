package behavioral.chainofresponsibility;

public class MessageCheckHandler extends MessageHandler {
    public MessageCheckHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        if (!message.matches(".*\\d.*")) {
            handle(message);
        }
    }
}
