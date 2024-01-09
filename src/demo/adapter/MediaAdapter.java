package demo.adapter;

public class MediaAdapter implements MediaPlayer{
    // The line `AdvanceMediaPlayer advanceMediaPlayer;` is declaring a variable named
    // `advanceMediaPlayer` of type `AdvanceMediaPlayer`. This variable is used to store an instance of
    // a class that implements the `AdvanceMediaPlayer` interface.
    AdvanceMediaPlayer advanceMediaPlayer;

    // The `MediaAdapter` constructor is responsible for creating an instance of the `MediaAdapter`
    // class. It takes a parameter `audioType` which specifies the type of audio file to be played.
    public MediaAdapter(String audioType){
        // The code block `if(audioType.equalsIgnoreCase("vlc")){ advanceMediaPlayer = new VlcPlayer();
        // } else if(audioType.equalsIgnoreCase("mp4")){ advanceMediaPlayer = new Mp4Player(); }` is
        // responsible for creating an instance of the appropriate player class based on the
        // `audioType` parameter.
        if(audioType.equalsIgnoreCase("vlc")){
            // The line `advanceMediaPlayer = new VlcPlayer();` is creating a new instance of the
            // `VlcPlayer` class and assigning it to the `advanceMediaPlayer` variable. This allows the
            // `MediaAdapter` class to use the methods provided by the `VlcPlayer` class to play VLC
            // audio files.
            advanceMediaPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")){
            // The line `advanceMediaPlayer = new Mp4Player();` is creating a new instance of the
            // `Mp4Player` class and assigning it to the `advanceMediaPlayer` variable. This allows the
            // `MediaAdapter` class to use the methods provided by the `Mp4Player` class to play MP4
            // audio files.
            advanceMediaPlayer = new Mp4Player();
        }
    }
    @Override
    // The `play` method is responsible for playing the audio file specified by the `fileName`
    // parameter. It takes two parameters: `audioType` which specifies the type of audio file, and
    // `fileName` which specifies the name of the audio file.
    public void play(String audioType, String fileName) {
        // The code block `if(audioType.equalsIgnoreCase("vlc")){
        //             advanceMediaPlayer.playVlc(fileName);
        //         } else if(audioType.equalsIgnoreCase("mp4")){
        //             advanceMediaPlayer.playMp4(fileName);
        //         }` is responsible for playing the audio file based on its type.
        if(audioType.// The `equalsIgnoreCase` method is a method provided by the `String` class in
        // Java. It is used to compare two strings for equality, ignoring the case of the
        // characters.
        equalsIgnoreCase("vlc")){
            // The line `advanceMediaPlayer.playVlc(fileName);` is calling the `playVlc` method on the
            // `advanceMediaPlayer` object. This method is responsible for playing a VLC audio file
            // specified by the `fileName` parameter.
            advanceMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
