import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<String> music = new ArrayList<String>();
        
        Singer<String> music1 = new  Singer<String>();
        music1.setSingername("Why Don't We");
        music1.setMusicname("8 Letters");
        music1.setDaterelease("Aug 19, 2018");
        music.add("\""+ music1.getDaterelease() + "\"" + " from "+ music1.getMusicname() + " by: " + music1.getSingername());

        Singer<String> music2 = new  Singer<String>();
        music2.setSingername("Rex Orange County");
        music2.setMusicname("The Shade");
        music2.setDaterelease("Mar 11, 2022");
        music.add("\""+ music2.getDaterelease() + "\"" + " from "+ music2.getMusicname() + " by: " + music2.getSingername());

        Singer<String> music3 = new  Singer<String>();
        music3.setSingername("IV of Spades");
        music3.setMusicname("Come Inside Of My Heart");
        music3.setDaterelease("Oct 13, 2019");
        music.add("\""+ music3.getDaterelease() + "\"" + " from "+ music3.getMusicname() + " by: " + music3.getSingername());

        Singer<String> music4 = new  Singer<String>();
        music4.setSingername("Enhypen");
        music4.setMusicname("I Need the Light");
        music4.setDaterelease("Aug 12, 2022");
        music.add("\""+ music4.getDaterelease() + "\"" + " from "+ music4.getMusicname() + " by: " + music4.getSingername());

        Singer<String> music5 = new  Singer<String>();
        music5.setSingername("Cravity");
        music5.setMusicname("Believer");
        music5.setDaterelease("Aug 24, 2020");
        music.add("\""+ music5.getDaterelease() + "\"" + " from "+  music5.getMusicname() + " by: " + music5.getSingername());

        System.out.print("Enter Music index: ");
        Integer user = input.nextInt();

        try{
            if(user < 0){
                input.close();
                throw new Exception("Your input is negative. Please input positive index.");
            }
            if(user > 5){
                input.close();
                throw new Exception("Your input exceeds the size of array.");
            }

            System.out.println("Music Index: " + user);
            System.out.println(music.get(user));

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        input.close();

    }
}