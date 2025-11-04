package controlflow;

public class examplesWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100){
            System.out.println(Math.pow(i , 2)); //က i² (i နှစ်ထပ်) ကို တွက်ပေးတယ်
            i++;
            
            //1.0      // 1² = 1
            //4.0      // 2² = 4
            //9.0      // 3² = 9
            //16.0     // 4² = 16
            //...
            //9801.0   // 99² = 9801
        }

//        boolean notFound = true;
//        while (notFound){ //notFound က true ဖြစ်နေသမျှ loop ကို ဆက်လက်အလုပ်လုပ်မယ်
//            int randomNr = (int) (Math.random() * 11); // 0 ကနေ 9 အထိ random number တစ်ခုထုတ်ပေးမယ်
//            System.out.println("Value : " + randomNr);
//            if (randomNr == 10){ //random number က 10 နဲ့ ညီမျှရင် notFound ကို false ပြောင်းမယ်
//                notFound = false;
//                //Math.random() * 10 က 0.0 ကနေ 9.999... အထိ values တွေပဲပေးပါတယ်။
//                // (int) နဲ့ cast လုပ်လိုက်တဲ့အခါ 0 ကနေ 9 အထိ integer values တွေပဲရပါတယ်။
//            }
//        }
    }
}
