package com.solid.openclosed;

//This bad design where we are taking type
// and for each type we are having cases
// now if we want to introduce divison , we have to modify calculator
public class BadCalculator {
    public int calculateNumber(int number1 , int number2 , String type){
        int result=0;
        switch (type){
            case "sum":
                result = number1 + number2;
            case "sub":
                result = number1 - number2;
        }
        return  result;
    }
}
