package com.promineotech;

import java.util.Arrays;

public class codingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        /* a. Programmatically subtract the value of the first element in the array from the value in the last element
         *  of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        */
        int firstElement = ages[0];
        int lastElement = ages[ages.length - 1];
        int result = lastElement - firstElement;
        System.out.println(result);

        // b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
        ages = Arrays.copyOf(ages, ages.length + 1);
        ages[ages.length - 1] = 80;
        firstElement = ages[0];
        lastElement = ages[ages.length - 1];
        result = lastElement - firstElement;
        System.out.println(result);

        // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        double averageAge = (double) sum / ages.length;
        System.out.println(averageAge);
        
        //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};        
        
        /* a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result
         *  to the console.
        */
        int totalLetters = 0;
        for (String name : names) {
        	totalLetters += name.length();
        }
        double averageLetters = (double)totalLetters / names.length;
        
        System.out.println(averageLetters);
        /* b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and
         *  print the result to the console.
        */
        String concatinatedNames = "";
        for (String name : names) {
        	concatinatedNames += name + " ";
        }
        System.out.println(concatinatedNames);
        
        //3. How do you access the last element of any array?
        		/*Answer:  for the above code the way we would access the last element we could do the following:
        		 *  		String lastElement = names[names.length - 1];
        		 *  		we access it by using the length property - 1 
        		 */
        //4. How do you access the first element of any array?
        		/*Answer:  for the above code the way we would access the first element we could do the following:
        		 *  		String firstElement = names[0];
        		 * 			we access it by using the index number [0]
        		 */
        /*5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
         *  add the length of each name to the nameLengths array.
		*/
        int [] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        /*6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
         * 	 Print the result to the console 
         */
        int nameLengthsSum = 0;
        for (int i = 0; i < nameLengths.length; i++) {
            nameLengthsSum += nameLengths[i];
        }
        System.out.println(nameLengthsSum);
        
        //7. Method Test
        String word = "Hello";
        int n = 3;
        String concatenatedWord = concatenateWord(word, n);
        System.out.println(concatenatedWord);
        
        //8. Method Test
        String firstName = "Michael";
        String lastName = "Tomasi";
        String fullName = genFullName(firstName, lastName);
        System.out.println(fullName);
        
        //9. Method Test
        int[] numbers = {15, 26, 30, 45};
        boolean isSumGreaterThan100 = isSumGreaterThan100(numbers);
        System.out.println(isSumGreaterThan100);
        
        //10. Method Test
        double[] doubleNumbers = {2.5, 4.8, 6.9, 9.1, 9.7};
        double average = calculateAverage1(doubleNumbers);
        System.out.println(average);
        
        //11. Method Test
        double[] array1 = {2.5, 4.8, 6.3, 9.1, 1.7};
        double[] array2 = {1.2, 3.9, 5.6, 7.8, 2.4};
        boolean isFirstArrayAverageGreater = compareArrayAverages(array1, array2);
        System.out.println(isFirstArrayAverageGreater);
        
        //12. Method Test
        boolean isHotOutside = true;
        double moneyInPocket = 25.00;
        boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(willBuyDrink);
        
        //13. Method Test
        boolean workNotCompleted = true;
        int hoursOfStudy = 15;
        String schoolWorkStatus = schoolWorkStatus(workNotCompleted, hoursOfStudy);
        System.out.println(schoolWorkStatus);
        
        
        		
    }
	/*13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 * 	  This Method takes a boolean value known as workNotCompleted and an int value of hours of study and returns a string
	 * 	  based on whether your work is completed and how many hours you have worked.  This would provide a user with some "Verbal"
	 *   Input to encourage them or give advice.
	 */
	public static String schoolWorkStatus(boolean workNotCompleted, int hoursOfStudy) {
		if (workNotCompleted && hoursOfStudy > 20) {
	        return "You Should Seek Help With Classwork!";
	    } else if (workNotCompleted && hoursOfStudy < 20) {
	        return "Keep Studying! You are Almost done.";
	    } else if (!workNotCompleted && hoursOfStudy > 20) {
	        return "Good Job!";
	    } else {
	        return "You are a fast learner! Good Job!";
	    }
	}
	/*12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
	 * 	  true if it is hot outside and if moneyInPocket is greater than 10.50
	 * 
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
		
		
	}
	/* 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array
	 *   is greater than the average of the elements in the second array.
	 */
	private static boolean compareArrayAverages(double[] array1, double[] array2) {
		double average1 = calculateAverage1(array1);
        double average2 = calculateAverage1(array2);
        return average1 > average2;
    }

    private static double calculateAverage1(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
		
	
	}
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double calculateAverage(double[] doubleNumbers) {

		double sum = 0;
		for (double num : doubleNumbers) {
			sum += num;
		}
		return sum / doubleNumbers.length;
	}
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isSumGreaterThan100(int[] numbers) {
		
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}		
		return sum > 100;
		
	}
	/*8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should
	 *  be the first and the last name as a String separated by a space). 
	 */
	public static String genFullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}



	/*7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
     * itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”)
     */ 	
	public static String concatenateWord(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}

}
