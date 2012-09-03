Vertical Carousel!

I used the source from this link :http://www.codeproject.com/Articles/146145/Android-3D-Carousel here.

In Carousel.java, we have to modify the code :

private void Calculate3DPosition(CarouselItem child, int diameter,float angleOffset) 
{
        angleOffset = angleOffset * (float) (Math.PI / 180.0f);
        float y = (float) (diameter / 2 * Math.sin(angleOffset)) + diameter / 2
                - child.getWidth() / 2;
        float z = diameter / 2 * (1.0f - (float) Math.cos(angleOffset));
        float x = (float) (-   diameter / 2 * Math.cos(angleOffset) * 0.5);
        child.setX(x + 250);//This values should be change (250)
        child.setZ(z);
        child.setY(y - 150);//This values should be change(150) 
}

I have done some adjustment for my project by changing setX,setY values and it is worked for me.
If anybody can suggest in proper calculations should be appreciatable. 
