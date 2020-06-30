/*Autor: Yuceli Polanco*/

package uts2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MainClass 
{
    
    FileInputStream FIS;
    BufferedInputStream BIS;
    long currentFrame;
    
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    public String fileLocation;
    private AudioInputStream ThisInputStream = null;
    public Clip clip = null;
    
    public void Stop(){
        if(player != null){
            player.close();
            
             pauseLocation = 0;
             songTotalLength = 0;
             
             MP3PlayerGUI.Display.setText("");
             
            currentFrame = 0L; 
            clip.stop(); 
            clip.close(); 
        }
    }
    
    public void Pause() throws IOException{
        if(player != null){
            try{
               pauseLocation =  FIS.available();
               player.close();
               this.currentFrame =  
               this.clip.getMicrosecondPosition(); 
               clip.stop(); 
      
            }
            catch(IOException ex){
                
            }
           
        }
    }
    
    public void Play(String path) throws UnsupportedAudioFileException, LineUnavailableException{
        
        try {
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            songTotalLength = FIS.available();
            fileLocation = path + "";
            
            ThisInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(ThisInputStream);
            clip.start();
        
        } catch (FileNotFoundException  | JavaLayerException ex ) {
            
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                    
                    if(player.isComplete() && MP3PlayerGUI.count == 1){
                        Play(fileLocation);
                    }
                    if(player.isComplete()){
                        MP3PlayerGUI.Display.setText("");
                    }
                } catch (JavaLayerException ex) {
                    
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
        
    }
    
    public void Resume() throws JavaLayerException, IOException, UnsupportedAudioFileException, LineUnavailableException{
        
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            FIS.skip(songTotalLength - pauseLocation);
            
            clip.close(); 
            resetAudioStream(); 
            clip.setMicrosecondPosition(currentFrame); 
             
    
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);

       
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);

        } catch (JavaLayerException ex) {
            Logger.getLogger(MP3PlayerGUI.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
         new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    
                }
            }
        }.start();
         
        }
    
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, 
                                            LineUnavailableException  
    { 
        ThisInputStream = AudioSystem.getAudioInputStream( 
        new File(fileLocation).getAbsoluteFile()); 
        clip.open(ThisInputStream); 
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
    

    }
