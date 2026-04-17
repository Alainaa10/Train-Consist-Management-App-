import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        String searchKey = "BG309";

        int left = 0;
        int right = bogieIds.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}