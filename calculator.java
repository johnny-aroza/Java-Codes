class Calculator{

//add two numbers
		public static int add(int num1,int num2){
			 int sum=num1+num2;
			 return sum;
		}
//add two numbers
		public static boolean per(int n){
			int sum=0;
			for (int i=1;i<n;i++ ) {
				if (n%i==0) {

					sum+=i;
				}
				
			}
			if (n==sum) {
				return true;
				
			}
			 else return false;
		}
		//add two numbers
		public static int rev3(int num){
			 int rev=0,temp;
			while(num!=0){
				temp=num%10;
				rev=rev*10+temp;
				num=num/10;
			}
			
				return rev;
		}
		//lottery 3 ticker
		public static int l2(int num1,int num2,int num3){
			return (l1(num1)+l1(num2)+l1(num3));
		}
		//add two numbers
		public static int l1(int x){
			if(x%4==0 && x%7==0){
				return 20;
			}
			else if (x%4==0) {
				return 6;
				
			}
			else if (x%7==0) {
				return 10;
				
			}
			else 
				return 0;
		}
		//some is equal to other num
		public static boolean tsum(int a,int b,int c){
			
			if(a+b==c){
			 return true;
			}
			else if (b+c==a) {
				return true;	
			}
			else if (c+a==b) {
				return true;
				
			}
			else 
			return false;
		}
		//same last digit
		public static boolean sld(int num1,int num2){
			 int c1=num1%10,c2=num2%10;
			 
			 if(c1==c2)
			 	return true;
			 else
			 return false;
		}
		//same last digit
		public static int black(int x,int y){
			int c1=21-x,c2=21-y;
			 if (x>21 || y>21) {
			 	return -1;
			 	
			 }
			 else if (x==y && x==21) {
			 	return -2;
			 	
			 }
			 else if (c1<c2) {
			 	return x;
			 	
			 }
			 else 
			 	return y;
		}
		//change case
		public static char casea(char x){
			int temp=0;
			if((int)x>=65 && (int)x<97)
				temp=x+32;
			else if (((int)x>=97 && (int)x<129)) {
				temp=x-32;
				
			}
			else{
				temp=(int)x;
			}
			 return (char)temp;
		}
		//add two numbers
		public static int mon(int x){
			int temp=0;
			 switch(x){
			 	case (1) :
			 		temp=31;
			 		break;
			 	case (7) :
			 		temp=31;
			 		break;
			 	case (8) :
			 		temp=31;
			 		break;
			 	case (3) :
			 		temp=31;
			 		break;
			 	case (10) :
			 		temp=31;
			 		break;
			 	case (12) :
			 		temp=31;
			 		break;
			 	case (5) :
			 		temp=31;
			 		break;		 		
			 	case (11) :
			 		temp=30;
			 		break;
			 	case (4) :
			 		temp=30;
			 		break;
			 	case (6) :
			 		temp=30;
			 		break;
			 	case (9) :
			 		temp=30;
			 		break;
			 	case 2:
			 		temp=28;
			 		break;
			 }
			 return temp;
		}
		//1ST IF greater of 3
		public static boolean gr3(int num1,int num2,int num3){
			
			boolean temp= (num1>num2)?true:((num1>num3)?  true:false);
			
			 return temp;
		}
		//mid char
//middle character
	public static char middlechar(char first, char sec, char third){
	 	char i2,i3,i4;         //middle character when the characters
		if(first>sec){         //are arranged in order
			i2=first;
		    i3=sec;
		}
		 else{
		 	i2=sec;
		    i3=first;
		}
		 if(i2>third){
		 	if (third>i3){
		 	i4=i3;
		 	i3=third;
		 }
		 else {
		 	i4=third;
		 }
		}
		 else{
		 	i4=i3;
		 	i3=i2;
		 	i2=third;
		 }
		 
		 return i3;

	 	}
//is digit or not
	public static boolean isdigit(char x){
		if((int)x>=65 && (int)x<=129)
			return false;
		else 
			return true;
	}
//ascending order
	public static boolean as3(int num1,int num2,int num3){
		int c1=num2-num1,c2=num3-num2;
		boolean temp= ((c1)>0)?true:(((c2)>0)?true:false);
		 return temp;
	}
//ascending order
	public static double ds3(int num1,int num2,int num3){
		return (num1*1111+num2*1111+num3*1111);
	}
//area of a square
	public static double sqr(int x1,int y1,int x2,int y2){
		return ((x1-x2)*(y1-y2));
	}
//add of 3 bool
	public static boolean bl(boolean num1,boolean num2,boolean num3){
		return ((num1 &&num2 )&&num3);
	}
//sum two digit
	public static int sdigi(int num1){
		int temp;
		temp=num1%10;
		num1/=10;
		return (add(temp,num1));
	}
//sum of last 4 digit
	public static int sl4digi(int num1){
		int temp=0,c1,count=0;
		while(count<4){
			c1=num1%10;
			temp+=c1;
			num1/=10;
			count++;
		}
		return temp;
	}
//sum of last 3 digit
	public static int sl3digi(int num1){
		int temp=0,c1,count=0;
		while(count<3){
			c1=num1%10;
			temp+=c1;
			num1/=10;
			count++;
		}
		return temp;
	}
//decimal change
	public static double deci(int num1,int num2,int num3){
		return (num1+num2*.1+num3*.01);
	}
//greater of 3
	public static int gr3n(int a,int b,int c){
		if (a>b) {
			if (a>c ) {
			 	return a;	
			}
			else if (b>c) {
			 	return b;
			 		
			}
		}
		else if(b>c){
			return b;
		}
		else {
			return c;
		}
		return 0;
	}
//divisible by 3 or 7
	public static boolean d37(int num1){
		if((num1%3==0) || (num1%7==0)){
			return true;
		}
		else {
			return false;
		}
	}
//repeat digit
	public static String repeat(int num1){
		String sum=" "+num1+num1;
		return sum;
	}
//add two numbers
	public static int fact(int fact){
		if(fact==0)
			return 1;
		else 
		return (fact*Calculator.fact(fact-1));
	}
//100th digit
	public static int digi(int num){
		int count=0,temp=0;
		while (num!=0) {
			temp=num%10;
			count++;
			if(count==2){
				break; 
			}
		} return temp;
	}	
//run rate
	public static double rr(int t,int mo,int cs,int ob){
		double c1=0,c2=0,temp;
		c1=t-cs;
		c2=mo-ob;
		temp=c1/c2;
		return temp;
	}
//ADD TO DOUBLE NUM
	public static double add(double num1,double num2){
		double sum=num1+num2;
		return sum;
	}
//cal speed
	public static double speed(double num1,double num2){
		double sum=num1*num2;
		return sum;
	}
//area of a circle
	public static double acrcl(double r){
		double area=0;
		return area=3.14*r*r;
	}
//area of a triangle
	public static double atri(double base,double ht){
		double area=.5*base*ht;
		return area;
	}
//add three numbers
	public static int add(int num1,int num2,int num3){
		int sum=num1+num2+num3;
		return sum;
	}
//cel to far
	public static double cel2far(double cel) {
		double far;
		far=(cel*1.8)+32;
		return far;
	}
//far to cel
	public static double f2c(double	far) {
		double cel;
		cel=(far-32)*.555;
		return cel;
	}
//rupee to dollar
	public static double r2d(double r) {
		double dollar=r/60;
		return dollar;
	}
//chekc leap year
	public static boolean leap(int year) {
		if(year%4==0)
			return true;
		else 
			return false;
	}
//check even or not
	public static boolean ec(int n) {
		if(n%2==0)
			return true;
		else
			return false;
		}	
//check even or not
	public static boolean oc(int n) {
		if(n%2==1)
			return true;
		else
			return false;
	}	
//divisible by 6
	public static boolean by6(int n) {
		if(n%6==0)
			return true;
		else
			return false;
	}
//check prime number
	public static boolean pm( int n){
		int k=0;
		for(int j=2;j<=n/2;j++){
			if (n%j==0)
				k=1;
			break;
		}
		if(k==1)
			return false;
		else
			return true;
	}
// check the palindrome num
	public static boolean pal(int num) {
		int rev=0,check,temp;
		check=num;
		while(num!=0){
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if (check==rev)
			return true;
		else 
			return false;
	}
//count digit
	public static int cdigit(int num) {
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		return count;
	}

//even btween range
	public static String eve(int fr,int to){
		String res=" ";
		System.out.println("even series");
		for(int i=fr;i<=to;i++){
			if(i%2==0)
				res+=" "+i;
		}
		return res;
	}
//prime series
	public static String ps(int fr,int to){
		String res="";
		System.out.println("\nprime series\n");
			for (int i=fr; i<=to; i++) {
			if(pm(i))
				res+=" "+i;
		}
		return res;
	}
// palindrome series in range
	public static String palis(int fr,int to){
		String res=" ";
		System.out.println("\npalindrome  series\n");
		for (int i=fr; i<=to; i++) {
			if(pal(i))
				res+=" "+i;
		} 
		return res;
	}

//time from seconf to hour
	public static String timeh(int s){
		String res=" ";
		int hour=0,minute=0;
		while(s>3600){
			hour++;
			s-=3600;
		}
		while(s>60){
			s-=60;
			minute++;
		}
		return res+=hour+"hr:"+minute+"min:"+s+"sec";
	}
//fib series
	public static String fib(int til) {
		int num1=0,num2=1,sum,count=til;
		String res="0"+" "+"1"+" ";
		System.out.println("\nfibonacci series is :-\n");
		while(count-->0){
			sum=num1+num2;
			res+=" "+sum;
			num1=num2;
			num2=sum;
		}
		return res;
	}
//check fib num
	public static boolean fibc(int num){
		double c1=((5*num*num)+4);
		double c2=((5*num*num)-4);
		double d1=c1*c1,d2=c2*c2;
		if(c1==Math.sqrt(d1) && c2==Math.sqrt(d2) )
			return true;
		else 
			return false;
	}

//print the 2d array content
	public static void printarrayofsum(int[][] a) {
	for (int i=0; i<a.length;i++ ) {
		for (int j=0; j<a[0].length;j++ ) {
			System.out.print(a[i][j]+"\t");
		}	
		System.out.println();	
	}

	}
//ad two array 
	public static int[][] add2array(int[][] a,int[][] b) {
		int[][] res = new int[a.length][a[0].length];
	for (int i=0; i<a.length;i++ ) {
		for (int j=0; j<a[i].length;j++ ) {
			res[i][j]=a[i][j]+b[i][j];
			}	
			System.out.println();	
		}
		return res;
	}

//print the array content
	public static void printarray(int[] array) {

		for (int i=0; i<array.length;i++ ) {
			System.out.print(array[i]+"\t");
			
		}
	}
//print the array content
	public static void printarray(char[] array) {

		for (int i=0; i<array.length;i++ ) {
			System.out.print(array[i]+"\t");
			
		}
	}

//boolean if repeated num
	public static boolean repeat(int[] array) {
		int count=0;
		for (int i=0; i<array.length; i++) {
			for (int j=i+1;j<(array.length)-i ;j++ ) {
				if(array[i]==array[j]){
					count++;
					break;
				}
			}
		}
		if (count!=0) {
			return false;				
		}
		else{
			return true;
		}
	}

//summation of array
	public static int suma(int[] array) {
		int sum=0;
		for (int i=0; i<array.length;i++ ) {
			sum+=array[i];
		}
		return sum;
	}

//max in an array
	public static int amax(int[] a) {
		int max=a[0];
		//System.out.println("max="+max);
		for (int i = 1; i<a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

//key position
	public static int pos(int[] a,int k) {
		int pos=-1;
		for (int i=0; i<a.length; i++) {
			if(k==a[i]){
				pos=i;
			}
		}
		return pos;
	}

//sort an array
	public static void sort(int[] a) {
		for (int i=0; i<a.length; i++) {
			for (int j=i; j
				<a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
	}

//reverse an array
	public static void reverse(int[] a) {
		int j=a.length-1,i=0;
		do{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}while(j>i);
		
	}

//case change
	public static void case1(char[] a) {
		for (int i=0;i<a.length ;i++ ) {
			if(a[i]>=97){
				a[i]-=32;

			}
			else{
				a[i]+=32;
			}
			
		}
		
	}

//natural numbers generation of given size to an array
	public static int[] naturalsize(int howmany){
		int[] a = new int[howmany];
		for (int i=0; i<a.length; i++) {
			a[i] = i +1;
		}
		
		return a;
		
	}

//random numbers generation of given size to an array
	public static int[] ranarray(int howmany){
		int[] a = new int[howmany];
		for (int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*1000);
		}
		
		return a;
		
	}

//even numbers from-to in array
	public static int[] evenarrays(int from,int to) {
		int[] evenarray = new int[((to-from)/2)+1];
		int index = 0;
		for (int i=from; i<=
			to; i++) {
			if(i%2==0)
				evenarray[index++]=i;
			
		}
			return evenarray;
		
	}

//odd numbers from-to in array
	public static int[] oddnarrays(int from,int to) {
		int[] oddnarray = new int[((to-from)/2)+1];
		int index = 0;
		for (int i=from; i<=to; i++) {
			if(i%2==1)
				oddnarray[index++]=i;
			
		}
			return oddnarray;
		
	}

//array of prime numbers
	public static int[] primearrays(int from,int to) {
		int index = 0;
		int[] primearray = new int[to-from];
		for (int i=from; i<to; i++) {
			int flag=0;
			for (int j=2; j<i; j++) {
				if(i%j==0){
					flag=1;
								
				}
			}
			if (flag==0) {
				primearray[index++] = i;
			
			}
			
		}
		return primearray;
	}	

//array of fib series	
	public static int[] fibarray(int sz) {
		int[] fibarray = new int[sz];
		fibarray[0] = 0;
		fibarray[1] = 1;
		for (int i = 2;i<fibarray.length;i++ ) {
			fibarray[i] =fibarray[i-1]+fibarray[i-2];
		
		}
		return fibarray;	
	}

//random character array returns	
	public static char[] randomaz(int a){
		char[] array=new char[a];
		int result;
		for(int i=0;i<array.length;i++){
			while(true){
				result=(int)(Math.random()*1000);
				if((result>=65 && result<=90)||(result>=97 && result<=122)) {
					break;
				}
			}
			array[i]=(char)result;
		}
		return array;
	}	

//reverse an array
	public static int[] revarr(int[] a) 
	{
		int temp,i=0,j=a.length-1;
		while(i<j){
			temp = a[j];
			a[j--] = a[i];
			a[i++] = temp;
		}
    	return a;
    }

//vowel count in an array
    public static int vowelcount(char[] a) {
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='A' ||a[i]=='E'|| a[i]=='I'|| a[i]=='O'|| a[i]=='U' ||a[i]=='a' ||a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u'){
				count++;
			}
		}
		return count;
	}

// palindrome series in range
	public static int[] palinarray(int fr,int to){
		int[] parray = new int[((to-fr)/10)+10];
		int index=0;
		System.out.println("\npalindrome  series\n");
		for (int i=fr; i<=to; i++) {
			if(Calculator.pal(i))
				parray[index++]= i;
		} 
		return parray;
	}


}