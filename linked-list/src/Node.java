//Generic Type변수
public class Node<T> {
    private T data;
    private Node<T> next;

    // 생성자지만 next는 모르기때문에 data만 인자로 갖음
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // Getter
    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    // Setter
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
