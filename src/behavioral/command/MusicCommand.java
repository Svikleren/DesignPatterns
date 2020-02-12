package behavioral.command;

public class MusicCommand implements Command {
    MusicPlayer musicPlayer;

    public MusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}
