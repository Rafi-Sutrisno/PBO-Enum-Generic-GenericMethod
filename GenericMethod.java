package pkgenum.multigeneric.genericmethod;

public class GenericMethod {
    public <Type> void info(Type[] array){
        for(Type Array : array){
            System.out.println(Array);
        }
    }
}
