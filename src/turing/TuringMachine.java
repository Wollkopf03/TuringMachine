package turing;

public class TuringMachine {

    private boolean tape[];
    private int pointer;
    State currentState;

    public TuringMachine(boolean tape[], State startState) {
        this.tape = tape;
        currentState = startState;
    }

    public void run() {
        while (currentState != null)
            currentState = currentState.execute(this, tape[pointer]);
        stop();
    }

    public void increasePointer() {
        pointer++;
    }

    public void decreasePointer() {
        pointer--;
    }

    public void flipBit() {
        tape[pointer] = !tape[pointer];
    }

    private void stop() {
        System.out.print("[");
        for (boolean bit : tape)
            System.out.print(bit ? "1," : "0,");
        System.out.println("]");
    }
}
