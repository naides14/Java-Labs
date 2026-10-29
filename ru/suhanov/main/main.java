package ru.suhanov.main;

import ru.suhanov.forshapes.*;
import ru.suhanov.shapetask.sh_Circle;
import ru.suhanov.shapetask.sh_Rectangle;
import ru.suhanov.shapetask.sh_Square;
import ru.suhanov.shapetask.sh_Triangle;
import ru.suhanov.treetask.Tnode;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        if (args.length>=2){
            double stepen = power(args[0],args[1]);
            System.out.println(args[0]+"^"+args[1]+"="+stepen);
        }

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int side=0;

        while (true) {
            System.out.println("Введите координату x левой верхней точки квадрата");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            }
            System.out.println("Введено не число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите координату x левой верхней точки квадрата");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите длину стороны квадрата");
            if (scanner.hasNextInt()) {
                side = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        sh_Square kvadr = new sh_Square(x, y, side);
        System.out.println(kvadr);
        Line squareedges = new Line(kvadr.edges);
        System.out.println(squareedges);
        System.out.println("Длина стороны квадрата: "+kvadr.Getsidelen()+"\n");

        kvadr.Setsidelen(40);
        System.out.println(kvadr);
        squareedges.p_arr=kvadr.edges;
        System.out.println(squareedges);

        //Point newlast = new Point(15,25);
        //kvadr.Setlastpoint(newlast);
        //System.out.println(kvadr);

        //squareedges.p_arr=kvadr.edges;
        //System.out.println(squareedges);

        System.out.println("ЗАДАНИЕ 2-----------------------");
        Tnode root = new Tnode();
        root.addval(3);
        root.addval(5);
        root.addval(4);
        root.addval(7);
        root.addval(1);
        root.addval(2);
        System.out.println(root);

        System.out.println("ЗАДАНИЕ 3-----------------------");
        Point[] p = {new Point(0,2),new Point(0,4),new Point(6,4),};
        Lineloop zamkn = new Lineloop(p);
        System.out.println(zamkn);

        System.out.println("ЗАДАНИЕ 4-----------------------");
        sh_Circle circle = new sh_Circle(new Point(1,1),5);
        System.out.println(circle);

        sh_Square square = new sh_Square(new Point(2,2),5);
        System.out.println(square);

        sh_Rectangle rect = new sh_Rectangle(new Point(5,5),4,2);
        System.out.println(rect);

        sh_Triangle tri = new sh_Triangle(new Point[]{new Point(0,0),new Point(4,0),new Point(0,3)});
        System.out.println(tri);

        System.out.println("ЗАДАНИЕ 5-----------------------");
        Point[] simplepoints = new Point[]{new Point(0,0),new Point(1,2)};
        Line polyline = new Line(simplepoints);
        Linestraight polystrline = new Linestraight(simplepoints[0],simplepoints[1]);

        lenmeasure[] lines = {polyline, polystrline};
        double totallen = lenmeasure.objlensum(lines);

        System.out.println(polyline.measure());
        System.out.println(polystrline.measure());
        System.out.println(totallen);

        Line line = new Line(simplepoints);
        intochain[] shapesWithChains = {square, tri, line};
        Line totalChain = intochain.mergechains(shapesWithChains);
        System.out.println(totalChain);

        Line compline1 = new Line(new Point[]{new Point(0,0),new Point(4,0),new Point(0,3)});
        Line compline2 = new Line(new Point[]{new Point(1,0),new Point(4,0),new Point(0,3)});
        System.out.println(compline1.equals(compline2));
        }

        public static double power(String x,String y){
        double numx = parseInt(x);
        double numy = parseInt(y);
        return pow(numx,numy);

        }


    }





