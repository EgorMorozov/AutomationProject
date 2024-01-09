public class Record {
    private int bitrate;
    private float size;
    private String time;
    private String singer;

    public static int a=20;

    public static void changeA(int changeTo){
        a= changeTo;
    }


    public final int TEST = 10;

    Record(int bitrate, float size, String time, String singer) {
        this.bitrate = bitrate;
        this.size = size;
        this.time = time;
        this.singer = singer;
    }

    float changeSize(float newSize) {
        a = 10;
        return size = newSize;
    }
}
