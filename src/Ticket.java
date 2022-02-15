public  class Ticket {
    String passengerId;
    String name;
    String berthPreference;
    int age;

    int idGenerator =0;

    public Ticket(String passengerId,String name, String berthPreference, int age) {
        this.passengerId = passengerId;
        this.name = name;
        this.berthPreference = berthPreference;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passengerId='" + passengerId + '\'' +
                ", name='" + name + '\'' +
                ", berthPreference='" + berthPreference + '\'' +
                ", age=" + age +
                ", idGenerator=" + idGenerator +
                '}';
    }

    public String getPassengerId()
    {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBerthPreference() {
        return berthPreference;
    }

    public void setBerthPreference(String berthPreference) {
        this.berthPreference = berthPreference;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
