public class ChinaBank {


    public static void main(String[] args) {

        Bank newBank1 = new Bank();
        newBank1.setName("Honk");
        newBank1.setAddress("Shanghai");
        newBank1.setWorth(234_000_000_000_000L);

        System.out.println(newBank1);

    }
}
