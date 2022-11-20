

public class Pixel {
    public int Alpha;
    public int Red;
    public int Green;
    public int Blue;

    public Pixel(int integerPixel) {
        Alpha = (integerPixel&0xff000000)>>24;
        Red =   (integerPixel&0x00ff0000)>>16;
        Green = (integerPixel&0x0000ff00)>>8;
        Blue =  (integerPixel&0x000000ff)>>0;
    }

    public int GetIntegerPixel() {
        return (Alpha<<24) | (Red<<16) | (Green<<8) | (Blue);
    }
}
