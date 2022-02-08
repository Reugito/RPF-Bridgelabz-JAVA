package com.bridgelabz.programs;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
  
public class ImageTransfer
{
    public static void main(String args[])throws IOException
    {
        int width = 103;  
        int height = 640;   
  
        BufferedImage image = null;
        try
        {
            File input_file = new File("D:\\Demonslayer.jpg"); 
          
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
  
            image = ImageIO.read(input_file);
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
  
        try
        {
            File output_file = new File("D:\\om\\Out.jpg");
            ImageIO.write(image, "jpg", output_file);
            
            System.out.println("Image transfer successfull");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
    }
}