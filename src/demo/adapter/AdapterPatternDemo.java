package demo.adapter;

/**
 * The AdapterPatternDemo class demonstrates the usage of an AudioPlayer to play different types of
 * audio files.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // The line `AudioPlayer audioPlayer = new AudioPlayer();` is creating a new instance of the
        // `AudioPlayer` class and assigning it to the variable `audioPlayer`. This allows us to use
        // the `audioPlayer` object to call methods and perform actions defined in the `AudioPlayer`
        // class.
        AudioPlayer audioPlayer = new AudioPlayer();
       // The line `audioPlayer.play("mp3","com-buom-xuan.mp3");` is calling the `play` method of the
       // `AudioPlayer` object and passing two arguments: "mp3" and "com-buom-xuan.mp3".
        audioPlayer.play("mp3","com-buom-xuan.mp3");
        audioPlayer.play("mp4","nhat-ky-vang-anh.mp4");
        audioPlayer.play("vlc","tram-an.vlc");
        audioPlayer.play("avi","demo.avi");
    }
}
