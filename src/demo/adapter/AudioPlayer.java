package demo.adapter;

/**
 * The `AudioPlayer` class is responsible for playing audio files, and it uses a `MediaAdapter` to
 * adapt different audio formats.
 */
public class AudioPlayer implements MediaPlayer{
    // `MediaAdapter mediaAdapter;` is declaring a variable `mediaAdapter` of type `MediaAdapter`. This
    // variable is used to create an instance of the `MediaAdapter` class, which is responsible for
    // adapting different audio formats (such as VLC and MP4) to be played by the `AudioPlayer` class.
    MediaAdapter mediaAdapter;
    @Override
    // The `play` method in the `AudioPlayer` class is responsible for playing audio files. It takes
    // two parameters: `audioType` and `fileName`.
    public void play(String audioType, String fileName) {
        // The code block is implementing the logic for playing audio files in the `AudioPlayer` class.
        if(audioType.equalsIgnoreCase("mp3")){
           // The line `System.out.println("playing mp3 file"+fileName);` is printing a message to the
           // console. It is displaying the message "playing mp3 file" followed by the value of the
           // `fileName` variable. This line is executed when the `audioType` parameter is equal to
           // "mp3" in the `play` method of the `AudioPlayer` class.
            System.out.println("playing mp3 file"+fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            // The code `mediaAdapter = new MediaAdapter(audioType);` creates a new instance of the
            // `MediaAdapter` class and assigns it to the `mediaAdapter` variable. The `audioType`
            // parameter is passed to the constructor of the `MediaAdapter` class.
            mediaAdapter = new MediaAdapter(audioType);
            // The line `mediaAdapter.play(audioType,fileName);` is calling the `play` method of the
            // `MediaAdapter` class and passing the `audioType` and `fileName` parameters to it. This
            // line is executed when the `audioType` parameter in the `play` method of the
            // `AudioPlayer` class is either "vlc" or "mp4". It delegates the responsibility of playing
            // the audio file to the `MediaAdapter` class, which is responsible for adapting different
            // audio formats.
            mediaAdapter.play(audioType,fileName);
        } else {
            // The line `System.out.println("Invalid media "+audioType+"format not supported");` is
            // printing a message to the console. It is displaying the message "Invalid media" followed
            // by the value of the `audioType` variable, and then "format not supported". This line is
            // executed when the `audioType` parameter in the `play` method of the `AudioPlayer` class
            // does not match any of the supported audio formats ("mp3", "vlc", "mp4").
            System.out.println("Invalid media "+audioType+"format not supported");
        }
    }
}
