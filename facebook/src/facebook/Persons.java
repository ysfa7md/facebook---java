
package facebook;

import java.util.ArrayList;

import java.util.List;


public class Persons {
    // Actual user
    public static Person Online;
    //run this method for test
    public static void run (){
        
         
        
        ArrayList <Person> persons = new ArrayList <>() ; 
  
        Person p = new Person (
        new ArrayList<>(List.of(
            "1.1|like:12|security:private[2,3]tag:yes[2]{WHO AM I @?",
            "1.1.1|like:3{you are Hisham",
            "1.2|like:5|security:public{I like coffee",
            "1.2.1|like:2{and me !" 
       
        )), "Mohamed Ali", 1 , "12/2/2000", "male" , "Mohamed_Ali@gmail.com", "12345678" );
        
        persons.add(p);
        
        
          p = new Person (
        new ArrayList<>(List.of(
            "1.1|like:12|security:private[2,3]tag:yes[2]{WHO AM I @?",
            "2.1.1|like:3{you are Hisham",
            "2.2|like:5|security:public{I like coffee",
            "2.2.1|like:2{and me !" 
       
        )), "mona mohamed", 1 , "12/2/2000", "female" , "mona@gmail.com", "12345678" );
        
        persons.add(p);
        
        
        
               p = new Person (
        new ArrayList<>(List.of(
            "1.1|like:12|security:private[2,3]tag:yes[2]{WHO AM I @?",
            "3.1.1|like:3{you are Hisham",
            "3.2|like:5|security:public{I like coffee",
            "3.2.1|like:2{and me !" 
       
        )), "Ahmed yaser", 1 , "12/2/2000", "male" , "ahmed@gmail.com", "12345678" );
        
        persons.add(p);
        
        //---- Fetch actual user data 
        
        Online = persons.get(0);
    
    }
    
    
}