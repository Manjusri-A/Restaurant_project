import java.util.ArrayList;
import java.util.List;

public class TableManagement {
    private List<Integer> available2Seater = new ArrayList<>();
    private List<Integer> available4Seater = new ArrayList<>();
    private List<Integer> available6Seater = new ArrayList<>();
    private List<Integer> available8Seater = new ArrayList<>();

    public TableManagement() {
        for (int i = 1; i <= 4; i++) available2Seater.add(i);
        for (int i = 5; i <= 7; i++) available4Seater.add(i);
        for (int i = 8; i <= 10; i++) available6Seater.add(i);
        for (int i = 11; i <= 15; i++) available8Seater.add(i);
    }

    public void displayAvailableSeats() {
        System.out.println("2-seater: Available Table numbers " + available2Seater);
        System.out.println("4-seater: Available Table numbers " + available4Seater);
        System.out.println("6-seater: Available Table numbers " + available6Seater);
        System.out.println("8-seater: Available Table numbers " + available8Seater);
    }

    public void reserveTable(int seatType) {
        if (seatType == 2 && !available2Seater.isEmpty()) {
            int reservedTable = available2Seater.remove(0);
            System.out.println("2-seater Table " + reservedTable + " reserved.");
        } else if (seatType == 4 && !available4Seater.isEmpty()) {
            int reservedTable = available4Seater.remove(0);
            System.out.println("4-seater Table " + reservedTable + " reserved.");
        } else if (seatType == 6 && !available6Seater.isEmpty()) {
            int reservedTable = available6Seater.remove(0);
            System.out.println("6-seater Table " + reservedTable + " reserved.");
        } else if (seatType == 8 && !available8Seater.isEmpty()) {
            int reservedTable = available8Seater.remove(0);
            System.out.println("8-seater Table " + reservedTable + " reserved.");
        } else {
            System.out.println("No tables available for the selected seat type.");
        }
    }
}

