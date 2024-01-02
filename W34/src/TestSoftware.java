import com.techacademy.software.Software;
import com.techacademy.software.TextEditor;

public class TestSoftware {
    public static void main(String[] args) {
        Software s1= new Software("windows", "10", 80,125.45);
        Software s2= new Software("windows", "11", 75,129.45);
        s1.addUsers(40);
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
        int hash = s2.hashCode();

        TextEditor t1 = new TextEditor("windows", "10", 80,125.45,".xD",20);
        TextEditor t2 = new TextEditor("windows", "10", 70,126.45,".PD",26);
        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));
        int hasht = t1.hashCode();
        t1.addUsers(50);
    }
}
