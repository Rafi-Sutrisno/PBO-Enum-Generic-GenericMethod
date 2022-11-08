package pkgenum.multigeneric.genericmethod;

public enum Device {
    LAPTOP("15 juta"),
    HANDPHONE("5 juta"),
    COMPUTER("6 juta");
    
    String Harga;
    
    private Device(String harga){
        this.Harga = harga;
    }
    
    public String getHarga(){
        return this.Harga;
    }
    
    public String Info(){
        return "Device : " + super.toString() + "\nHarga :\t" + this.getHarga();
    }
}
