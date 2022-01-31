import java.util.ArrayList;

public class uno {
    //so you sieve the shit right
    //like a sieve
    //fucking wshwshwshwshwsh
    public static ArrayList<Integer> primeee(int n) {
        ArrayList<Integer> fresh = new ArrayList<Integer>();
        ArrayList<Integer> fresher = new ArrayList<Integer>();
        int p = 2;
        
        for (int i = 2; i <= n; i++) {
            fresh.add(i);
        }
        
        while (fresh.size() >= 1) {
            if (fresh.get(0) > p) p = fresh.get(0);
            for (int j = 0; j < fresh.size(); j++) {
                if (fresh.get(j) >= p && fresh.get(j) % p == 0) {
                    fresh.remove(fresh.indexOf(fresh.get(j)));
                }
            }
            fresher.add(p);
        }
        //System.out.println(p);
        //System.out.println(fresh);
        return fresher;
    }

    public static void main (String[] args) {
        System.out.println(primeee(100));
    }
}