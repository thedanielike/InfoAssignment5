/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingassignment;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author danielike
 */
public class TonePlayer {
    private final File[] toneFiles;
    private final Object lock = new Object();
    private int currentToneIndex = 0;

    public TonePlayer(String[] toneFileNames) {
        toneFiles = new File[toneFileNames.length];
        for (int i = 0; i < toneFileNames.length; i++) {
            toneFiles[i] = new File(toneFileNames[i]);
        }
    }

    public void playNextTone() {
        synchronized (lock) {
            if (currentToneIndex < toneFiles.length) {
                playSound(toneFiles[currentToneIndex]);
                currentToneIndex++;
            }
        }
    }

    private void playSound(File soundFile) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
