package com.oop.encapsulation;

class Human {

    private String name;
    private int age ;
    private String CompanyName;
    private boolean isOnLeave;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public boolean isOnLeave() {
        return isOnLeave;
    }

    public void setOnLeave(boolean onLeave) {
        isOnLeave = onLeave;
    }

    public String getEmail() {
        return email;
    }

    /*public void setEmail(String email) {
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }
        else {
            System.out.println("Provide a valid email");
        }
    }*/

    public void setEmail(String email) {
            this.email = email;
    }

    Human(String name, int age, String CompanyName, String email) {
        this.name=name;
        this.age=age;
        this.CompanyName=CompanyName;
        this.email=email;

    }
    Human(String name,int age,String CompanyName,Boolean isOnLeave) {
        this.name=name;
        this.age=age;
        this.CompanyName=CompanyName;
        this.isOnLeave=isOnLeave;

    }


}

class Demo {
    public static void main(String[] args) {
        Human human = new Human("Tom",22,"Google","tom@gmail.com");
        human.setName("Roshan");
        System.out.println(human.getName() + " Age is-" + human.getAge());
        System.out.println(human.getEmail());








    }

}
