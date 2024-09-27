
package idk;

import java.util.Scanner;
public class Robot {
    int speed;
    int size;
    String robot;
    Robot(){
        speed = 1;;
        size = 1;
        robot = "*\n";
    }
    
    void who(){
        System.out.print(robot+"\nI am Sai Karthi Balaji Ganeshamoorthy");
    }
    
    void change_size(int x){
        robot="";
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                robot+="*";
            }
            robot+="\n";
        }
        size = x;
        System.out.print("\nThe robot:\n"+robot);
    }
    
    void change_speed(int x){
        speed = x;
    }
    
    void move_right(int x){
        String temp="";
        for(int i=0;i<size;i++){
            for(int j=0;j<x*speed;j++){
                temp+=" ";
            }
            char c='\u0000';
            int index = 0;
            while(c != '\n'){
                c=robot.charAt(index);
                temp+=c;
                index++;
            }
        }
        robot = temp;
        size+=x*speed;
        System.out.print("\nAfter moving:\n"+robot);
    }
    
    void reset(){
        String temp="";
        int temp_size=0;
        for(int i=0;i<robot.length();i++){
            char c=robot.charAt(i);
            if(c!=' '){
                temp_size++;
                temp+=c;
            }
        }
        robot = temp;
        System.out.print("\nPosition has been reset:\n"+robot);
    }
    
    void joke(){
        System.out.print("\nSai is gay, and so I am!!");
    }
    
    public static void main(String args[]){
        Robot ob = new Robot();
        Scanner sc = new Scanner(System.in);
        int choice=1;
        while(choice != 10){
            System.out.print("\nEnter:(1)Who are you\n(2)Change size\n(3)Change speed\n(4)Move right\n(5)Reset position\n(6)Make a joke\n(7)Exit\nYour choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ob.who();
                    break;
                case 2:
                    System.out.print("\nEnter size : ");
                    ob.change_size(sc.nextInt());
                    break;
                case 3:
                    System.out.print("\nEnter new speed : ");
                    ob.change_speed(sc.nextInt());
                    break;
                case 4:
                    System.out.print("\nEnter number of steps to move right : ");
                    ob.move_right(sc.nextInt());
                    break;
                case 5:
                    ob.reset();
                    break;
                case 6:
                    ob.joke();
                    break;
                case 7:
                    System.out.print("\nProgram exitted!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("\nWrong Choice!!!");
            }
        }
    }
}
