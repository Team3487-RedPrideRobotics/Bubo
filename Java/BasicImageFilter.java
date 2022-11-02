import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class BasicImageFilter {
    public static void main (String[] args) {
        BufferedImage image = null;

        try {
            var inputFile = new File("testImage.jpg");
            image = ImageIO.read(inputFile);
        }
        catch (IOException ex) {
            System.out.print("couldn't read image");
        }

        var processedImage = ProcessImage(image);

        try {
            var outputFile = new File("resultImage.jpg");
            ImageIO.write(processedImage, "jpg", outputFile);
        }
        catch (IOException ex) {
            System.out.print("couldn't write image");
        }
    }

    private static BufferedImage ProcessImage(BufferedImage inputImage) {
        var width = inputImage.getWidth();
        var height = inputImage.getHeight();

        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                var pixel = new Pixel(inputImage.getRGB(w, h));
                if (inputImage.getRGB(w, h) != pixel.GetIntegerPixel()) {
                    System.out.print("values do not match");
                }
                pixel = FilterPixel(pixel);
                inputImage.setRGB(w, h, pixel.GetIntegerPixel());
            }
        }

        System.out.print("image is processed");
        return inputImage;
    }

    private static Pixel FilterPixel(Pixel input) {
        //do something interesting here.
        return input;
    }
}