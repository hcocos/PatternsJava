
public class Student {
	
	private int matriculationNumber;
	private String name;

	
public Student(int matriculationNumber, String name)
{
	this.matriculationNumber = matriculationNumber;
	this.name = name;
}
	
public int getMatriculationNumber()
{
	return this.matriculationNumber;
}

public String getName()
{
	return this.name;
}
	
public void setMatriculationNumber(int matriculationNumber)
{
	this.matriculationNumber = matriculationNumber;
}

public void setName(String name)
{
	this.name = name;
}

}
