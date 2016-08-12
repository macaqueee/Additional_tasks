package hashMap.hashMap;

import java.util.Date;

/**
 * Created by macaque on 10.08.2016.
 */
public class TestHashMap {


    public static void main(String[] args) {

        HashMap<User, String> hashMap = new HashMap<>();
        Date birth = new Date();


        for (int i = 0; i < 15; i++) {
            User user = new User(i,2000,"User #" + i, birth);
            hashMap.put(user,i+ " element");
        }

        User user = new User(5,2000,"User #" + 5, birth);
        System.out.println(hashMap.size());
        System.out.println(hashMap.tableLength());
        System.out.println(hashMap.containsValue("15 element"));
        System.out.println(hashMap.containsKey(user));



    }
}

class User {

    private int id;
    private double salary;
    private String name;
    private Date birth;

    public User(int id, double salary, String name, Date birth) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + id;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        long temp = Double.doubleToLongBits(salary);
        hash = 31 * hash + (int) (temp ^ (temp >>> 32));
        hash = 31 * hash + (birth != null ? birth.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj == null || User.class != obj.getClass()){
            return false;
        }
        User that = (User) obj;

        if (this.id != that.id){
            return false;
        }
        if (!(this.name != null ? this.name.equals(that.name) : that.name == null)){
            return false;
        }
        if (this.salary != that.salary){
            return false;
        }
        if (!(birth  != null ? birth.equals(that.birth) : that.birth == null)){
            return false;
        }
        return true;
    }
}
