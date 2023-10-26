import java.util.ArrayList;

public class Table {
    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();
    
    public static void main(String[] args) {
        var myTable = new Table(4);
        System.out.println(myTable);
    }

    public Table (Integer numLegs){
        for (int i = 0; i < numLegs; i++){
            legs.add(new Leg(25));
        }
    }
}
