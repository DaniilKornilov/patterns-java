package behavioral.state;

import behavioral.state.player.Player;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(List.of("track1", "track2", "track3"));
        // Ready player state
        PlayerState playerState = player.getState();
        playerState.onLock();

        // Locked player state
        playerState = player.getState();
        playerState.onPlay();

        // Ready player state
        playerState = player.getState();
        playerState.onPlay();

        // Playing player state
        playerState = player.getState();
        playerState.onNext();
        playerState.onPrevious();
        playerState.onLock();
    }

}
