class Algos {

//bubble sort
	public static void bubbleSort(int[] a){
		for (int i=0; i<a.length;i++ ) {
			for (int j=1; j<(a.length-i);j++ ) {
				if (a[j-1]>a[j]) {
					Calculator.swapAryElement(a,j,j-1);
				}
				
			}
		}
	}
//merge sort
	public static void mergeSort(int low,int high,int[] a){
		if (low<high){
		int mid=(low+high)/2;
		mergeSort(low,mid,a);
		mergeSort(mid+1,high,a);
		merge(low,mid,high,a);
	}

}
private static void merge(int low,int mid,int high,int[] a){
		int[] temp= new int[high - low+1 ];
		int left = low;
		int right = mid+1;
		int k=0;
		while (left <=mid && right<=high) {
			if (a[left]<a[right]) {
				temp[k]=a[left++];
			}
			else {
				temp[k]=a[right++];
			}
			k++;
		}
			if (left<=mid) {
				while (left<=mid) {
					temp[k++]=a[left++];	
				}
			}
			else if (right<=high) {
				while(right<=high){
				temp[k++]=a[right++];
			}
		}
		for (int i=0; i<temp.length;i++ ) {
			a[low+i]=temp[i];
		}
	}
//quick sort
public static void quickSort(int low,int high,int[] a){
	if (low<high) {
		int q= partition(low,high,a);
		quickSort(low,q-1,a);
		quickSort(q+1,high,a);
		
		
	}
}

//partition for quicksort
private static int partition(int low,int high,int[] a){
	
	int i = low-1,j;
	
	for (j=low;j<=high-1;j++ ) {
		if (a[j]<a[high]) {
			Calculator.swapAryElement(a,j,++i);
		}
	}
		Calculator.swapAryElement(a,i+1,high);
	
	return i+1;	

	}

//heap sort
public static void selectionSort(int[] a){
	for (int i=0;i<a.length-2 ;i++ ) {
		int min = i;
		for (int j=i;j<a.length-1 ;j++ ) {
			if (a[j]<a[min]) {
				min = j;
			}
		}
		Calculator.swapAryElement(a,min,i);

	}
}
//insertion sort
public static void insertionSort(int[] a){
	for (int i=1;i<a.length-1 ;i++ ) {
		int val=a[i];
		int hole=i;
		while(hole>0 && a[hole-1]>val){
			a[hole]=a[hole-1];
			hole--;
		}
		a[hole]=val;
	}
	}

}

