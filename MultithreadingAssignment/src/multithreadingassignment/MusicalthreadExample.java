/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingassignment;

/**
 *
 * @author danielike
 */

class Thread1 extends Thread {
    private final TonePlayer tonePlayer;

    public Thread1(TonePlayer tonePlayer) {
        this.tonePlayer = tonePlayer;
    }

    @Override
    public void run() {
        tonePlayer.playNextTone(); // do
                System.out.println("do");
        tonePlayer.playNextTone(); // mi
                System.out.println("mi");
        tonePlayer.playNextTone(); // sol
                System.out.println("sol");
        tonePlayer.playNextTone(); // si
                System.out.println("si");
        
    }
}
class Thread2 extends Thread {
    private final TonePlayer tonePlayer;

    public Thread2(TonePlayer tonePlayer) {
        this.tonePlayer = tonePlayer;
    }

    @Override
    public void run() {
        tonePlayer.playNextTone(); // re
                System.out.println("re");
        tonePlayer.playNextTone(); // fa
                System.out.println("la");
        tonePlayer.playNextTone(); // la
                System.out.println("la");
        tonePlayer.playNextTone(); // do-octave
                System.out.println("d0-octave");
    }
}

public class MusicalthreadExample {
    public static void main(String[] args) {
        String[] toneFileNames = {
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/la.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/si.wav",
                "/Users/danielike/Documents/NEU/Fall 2023/INFO 5100/Multithreading/Multithreading  Resources/Sounds/do-octave.wav"
        };

        TonePlayer tonePlayer = new TonePlayer(toneFileNames);

        Thread1 thread1 = new Thread1(tonePlayer);
        Thread2 thread2 = new Thread2(tonePlayer);

        thread1.start();
        thread2.start();
    }
}
