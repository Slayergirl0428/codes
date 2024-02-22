import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner kbd = new Scanner (System.in);

        String decision;

        String ageStr = "16";
        int age = 0;
        Integer old = Integer.parseInt(ageStr);

        Double money = 0.0;

        String[] values = new String[10];
        values[0] = "";

        Integer[] numbers = new Integer[10];

        List<Money> valuesList = new ArrayList<Money>();
        valuesList.add(new Money("Dollars", 1000000000.0));
        boolean yn = true;
        while(yn)
        {
            System.out.println("please enter your name");
            String name = kbd.nextLine();

            System.out.println("you entered the name" + name );

            System.out.println("enter another name : yes or no");
            decision = kbd.nextLine();

            switch(decision)
            {
                case "yes":
                    yn = true;
                    break;

                case "no":
                    yn = false;
                    break;

                default:
                  System.out.println("please enter again");
                  boolean repeat = true;

                  while(repeat)
                  {
                      System.out.println("enter another name : yes or no");
                      decision = kbd.nextLine();

                      switch(decision)
                      {
                          case "yes":
                              yn = true;
                              repeat = false;
                              break;

                          case "no":
                              yn = repeat = false;
                              break;
                          default:
                              repeat = true;
                      }
                  }
            }
        }
    }
}
