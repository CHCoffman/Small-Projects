/*************************************************************
    Created by Colten Coffman 3/8/2019
    COSC 2436 Lab 5
    This program uses array stack to contain entries,
    expands array dynamically, then tests the functionality
 **************************************************************/
package com.coffman;

public class DynamicArray {
    private int[] A;
    private int arraySize;

    public DynamicArray(){
        A = new int[1];
        arraySize = 1;
    }

    // Gets current size of array
    public int getSize(){
        return (arraySize);
    }

    // Doubles array
    public void increaseSize(){
        int size = A.length;
        int[] B = new int [2 * size];
        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        A = B;
        arraySize = A.length;
    }

    // Halves size of array
    public void decreaseSize(){
        int size = A.length;
        int[] B = new int[size / 2];
        for(int i = 0; i < B.length; i++){
            B[i] = A[i];
        }
        A = B;
        arraySize = A.length;
    }

    // Returns integer if index > size of array
    public int getElement(int index)throws Exception{

        if(index<0 || index>=A.length)
        {
            throw new Exception();

        }
        return A[index];

    }

    // Puts integer value in index
    public void modifyElement(int value, int index) throws Exception{

        if(index<0 || index>=A.length)
        {
            throw new Exception();
        }
        A[index]=value;
    }


}
