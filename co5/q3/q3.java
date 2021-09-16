import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class q3 extends Applet {

    public void paint(Graphics g){

        System.out.println("Enter marks : ");
        int marks = 0;
        int n =3;
        Scanner sc = new Scanner(System.in);
        while(n!=0)
        {
            marks = marks + sc.nextInt();
            n--;
        }

        int per;
        per = marks /3;

        System.out.println("Percentage is :" + per);



        if(per > 50)
        {
            // Oval for face outline
            g.drawOval(80, 70, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(120, 120, 15, 15);
            g.fillOval(170, 120, 15, 15);

            // Arc for the smile
            g.drawArc(130, 180, 50, 20, 180, 180);
        }
        else
        {
            // Oval for face outline
            g.drawOval(80, 70, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(120, 120, 15, 15);
            g.fillOval(170, 120, 15, 15);

            // Arc for the smile
            g.drawArc(130, 180, 100, 20, 90, 45);
        }

    }


}
