package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-19
 */
public class Run {
    public static void main(String[] args) {
        //Context context = new Context(new ConcreteStateA());
        //context.request();
        //context.request();
        //context.request();
        //context.request();
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(17);
        emergencyProjects.writeProgram();


    }
}
