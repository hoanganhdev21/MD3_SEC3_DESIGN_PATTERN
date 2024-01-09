package demo.adapter;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
   // The `playMp4` method is responsible for playing a mp4 file. It takes a `fileName` parameter,
   // which represents the name of the mp4 file to be played. Inside the method, it simply prints a
   // message indicating that the mp4 file is being played.
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file"+fileName);
    }

    @Override
    // The `playVlc` method in the `Mp4Player` class is a method that is required to be implemented
    // because the `Mp4Player` class implements the `AdvanceMediaPlayer` interface. However, since the
    // `Mp4Player` class is specifically designed to play mp4 files, the `playVlc` method does not have
    // any functionality and simply does nothing.
    public void playVlc(String fileName) {
        // do nothing
    }
}
