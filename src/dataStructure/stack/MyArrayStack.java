package dataStructure.stack;

public class MyArrayStack implements MyStack {


    private Object[] mas;
        private int top;
    public MyArrayStack(int size){
        mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        if (top == mas.length){
            System.out.println("Stack is full!");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        Object forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }


}
