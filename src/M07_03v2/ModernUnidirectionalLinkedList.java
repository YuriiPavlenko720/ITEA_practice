package M07_03v2;

public class ModernUnidirectionalLinkedList<T> {

    private Cell<T> first;
    private Cell<T> last;
    private int size = 0;

    class Cell<T> {
        T content;
        Cell<T> next;

        public Cell(T content) {
            this.content = content;
        }
    }

    public int size() {
        return size;
    }

    public void add(final T o) {
        if (first == null) {
            first = new Cell<>(o);
            last = first;
        } else {
            last.next = new Cell<>(o);
            last = last.next;
        }
        size += 1;
    }

    public void add(final int index, final T data) {
        if (index >= 0 && index < size) {
            Cell<T> newCell = new Cell<>(data);
            if (first == null) {
                first = newCell;
                last = first;
            } else if (index == 0) {
                newCell.next = first;
                first = newCell;
            } else {
                Cell<T> target = first;
                for (int i = 0; i < index - 1; i++) {
                    target = target.next;
                }
                newCell.next = target.next;
                target.next = newCell;
            }
        }
        size += 1;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            if (index == 0) {
                first = first.next;
                if (first == null) {
                    last = null;
                }
            } else {
                Cell<T> target = first;
                for (int i = 0; i < index - 1; i++) {
                    target = target.next;
                }
                target.next = target.next.next;
                if (index == size - 1) {
                    last = target;
                }
            }
            size -= 1;
        }
    }

    public void remove(T data) {
        Cell<T> target = first;
        if (first.content.equals(data)) {
            first = first.next;
        }
        for (int i = 0; i < size - 1; i++) {
            if (target.next.content.equals(data)) {
                target = target.next;
            }
        }
        size -= 1;
    }

    public void insertHead(T data) {
        Cell<T> newCell = new Cell<>(data);
        newCell.next = first;
        first = newCell;
        size += 1;
    }
}
