import java.util.Scanner;
import  java.lang.*;
class TaskBubble extends Thread{
	public void run(){
		Algos.bubbleSort(BenchMark.ar);
	}
}
class TaskQuick extends Thread{
	public void run(){
		BenchMarkMeth.quickBench(BenchMark.ar);
	}
}
class TaskInsertion extends Thread{
	public void run(){
		BenchMarkMeth.insertionBench(BenchMark.ar);
	}
}
class TaskSelection extends Thread{
	public void run(){
		BenchMarkMeth.selectionBench(BenchMark.ar);

	}
}
class TaskMerge extends Thread{
	public void run(){
		BenchMarkMeth.mergeBench(BenchMark.ar);

	}
}

class BenchMark{
static int[] ar;
	private static void sort(int[] a){
		System.out.println("--------------------------------------------------");
		int choice;
			Scanner S = new Scanner(System.in);
			do{
		System.out.println("\n Choose the sorting Algorithm.");
	System.out.println("\n 1.Bubble Sort \t\t5.Insertion Sort \n 2.Quick Sort \t\t6.BenchMark ALL Sort ");
		System.out.println(" 3.Merge Sort  \t\t4.Selection Sort \t7.exit  \t 8.Start Over");
		System.out.print(" Enter Your choice :-\t");
		choice = S.nextInt();
		System.out.println("--------------------------------------------------");
		switch(choice){
			case 1: System.out.println("\n You have choosen :- 1.Bubble Sort");
					BenchMarkMeth.bubbleBench(a);
					break;
			case 2: System.out.println("\n You have choosen :- 2.Quick Sort");
					BenchMarkMeth.quickBench(a);
					break;
			case 3: System.out.println("\n You have choosen :- 3.Merge Sort");
					BenchMarkMeth.mergeBench(a);
					break;
			case 4: System.out.println("\n You have choosen :- 4.Selection Sort");
					BenchMarkMeth.selectionBench(a);
					break;
			case 5:System.out.println("\n You have choosen :- 5.Insertion Sort");
					BenchMarkMeth.insertionBench(a);
					break;
			case 6:System.out.println("\n You have choosen :- 6.BenchMark all ");
			System.out.println("--------------------------------------------------");
					ar=a;
					TaskBubble tB= new TaskBubble();
					tB.start();
					TaskInsertion tI = new TaskInsertion();
					tI.start();
					TaskQuick tq = new TaskQuick();
					tq.start();
					TaskMerge tM = new TaskMerge();
					tM.start();
					TaskSelection tS = new TaskSelection();
					tS.start();
					while(true){
						if(!(tB.isAlive()||tI.isAlive()||tq.isAlive()||tM.isAlive()||tS.isAlive())){
							break;
						}
					}
					
					
					System.out.println("--------------------------------------------------");
					break;
			case 7:System.out.println("\n Thank you "+'\u263A');
					System.exit(0);
			case 8:mainCall();
			default:System.out.println("\n Enter proper choice");
		}}while(choice!=7);

	}
	public static void mainCall(){
		Scanner S = new Scanner(System.in);
		int choice,size=0;
		do{
			System.out.print("\n Enter the Array size:- \t");
			try
				size = S.nextInt();
			System.out.println("--------------------------------------------------");

				
			}while(size<=0);
			int[] array = new int[size];
			System.out.println("\n Choose the complexity");
			do{
			System.out.println("\n 1.Best Case \t 2.Average Case \t 3.Worst Case  ");
			System.out.print(" Enter Your choice :-\t");
			choice = S.nextInt();
			System.out.println("--------------------------------------------------");
			switch(choice){
				case 1 : System.out.println("\n You have choosen :- 1.Best Case");
						 array = Calculator.naturalSize(size);

						 System.out.println("\n Array for Best Case Scenario of size ("+size+")has been generated.");
						 sort(array);
						 break;
				case 2 : System.out.println("\n You have choosen :- 1.Average Case");
						 array = Calculator.randomArray(size);
						
						 
						  System.out.println("\n Array for Average Case Scenario of size ("+size+")has been generated");
						  sort(array);
						 break;
				case 3 : System.out.println("\n You have choosen :- 1.Worst Case");
						 array = Calculator.revNaturalSize(size);
						 System.out.println("\n Array for Worst Case Scenario of size ("+size+")has been generated");
						 sort(array);
						 break;
				default:System.out.println("\n Enter proper choice");
				break;
			}

			}while(!(choice == 1 ||choice == 2 || choice == 3 ));
	}
	public static void main(String[] args) {
		
		mainCall();
			}

}
	
