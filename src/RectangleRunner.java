public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        //Update
        plot1.setWidth(75);
        plot2.setWidth(75);
        plot2.setLength(75);
        plot3.setWidth(75);

        /*
        System.out.print("The length of plot1 is: ");
        System.out.println(plot1.getLength());
        System.out.print("The width of plot1 is: ");
        System.out.println(plot1.getWidth());
        System.out.print("The area of plot1 is: ");
        System.out.println(plot1.calculateArea());

        System.out.print("The length of plot2 is: ");
        System.out.println(plot2.getLength());
        System.out.print("The width of plot2 is: ");
        System.out.println(plot2.getWidth());
        System.out.print("The area of plot2 is: ");
        System.out.println(plot2.calculateArea());

        System.out.print("The length of plot3 is: ");
        System.out.println(plot3.getLength());
        System.out.print("The width of plot3 is: ");
        System.out.println(plot3.getWidth());
        System.out.print("The area of plot3 is: ");
        System.out.println(plot3.calculateArea());
        */

        /*
        int totalArea = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.print("These 3 plots require " + totalArea + " square feet of seed");
        */

    }
}
