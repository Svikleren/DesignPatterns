package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Command command = new LightCommand(new Light());
        Button button = new Button(command);
        button.pressButton();

        Command command1 = new MusicCommand(new MusicPlayer());
        Button button1 = new Button(command1);
        button1.pressButton();

        Command command2 = new LightAndMusicCommand(new MusicPlayer(), new Light());
        Button button2 = new Button(command2);
        button2.pressButton();

        Command command3 = new PhoneCommand(new Phone(), "Name");
        Button button3 = new Button(command3);
        button3.pressButton();
    }
}
