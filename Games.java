package pkgenum.multigeneric.genericmethod;

public class Games<T> {
    private T type;
    
    public void setValue(T x){
        type = x;
    }
    
    public T getValue(){
        return type;
    }
}
