import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> Cargo: " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goodsBogies
                .stream()
                .allMatch(b ->
                        b.type.equals("Cylindrical")
                                ? b.cargo.equals("Petroleum")
                                : true
                );

        System.out.println("Train Safety Compliance: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}