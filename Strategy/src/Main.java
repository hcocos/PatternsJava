import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<Student>();
		Sorter numberSort = new NumberSorter();
		Sorter nameSort = new NameSorter();
		
		students.add(new Student(12345, "Denise"));
		students.add(new Student(66666, "Alfred"));
		students.add(new Student(22222, "Beatrice"));
		students.add(new Student(77777, "Cesar"));

		
		Iterator<Student> studIter = students.iterator();
		
		System.out.println("The List of Students:");
		while (studIter.hasNext()) {
			Student tempStud = studIter.next();
			System.out.println("MatNum: "+tempStud.getMatriculationNumber()+
					" Name: " +tempStud.getName());
		}

		
		ArrayList<Student> numberSortedStudents = 
				(ArrayList<Student>) numberSort.sort(students);
		Iterator<Student> studSortNumIter = 
				numberSortedStudents.iterator();
		
		System.out.println("\nThe List of Students sorted by Number:");
		while (studSortNumIter.hasNext()) {
			Student tempStud = studSortNumIter.next();
			System.out.println("MatNum: "+tempStud.getMatriculationNumber()+
					" Name: " +tempStud.getName());
		}	
		
		
		ArrayList<Student> sortedNameStudents = 
				(ArrayList<Student>) nameSort.sort(students);
		Iterator<Student> studSortNameIter = 
				sortedNameStudents.iterator();
		
		System.out.println("\nThe List of Students sorted by Name:");
		while (studSortNameIter.hasNext()) {
			Student tempStud = studSortNameIter.next();
			System.out.println("MatNum: "+tempStud.getMatriculationNumber()+
					" Name: " +tempStud.getName());
		}	
		
	}

}
