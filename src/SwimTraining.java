import java.time.*;

public class SwimTraining {
    private double result;
    private LocalDateTime date;

    SwimTraining(double result, LocalDateTime date){
        this.result = result;
        this.date = date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setResult(double result) {
        this.result = result;
    }



    public double getResult() {
        return result;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
