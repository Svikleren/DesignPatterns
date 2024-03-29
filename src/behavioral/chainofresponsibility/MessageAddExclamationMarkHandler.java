package behavioral.chainofresponsibility;

public class MessageAddExclamationMarkHandler extends MessageHandler {
    public MessageAddExclamationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        System.out.println(message + "!");
    }
}
