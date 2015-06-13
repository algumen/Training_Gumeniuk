/**
 * Created by Oleksii on 07.06.2015.
 */

public class Initialize_6

{
public class Rectangle
    {
    private int rectLeft;
    private int rectTop;
    private int rectWidth;
    private int rectHeight;

    public void initialize(int left, int top, int width, int height)
        {
        this.rectLeft = left;
        this.rectTop = top;
        this.rectWidth = width;
        this.rectHeight = height;
        //Напишите тут ваш код
        }
    }
    public void main(String[] args)
    {
        Rectangle pryamoug = new Rectangle();
        pryamoug.initialize(5,4,0,0);
        Rectangle pryamoug_2 = new Rectangle();
        pryamoug_2.initialize(5,4,1,1);
        Rectangle pryamoug_3 = new Rectangle();
        pryamoug_3 = pryamoug_2;
    }

}