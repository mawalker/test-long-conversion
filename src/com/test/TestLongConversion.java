package com.test;
/**
 * 
 * Very Simple test of Java primitive and Long type conversion
 * <p>
 * for testing and diagnostic purposes (To eliminate a basic type conversion
 * issue from causing a student an issue requiring them to use '0l' instead of
 * '0' to get JUnit to function properly).
 * 
 * @author Michael A. Walker
 * 
 */
public class TestLongConversion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		long myLong1 = 0l;
		long myLong2 = 0;
		Long myLong3 = new Long(0l);
		Long myLong4 = new Long(0);
		Long myLong5 = new Long(myLong1);
		Long myLong6 = new Long(myLong2);
		long myLong7 = (int) 0;
		long myLong8 = (long) 0;
		long myLong9 = 0;
		long myLong10 = 0l;

		Long myLong11 = new Long(myLong9);
		Long myLong12 = new Long(myLong10);
		boolean b1 = (myLong11.longValue() == myLong12.longValue());
		boolean b2 = (myLong11.equals(myLong12));
		boolean b3 = (myLong11.compareTo(myLong12) == (int) 0);
		boolean b4 = (myLong11.hashCode() == myLong12.hashCode());
		boolean b5 = (myLong11.toString().equals(myLong12.toString()));

		if (b1 && b2 && b3 && b4 && b5) {
			System.out.println("Completed.");
		} else {
			System.out.println("Failed.");
		}

	}

}
