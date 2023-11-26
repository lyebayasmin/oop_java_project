package DomesticDreamTeam;

public class Category {
    private String name;
    private String gender;
    private int age;
    private String experience;
    private Category_type type;


    public Category() {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.experience = experience;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Category_type getType() {
        return type;
    }

    public void setType(Category_type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", experience='" + experience + '\'' +
                ", type=" + type +
                '}';
    }
}
