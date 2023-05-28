import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        login l1 = new login();
        registration rr = new registration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online Examination portal  !! ");
        System.out.println("\n1. Login\n2. SignUp");
        System.out.print("Enter your option: ");
        int r = sc.nextInt();
        if(r == 1){
            System.out.println("\nWelcome Back");
            System.out.println("----------Login----------");
            l1.m1();
        }else{
            System.out.println("----------SignUp----------");
            rr.r1();
        }
    }
}
class login{
    Scanner sc = new Scanner (System.in);
    public void m1(){
        menu m = new menu();
        int pswd = 12345;
        System.out.print("Enter your mail: ");
        String s = sc.next();
        while(true){
            System.out.print("Enter your password: ");
            int p = sc.nextInt();
            if(p == pswd){
                m.m2();
                break;
            }else{
                System.out.println("You Entered Mail or Password are Incorrect");
            }
        }
    }
}
class registration{
    Scanner sc = new Scanner (System.in);
    menu mm = new menu();
    void r1(){
        System.out.print("ENTER YOUR NAME :");
        String name = sc.nextLine();
        System.out.print("ENTER YOUR MAIL :");
        String mail = sc.nextLine();
        System.out.print("ENTER YOUR PASSWORD:");
        int pp = sc.nextInt();
        System.out.println("\n  Registration Successful !! ");
        System.out.println("\n ---------- Login ------------");
        while (true){
            System.out.print("ENTER YOUR MAIL: ");
            String s = sc.next();
            System.out.print("ENTER YOUR PASSWORD: ");
            int p = sc.nextInt();
            if(s.equals(mail) && p == pp){
                mm.m2();
                break;
            }
            else{
                System.out.println("You entered Mail or password are incorrect");
            }
        }
    }
}
class abt{
    void display(){
        System.out.println("Name : Sachin Rajbher");
        System.out.println("Mail : sachin12345603@gmail.com");
    }
}
class menu{
    sci s = new sci();
    mat m = new mat();
    abt a = new abt();
    Scanner sc = new Scanner (System.in);
    public void m2 (){
        System.out.println("\n*****login successful*****");
        while(true){
            System.out.println("\n 1.My Account \n 2.Exam \n 3.Exit");
            System.out.print("\n Enter your option :");
            int o = sc.nextInt();
            if(o==1){
                a.display();
                System.out.println("\n 1.Back \n 2.Exit");
                int g1 = sc.nextInt();
                if(g1==1){
                    System.out.println("\n");
                }else{
                    break;
                }
            }
            else if(o == 2){
                System.out.println("\n 1.Science \n 2.Maths");
                System.out.print("Select the subjcts: ");
                int su = sc.nextInt();
                if(su ==1){
                    s.s1();
                }else if(su == 2){
                    m.mat1();
                }else{
                    System.out.println("Choose the correct one :");
                }
                System.out.println("\n 1.Back \n 2.Exit");
                int g2 =sc.nextInt();
                if(g2 == 1){
                    System.out.println("\n");
                }else{
                    break;
                }
            }
			else{
                System.out.println("Choose the correct one");
            }
        }
    }
}

class sci{
    Scanner sc = new Scanner (System.in);
    void s1(){
        int count = 0;
        System.out.println();
        System.out.println("There are 3 questions each questions carries 1 marks");
        System.out.println();
        System.out.println("Question No. 1 :");
        System.out.println("What is male cow called ?");
        System.out.println("1. Dog");
        System.out.println("2. Ox");
        System.out.println("3. Monkey");
        System.out.println("4. Sheep");
        int ans1 = sc.nextInt();
        System.out.println();
        if(ans1 == 2){
            count++;
        }else{
            count = count;
        }
        System.out.println();
        System.out.println("Question No. 2 :");
        System.out.println("Which of the following animal lay eggs ?");
        System.out.println("1. Hen");
        System.out.println("2. Cat");
        System.out.println("3. Duck");
        System.out.println("4. Sheep");
        int ans2 = sc.nextInt();
        System.out.println();
        if(ans2 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println();
        System.out.println("Question No. 3 :");
        System.out.println("What  do animals requires besides air food to survive?");
        System.out.println("1. Water");
        System.out.println("2. House");
        System.out.println("3. Fruits");
        System.out.println("4. Pizza");
        int ans3 = sc.nextInt();
        System.out.println();
        if(ans3 == 1){
            count++;
        }else{
            count = count;
        }
        
        if(count > 2){
            System.out.println("\n EXCELLENT ");
        }
        else if(count >1 && count<3){
            System.out.println("/n GREAT JOB ");
        }else{
            System.out.println("\n BETTER LUCK NEXT TIME ");
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Your total score is:" +count);
        System.out.println("---------------------------------------");
        System.out.println("No.of questions you solve correct are :"+count);
    }
}

class mat{
    Scanner sc = new Scanner(System.in);
    void mat1()
    {
        int count = 0;
        System.out.println();
        System.out.println("There are 3 questions each questions carries 1 marks");
        System.out.println();
        System.out.println("Question No. 1 :");
        System.out.println("What is the next prime number after 3 ?");
        System.out.println("1. 6");
        System.out.println("2. 5");
        System.out.println("3. 9");
        System.out.println("4. 7");
        int ans1 = sc.nextInt();
        System.out.println();
        if(ans1 == 2){
            count++;
        }else{
            count = count;
        }
        System.out.println();
        System.out.println("Question No. 2 :");
        System.out.println("What is 15-7 ?");
        System.out.println("1. 10");
        System.out.println("2. 2");
        System.out.println("3. 12");
        System.out.println("4. 8");
        int ans2 = sc.nextInt();
        System.out.println();
        if(ans2 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println();
        System.out.println("Question No. 3 :");
        System.out.println("What is the square root of 81 ?");
        System.out.println("1. 9");
        System.out.println("2. 10");
        System.out.println("3. 7");
        System.out.println("4. 6");
        int ans3 = sc.nextInt();
        System.out.println();
        if(ans3 == 1){
            count++;
        }else{
            count = count;
        }
        
        if(count > 2){
            System.out.println("\n EXCELLENT ");
        }
        else if(count >1 && count<3){
            System.out.println("/n GREAT JOB ");
        }else{
            System.out.println("\n BETTER LUCK NEXT TIME ");
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Your total score is:" +count);
        System.out.println("---------------------------------------");
        System.out.println("No.of questions you solve correct are :"+count);      
    }
}