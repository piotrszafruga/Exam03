import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

    public List<Smurf> getList() {
        List<Smurf> smurfs = new ArrayList<>();

        Smurf smurf1 = new Smurf("s1","a1","d1");
        smurfs.add(smurf1);
        Smurf smurf2 = new Smurf("s2","a2","d2");
        smurfs.add(smurf2);
        Smurf smurf3 = new Smurf("s3","a3","d3");
        smurfs.add(smurf3);
        Smurf smurf4 = new Smurf("s4","a4","d4");
        smurfs.add(smurf4);
        Smurf smurf5 = new Smurf("s5","a5","d5");
        smurfs.add(smurf5);

        return smurfs;

    }
}
