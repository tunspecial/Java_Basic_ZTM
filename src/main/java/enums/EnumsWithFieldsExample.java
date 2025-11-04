package enums;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for ( Planet planet : Planet.values()){

            // Formatted Output %s = String (စာသား) ထည့်ဖို့ , %.2f = Float/Double နဲ့ ဒသမ 2 လုံး ပြဖို့ , %n = New line (စာကြောင်းသစ်) ခုန်ဖို့
            System.out.printf("%s is %.2f AU from the Sum%n" , planet.getName(), planet.getDistanceForSun());
        }
    }
}
