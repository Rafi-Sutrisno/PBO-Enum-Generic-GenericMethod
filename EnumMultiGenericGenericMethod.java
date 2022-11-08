package pkgenum.multigeneric.genericmethod;

public class EnumMultiGenericGenericMethod {
    public static void main(String[] args) {
        //Enum
        Device Rafi = Device.LAPTOP;
        Device Daffa = Device.COMPUTER;
        
        System.out.println(Rafi.Info());
        System.out.println(Daffa.Info());
        
        //Generic
        Games<Integer> game1 = new Games();
        Games<String> game2 = new Games();
        Games<Double> game3 = new Games();
        
        game1.setValue(100);
        game2.setValue("Romawi");
        game3.setValue(8.95);
        
        System.out.println("\n" + game1.getValue());
        System.out.println(game2.getValue());
        System.out.println(game3.getValue() + "\n");
        
        //GenericMethod
        Integer[] Intarr = {2, 3, 4, 5};
        String[] Stringarr = {"Moon", "Saturn", "Pluto", "Messi"};
        
        GenericMethod print = new GenericMethod();
        print.info(Intarr);
        print.info(Stringarr);
    }
}
