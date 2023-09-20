import java.util.Scanner;
public class ImmutableObject {
    public static void main(String[] args){
        double fahrenheit;
        double centigrade ;
        fahrenheit = 98.6;

        centigrade = (double) 5 /9*(fahrenheit - 32);
        System.out.println(centigrade);
        double x = 0.0;
        while(x <= 40.0)
        {
            centigrade = (double) 5 /9*(x - 32);
            System.out.println("Centigrade: " + x + " turns to ---> " + centigrade);
        x += 4.0;

        }

      StopChecking();

    }
    public static void StopChecking(){
        Scanner sc = new Scanner(System.in);

        String[][] myArray = new String[][]{{"BMW", "FERRARI", "LAMBO"}, {"PIZZA", "BURGER", "DUMPLING"}};
        String isin;
        String inputwords;

        System.out.println("\n");
        System.out.print("Enter a word: ");
        inputwords = sc.next();

        while(!(inputwords.equalsIgnoreCase("STOP"))){

            isin = ArrayChecked(myArray,inputwords);


            if(isin.equals("true")){
                System.out.println( inputwords+" is in 2D array");
            }
            else if(isin.equals("false")){
                System.out.println(inputwords+ " is not in 2D array");
            }
            System.out.println();
            System.out.print("Enter a new word: ");
            inputwords = sc.next();

        }

    }
    public static String ArrayChecked(String[][] array, String word){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j].equalsIgnoreCase(word))
                    return "true";
            }
        }
        return "false";
    }

}
