import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T>{
    private Node<T> head;
    private int size = 0;

    public void add(T data){
        Node<T> node = new Node<>(data);

        if (size == 0){
            this.head = node;
        }else{
            // 마지막노드 찾기
            Node<T> current = this.head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            // 현재 current에는 가장 마지막 node가 있음
            current.setNext(node);
        }
        this.size++;
    }

    public T get(int index) {
        // 양 끝 경계값 예외처리
        if(index <0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        // index 번째 노드를 찾는다.
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void delete(int index) {
        // 양 끝 경계값 예외처리
        if(index <0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
        }else {
            Node<T> current = this.head;
            // index-1 번째 노드를 찾는다.
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            // 다음 노드를 i+1번째 노드로 바꿔준다
            current.setNext(current.getNext().getNext());
        }
        this.size--;

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            @Override
            public boolean hasNext() {
                // null만 아니면 다음이 있음
                return current != null;
            }

            @Override
            public T next() {
                // 예외처리
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                T data = current.getData();
                current = current.getNext();
                return data;
            }
        };
    }

    // 하위과제
    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
