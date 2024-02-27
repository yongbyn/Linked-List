public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<T>();

    // Top에 원소 추가 => 가장 뒤에 원소 추가
    public void enqueue(T item){
        list.add(item);
    }

    // Bottom 원소 제거 반환 => 가장 앞에 있는 원소 제거하고 반환
    public T dequeue(){
        // exception
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        // bottom의 index
        int firstIndex = 0;
        T Bottom = list.get(firstIndex);
        list.delete(firstIndex);

        return Bottom;
    }

    // Bottom에 있는 원소를 반환한다.
    public T peek(){
        // exception
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        // bottom의 index
        int firstIndex = 0;
        T Bottom = list.get(firstIndex);

        return Bottom;
    }

}
