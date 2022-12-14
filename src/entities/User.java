package entities;

import enums.Status;

public class User implements Comparable<User>{
    private String name;
    private Status status;


    public User() {
    }

    public User(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatusName() {
        return status;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.getStatusName().equals(Status.TEACHER) && (o.getStatusName().equals(Status.SENIOR_STUDENT) || o.getStatusName().equals(Status.JUNIOR_STUDENT))){
            return 1;
        } else if (this.getStatusName().equals(Status.SENIOR_STUDENT) && (o.getStatusName().equals(Status.TEACHER) || o.getStatusName().equals(Status.JUNIOR_STUDENT))) {
            return 1;
        } else {
            return 1;
        }
    }
}


