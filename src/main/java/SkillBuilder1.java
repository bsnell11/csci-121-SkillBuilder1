import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        if (input.hasNextDouble()) {
            calcWallPaint(input);

        }
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        calcWallPaint(input);
    }

    public static void calcWallPaint(Scanner input){
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallHeight * wallWidth;
        System.out.printf("Wall area: %.1f square feet%n" , wallArea);


        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        double gallonsNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons%n", gallonsNeeded);

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest
        double cansNeeded = Math.ceil(gallonsNeeded / gallonsPerCan);
        System.out.printf("Cans needed: %d can(s)%n", (int)cansNeeded);
        //    //TODO : Replace this comment with your code line 12
    }
}
