import java.util.ArrayList;

public class Subscription {
    private Member member;

    private ArrayList<Member> debtList = new ArrayList<>();
    private ArrayList<Member> noDebtList = new ArrayList<>();

    private double price;
    private double payment;
    private double debt;

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void addDebt(Member member){
        debtList.add(member);
    }

    public ArrayList<Member> displayDebtList() {
        return debtList;
    }

}

