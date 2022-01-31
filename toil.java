import java.util.ArrayList;

public class toil {
    //take two bigints as params
    //size 1 minimum, always positive
    //add from the end, and if over ten put remainder and carry 1
    public static ArrayList<Integer> add(ArrayList<Integer> big1, ArrayList<Integer> big2) {
        if (big1.size()>big2.size() || big1.size()==big2.size()) {
            for (int i = big1.size(); i > 0; i--) {
                if (big1.get(i)+big2.get(i)<10) {
                    //why won't it let me have two gets in one line
                    //big1.get(i) = 0;
                }
            }
            //if () carry one shit
        }

        else if (big2.size() > big1.size()) {
            for (int i = big2.size(); i > 0; i--) {
                //big2.get(i) = big2.get(i);
                //if () carry one shit
            }
        }
        return big1;
    }

    public static void main (String[] args) {
    }
}
