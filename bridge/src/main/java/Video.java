public abstract class Video {
    protected VideoProcessor processor;
    public Video(VideoProcessor processor){
        this.processor = processor;
    }
    public abstract void play(String videoFile);
}
