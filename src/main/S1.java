package main;

import turing.Result;
import turing.Result.Direction;
import turing.State;

public class S1 extends State {

    @Override
    public Result execute(boolean bit) {
        if (bit)
            return new Result(false, S2.getInstance(), Direction.RIGHT);
        return new Result(false, null, Direction.NONE);
    }
}
