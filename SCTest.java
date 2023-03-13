package dz4;

import java.util.Scanner;

public class SCTest{
    public static void main( String[] args ){
      Scanner scanner = new Scanner(System.in);
      int count;
      String[] names = {"Nazar","Oleg","Nikita","Nazar","Nazar","Oleg"};
      for (int i = 0; i < names.length; i++) {
        System.out.print(names[i]+ " ");
      }
      System.out.println();
      System.out.print("Input your char: ");
     char cht = scanner.next().charAt(0);
     boolean isFound = false;
      for (int i = 0; i < names.length; i++) {
        for (int j = 0; j < names[i].length(); j++) {
          if(names[i].charAt(j)== cht){
            System.out.printf("[%d,%d]", i,j);
            System.out.println();
            isFound = true;
            break;
          }
        }
        if(isFound){
          break;
        }
      }
      
     
        System.out.println("-------------------------");
        String str ="aaabbc";
        char ch;
        int counter =1;
        for (int i = 0; i < str.length(); i++) {
          ch = str.charAt(i);
          for (int j = 0; j < str.length(); j++) {
            if(ch == str.charAt(j)){
              counter++;
            }
          }
          System.out.println(ch);
        }
        System.out.println(counter);

      
      System.out.println("-------------------------");
      // First and Last
      String first = names[0];
      String last = names[names.length-1];
      System.out.println("FIRST stringin array: "+ first);
      System.out.println("LAST string in array: " + last);            
        
      System.out.println("-------------------------");
      //?
      for(int i=0; i<names.length;i++){
        count=1;
        for (int j = i+1; j < names.length; j++){
          if(names[i].equals(names[j])){
            count++;
            names[j]= "";
          }         
        }   
      if(!names[i].equals("") && count>1){
        System.out.println(names[i]+ " - "+ count);
      }   
      } 
      
       
}}
