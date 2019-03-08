import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSorter implements Sorter{


public List<Student> sort(List<Student> list)
{

Comparator<Student> studentNumberComparator = new Comparator<Student>() {
		
	public int compare(Student s1, Student s2) {
				
		int studentNum1 = s1.getMatriculationNumber();
		int studentNum2 = s2.getMatriculationNumber();
				
		return studentNum1-studentNum2;
	}};

	
	Collections.sort(list, studentNumberComparator);
	
	return list;
}
	
	
	 
}
