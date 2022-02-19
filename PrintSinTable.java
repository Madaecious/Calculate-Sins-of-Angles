///////////////////////////////////////////////////////////////////////////////////////////////////
//	Name:			Mark Barros
//	Course:			CS1400 - Intro to Programming and Problem Solving
//	Description:	This program calculates the Sins of the angles from 0 to 90 degrees and
//					outputs them to the console.
///////////////////////////////////////////////////////////////////////////////////////////////////

// This is a necessary import. --------------------------------------------------------------------
import java.lang.Math;

// This is the PrinSinTable class. ----------------------------------------------------------------
public class PrintSinTable
{
	public static void main(String[] args)
	{
		System.out.println("----------------------------------------");
		System.out.println("Sin Table by Mark Barros");
		System.out.println("----------------------------------------");
		System.out.println("Angle     Sin");

		int iteration = 1;
		double current_angle_in_degrees = 0.0;
		double current_angle_in_radians = 0.0;
		while(iteration <= 90) {
			current_angle_in_radians = Math.toRadians(current_angle_in_degrees);
			System.out.printf("%5.0f     %06.5f\n", +
					current_angle_in_degrees, Math.sin(current_angle_in_radians));
			current_angle_in_degrees++;
			iteration++;
		}
		System.out.println("   90     1.00000");
		System.out.println("----------------------------------------");
	}
} // End of PrintSinTable class. ------------------------------------------------------------------
