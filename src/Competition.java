import java.time.*;

public class Competition {

    private SwimmingDiscipline swimmingDiscipline;

    private double result;
    private LocalDateTime date;

    private CompetitionSwimmers swimmers;

    Competition(SwimmingDiscipline swimmingDiscipline,LocalDateTime date,CompetitionSwimmers swimmers){
        this.swimmingDiscipline = swimmingDiscipline;
        this.date = date;
        this.swimmers = swimmers;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }




}
