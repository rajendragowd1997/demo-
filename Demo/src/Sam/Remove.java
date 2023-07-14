package Sam;

public class Remove {

	public static void main(String[] args) {
	String dup = "prdbbdfbdndoggggrammmgr";
	StringBuilder bui = new StringBuilder();
	dup.chars().distinct().forEach(c-> bui.append((char)c));
    System.out.println(bui);
	}

}


