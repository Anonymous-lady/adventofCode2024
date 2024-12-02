import java.io.*;
import java.util.*;
public class day1{
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList <Integer> row1 = new ArrayList<>();
        ArrayList <Integer> row2 = new ArrayList<>();
        Scanner f = new Scanner(new File("day1.txt"));
        while(f.hasNext()){
            row1.add(f.nextInt());
            row2.add(f.nextInt());
        }
        f.close();
       Collections.sort(row1);
       Collections.sort(row2);
       int sum = 0, difference;
       for(int i = 0; i < row2.size(); i++){
        if(row2.get(i) > row1.get(i)){
            difference = row2.get(i) - row1.get(i);
        }
        else{
            difference = row1.get(i) - row2.get(i);
        }
        sum += difference;
       }
       System.out.println(sum);
       int anothersum = 0;

       for (int n1 : row1){
        int count = 0;
        for (int n2 : row2){
            if (n1 == n2) {
                count++;
            }
        }
        anothersum += n1 * count;
    }
    //anothersum += n1 * count;
    System.out.println(anothersum);
    }
}
