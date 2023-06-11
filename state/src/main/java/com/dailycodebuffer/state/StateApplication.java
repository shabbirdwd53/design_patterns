package com.dailycodebuffer.state;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    References: https://www.tutorialspoint.com/design_pattern/state_pattern.htm
                https://refactoring.guru/design-patterns/state
 */

@SpringBootApplication
public class StateApplication {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
