public class Dimensions { //отдельный иммутабельный класс для габаритов
    private  final int width;
    private  final int height;
    private  final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Dimensions setWidth(int width) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setHeight(int height) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setLength(int length) {
        return new Dimensions(width, height, length);
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getLength() {return length;}

    public double volume(){
        return length * width * height;
    }

    public String toString(){
        return "Длина " + length + "см.;" + " Ширина " + width + "см.;" + " Высота " + height + "см.;";
    }
}

