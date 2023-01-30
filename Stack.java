public class Stack<E> implements IStack<E>{

    protected Arraylist<E> stack = new Arraylist();
    

    public void push(E item){
        this.stack.add(item);

    }
    
    public E pop{
        return this.stack.remove(stack.size() -1);

    }

    public E peek(){
        return this.stack.get(stack.size() -1);
    }
    

    public boolean empty(){
        if(stack !=null){
            return false;
        }
        return true;

    }


    public int size(){
        return this.stack.size();
    }
}
