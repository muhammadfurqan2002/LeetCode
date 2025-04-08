package LeetCode;
import java.util.ArrayList;
import java.util.List;
public class StackList {
    ArrayList<Integer> list;
    StackList(){
        list = new ArrayList<>();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(int value){
        list.add(value);
    }
    public int size(){
        return list.size();
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int last= list.get(size() - 1);
        list.remove(size() - 1);
        return last;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return list.get(size() - 1);
    }

    public void display(){
        for(int i = size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        stack.pop();
        stack.display();
    }
}
