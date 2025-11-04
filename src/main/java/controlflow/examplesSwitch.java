package controlflow;

public class examplesSwitch {
    public static void main(String[] args) {
        String extention = "pdf";
        switch (extention){
            case "doc":
                System.out.println("This is Document files");
                break;
            case "pdf":
                System.out.println("This is PDF files");
                break;
            case "excel":
                System.out.println("This is excel files");
                break;
            default:
                System.out.println("This is None of files extension in the program");
        }

        int month = 2;

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
                System.out.println("This month have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month have 30 days");
                break;
            case 2 :
                System.out.println("This month have 28 days");
                break;
            default:
                System.out.println("This is out of bound month in years");
        }


    }
}
