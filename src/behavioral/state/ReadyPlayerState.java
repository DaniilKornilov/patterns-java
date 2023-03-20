package behavioral.state;

import behavioral.state.player.Player;

public class ReadyPlayerState extends PlayerState {

    public ReadyPlayerState(Player player) {
        super(player);
    }

    @Override
    public void onLock() {
        player.setState(new LockedPlayerState(player));
    }

    @Override
    public void onPlay() {
        player.setState(new PlayingPlayerState(player));
    }

    @Override
    public void onNext() {
        // Player is not playing
    }

    @Override
    public void onPrevious() {
        // Player is not playing
    }

    @Override
    public String toString() {
        return "ReadyPlayerState{" +
                "player=" + player +
                '}';
    }

}
