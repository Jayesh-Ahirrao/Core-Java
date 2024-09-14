public class Box {
    private int length;
    private int breadth;
    private int depth;

    public Box() {
        length = breadth = depth = 0;
    }

    public Box(int length, int breadth, int depth) {
        this.length = length;
        this.breadth = breadth;
        this.depth = depth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("breadth: " + breadth);
        System.out.println("depth: " + depth);
    }

    public int calVolume() {
        return length * breadth * depth;
    }

    public void setLength(int len) {
        this.length = len;
    }
}
