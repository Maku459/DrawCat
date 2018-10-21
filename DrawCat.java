import java.awt.*;
import javax.swing.*;
import java.util.*;

public class DrawCat extends JPanel {
  public void paintComponent(Graphics g) {

    Random rnd = new Random();
    int skin_r = rnd.nextInt(255);
    int skin_g = rnd.nextInt(255);
    int skin_b = rnd.nextInt(255);

    int parts_r = rnd.nextInt(245);
    int parts_g = rnd.nextInt(245);
    int parts_b = rnd.nextInt(245);

    g.setColor(new Color(skin_r,skin_g,skin_b));

    //胴体
    int[] x = new int[]{190,308,348,154};
    int[] y = new int[]{340,340,500,500};
    g.fillPolygon(x,y,4);

    //耳
    int[] x1_l = new int[]{102,204,114};
    int[] x1_r = new int[]{391,290,380};
    int[] y1 = new int[]{76,149,200};
    g.fillPolygon(x1_l,y1,3);
    g.fillPolygon(x1_r,y1,3);

    g.setColor(new Color(255,255,255));
    int[] x2_l = new int[]{120,187,128};
    int[] x2_r = new int[]{374,306,365};
    int[] y2 = new int[]{106,155,189};
    g.fillPolygon(x2_l,y2,3);
    g.fillPolygon(x2_r,y2,3);

    //顔
    g.setColor(new Color(skin_r,skin_g,skin_b));
    g.fillOval(106,133,287,205);
    g.fillRoundRect(106, 183, 287, 156, 120, 120);
    g.fillOval(112,250,274,103);

    g.setColor(new Color(255,255,255));
    g.fillOval(190,250,118,103);

    //目
    Graphics2D g2 = (Graphics2D)g;
    g2.setColor(new Color(parts_r,parts_g,parts_b));
    g2.setStroke(new BasicStroke(12));
        g2.drawOval(174,220,40,40);
        g2.drawOval(282,220,40,40);
    g.setColor(new Color(0,0,0));
        g.fillOval(174,220,40,40);
        g.fillOval(282,220,40,40);
    g.setColor(new Color(255,255,255));
        g.fillOval(184,220,5,5);
        g.fillOval(292,220,5,5);

    //口
    g.setColor(new Color(parts_r,parts_g,parts_b));
    int[] x3 = new int[]{240,260,250};
    int[] y3 = new int[]{263,263,271};
    g.fillPolygon(x3,y3,3);
    g2.setStroke(new BasicStroke(3));
    g2.drawLine(250,271,250,288);
    g2.drawLine(250,288,237,300);
    g2.drawLine(250,288,263,300);

    //リボン
    int[] x4_l = new int[]{194,262,196};
    int[] x4_r = new int[]{305,236,305};
    int[] y4 = new int[]{333,363,393};
    g.fillPolygon(x4_l,y4,3);
    g.fillPolygon(x4_r,y4,3);
    g.fillOval(236,350,26,26);

  }

    public static void main(String[] args) {
        JFrame app = new JFrame("Graphics Test");
        app.add(new DrawCat());
        app.setSize(500, 500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}