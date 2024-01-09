package demo.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    // The `playMp4` method is a method that is required to be implemented because the `VlcPlayer`
    // class implements the `AdvanceMediaPlayer` interface. However, in this implementation, the method
    // does nothing. It is empty and does not perform any actions.
    // The `playMp4` method is a method that is required to be implemented because the `VlcPlayer`
    // class implements the `AdvanceMediaPlayer` interface. However, in this implementation, the method
    // does nothing. It is empty and does not perform any actions.
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    // The `playVlc` method is responsible for playing a VLC file. It takes a `fileName` parameter,
    // which represents the name of the VLC file to be played. Inside the method, it simply prints a
    // message indicating that the VLC file is being played.
    public void playVlc(String fileName) {
        System.out.println("playing vlc file "+fileName);
    }
}
