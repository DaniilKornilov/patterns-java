package behavioral.state;

import behavioral.state.player.Player;

public class PlayingPlayerState extends PlayerState {

    public PlayingPlayerState(Player player) {
        super(player);
        this.player.startPlayback();
    }

    @Override
    public void onLock() {
        player.setState(new LockedPlayerState(player));
    }

    @Override
    public void onPlay() {
        player.setState(new ReadyPlayerState(player));
    }

    @Override
    public void onNext() {
        player.nextTrack();
    }

    @Override
    public void onPrevious() {
        player.previousTrack();
    }

    @Override
    public String toString() {
        return "PlayingPlayerState{" +
                "player=" + player +
                '}';
    }

}
