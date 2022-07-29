package main;

import turing.Result;
import turing.State;
import turing.Result.Direction;

public class S2 extends State {

    @Override
    public Result execute(boolean bit) {
        if (bit)
            return new Result(true, this, Direction.RIGHT);
        return new Result(false, S3.getInstance(), Direction.RIGHT);
    }

}
