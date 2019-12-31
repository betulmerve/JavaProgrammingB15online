package myfolder;

public class Replit_163 {

    public static void main(String[] args) {

        //System.out.println(count_appearance(new String[]{"a", "foo", "bar", "foo", "bla"},"foo"));

    }


    public static int count_appearance(String[] arr,String t)
    {
        int count=0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].equals(t)) {
                count++;
            }
        }

        return count;

    }

    public static  int max(int x,int  max)
    {
        if (x>max) {
            return max;
        } else {
            return x;
        }
    }

    public boolean isEven(int n)
    {
        if (n%2==0) {
            return true;
        } else {
            return false;
        }

    }

    public static String c_profits (int buyPrice,int sellPrice)
    {
       if ((sellPrice-buyPrice)==0) {
           return "no loss";
       } else if ((sellPrice-buyPrice)>0) {
           return "profit";
       } else {
           return "loss";
       }



    }
}
