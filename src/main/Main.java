package main;

import turing.TuringMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean tape[] = new boolean[8];
        tape[0] = true;
        tape[1] = true;
        new TuringMachine(tape, new StartState()).run();
    }
}
