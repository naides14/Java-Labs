public class main {

    public static void main(String[] args) {

        System.out.println("ЗАДАЧА 1\n");
        Name name1=new Name("Клеопатра");
        Name name2=new Name("Пушкин", "Александр", "Сергеевич");
        Name name3=new Name("Маяковский","Владимир");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("ЗАДАЧА 2\n");
        Human human1=new Human(152,name1);
        System.out.println(human1);
        Human human2=new Human(167,name2);
        System.out.println(human2);
        Human human3=new Human(189,name3);
        System.out.println(human3);

        System.out.println("ЗАДАЧА 3\n");
        Name ivn=new Name("Чудов","Иван");
        Name ptr=new Name("Чудов","Петр");
        Name boris=new Name("Борис");
        Human humaniv=new Human(200,ivn);
        Human humanptr=new Human(180,ptr);
        Human humanbrs =new Human(150,boris);
        Humanwfather iv_sonof_ptr=new Humanwfather(humanptr,humaniv);
        Humanwfather boris_sonof_ptr=new Humanwfather(humanbrs,humanptr);
        System.out.println(iv_sonof_ptr);
        System.out.println(boris_sonof_ptr);
        System.out.println(humaniv);

        System.out.println("ЗАДАЧА 4\n");
        Point firstpoint=new Point(1,5);
        Point[] points1 = {firstpoint,new Point(2,5),new Point(5,3)};
        Line line = new Line(points1);
        System.out.println(line);
        Point[] points2 = {firstpoint,new Point(2,-5),new Point(4,-8),new Point(5,3)};
        Line line2=new Line(points2);
        System.out.println(line2);
        firstpoint.x=0;firstpoint.y=5;
        System.out.println(line);
        System.out.println(line2);

        System.out.println("ЗАДАЧА 5\n");
        Line_kwt lineempty= new Line_kwt();
        Line_kwt linemany=new Line_kwt(new Point(1,4),new Point(0,5));
        System.out.println(lineempty);
        System.out.println(linemany);

        System.out.println("ЗАДАЧА 6\n");
        Point[] points3 = {new Point(1,5),new Point(2,8),new Point(5,3)};
        Line_kwt2 lineadd =new Line_kwt2(points3);
        System.out.println(lineadd);
        lineadd.add(new Point(5,15),new Point(8,10));
        System.out.println(lineadd);
        }
    }



