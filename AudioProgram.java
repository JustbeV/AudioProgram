/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Administrator
 */
public class AudioProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
    // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        File file= new File("HighHope.wav");
       
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
                 
        Clip clip= AudioSystem.getClip();
        clip.open(audio);
        
        String resp=" ";
        
        while(!resp.equals("Q")){
            System.out.println("P- play,S-stop,R- reset,Q-quit");
            System.out.print("Enter your choice: ");
            
            resp= sc.next();
            resp=resp.toUpperCase();
            
            switch(resp){
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default: System.out.println("Wrong key");
            }
            System.out.println("bye!");
        }
        
    }
    
}
