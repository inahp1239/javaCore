package collections.equalsandhashcode;

public class EqualAndHashCode {
    public static void main(String[] args) {

		String str1 = "string";
		String str2 = "string";

		System.out.println(str1 == str2);  // true;
		System.out.println(str1.equals(str2)); // true  : because String clas already overrided ;
		
		// Code code1 = new Code("s01","l02");
		// Code code2 = new Code("s01","l02");

		// System.out.println(code1 == code2); // false
		// System.out.println(code1.equals(code2)); // false    :  before overriding the hashCode() and equals() ;
		
		// System.out.println(code1.equals(code2)); // true   : after overriding;
		
    }
}

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		return true;
	}

	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

    // this code will compare and remove the dupicates in a user defined data type;
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	
}
