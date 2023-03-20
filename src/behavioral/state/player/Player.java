package behavioral.state.player;

import behavioral.state.PlayerState;
import behavioral.state.ReadyPlayerState;

import java.util.List;

public class Player {

    private final List<String> playlist;

    private PlayerState playerState;

    private int currentTrackIndex = 0;

    public Player(List<String> playlist) {
        this.playlist = playlist;
        playerState = new ReadyPlayerState(this);
    }

    public void startPlayback() {
        System.out.println("Playing " + playlist.get(currentTrackIndex));
    }

    public void nextTrack() {
        currentTrackIndex++;
        if (currentTrackIndex > playlist.size() - 1) {
            currentTrackIndex = 0;
        }
        System.out.println("Playing " + playlist.get(currentTrackIndex));
    }

    public void previousTrack() {
        currentTrackIndex--;
        if (currentTrackIndex < 0) {
            currentTrackIndex = playlist.size() - 1;
        }
        System.out.println("Playing " + playlist.get(currentTrackIndex));
    }

    public void resetPlaylistTrack() {
        System.out.println("Reset to first track");
        currentTrackIndex = 0;
    }

    public PlayerState getState() {
        return playerState;
    }

    public void setState(PlayerState playerState) {
        System.out.println("New player state: " + playerState);
        this.playerState = playerState;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", playlist=" + playlist +
                ", currentTrackIndex=" + currentTrackIndex +
                '}';
    }

}
