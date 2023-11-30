/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadassignment;

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
        tonePlayer.playNextTone(); // do
        System.out.println("do");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // la
        System.out.println("la");
        tonePlayer.playNextTone(); // la
        System.out.println("la");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // do
        System.out.println("do");
    }
}

class Thread2 extends Thread {
    private final TonePlayer tonePlayer;

    public Thread2(TonePlayer tonePlayer) {
        this.tonePlayer = tonePlayer;
    }

    @Override
    public void run() {
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // do
        System.out.println("do");
    }
}

class Thread3 extends Thread {
    private final TonePlayer tonePlayer;

    public Thread3(TonePlayer tonePlayer) {
        this.tonePlayer = tonePlayer;
    }

    @Override
    public void run() {
        tonePlayer.playNextTone(); // do
        System.out.println("do");
        tonePlayer.playNextTone(); // do
        System.out.println("do");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // la
        System.out.println("la");
        tonePlayer.playNextTone(); // la
        System.out.println("la");
        tonePlayer.playNextTone(); // so
        System.out.println("so");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // fa
        System.out.println("fa");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // mi
        System.out.println("mi");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // re
        System.out.println("re");
        tonePlayer.playNextTone(); // do
        System.out.println("do");
    }
}

public class TwinkleTwinkleExample {
    public static void main(String[] args) {
        String[] toneFileNames = {
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/la.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/la.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/la.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/la.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/sol.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/fa.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/mi.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/re.wav",
                "/Users/danielike/Downloads/Multithreading  Resources/Sounds/do.wav",
                
        };

        TonePlayer tonePlayer = new TonePlayer(toneFileNames);

        Thread1 thread1 = new Thread1(tonePlayer);
        Thread2 thread2 = new Thread2(tonePlayer);
        Thread3 thread3 = new Thread3(tonePlayer);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
