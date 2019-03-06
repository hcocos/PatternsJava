import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter  implements Sorter{

	public List<Student> sort(List<Student> list)
	{

	Comparator<Student> studentNameComparator = new Comparator<Student>() {
			
		public int compare(Student s1, Student s2) {
					
			String studentName1 = s1.getName().toUpperCase();
			String studentName2 = s2.getName().toUpperCase();
					
			return studentName1.compareTo(studentName2);
		}};

		
		Collections.sort(list, studentNameComparator);
		
		return list;
	}
	
}
