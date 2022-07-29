package turing;

public record Result(boolean write, State nextState, Direction dir) {
    public enum Direction {
        LEFT, RIGHT, NONE
    }
}
