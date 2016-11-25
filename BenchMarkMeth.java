class BenchMarkMeth{
	public static void bubbleBench(int[] a){
						int[] temp = new int[a.length];
						Calculator.copyArray(temp,a);
					long startTime = System.currentTimeMillis();
					Algos.bubbleSort(temp);
					long endTime   = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Time taken by Bubble Sort is \t\t"+totalTime+"ms");
				}
	public static void insertionBench(int[] a){
		int[] temp = new int[a.length];
						Calculator.copyArray(temp,a);
		long startTime = System.currentTimeMillis();
					Algos.insertionSort(temp);
					long endTime   = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Time taken by Insertion Sort is \t"+totalTime+"ms");
					
	}
	public static void quickBench(int[] a){
		int[] temp = new int[a.length];
						Calculator.copyArray(temp,a);
		long startTime = System.currentTimeMillis();
					Algos.quickSort(0,a.length-1,temp);
					long endTime   = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Time taken by Quick Sort is \t\t"+totalTime+"ms");

	}
	public static void selectionBench(int[] a){
		int[] temp = new int[a.length];
						Calculator.copyArray(temp,a);
		 long startTime = System.currentTimeMillis();
					Algos.selectionSort(temp);
					long endTime   = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Time taken by Selection Sort is \t"+totalTime+"ms");

	}
	public static void mergeBench(int[] a){
		int[] temp = new int[a.length];
						Calculator.copyArray(temp,a);
		long startTime = System.currentTimeMillis();
					Algos.mergeSort(0,a.length-1,temp);
					long endTime   = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Time taken by Merge Sort is \t\t"+totalTime+"ms");

	}


}