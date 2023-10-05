package collections.maps;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
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

public class TreeMapWithSortingOfObject {
    public static void main(String[] args) {
		Map<Code,String> hashmap = new TreeMap<>();
		hashmap.put(new Code("S01","L03"), "Generics");
		hashmap.put(new Code("S01","L01"), "Files under Java");
		hashmap.put(new Code("S02","L03"), "Network programming");
		hashmap.put(new Code("S01","L07"), "OOPS");
		hashmap.put(new Code("S01","L05"), "Methods");
		hashmap.put(new Code("S01","L03"), "Expressions");
		
		for(Map.Entry<Code, String> entry: hashmap.entrySet()){
		   System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
    }
}
