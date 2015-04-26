package id.co.technomotion.builderpatteronandroid;

/**
 * Created by omayib on 4/16/15.
 */
public class Person {
    private  String firstName;
    private String middleName;
    private String lastName;
    private String birthDay;
    private String birthPlace;
    private String job;
    private  String address;
    private  String phone;
    private String salary;
    private double bodyHeight;
    private double bodyWeight;

    private Person(Builder b){
        this.address=b.address;
        this.birthDay=b.birthDay;
        this.birthPlace=b.birthPlace;
        this.bodyHeight=b.bodyHeight;
        this.bodyWeight=b.bodyWeight;
        this.firstName=b.firstName;
        this.job=b.job;
        this.lastName=b.lastName;
        this.middleName=b.middleName;
        this.salary=b.salary;
        this.phone=b.phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getJob() {
        return job;
    }

    public String getAddress() {
        return address;
    }

    public String getSalary() {
        return salary;
    }

    public double getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", job='" + job + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", bodyHeight=" + bodyHeight +
                ", bodyWeight=" + bodyWeight +
                '}';
    }

    public static class Builder{
        private String firstName;//required
        private String middleName;
        private String lastName;
        private String birthDay;
        private String birthPlace;
        private String job;
        private String address;//required
        private String phone;//required
        private String salary;
        private double bodyHeight=0;
        private double bodyWeight=0;

        public Builder firstName(String firstNamePerson){
            this.firstName=firstNamePerson;
            return this;
        }
        public Builder middleName(String middleNamePerson){
            this.middleName=middleNamePerson;
            return this;
        }
        public Builder lastName(String lastNamePerson){
            this.lastName=lastNamePerson;
            return this;
        }
        public Builder birthDay(String birthDayPerson){
            this.birthDay=birthDayPerson;
            return this;
        }
        public Builder birthPlace(String birthPlacePerson){
            this.birthPlace=birthPlacePerson;
            return this;
        }
        public Builder job(String jobPerson){
            this.job=jobPerson;
            return this;
        }
        public Builder address(String addressPerson){
            this.address=addressPerson;
            return this;
        }
        public Builder phone(String phonePerson){
            this.phone=phonePerson;
            return this;
        }
        public Builder salary(String salaryPerson){
            this.salary=salaryPerson;
            return this;
        }
        public Builder bodyHeight(double height){
            this.bodyHeight=height;
            return this;
        }
        public Builder bodyWedight(double weight){
            this.bodyWeight=weight;
            return this;
        }

        public Person build(){
            Person person= new Person(this);
            if(person.firstName==null){
                throw new IllegalStateException("first name can not be empty");
            }
            if(person.address==null){
                throw new IllegalStateException("address can not be empty");
            }
            if(person.phone==null){
                throw new IllegalStateException("phone can not be empty");
            }
            return person;
        }
    }

}
