// TWICE.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class TWICE extends Applet
{

   public void paint(Graphics g)
   {
      drawT(g);
      drawW(g);
      drawI(g);
      drawTwice(g);
   }
   public static void drawT(Graphics g)
   {
      Color twicePink = new Color(255, 95, 162);
      g.setColor(twicePink);
      //this method draws the 'T' kind of part in the Twice logo
      int x1[] = {525, 500, 490, 500, 525, 550, 575, 600, 625, 640, 650, 660, 665, 650, 625, 600, 575, 550, 525, 510, 525, 550, 525};
      int y1[] = {175, 150, 140, 125, 100,  90,  85,  80,  75,  70,  50,  70,  95, 100, 100, 100, 100, 110, 120, 140, 150, 160, 175};
      int n1 = 23;
      g.fillPolygon(x1, y1, n1);
      int x2[] = {560, 558, 555, 560, 565, 580, 577, 576, 580, 560};
      int y2[] = {100, 125, 123, 140, 150, 150, 140, 135, 100, 100};
      int n2 = 10;
      g.fillPolygon(x2, y2, n2);
      g.setColor(twicePeach);
      g.drawLine(565, 150, 580, 150);
   }
   public static void drawW(Graphics g)
   {
      Color twiceOrange = new Color(253, 179, 165);
      //this draws the left part of the 'w' logo
      g.setColor(twiceOrange);
      int x3[] = {560, 580, 583, 585, 587, 600, 620, 622, 624, 622, 623, 625, 630, 632, 630, 615, 600, 580, 575, 565, 555, 560};
      int y3[] = {101, 101, 165, 175, 180, 185, 175, 170, 165, 155, 145, 144, 150, 165, 150, 190, 195, 200, 200, 190, 175, 101};
      int n3 = 22;
      g.fillPolygon(x3, y3, n3);
      int x4[] = {622, 615, 610, 614, 612, 611, 622};
      int y4[] = {170, 150, 160, 175, 175, 160, 185};
      int n4 = 7;
      g.fillPolygon(x4, y4, n4);
   }
   public static void drawI(Graphics g)
   {
      Color twiceYellow = new Color(252, 207, 166);
      g.setColor(twiceYellow);
      //draws 'I'
      int x5[] = {625, 630, 638, 640, 639, 638, 637, 639, 650, 655, 660, 665, 665, 655, 650, 638, 625, 620};
      int y5[] = {175, 180, 175, 160, 150, 135, 125, 115, 117, 114, 125, 128, 170, 175, 185, 190, 187, 185};
      int n5 = 18;
      g.fillPolygon(x5, y5, n5);
      int x6[] = {660, 665, 660, 665, 668, 675, 668, 665, 660};
      int y6[] = {125, 120, 115, 113, 115, 120, 125, 130, 135};
      int n6 = 9;
      g.fillPolygon(x6, y6, n6);
   }
   public static void drawTwice(Graphics g)
   {
      //This draws the letters 'Twice'
      Color twiceYellow = new Color(252, 207, 166);
      Color twiceOrange = new Color(253, 179, 165);
      Color twiceApricot = new Color(254, 151, 164);
      Color twiceMagenta = new Color(254, 123, 163);
      Color twicePink = new Color(255, 95, 162);
      g.setColor(Color.yellow);
      g.drawLine(525, 25, 550, 75);
      g.drawLine(600, 10, 600, 50);
      g.drawLine(675, 75, 725, 25);
      g.drawLine(725, 100, 775, 75);
      g.drawLine(725, 150, 775, 150);
      g.drawLine(725, 100, 775, 75);
      g.drawLine(725, 200, 775, 225);
      g.drawLine(650, 200, 675, 250);
      g.drawLine(500, 250, 550, 200);
      g.drawLine(425, 150, 475, 150);
      g.drawLine(450, 75, 500, 100);
      g.drawLine(525, 25, 550, 75);
      g.setColor(twiceYellow);
      g.fillRect(400, 275, 75, 25);
      g.fillRect(425, 300, 25, 50);
      g.setColor(twiceOrange);
      int x7[] = {500, 525, 550, 563, 600, 625, 600, 575, 563, 550, 525, 500};
      int y7[] = {275, 275, 360, 355, 275, 275, 400, 400, 375, 400, 400, 275};
      int n7 = 12;
      g.fillPolygon(x7, y7, n7);
      g.setColor(twiceApricot);
      g.fillRect(650, 275, 75, 25);
      g.fillRect(675, 300, 25, 75);
      g.fillRect(650, 375, 75, 25);
      g.setColor(twiceMagenta);
      int x8[] = {825, 825, 800, 780, 775, 780, 800, 825, 825, 775, 750, 765, 775, 800, 825};
      int y8[] = {275, 300, 310, 325, 350, 360, 365, 375, 400, 375, 350, 290, 300, 285, 275};
      int n8 = 15;
      g.fillPolygon(x8, y8, n8); 
      g.setColor(twicePink);
      g.fillRect(850, 275, 25, 125);
      g.fillRect(875, 275, 50, 25);
      g.fillRect(875, 325, 50, 25);
      g.fillRect(875, 375, 50, 25);
   }
   
}