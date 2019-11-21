// Taco.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Taco extends Applet
{

   public void paint(Graphics g)
   {
      
   }
   public static void drawMold(Graphics g)
   {
      //This draws the block shape of the Minecraft taco block
      g.setColor(Color.black);
      int x1[] = {100, 200, 200, 100, 100};
      int y1[] = {300, 350, 475, 425, 300};
      int n1[] = 5;
      g.drawPolygon(x1, y1, n1);
      int x6[] = {100, 200, 300, 200, 100};
      int x6[] = {300, 250, 300, 350, 300};
      int n6 = 5;
      g.drawPolygon(x6, y6, n6);
      int x7[] = {200, 300, 300, 200, 200};
      int y7[] = {350, 300, 425, 475, 350};
      int n7 = 5;
      g.drawPolygon(x7, y7, n7);
   }
   public static void drawTaco(Graphics g)
   {
      Color tacoYellow = new Color(247, 195, 47);
      Color lettuceGreen = new Color(119, 209, 75);
      Color tacoMeat = new Color(142, 101, 71);
      Color tomato = new Color(235, 102, 59);
      g.setColor(tacoYellow);
      //this draws shell
      int x2[] = {100, 125, 210, 220, 230, 240, 280, 275, 285, 280, 195, 200, 300, 300, 200, 100, 100};
      int y2[] = {300, 288, 345, 425, 420, 445, 425, 410, 405, 305, 255, 250, 300, 425, 475, 425, 300};
      int n2[] = 17;
      g.fillPolygon(x2, y2, n2);
      g.setColor(lettuceGreen);
      //this draws lettuce
      int x3[] = {125, 210, 220, 230, 240, 250, 225, 155, 125};
      int y3[] = {288, 345, 425, 420, 445, 435, 340, 275, 288};
      int n3 = 9;
      g.fillPolygon(x3, y3, n3);
      g.setColor(tacoMeat);
      //this draws taco meat
      int x4[] = {155, 185, 250, 275, 250, 225, 155};
      int y4[] = {275, 255, 325, 425, 435, 340, 275};
      int n4 = 7;
      g.fillPolygon(x4, y4, n4);
      g.setColor(tomato);
      //this draws tomatoes
      int x5[] = {185, 195, 280, 285, 275, 280, 270, 250, 185};
      int y5[] = {255, 253, 305, 405, 410, 425, 430, 325, 255};
      int n5 = 9;
      g.fillPolygon(x5, y5, n5);
   }
}