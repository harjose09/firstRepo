public class Bank {

   private String name;
   private String address;
    private long worth;


    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address ;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public long getWorth(){
        return worth ;
    }
    public void setWorth(long worth){
        this.worth = worth;
    }

    @Override
    public String toString(){
        return name + " Bank is located at " + address +
                " and they are worth " + worth + " billion naira";
    }


    public static void main(String[] args) {

        Bank newBank = new Bank();
        newBank.name = "Lotus";
        newBank.address = "46 Ik road lagos";
        newBank.worth = 50_000_000_000L;

        System.out.println(newBank);


        Bank newBank1 = new Bank();
        newBank1.name = "UBA";
        newBank1.address = "20 Marina road lagos";
        newBank1.worth = 200_000_000_000L;

        System.out.println(newBank1);
    }

}
