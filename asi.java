class Asi{
	public static void main(String[] args) {
		int[] contentarray = {1,3,5,78,4,332,21};
		int[] repeatarray = { 1,2,5,6,1,3,4,88,23,6};
		int[] sumarray = {1,2,3,5,4,7,8,9};
		int[] marray = {200,22,55,30,88,99,33,100};
		int[] narray = {200,22,55,30,88,99,33,100};
		char[] carray = {'a','A','b','B'};
		int howmany = 20;

		// ADD TO NUMBERS
		System.out.println("Add result\t"+Calculator.add(100,200));
		// ADD TwO DOUBLE NUMBERS
		System.out.println("Add double result\t"+Calculator.add(20.50,13.2));
		//calculate speed from time and distance
		System.out.println("speed is\t"+Calculator.speed(23.50,15.2)+"km/hr");
		//area of a circle
		System.out.println("Area of a circel\t"+Calculator.acrcl(25));
		//factorial
		//area of a circle
		System.out.println("fact number\t"+Calculator.fact(5));
		//even or not
		System.out.println("number is even:"+Calculator.ec(24));
		//even or not
		System.out.println("number is odd:"+Calculator.oc(24));
		//check prime number
			System.out.println("entered num 11 is prime:"+Calculator.pm(11));
		//check palindrome
			System.out.println("entered num 225 is palindrome:"+Calculator.pal(225));
		//check fibonacci series
			System.out.println("fibonacci series is: \n"+Calculator.fib(25));
		//divisible bye 6
		System.out.println("\nentered num 36  is divisible by 6"+Calculator.by6(36));
		//take seond return hr
		System.out.println("\nentered seconds is 25000 in hour is"+Calculator.timeh(25000));
		//count digit 
		System.out.println("\ntotal digits in numbers 2560 is :"+Calculator.cdigit(2560));
		//repeat digit 
		System.out.println("\nrepeat :"+Calculator.repeat(63));
		//100th digit 
		System.out.println("\n 100th digit in 1265 :"+Calculator.digi(1256));
		//runrate required 
		System.out.println("\n run rate required for the status(target:326,max over:49,current score:210,overs bowled:33) :"+Calculator.rr(326,49,210,33));
		//make decimal digit
		System.out.println("\n decimal digi of  1,2,5 :"+Calculator.deci(1,2,5));
		//sum digit
		System.out.println("sum of 24 digit:"+Calculator.sdigi(24));
		//and of 3 boolean
		System.out.println("AND(t,t,f) :"+Calculator.bl(true,true,false));
		//1ST IF greater of 3 greater of 3
		System.out.println("IF 1ST greater of (2,20,20):"+Calculator.gr3(2,20,20));
		//ascending of 3
		System.out.println("asending of (12,13,14):"+Calculator.as3(12,13,14));
		//sum of last 3 digit
		System.out.println("sum of last 4 digit 451111 :"+Calculator.sl4digi(451111));
		//area of square wen end oints
		System.out.println("area of a square with end points(0,0,5,5) :"+Calculator.sqr(0,0,5,5));
		//4 digit sum out of 3 numbers
		System.out.println("entered number(4,5,6)  result :"+Calculator.ds3(4,5,6));
		//divisible by 3 or 7
		System.out.println("num=27 divisible by 3 or 7 :"+Calculator.d37(21));
		//greater of 3
		System.out.println("GREATEST OF (2,40,50) :"+Calculator.gr3n(2,40,50));
		//NUMBER OF DAYS IN MONTH OF 2014
		System.out.println("NO OF DAYS IN 1st MONTH :"+Calculator.mon(1));
		//change case
		System.out.println("change case of D :"+Calculator.casea('D'));
		//digit or not
		System.out.println("is entered is digit:"+Calculator.isdigit('2'));
		//mid character
		System.out.println("middle char :"+Calculator.middlechar('b','a','c'));
		// same last digit
		System.out.println("same last digit result (221,221):\t"+Calculator.sld(221,221));
		//sume of any 2 equals to other
		System.out.println("sum of any 2 is erd number (22,22,44) :"+Calculator.tsum(22,22,44));
		//lottery1
		System.out.println("lottery amount for (21) :"+Calculator.l1(21));
		//lottery3,
		System.out.println("lottery amount for (59,8,49) :"+Calculator.l2(59,8,49));
		//sum of last 3 digit
		System.out.println("sum of last 3 digit 451111 :"+Calculator.sl3digi(451111));
		//black jack
		System.out.println("same last digit result (18,21):\t"+Calculator.black(189,21));
		//reverse 3 digit number
		System.out.println("reverse of (183):\t"+Calculator.rev3(183));
		//perfect mumber
		System.out.println("checking 6 is perfect number or not:\t"+Calculator.per(496));



		//content print array
		Calculator.printarray(contentarray);
		//check repeat numbers
		System.out.println("\nthe content in array are repeated:-"+Calculator.repeat(repeatarray));

		//sum of a array
		System.out.println("the sum of the array is "+Calculator.suma(sumarray));

		//max in an aray
		System.out.println("the max of the array is "+Calculator.amax(marray));

		//key positionm
		System.out.println("the position in the array is "+Calculator.pos(marray,100));

		//sort an array
		Calculator.sort(marray);
		Calculator.printarray(marray);


		System.out.println("\n reverse array is ");
		//revers an array
		Calculator.reverse(contentarray);
		Calculator.printarray(contentarray);

		//case an array
		System.out.println("\n case change array is ");
		Calculator.case1(carray);
		//Calculator.printcd(carray);

		//give array size and generate natrual numbers
		System.out.println("\nrandom array \n");
		int[] ranarray = Calculator.ranarray(howmany);
		Calculator.printarray(narray);
	//eveen numbers from-to in array
		System.out.println("\n even  array \n");
		int[] evenarrayd = Calculator.evenarrays(10,20);
		Calculator.printarray(evenarrayd);
	//eveen numbers from-to in array
		System.out.println("\n odd  array \n");
		int[] oddnarrayd = Calculator.oddnarrays(10,20);
		Calculator.printarray(oddnarrayd);
	//prime numbers from-to in array
		System.out.println("\n prime  array \n");
		int[] primearrayd = Calculator.primearrays(10,20);
		Calculator.printarray(primearrayd);
	//prime numbers from-to in array
		System.out.println("\n fibonacci  array \n");
		int[] fibarrayd = Calculator.fibarray(10);
		Calculator.printarray(fibarrayd);
	//random a-z numbers from-to in array
		System.out.println("\n random character  array \n");
		char[] chararrayd = Calculator.randomaz(10);
		Calculator.printarray(chararrayd);
	//reverse an array
		int[] revarrayd={6,3,4,8,7,0,2,1};
		System.out.println("\n arrary before reverse \n");
		Calculator.printarray(revarrayd);
		int[] resu = Calculator.revarr(revarrayd);
		System.out.println("\n arrary after reverse \n");
		Calculator.printarray(resu);
	//vowel count in an array
		System.out.println("\n random character  array \n");
		char[] chararrayd1 = Calculator.randomaz(10);
		Calculator.printarray(chararrayd1);
		System.out.println("\n number of vowels\n"+Calculator.vowelcount(chararrayd1));
	//pallindrom array
		System.out.println("\n palindrome  array \n");
		int[] palinarray1 = Calculator.palinarray(100,200);
		Calculator.printarray(palinarray1);



		
	}
}
