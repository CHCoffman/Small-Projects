/*************************************
Test file for the dynamic array stack
 *************************************/
package com.coffman;

public class Main {

    public static void main(String[] args) {

        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();

        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.printStack();

        }
    }

