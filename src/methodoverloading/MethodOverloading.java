/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author Muhammad Shameem
 */
class Shape
{
        int ht,wd,side;
        double  rad;
        Shape(int a)
        {
                side=a;
        }
        Shape(int h,int w)
        {
                ht=h;
                wd=w;
        }
        Shape(double  r)
        {
                rad=r;
        }
        void showSide ()
        {
                System.out.println("Side="+side);
        }

        void showHeight()
        {
                System.out.println("Height="+ht+" Width="+wd);
        }
        void showRadius()
        {
                System.out.println("Radius="+rad);
        }
        void area(int a)
        {
                int area=a*a;
                System.out.println("Area of Square="+area);
        }
        void area(int l, int b)
        {
                int area=l*b;
                System.out.println("Area of Rectangle="+area);
        }
        void area(double r)
        {
                double area=3.14*r*r;
                System.out.println("Area of Circle="+area);
        }
}

public class MethodOverloading {

   
    public static void main(String[] args) {
          Shape s1=new Shape(10);
                Shape s2=new Shape(20,30);
                Shape s3=new Shape(40l);
                s1.showSide();
                s2.showHeight();
                s3. showRadius();
                s1.area(5);
                s2. area(4,5);
                s3. area(1.75);

    }
    
}
