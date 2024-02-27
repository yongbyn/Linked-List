public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    // top에 원소를 추가한다. 맨 끝을 top이라고 가정
    public void push(T item) {
        list.add(item);
    }

    // top에 있는 원소를 제거하고 반환한다.
    public T pop() {
        // exception
        if(list.isEmpty()){
            throw new IllegalStateException("Stack is empty!");
        }
        // top의 index
        int lastIndex = list.size()-1;
        T top = list.get(lastIndex);
        list.delete(lastIndex);

        return top;
    }

    // top에 있는 원소를 반환한다.
    public T peek(){
        // exception
        if(list.isEmpty()){
            throw new IllegalStateException("Stack is empty!");
        }
        // top의 index
        int lastIndex = list.size()-1;
        T top = list.get(lastIndex);

        return top;
    }
}
