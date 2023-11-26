
import java.util.ArrayList;

public class CompetitionSwimmers {


    private Coach coach;
    private double result;
    private Member member;
    private SwimmingDiscipline swimmingDiscipline;
    private SwimTraining swimTraining;

    private ArrayList<String> allResults;

    CompetitionSwimmers(Member member, Coach coach, SwimmingDiscipline swimmingDiscipline ){
        this.member = member;
        this.coach = coach;
        this.swimmingDiscipline = swimmingDiscipline;


    }
    public ArrayList<String> showAllResults() {
        return allResults;
    }
    


}
