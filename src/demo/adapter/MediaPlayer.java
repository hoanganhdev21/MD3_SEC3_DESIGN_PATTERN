package demo.adapter;

public interface MediaPlayer {
   /**
    * The play function takes in an audio type and file name as parameters and plays the corresponding
    * audio file.
    * 
    * @param audioType The audio type parameter specifies the type or format of the audio file that you
    * want to play. Examples of audio types could be "mp3", "wav", "aac", etc.
    * @param fileName The name of the audio file that you want to play.
    */
    void play(String audioType, String fileName);
}
