package turing;

public abstract class State {

    private static State instance;

    public abstract Result execute(boolean bit);

    public static State getInstance() {
        return instance;
    }
}
