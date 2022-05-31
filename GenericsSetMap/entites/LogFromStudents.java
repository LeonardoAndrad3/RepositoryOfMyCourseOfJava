package entites;

import java.util.Objects;

public class LogFromStudents {

	private Integer idStudent;

	public LogFromStudents(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogFromStudents other = (LogFromStudents) obj;
		return Objects.equals(idStudent, other.idStudent);
	}
	
	
	
	
	
}
