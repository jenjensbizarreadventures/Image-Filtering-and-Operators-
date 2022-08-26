
public class ImageCombine
{
    public static void main(String [] args)
    {
        PixImage original = new PixImage("Holly3.jpg");
        original.showImage();
        
        PixImage additional = new PixImage("CloudStars.jpg");
        additional.showImage();



        for (int i = 0; i < additional.red.length; i++)
        {
            for (int j = 0; j < additional.red[0].length; j++)
            {
                if (additional.red[i][j] > 128)
                {
                    original.red[i][j] += 75;
                }
                else 
                {
                    original.blue[i][j] += 80;
                }
                original.red[i][j] = original.red[i][j] * additional.red[i][j] / 255;
                original.green[i][j] = original.green[i][j] * additional.green[i][j] / 255;
                original.blue[i][j] = original.blue[i][j] * additional.blue[i][j] / 255;
            }
        }

        original.showImage();
    }


    
}
