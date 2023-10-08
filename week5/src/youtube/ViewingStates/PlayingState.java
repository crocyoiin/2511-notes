package youtube.ViewingStates;

import youtube.Viewing;

public class PlayingState implements ViewingState {
    private Viewing viewing;

    public PlayingState(Viewing view) {
        this.viewing = view;
    }

    @Override
    public void onLock() {
        System.out.println("now locking");
        viewing.setState(new LockedState(viewing));
    }

    @Override
    public void onPlay() {
        System.out.println("now pausing");
        viewing.setState(new PausedState(viewing));
    }

    @Override
    public void onNext() {
        viewing.toNextVid();
    }
    
}
