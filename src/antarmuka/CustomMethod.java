package antarmuka;

public class CustomMethod<T> {

    private T obj;

    public void setHandler(T obj) {

        this.obj = obj;
    }

    public T getHandler() {
        return this.obj;
    }
}