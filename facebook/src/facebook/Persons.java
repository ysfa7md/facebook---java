
package facebook;


import java.util.ArrayList;

import java.util.List;


public class Persons {
    static ArrayList <Person> persons = new ArrayList <>() ;

    // Actual user
    public static Person Online;
    //run this method for test
    public static void run (){




        Person p = new Person (
                new ArrayList<>(List.of(
                        "1.1|like:12|private{WHO AM I @mona_2",
                        "1.1.1|like:3{you are Hisham",
                        "1.2|like:5|public{I like coffee",
                        "1.2.1|like:2{and me !"

                )), "Mohame Ali", 1 , "12/2/2000", "male" , "Mohamed_Ali@gmail.com", "12345678" , new ArrayList<>(List.of(1,2,3)));

        persons.add(p);


        p = new Person (
                new ArrayList<>(List.of(
                        "1.1|like:12|private{WHO AM I @Mohamed_1",
                        "2.1.1|like:3{you are Hisham",
                        "2.2|like:5|security:public{I like coffee",
                        "2.2.1|like:2{and me !"

                )), "mona mohamed", 2 , "12/2/2000", "female" , "mona@gmail.com", "12345678",  new ArrayList<>(List.of(1,3,2)) );

        persons.add(p);



        p = new Person (
                new ArrayList<>(List.of(
                         "1.1|like:12|private{WHO AM I @mona_2",
                        "1.1.1|like:3{you are Hisham",
                        "1.2|like:5|public{I like coffee",
                        "1.2.1|like:2{and me !"

                )), "Ahmed yaser", 3 , "12/2/2000", "male" , "ahmed@gmail.com", "12345678",  new ArrayList<>(List.of(1,2,3)) );

        persons.add(p);

        //---- Fetch actual user data

        Online = persons.get(0);

    }


}
