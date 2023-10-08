package youtube.ViewingStates;

import youtube.Viewing;

public class PausedState implements ViewingState {
    private Viewing viewing;

    public PausedState(Viewing view) {
        this.viewing = view;
    }

    @Override
    public void onLock() {
        System.out.println("now locked");
        viewing.setState(new PlayingState(viewing));
    }

    @Override
    public void onPlay() {
        System.out.println("now playing");
        viewing.setState(new PlayingState(viewing));
    }

    @Override
    public void onNext() {
        viewing.toNextVid();
    }
    
}

