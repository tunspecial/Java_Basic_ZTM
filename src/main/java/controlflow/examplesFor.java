package controlflow;

public class examplesFor {
    public static void main(String[] args) {

        for(int row = 1 ; row < 11 ; row++){
            for(int col = 1 ; col <11 ; col++){
                System.out.printf("%5d" , row * col);
                //printf() method ကိုသုံးထားသည် (formatted printing)
                //"%4d" format specifier:
                //%d - integer value ကိုပြသရန်
                //4 - field width 4 characters ယူမည်
                //ညာဘက်ယွင်း (right-aligned) ဖြစ်မည်
            }
            System.out.println();
        }

//        int[] nrs = {1,2,3,4,5,6,7,8,9,10};
//        int search = 3 ; //ရှာဖွေမည့်တန်ဖိုး: 3
//        int index = -1 ;  //မတွေ့ပါက -1 ကိုပြသမည်
//        for (int i = 0 ; i < nrs.length ; i ++){ //nrs.length = 10 (array ၏အရွယ်အစား)
//            if(nrs[i] == search){ // Array ၏လက်ရှိ element (nrs[i]) နှင့် ရှာဖွေမည့်တန်ဖိုး (search) နှိုင်းယှဉ်မည်
//                index = i; //တူညီလျှင်: index variable ထဲတွင် လက်ရှိ index i ကိုသိမ်းမည်
//            }
//        }
//        System.out.println(index);
    }
}
