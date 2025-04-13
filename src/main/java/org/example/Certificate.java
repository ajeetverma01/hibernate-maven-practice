package org.example;

public class Certificate {
    String course;
    String Duration;

    public String getCourse() {
        return course;
    }

    public Certificate(){
        super();
    }
    public Certificate(String course, String duration) {
        super();
        this.course = course;
        Duration = duration;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}
