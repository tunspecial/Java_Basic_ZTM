package primitivevsobject;

public class Pass {
    public static void main(String[] args){ //stack
        int i = 3 ; // (primitive variable)
        Person p = new Person();
        p.name = "Mg Mg";
        changesStuff(i,p);
        System.out.println(i + " " + p.name);
    }

    public  static void  changesStuff(int x , Person person){
        x = 5 ;
        person.name = "Ko Ko";

    }

}
