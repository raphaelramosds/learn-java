import java.util.Scanner;

class PrimitiveTypes 
{

    public static void main (String[] args) 
    {
        Scanner sin = new Scanner(System.in);

        String name;
        float grade;
        int age;

        System.out.print("Name: ");
        name = sin.nextLine();

        System.out.print("Age: ");
        age = sin.nextInt();

        System.out.print("Grade: ");
        grade = (float) sin.nextFloat();

        sin.close();

        // Convert integer to string using Integer class
        String ageStr = Integer.toString(age);

        System.out.format("DETAILS OF %s\'s GRADE: (%s Y OLD)\n", name, ageStr);
        System.out.println("All decimal places: " + grade);
        System.out.printf("1 decimal place: %.1f\n", grade);
        System.out.format("2 decimal places: %.2f\n", grade);
    } 

}