package CodingTest;
import java.lang.Math;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class HashMap_List_KeyPad {

    public int distance(int[] tpos,int []fpos){
        return Math.abs(tpos[0]-fpos[0])+Math.abs(tpos[1]-fpos[1]);
    }

    public static void main(String[] args) {
        String [] answer = new String[0];
        
        HashMap<String,HashSet<Integer>> pattern = new HashMap<String,HashSet<Integer>>();
        pattern.put("L",new HashSet<Integer>());
        HashSet<Integer> left = pattern.get("L");
        left.add(1); left.add(4); left.add(7);
       
        pattern.put("R",new HashSet<Integer>());
        HashSet<Integer> right = pattern.get("R");
        right.add(3); left.add(6); left.add(9);
        		
        HashMap<String,ArrayList<Integer>> fpos = new HashMap<String,ArrayList<Integer>>();
        fpos.put("L", new ArrayList<Integer>());
        fpos.put("R", new ArrayList<Integer>());
        ArrayList<Integer> fleft = fpos.get("L");
        ArrayList<Integer> fright = fpos.get("R");
        fleft.add(0);        fleft.add(3);
        fright.add(2);        fright.add(3);
        
        //pattern={"L"=[1,4,7],"R"=[3,6,9]}
        //fpos={"L"=[0,3],"R"=[2,3]}
        
        

    }
}



