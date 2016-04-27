package com.example.task1.MapStates;

import com.example.task1.Generate.GenerateStates;
import com.example.task1.Lines.States;
import com.example.task1.Readers.Describe;
import org.javatuples.Triplet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Павел on 19.04.2016.
 */
public class MapStates extends JPanel{
    private Color[] colors={Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA,Color.ORANGE,Color.RED,Color.YELLOW};
    private Random random=new Random();
    public void paint(Graphics g){
        ArrayList<States>listStates= Describe.getStates();
        for(States state:listStates){
            int count=state.getCoordinatesList().size();
            ArrayList<Triplet<Integer,Double,Double>> listCoordinates = state.getCoordinatesList();
            ArrayList<Integer> xStates=new ArrayList();
            ArrayList<Integer> yStates=new ArrayList();
            for(Triplet<Integer,Double,Double> object: listCoordinates){
                Double digit1=object.getValue1();
                Double c=digit1*10;
                Double digit2=object.getValue2();
                Double b=digit2*(-10);
                xStates.add(c.intValue()+1800);
                yStates.add(b.intValue()+700);
                System.out.println(digit1);
            }
            int[] xCoordinates=xStates.stream().mapToInt(i->i).toArray();
            int[] yCoordinates=yStates.stream().mapToInt(i->i).toArray();
           // g.drawPolygon(xCoordinates,yCoordinates,count);
            g.fillPolygon(xCoordinates,yCoordinates,count);
            g.setColor(new Color((int)(Math.random()*2_000_000_000)));//colors[random.nextInt(colors.length)]);
        }
    }

    public void showFrame(){
        JFrame frame=new JFrame();
        frame.setBackground(Color.WHITE);
        frame.getContentPane().add(new MapStates());
        frame.setTitle("Карта штатов");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,1000);

    }
}
