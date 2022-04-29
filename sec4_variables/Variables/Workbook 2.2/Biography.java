public class Biography {
    public static void main(String[] args) {

        //make a name variable
        String name = "John Smith";
        //make an age variable
        int age = 46;
        //make a country variable
        String country = "Jordan";
        //make a sport variable
        String sport = "Football";
        //make an hours variable
        int hours = 2;
        //make a game variable
        String game = "Witcher";
        //make a subject variable
        String subject = "Web Development";
        //make a grade variable
        char grade = 'A';
     
        System.out.println("My name is " + name + '.' + " I'm " + age + " years old, and"
        +" I'm from " + country + '.');
        System.out.println("My favorite sport is " + sport +'.' + " I play for " + hours 
        + " hours a day" + '.');
        System.out.println("When I'm tired, I like to play " + game + '.');
        System.out.println("In school, my favorite subject was " + subject + 
        ", I scored a " + grade + '.');
    }
}