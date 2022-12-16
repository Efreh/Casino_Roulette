package animationsSounds;

import java.io.*;
import javax.sound.sampled.*;

public class SoundsPlayer {

    float volume = 0.8f;

    public void fountMusic() {
        try {
            File fountFile = new File("src/musicRes/fount_music1.wav");            //Звуковой файл

            AudioInputStream ais = AudioSystem.getAudioInputStream(fountFile);

            Clip clip = AudioSystem.getClip();

            clip.open(ais);

            FloatControl vc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            vc.setValue((vc.getMaximum() - vc.getMinimum()) * volume + vc.getMinimum());

            clip.setFramePosition(0);
            clip.start();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }
    }
}
