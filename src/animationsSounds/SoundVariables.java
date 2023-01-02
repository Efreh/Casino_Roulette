package animationsSounds;

import java.io.Serializable;

public class SoundVariables implements Serializable{
    private String fountMusic = "/musicRes/fount_music1.wav";
    public String getFountMusic(){return fountMusic;}
    
    private String ballRun = "/musicRes/vraschenie-sharika.wav";
    public String getBallRun(){return ballRun;}
    
    private String winClip = "/musicRes/win_clip.wav";
    public String getWinClip(){return winClip;}
    
    private String luseClip = "/musicRes/luse_clip.wav";
    public String getLuseClip(){return luseClip;}
    
    private String gameOverClip = "/musicRes/gameOver_clip.wav";
    public String getGameOverClip(){return gameOverClip;}
    
    private String chipClip = "/musicRes/chip_clip.wav";
    public String getChipClip(){return chipClip;}
    
    public void rotCasinoSoundProfile(){
        winClip = "/musicResRotCasino/win_clip.wav";
        luseClip = "/musicResRotCasino/luse_clip.wav";
        gameOverClip = "/musicResRotCasino/gameOver_clip.wav";
    }
    public void standartSoundProfile(){
        winClip = "/musicRes/win_clip.wav";
        luseClip = "/musicRes/luse_clip.wav";
        gameOverClip = "/musicRes/gameOver_clip.wav";
    }
}
