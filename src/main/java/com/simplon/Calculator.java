package com.simplon;

/**
 * Created by aliyou on 12/02/17.
 */


public class Calculator {
    private float number;
    private float number1;

    public float addition(float number, float number1){
        this.number = number;
        this.number1 = number1;

        return this.number + this.number1;
    }

    public float substraction(float number,float number1){
        this.number = number;
        this.number1 = number1;

        return this.number - this.number1;
    }

    public float divide(float number,float number1){
        this.number = number;
        this.number1 = number1;

        if(this.number1 == 0){
            throw new IllegalArgumentException();
        }
        else return this.number / this.number1;
    }

}
