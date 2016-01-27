package percentages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class percentages {
	public static int idx_five;
	public static int idx_two;
	public static int[] nums = new int[125];
	public static float percentage;
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static ArrayList<Integer> al_1 = new ArrayList<Integer>();
	public static void main(String[] args) throws FileNotFoundException,
	IOException {
		System.out.println("Percentage of these two numbers :");
		// Numbers divisible by 5 and starts with index 5
		for (idx_five = 5; idx_five <= nums.length; ++idx_five) {
			if (idx_five % 5 == 0)
			{
				al.add(idx_five);
			}
		}
		// Numbers divisible by 2 and starts with index 4
		for (idx_two = 2; idx_two <= 100; ++idx_two)
		{
			if (idx_two % 2 == 0)
			{
				al_1.add(idx_two);
			}
		}
		PercentageProblems();
		Finding_x_Problems();
		
	}
	public static void PercentageProblems() throws IOException {
		// TODO Auto-generated method stub
		//Creating a Folder by name Percentage-Problems
		File file1 = new File("C:\\Users\\bmastaff\\worksheets\\2015\\Percentage-Problems");
		file1.mkdir();
		file1.createNewFile();
		// For loop for Array list 2 and creating a folder by name Set.
		for (int j : al_1)
		{
			File file = new File("C:\\Users\\bmastaff\\worksheets\\2015\\Percentage-Problems\\Set" + j);
			file.mkdir();
			file.createNewFile();
			//creating txt file by name per.txt and per_ans.txt
			PrintWriter out_percentage = new PrintWriter(
					new BufferedWriter(new FileWriter(
							"C:\\Users\\bmastaff\\worksheets\\2015\\Percentage-Problems\\Set" + j +"\\per"+ j + ".txt", true)));
			PrintWriter out_percentage_answers = new PrintWriter(
					new BufferedWriter(new FileWriter(
							"C:\\Users\\bmastaff\\worksheets\\2015\\Percentage-Problems\\Set" + j +"\\per_ans"+j + ".txt", true)));
			// writing into the file per.txt and per_ans.txt
			for (int i = 0; i < 25; i++)
			{
				System.out.println(al.get(i) + " " + "%" + " " + j);
				out_percentage.println(i+1 + ".   " + al.get(i) + " % " + j);
				out_percentage.println();
				percentage = (float) (al.get(i)) / 100 * j;
				System.out.println(percentage);
				out_percentage_answers.println(i+1 + ")" + " " + percentage);
				out_percentage_answers.println("   ");
				
			}
			out_percentage.close();
			out_percentage_answers.close();
		}
		
	}
	public static void Finding_x_Problems() throws IOException {
		// TODO Auto-generated method stub
		//Creating a Folder by name Percentage-Problems
				File file1 = new File("C:\\Users\\bmastaff\\worksheets\\2015\\Finding_x_Problems");
				file1.mkdir();
				file1.createNewFile();
				// For loop for Array list 2 and creating a folder by name Set.
				for (int j : al_1)
				{
					File file = new File("C:\\Users\\bmastaff\\worksheets\\2015\\Finding_x_Problems\\Set" + j);
					file.mkdir();
					file.createNewFile();
					//creating txt file by name per.txt and per_ans.txt
					PrintWriter out_percentage = new PrintWriter(
							new BufferedWriter(new FileWriter(
									"C:\\Users\\bmastaff\\worksheets\\2015\\Finding_x_Problems\\Set" + j +"\\per"+ j + ".txt", true)));
					PrintWriter out_percentage_answers = new PrintWriter(
							new BufferedWriter(new FileWriter(
									"C:\\Users\\bmastaff\\worksheets\\2015\\Finding_x_Problems\\Set" + j +"\\per_ans"+j + ".txt", true)));
					// writing into the file per.txt and per_ans.txt
					for (int i = 0; i < 25; i++)
					{
						System.out.println(al.get(i) + " " + "%" + " " + j);
						out_percentage.println(i+1 + ".   " + al.get(i) + "%" + "X" + " " + "="+ " " +j);
						out_percentage.println();
						percentage = (float)(j) / al.get(i) * 100;
						System.out.println(percentage);
						out_percentage_answers.println(i+1 + ")" + " " + percentage);
						out_percentage_answers.println("   ");
						
					}
					out_percentage.close();
					out_percentage_answers.close();
				}
	}
	}
