package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        //break
        //loop will stop

        //let count 1-10 but stop when you reach 5

//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//            if (i==5) {
//                break;
//            }
//        }
        //cuzdanimiza 40dolardan fazlasi sigmiyor
        //40i gecmemesi lazim

        int sum=0;
        for (int x = 1; x <=10 ; x++) {
            System.out.println("Current sum is"+sum);
            System.out.println("If i add "+x+" dollar, it would be "+(sum+x));
            //onemli bir ayrinti burasi
            //sum diye check edersen 45 basiyor ama bize 40i gecmemesi lazim
            //bu sekilde durdurabilirz

            if(sum+x>40) {
                break;
            }
            sum=sum+x;   //bunu unutma!! once condition check sonra adding yapiyorsun!

        }
        System.out.println("Sum is "+ sum);


    }
}
