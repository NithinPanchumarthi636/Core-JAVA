package com.rs.core.oops.ex;

public class StudentMain {

	public static void main(String[] args) {

		// 1.create objects to the student class
		Student student = new Student();

		// 2.set 8 properties values to student object
		student.setId(786);
		student.setName("Nithin");
		student.setGender('M');

		student.setTeluguMarks(80);
		student.setHindiMarks(79);

		student.setMathsMarks(85);
		student.setScienceMarks(94);
		student.setSocialMarks(79);

		// 3.Get 8 property values to the student objedct
		int id = student.getId();
		String name = student.getName();
		char gender = student.getGender();

		int teluguMarks = student.getTeluguMarks();
		int hindiMarks = student.getHindiMarks();

		int mathsMarks = student.getMathsMarks();
		int scienceMarks = student.getScienceMarks();
		int socialMarks = student.getSocialMarks();

		// 4.print 8 property values in the console view
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Gender:" + gender);

		System.out.println("Telugu:" + teluguMarks);
		System.out.println("Hindi:" + hindiMarks);

		System.out.println("Maths :" + mathsMarks);
		System.out.println("Science:" + scienceMarks);
		System.out.println("Social :" + socialMarks);
		
      //  StudentMain studentMain =new StudentMain();
		
		int languageTotal=StudentMain.getTotalMarks(teluguMarks, hindiMarks);
		System.out.println("LanguageTotal :" + languageTotal);
		
		
		int nonLanguageTotal =StudentMain.getTotalMarks(mathsMarks,scienceMarks,socialMarks);
		System.out.println("NonLanguageTotal :" + nonLanguageTotal);
	}
	
		public static int getTotalMarks(int teluguMarks,int hindiMarks) {
        return teluguMarks + hindiMarks;
        
	}
		public static  int getTotalMarks(int mathsMarks,int scienceMarks,int socialMarks) {
		return mathsMarks+scienceMarks+socialMarks;
		}

}
