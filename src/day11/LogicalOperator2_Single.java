package day11;

public class LogicalOperator2_Single {

    public static void main(String[] args) {

        // && short circuit AND
        //it does not check the next condition as long as the first condition is false
        // just like multiple condition for rocket launching
        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false it does not go and check next conditions

        // & check each and every condition no matter what
        // if isEngineRunning is false
        // it will check isCommunicstionSystemWorking and isAirEnough
        // result will be same of course!

        // bu hata veriyor
//        System.out.println(9/0);
//        System.out.println(9/0==3);

        //o yuzden farki gormek icin deniyoruz (rocket science ornegi)
        System.out.println(5>10 && 9/0==3);  // bu false cunku ikinciye gecmiyor bile
        System.out.println(5>10 & 9/0==3);  //bu error cunku ikinciyi de check ediyor

        //yuzde 99 her zaman && veya || kullaniliyor  (store milk ornegi)
        System.out.println(10>5 || 9/0==3);
        System.out.println(10>5 | 9/0==3);
    }
}
