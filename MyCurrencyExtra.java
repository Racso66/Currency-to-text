import java.util.Scanner;
/* Student name: Racso66
   File Name: MyCurrencyExtra.java
   This code converts Double number value into it's Text String form.
   The text is just like how it is on a cheque
*/
public class MyCurrencyExtra{

	public static void main(String [] args){
	
		double value = getValueFromUser();
		//getting an input value from user
		String text = convertToWords(value);
		//use the input value and convert to text form.
		System.out.println(text);
		//Outputting the converted String
	}
	/*
	This code assigns the english names for each number
	for ten thousand,thousands,hundreds,tens,ones and zero
	*/
	public static String baseCardinalToString(int value){
	
		
		String valueName = "";
		//to assign names for each value.
		
		//Values 1-9
		if(value < 10){
			if(value == 1){
				valueName = "one ";}
			else if(value == 2){
				valueName = "two ";}
			else if(value == 3){
				valueName = "three ";}
			else if(value == 4){
				valueName = "four ";}
			else if(value == 5){
				valueName = "five ";}
			else if(value == 6){
				valueName = "six ";}
			else if(value == 7){
				valueName = "seven ";}
			else if(value == 8){
				valueName = "eight ";}
			else if(value == 9){
				valueName = "nine ";}
		}
		//10-19 values
		else if(value < 20 && value >= 10){
			if(value == 10){
				valueName = "ten";}//only one equal sign here, I don't remember why.
			else if(value == 11){
				valueName = "eleven ";}
			else if(value == 12){
				valueName = "twelve ";}
			else if(value == 13){
				valueName = "thirteen ";}
			else if(value == 14){
				valueName = "fourteen ";}
			else if(value == 15){
				valueName = "fifteen ";}
			else if(value == 16){
				valueName = "sixteen ";}
			else if(value == 17){
				valueName = "seventeen ";}
			else if(value == 18){
				valueName = "eighteen ";}
			else if(value == 19){
				valueName = "nineteen ";}
		}
		//Values with "ty".
		else if(value <30 && value >= 20){
			valueName = "twenty";}
		else if(value <40 && value >= 30){
			valueName = "thirty";}
		else if(value <50 && value >= 40){
			valueName = "forty";}
		else if(value <60 && value >= 50){
			valueName = "fifty";}
		else if(value <70 && value >= 60){
			valueName = "sixty";}
		else if(value <80 && value >= 70){
			valueName = "seventy";}
		else if(value <90 && value >= 80){
			valueName = "eighty";}
		else if(value <100 && value >= 90){
			valueName = "ninety";}
		
		
		return valueName;
		// returning the value name
	}
	
	public static String convertToWords(double value){
	/*giving specific names to each parts of number
	printing out the value of each part and adding name of the parts after
	ex: 99203, "ninety nine" is the value for the thousand part, and adding "thousand" after it
	*/
		//names assigned below
		String Name = "";
		int DValue = 0;
		int thousands = 0;
		int hundreds =0;
		int tens = 0;
		int ones = 0;
		int cents = 0;
		
		
		DValue = (int) value;
		hundreds = DValue%1000;
		thousands = DValue - hundreds;
		tens = hundreds%100;
		hundreds = hundreds - tens;
		ones = tens%10;
		cents = ((int)(value * 100.0 + 0.5 )) % 100;
		
		//Thousand names
		thousands = thousands/1000;
		if(thousands > 0)
		{
			if(thousands == 1){
				Name = baseCardinalToString(1) + "thousand ";}
			else if(thousands == 2){
				Name = baseCardinalToString(2) + "thousand ";}
			else if(thousands == 3){
				Name = baseCardinalToString(3) + "thousand ";}
			else if(thousands == 4){
				Name = baseCardinalToString(4) + "thousand ";}
			else if(thousands == 5){
				Name = baseCardinalToString(5) + "thousand ";}
			else if(thousands == 6){
				Name = baseCardinalToString(6) + "thousand ";}
			else if(thousands == 7){
				Name = baseCardinalToString(7) + "thousand ";}
			else if(thousands == 8){
				Name = baseCardinalToString(8) + "thousand ";}
			else if(thousands == 9){
				Name = baseCardinalToString(9) + "thousand ";}
			else if(thousands == 10){	
				Name = "ten thousand ";}
			//this is the maximum case of userinput
			
		}
		
		//Hundreds names
		hundreds = hundreds/100;
		if(hundreds > 0)
		{
			if(hundreds == 1){
				Name = Name + baseCardinalToString(1) + "hundred ";}
			else if(hundreds == 2){
				Name = Name + baseCardinalToString(2) + "hundred ";}
			else if(hundreds == 3){
				Name = Name + baseCardinalToString(3) + "hundred ";}
			else if(hundreds == 4){
				Name = Name + baseCardinalToString(4) + "hundred ";}
			else if(hundreds == 5){
				Name = Name + baseCardinalToString(5) + "hundred ";}
			else if(hundreds == 6){
				Name = Name + baseCardinalToString(6) + "hundred ";}
			else if(hundreds == 7){
				Name = Name + baseCardinalToString(7) + "hundred ";}
			else if(hundreds == 8){
				Name = Name + baseCardinalToString(8) + "hundred ";}
			else if(hundreds == 9){
				Name = Name + baseCardinalToString(9) + "hundred ";}
		}
		
		/*this part adds an "and" between each part of the text
		but by doing this, if I type in 1000.02 the out put will become 
		"one thousand and ------------------- 02/100 dollars" where the "and" here is not needed
		only appears for hundreds and thousands
		*/
		if(value > 100){
			Name = Name + "and ";}
		//Tens name
		if(tens > 0){
			if(tens > 9 && tens < 20){
				Name = Name + baseCardinalToString(tens);}
			else if(tens >= 20 && tens <30){
				Name = Name + baseCardinalToString(20);	}
			else if(tens >= 30 && tens <40){
				Name = Name + baseCardinalToString(30);}
			else if(tens >= 40 && tens <50){
				Name = Name + baseCardinalToString(40);}
			else if(tens >= 50 && tens <60){
				Name = Name + baseCardinalToString(50);}
			else if(tens >= 60 && tens <70){
				Name = Name + baseCardinalToString(60);}
			else if(tens >= 70 && tens <80){
				Name = Name + baseCardinalToString(70);}
			else if(tens >= 80 && tens <90){
				Name = Name + baseCardinalToString(80);}
			else if(tens >= 90 && tens <100){
				Name = Name + baseCardinalToString(90);}
		}
		
		/*Ones names if there is a tens value +if ones come after tens, add a "-" in between
		ex: 35 = thirty-five
		*/
		if(tens > 19 && ones > 0){
			if(ones == 1){
				Name = Name + "-" + baseCardinalToString(1);}	
			else if(ones == 2){
				Name = Name + "-" + baseCardinalToString(2);}	
			else if(ones == 3){
				Name = Name + "-" + baseCardinalToString(3);}
			else if(ones == 4){
				Name = Name + "-" + baseCardinalToString(4);}
			else if(ones == 5){
				Name = Name + "-" + baseCardinalToString(5);}
			else if(ones == 6){
				Name = Name + "-" + baseCardinalToString(6);}
			else if(ones == 7){
				Name = Name + "-" + baseCardinalToString(7);}
			else if(ones == 8){
				Name = Name + "-" + baseCardinalToString(8);}
			else if(ones == 9){
				Name = Name + "-" + baseCardinalToString(9);}
		}
		//ones names if there are no tens value, here the "-" is not needed
		else if(tens < 10){
			if(ones == 1){
				Name = Name + baseCardinalToString(1);}
			else if(ones == 2){
				Name = Name + baseCardinalToString(2);}
			else if(ones == 3){
				Name = Name + baseCardinalToString(3);}
			else if(ones == 4){
				Name = Name + baseCardinalToString(4);}
			else if(ones == 5){
				Name = Name + baseCardinalToString(5);}
			else if(ones == 6){
				Name = Name + baseCardinalToString(6);}
			else if(ones == 7){
				Name = Name + baseCardinalToString(7);}
			else if(ones == 8){
				Name = Name + baseCardinalToString(8);}
			else if(ones == 9){
				Name = Name + baseCardinalToString(9);}
		}
		//this code accounts for when all parts are 0 (cents can have any value) print "zero"
		if (tens == 0 && ones == 0 && hundreds == 0 && thousands == 0){
			Name = "zero ";}
		
		/*adding "-" for value before the . and after the .
		ex: 9932.23   , 9932 is before the .  and 23 is after
		*/
		for (int x = Name.length(); x < 54; x++){
			Name = Name + "-";}//fill in "-" until wordlength reaches 54
	  						  //the rest of the 16 will be in the cents code
		
		//Adding Cents to the end of the string
		if(cents == 00){
			Name = Name + " 00/100 dollars";}// no cents value
		else if(cents >= 10){
			Name = Name + " " + cents + "/100 dollars";}//cents value with two digits
		else{
			Name = Name + "- " + cents + "/100 dollars";}//cents value with one digit
		return Name;								   //an extra " " space is needed to max out the word count
	}
	
	public static double getValueFromUser(){
		Scanner scan = new Scanner(System.in);
		double value = 0.0;
		boolean correctNum = false;
		/*code here allows the user to input a number until it's a valid number
		ex. if user inputs greater than 10000 or less than 0.01, the user can keep entering
		a number until it's a valid number within this range
		*/
		while(!correctNum)
		{
			System.out.print("What is the monetary amount? ");
			//user input = double
			if(scan.hasNextDouble()){
				value = scan.nextDouble();
				if(value <= 10000.0 && value >= 0.01){//testing to see if the number is in the range
					correctNum = true;}//if it is a valid number, use it in main.
				else{	//repeats to ask for a correct value
					System.out.println("Please enter in a value between 10,000.00 and 0.01");}
			}
		}
		return value;//return the value
	}	
}
//questions are listed in the code by comments. line 172
