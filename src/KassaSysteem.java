import java.time.LocalDate;
public class KassaSysteem {

    private Integer jaar;
    private Integer maand;
    private Integer dag;

    public KassaSysteem(Integer jaar, Integer maand, Integer dag) {
        this.jaar = jaar;
        this.maand = maand;
        this.dag = dag;
    }
    public LocalDate date = LocalDate.now();

    public int getLeeftijdJaar() {
        int year = date.getYear() - 18;
        if (jaar > year) {
            return 0;
        } else if (jaar == year) {
            return 1;
        } else {
            return 2;
        }
    }

    public int getLeeftijdMaand() {
        int month = date.getMonthValue();
        if (maand > month) {
            return 0;
        } else if (maand == month) {
            return 1;
        } else {
            return 2;
        }
    }

    public int getLeeftijdDag() {
        int day = date.getDayOfMonth();
        if (dag > day) {
            return 0;
        } else {
            return 1;
        }
    }
}


