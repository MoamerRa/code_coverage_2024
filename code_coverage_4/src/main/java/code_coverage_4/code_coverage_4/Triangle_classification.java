package code_coverage_4.code_coverage_4;

public class Triangle_classification 
{

	/*
	 * מעמר רביע – 207661836
	 * אלאא נפאפעה – 212896021
	 * */
	
	enum Triangle_Types 
	{
		equilateral,
		isosceles,
		Scalene,
		Nottriangle,
		ERROR

	} 
	
	/*
	 * Here is the main code ! 
	public static String classifyTriangle(int a, int b, int c) {

		Triangle_Types triangle;
		if((c < a+b) && (b < a+c) && (a < b+c) )
		{
			if((a==b) && (b==c) )
				triangle= Triangle_Types.equilateral;
			else if ((a==b) || (b==c) || (a==c))
				triangle= Triangle_Types.isosceles;
			else
				triangle= Triangle_Types.Scalene;

		}else
			triangle= Triangle_Types.Nottriangle;

		return triangle.toString();
	}*/
	
	
	
	/**
	 * Here I want to simplify the code to easily build a diagram .
	 * */
	public static String classifyTriangle(int a, int b, int c)
	{
		Triangle_Types triangle = null;
		if(c < a+b)
		{
			if(b < a+c)
			{
				if(a < b+c)
				{
					if(a==b)
					{
						if(b==c)
						{
							triangle= Triangle_Types.equilateral;
						}
						else {triangle= Triangle_Types.isosceles;}
					}
					else if(b==c) {triangle= Triangle_Types.isosceles;}
					else if(a==c) {triangle= Triangle_Types.isosceles;}
					else {triangle= Triangle_Types.Scalene;}
				}
				else {triangle= Triangle_Types.Nottriangle;}
			}
			else {triangle= Triangle_Types.Nottriangle;}
		}
		else {triangle= Triangle_Types.Nottriangle;}
					
		
		return triangle.toString();
		
	}
	
	

}

