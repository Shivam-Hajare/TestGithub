import java.util.ArrayList;
import java.util.Collections;

public class PRN2302340120192_ShivamHajare_Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(3);
        int k=2;//no of terms travel
        Collections.reverse(list);
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            leftList.add(list.get(i));
        }
        Collections.reverse(leftList);
        for(int i=k;i<list.size();i++)
        {
            rightList.add(list.get(i));
        }
        Collections.reverse(rightList);
        
        for(int i=0;i<leftList.size();i++)
        {
            result.add(leftList.get(i));
        } 
        for(int i=0;i<rightList.size();i++)
        {
            result.add(rightList.get(i));
        }
        System.out.println(result);

    }
}
