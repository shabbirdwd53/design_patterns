package com.solid.dependencyinversion.bad;

/**
 * Lets take similar example which we have in Open Closed.
 * Here we are having calculator with add and sub functionality
 * and user is sending choice for it.
 * This operations are called as sub module in the system
 *
 */
public class AddOperation {
    public int add(int a, int b){
        return a+b;
    }
}
