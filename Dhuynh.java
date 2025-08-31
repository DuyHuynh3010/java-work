import java.awt.Font;
import java.util.Scanner;

/**
 * Description
 * ______________________
 * ______________________
 * @author DHuynh
 * @version August 30, 2025
 */
public class DHuynh
{
    public static void nameAgeIncome()
    {
        //Declare and initiallize a variable
        String name = "Duy Huynh";
        int age = 19; 
        double annualPay = 130000;
        //printing the ouput on the console
        System.out.print("My name is "+name+", my age is "+age+" and\nI hope to earn $"+annualPay+" per year.");
        
        //Creating a graphic window to show output
        Draw win = new Draw();
        win.setCanvasSize(800, 800); //set the window size to 800x800 
        win.setXscale(0,800);
        win.setYscale(0,800);
        win.setTitle("nameAgeIncome by DHuynh"); //set a name for the title bar of the graphic window

        //4 color background 123 need to do ALL quadrant colors 
        win.setPenColor(Draw.LIGHT_GRAY); 
        win.filledRectangle(200,200, 400/2,  400/2);
        win.setPenColor(Draw.ORANGE);
        win.filledRectangle(600,200, 400/2,  400/2);
        win.setPenColor(Draw.PINK);
        win.filledRectangle(200,200, 400/2,  400/2);
        win.setPenColor(Draw.MAGENTA);
        win.filledRectangle(600,600, 400/2,  400/2);

        //Displaying the graphics command to graphics screen.
        win.setPenColor(Draw.BLACK); //using the black color
        //displaying the output of the prompt on the graphic screen (display the same thing as on the console)
        win.textLeft(400,770, "My name is "+name+", my age is "+age+" and");
        win.textLeft(400,750, "I hope to earn $"+annualPay+" per year.");


        //Printing my name with large font on the graphic screen
        Font large = new Font("Arial", Font.PLAIN, 80);
        win.setFont( large );
        win.text(600,450,"Duy Huynh");
    }

    public static void personalInfo()
    {
        //Declare and initiallize a variable
        String name = "Duy Huynh";
        String address = "12345 Springdale St. Westminster, CA 92683";
        String phoneNum = "123-456-123";
        String major = "Computer Science";
        System.out.print(name+"\n"+address+"\n"+phoneNum+"\n"+major); //printing the ouput on the console
        
        //Creating a graphic window to show output
        Draw win = new Draw();
        win.setCanvasSize(800, 800); //set the window size to 800x800 
        win.setXscale(0,800);
        win.setYscale(0,800);
        win.setTitle("personalInfo by DHuynh"); //set a name for the title bar of the graphic window

        //4 color background 123 need to do ALL quadrant colors
        win.setPenColor(Draw.LIGHT_GRAY);
        win.filledRectangle(200,200, 400/2,  400/2);
        win.setPenColor(Draw.ORANGE);
        win.filledRectangle(600,200, 400/2,  400/2);
        win.setPenColor(Draw.PINK);
        win.filledRectangle(200,600, 400/2,  400/2);
        win.setPenColor(Draw.MAGENTA);
        win.filledRectangle(600,600, 400/2,  400/2);

        //displaying the output of the prompt on the graphic screen (display the same thing as on the console)
        win.setPenColor(Draw.BLACK);
        win.textLeft(400,770, name);
        win.textLeft(400,750, address);
        win.textLeft(400,730, phoneNum);
        win.textLeft(400,710, major);
        


        //Printing my name with large font on the graphic screen
        Font large = new Font("Arial", Font.PLAIN, 80);
        win.setFont( large );
        win.text(600,450,"Duy Huynh");
        
        
    }

    public static void salesPredict()
    {
        //Declare and initiallize a variable
        double totalSales = 4_600_000;   // 4.6 million
        double percentEastCoast = 0.62;  // 62%
        
        //operation
        double eastCoastSales = totalSales * percentEastCoast;
        
        //printing the ouput on the console
        System.out.println("If the company has $" + totalSales + " in sales this year,");
        System.out.println("the East Coast division will generate approximately $" + eastCoastSales);
        
        //Creating a graphic window to show output
        Draw win = new Draw();
        win.setCanvasSize(800, 800); //set the window size to 800x800 
        win.setXscale(0,800);
        win.setYscale(0,800);
        win.setTitle("salesPredict by DHuynh"); //set a name for the title bar of the graphic window

        //4 color background 123 need to do ALL quadrant colors
        win.setPenColor(Draw.LIGHT_GRAY);
        win.filledRectangle(200,200, 400/2,  400/2);
        win.setPenColor(Draw.ORANGE);
        win.filledRectangle(600,200, 400/2,  400/2);
        win.setPenColor(Draw.PINK);
        win.filledRectangle(200,600, 400/2,  400/2);
        win.setPenColor(Draw.MAGENTA);
        win.filledRectangle(600,600, 400/2,  400/2);

        //displaying the output of the prompt on the graphic screen (display the same thing as on the console)
        win.setPenColor(Draw.BLACK);
        win.textLeft(400,770, "If the company has $" + totalSales + " in sales this year,");
        win.textLeft(400,750, "the East Coast division will generate $" + eastCoastSales);
        
        


        //Printing my name with large font on the graphic screen
        Font large = new Font("Arial", Font.PLAIN, 80);
        win.setFont( large );
        win.text(600,450,"Duy Huynh");
    }

    public static void salesTax()
    {
        //Declare and initiallize a constant
        final double stateTaxRate = 0.04;
        final double countyTaxRate = 0.02;
        
        //Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Asking the user to enter the purchase amount and store it in variable named purchase
        System.out.print("Enter the amount of the purchase: ");
        double purchase = keyboard.nextDouble();
        
        //operations
        double stateTax = purchase * stateTaxRate;
        double countyTax = purchase * countyTaxRate;
        double totalTax = stateTax + countyTax;
        double totalSale = purchase + totalTax;
        
        //printing the ouput on the console
        System.out.printf("Purchase amount: $"+ purchase+"\n");
        System.out.printf("State sales tax (4%%): $"+ stateTax+"\n");
        System.out.printf("County sales tax (2%%): $"+ countyTax+"\n");
        System.out.printf("Total sales tax: $"+ totalTax+"\n");
        System.out.printf("Total sale amount: $"+ totalSale);
        
        
        //Creating a graphic window to show output
        Draw win = new Draw();
        win.setCanvasSize(800, 800); //set the window size to 800x800 
        win.setXscale(0,800);
        win.setYscale(0,800);
        win.setTitle("salesTax by DHuynh"); //set a name for the title bar of the graphic window

        //4 color background 123 need to do ALL quadrant colors
        win.setPenColor(Draw.LIGHT_GRAY);
        win.filledRectangle(200,200, 400/2,  400/2);
        win.setPenColor(Draw.ORANGE);
        win.filledRectangle(600,200, 400/2,  400/2);
        win.setPenColor(Draw.PINK);
        win.filledRectangle(200,600, 400/2,  400/2);
        win.setPenColor(Draw.MAGENTA);
        win.filledRectangle(600,600, 400/2,  400/2);

        //displaying the output of the prompt on the graphic screen (display the same thing as on the console)
        win.setPenColor(Draw.BLACK);
        win.textLeft(400,770, "Purchase amount: $"+ purchase);
        win.textLeft(400,750, "State sales tax (4%%): $"+ stateTax);
        win.textLeft(400,730, "County sales tax (2%%): $"+ countyTax);
        win.textLeft(400,710, "Total sales tax: $"+ totalTax);
        win.textLeft(400,690, "Total sale amount: $"+ totalSale);
        
        
        //Printing my name with large font on the graphic screen
        Font large = new Font("Arial", Font.PLAIN, 80);
        win.setFont( large );
        win.text(600,450,"Duy Huynh");
    }
}