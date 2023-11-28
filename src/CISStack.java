import java.util.Arrays;

public class CISStack {

    // Array property.
    private Integer[] stack;

    // Size property.
    private int size;

    // Pointer property
    private int pointer;

    // Constructor.
    public CISStack(int size){
        this.stack = new Integer[size];
        this.size = size;
        this.pointer = -1;
    }
    // Push. This method pushes a value onto the top of the stack.

    public void push(int x){
        pointer++;
        stack[pointer] = x;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop(){
        int x = stack[pointer];
        pointer--;
        return x;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if(pointer == -1){
            return true;
        } else{
            return false;
        }
    }

    // size. Returns the size of the queue.
    public int size(){
       return (pointer + 1);
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}
    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size() +
                ", pointer=" + pointer +
                '}';
    }
}
