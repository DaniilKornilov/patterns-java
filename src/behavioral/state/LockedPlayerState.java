package behavioral.state;

import behavioral.state.player.Player;

public class LockedPlayerState extends PlayerState {

    public LockedPlayerState(Player player) {
        super(player);
        this.player.resetPlaylistTrack();
    }

    @Override
    public void onLock() {
        // Player is locked
    }

    @Override
    public void onPlay() {
        player.setState(new ReadyPlayerState(player));
    }

    @Override
    public void onNext() {
        // Player is locked
    }

    @Override
    public void onPrevious() {
        // Player is locked
    }

    @Override
    public String toString() {
        return "LockedPlayerState{" +
                "player=" + player +
                '}';
    }

}
