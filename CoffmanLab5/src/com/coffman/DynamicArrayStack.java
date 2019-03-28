/*************************************
Stack using the DynamicArray.java
 *************************************/
package com.coffman;

public class DynamicArrayStack {

    private DynamicArray A;
    private int endIndex = -1;
    private int sizeStack;
    private int sizeArray;

    public DynamicArrayStack(){
        A = new com.coffman.DynamicArray();
    }

    // Returns size
    public int getSize(){

        return endIndex+1;
    }

    // Push operation of stack
    public void push(int value){

        sizeStack = getSize();
        sizeArray = A.getSize();

        if(sizeStack==sizeArray)
            A.increaseSize();

        endIndex++;
        try
        {
            A.modifyElement(value, endIndex);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private int popElement() throws Exception{
        int index=endIndex;

        sizeStack=getSize();
        sizeArray=A.getSize();

        if(sizeStack == 0)
        {
            System.out.println("Stack is Empty");
            throw new Exception();
        } else {
            endIndex--;
            if(sizeStack<=(sizeArray/2))
                A.decreaseSize();
            sizeArray=A.getSize();
            return A.getElement(index);
        }
    }
    public void pop()
    {

        try{
            System.out.println(popElement());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void printStack()
    {
        int size = endIndex;
        try{
            for(int i = size;i >= 0;i--)
            {
                System.out.print(A.getElement(i)+" ");
            }
            System.out.println();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
