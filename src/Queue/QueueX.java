package Queue;

public class QueueX<T> {
    private int maxSize;

    private T[] array;

    private int front;

    private int rear;

    private int nElements;

    public QueueX(int size) {
        this.maxSize = size;
        this.array = (T[])new Object[size];
        this.front = 0;
        this.rear = -1;
        this.nElements = 0;
    }

    public void insert(T element) throws QueueXException {
        if (!isFull())
        {
        if (rear == maxSize - 1)
        {
            rear = -1;
        }
        array[++rear] = element;
        nElements++;
        }
        else throw new QueueXException();
    }

    public T remove() throws QueueXException {
        if (!isEmpty()) {
            T element = array[front++];
            if (front == maxSize) {
                front = 0;
            }
            nElements--;
            return element;
        }
        else throw new QueueXException("no elements");
    }

    public T peek()
    {
        return array[front];
    }

    public boolean isEmpty()
    {
        return nElements == 0;
    }

    public int size()
    {
        return nElements;
    }

    public boolean isFull()
    {
        return nElements == maxSize;
    }
}
