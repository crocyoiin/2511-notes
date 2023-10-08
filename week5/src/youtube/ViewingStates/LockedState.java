package youtube.ViewingStates;

import youtube.Viewing;

public class LockedState implements ViewingState {
    private Viewing viewing;

    public LockedState(Viewing view) {
        this.viewing = view;
    }

    @Override
    public void onLock() {
        viewing.setState(new PlayingState(viewing));
        System.out.println("Unlocked!");
    }

    @Override
    public void onPlay() {
        System.out.println("Cannot play locked video");
    }

    @Override
    public void onNext() {
        System.out.println("Cannot skip on locked video");
    }
    
}

