import java.util.Scanner;

public class IT24102281Lab7Q1B 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter several integers separated by spaces:");
	int student=1;

	while(student<4)
	{
		System.out.println("student"+student);
		int count=0;
		double marks[] = new double[4];
		System.out.print("Enter marks: ");
        	String input = scanner.nextLine();
        	String[] numbers = input.split("\\s+");

        	for (String number : numbers) {
			double num = Double.parseDouble(number);
            		marks[count++] = num;
			if(count>3) break;
        	}
		double total=0;
		for(Double mark: marks){
			total+=mark;
		}
        	
		double Average=(total/4);
		System.out.println("Average : "+ Average);

		String grade="";
			if(Average<50)
				grade="Fail";
		
		
			if(Average>49 && Average<75)
				grade="Credit";
		
			if(Average>74 && Average<101)
				grade="Distination";
			System.out.println("Overall Grade is : "+grade);
		student=student+1;
		System.out.println(" ");
	
	}

	
    }
}