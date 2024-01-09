package demo.adapter;

// The code snippet is defining an interface called `AdvanceMediaPlayer`. This interface declares two
// methods: `playMp4` and `playVlc`.
public interface AdvanceMediaPlayer {
   /**
    * The playMp4 function plays a video file with the given fileName in the MP4 format.
    * 
    * @param fileName The fileName parameter is a string that represents the name or path of the MP4
    * file that you want to play.
    */
    public void playMp4(String fileName);
    public void playVlc(String fileName);
}
