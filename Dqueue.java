
public class Dqueue
{
	private Student[] students;
	private int F;
	private int R;

	public Dqueue()
	{
		this(5);
	}
	public Dqueue(int size)
	{
		students = new Student[size];
		F = -1;
		R = -1;
	}

	public Student getIndex(int i) {
		return this.students[i];
	}
	public void setIndex(Student stu,int i) {
		 this.students[i] = stu;
	}
	public Dqueue(Dqueue studentsQ)
	{
		students = new Student[studentsQ.students.length];
		for(int i=0; i<studentsQ.students.length; i++) {
			this.students[i] = studentsQ.students[i];
		}
	}

	public void insertFromF(Student value)
	{
		if(R == students.length-1 && F==0)
		{
			System.out.println("queue is full");
		}
		else
		{
			if(F==-1)
			{
				F=R=0;
				students[R] = value;
			}else {
				if(F!=0 ) 
				{
					F--;
					students[F] = value;
				}else {
					++R;
					for(int i= R; i>F; i--) {
						students[i] = students[i-1];
					}
					students[F] = value;
				}


			}

		}
	}
	public void insertFromR(Student value)
	{
		if(R == students.length-1 && F==0)
		{
			System.out.println("queue is full");
		}
		else
		{
			if(F==-1)
			{
				F=R=0;
				students[R] = value;
			}else {
				if(R <students.length-1) {
					R++;
					//	System.out.println(F+"  "+ R);
					students[R] = value;

				}else if(R==students.length-1){
					--F;
					for(int i=F; i<R; i++) {
						students[i] = students[i+1];
					}
					students[R] = value;
				}
			}

		}
	}
	public void removeFromF()
	{
		if(F==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			if(F==R) {
				Student value = students[F];
				F=R=-1;
			}else {
				Student value = students[F];
				F++;

			}
		}
	}
	public void removeFromR()
	{
		if(F==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			if(F==R) {
				Student value = students[R];
				F=R=-1;
			}else {
				Student value = students[R];
				R--;

			}
		}
	}

	public String toString() 
	{
		String str = "";
		if(F==-1) {
			str += "empty";
		}else {
			for (int i = F; i <= R; i++) {
				str += students[i]+"\n";
			}

		}
		return str;
	}


}
