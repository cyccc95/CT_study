import java.io.*;
import java.util.*;

class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Num10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();

        int age;
        String name;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            Person p = new Person(age, name);
            list.add(p);
        }
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int a1 = p1.getAge();
                int a2 = p2.getAge();
                return a1 - a2;
            }
        });

        for (Person p : list){
            bw.write(p.toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

// 값이 같은 원소의 전후관계가 바뀌지 않는 정렬 알고리즘을 안정 정렬(stable sort)라고 합니다.