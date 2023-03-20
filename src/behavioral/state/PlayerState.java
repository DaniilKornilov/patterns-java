package behavioral.state;

import behavioral.state.player.Player;

public abstract class PlayerState {

    protected final Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract void onLock();

    public abstract void onPlay();

    public abstract void onNext();

    public abstract void onPrevious();

}
