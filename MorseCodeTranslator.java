/** Addison Chen
  * The goal is to translate a string into morse code
**/

import java.util.*; //importing any utils needed

public class MorseCodeTranslator {

public static void main(String[] args)
{
      Scanner input = new Scanner(System.in);

      //Declaring the variables 
      String Response = "";
      String phrase = "";
      String answer = "";
      String english = "English";
      String morse = "Morse-Code";
      int loop = 0;

      //This is the English and Morse arrays. Inside the array are the letters and numbers that will be translated into morse
      final String[] English = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                               "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
                               "Y", "Z", " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; 

      final String[] Morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                             "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " ", 
                             ".----", "..---", "...--", "....-", ".....", "-....", "--...", 
                             "---..", "----.", "-----"}; // morse code

      while(loop == 0)
      {
          System.out.print("Would you like to enter the phrases in English or in Morse code? ");
          Response = input.next();  

          while(!(Response.equalsIgnoreCase(english) || Response.equalsIgnoreCase(morse)))
          {
              System.out.println("Invalid response. Please enter 'English' or 'Morse-code'.");
              System.out.print("Would you like to enter a phrase in English or in Morse-code? ");
              Response = input.next();
          }

          if(Response.equalsIgnoreCase(english))
          {
              System.out.print("Please enter your English phrase: ");
              input.nextLine();
              phrase = input.nextLine();    

              System.out.println("You entered: " + phrase);
              phrase = phrase.toUpperCase();
              System.out.print("In morse code, this is: ");

              for(int count = 0; count < phrase.length(); count++ )
              { 
                  for(int index = 0; index < English.length; index++) 
                  { 
                      if(phrase.substring(count, (count+1)).equals(English[index]))
                          System.out.print(Morse[index] + " "); 
                  } 
              } 
          }
          else if(Response.equalsIgnoreCase(morse))
          {
              System.out.print("Please enter your Morse-code phrase: ");
              input.nextLine();
              phrase = input.nextLine();    

              System.out.println("You entered: " + phrase);
              System.out.print("In English, this is: ");

              for(int count = 0; count < phrase.length(); count++ )
              { 
                  for(int index = 0; index < Morse.length; index++) 
                  { 
                      if(phrase.substring(count, (count+1)).equals(Morse[index])) 
                          System.out.print(English[index]); 
                  } 
              } 
          }
          loop++;

          System.out.print("Would you like to enter another phrase? (Y or N): ");
          answer = input.next();

          while(!(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")))
            {
                System.out.print("Incorrect input. Please enter either 'Y' or 'N'.");
                answer = input.next();  
            }
          if(answer.equalsIgnoreCase("Y"))
          {
              loop = 0;
          }
          else
              {
                
                input.close();
              }

      }
}
}
