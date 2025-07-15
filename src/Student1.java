public class Student1 {


        String name;
        String address;
        int age;



        @Override
        public String toString(){
            return "Student{" +
                    "name = '" + name + '\'' +
                    ", age = '" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

        public static void main(String [] args){

            Student1 newStudent1 = new Student1();
            newStudent1.address = "Lagos Mainland";
            newStudent1.age = 15;
            newStudent1.name = "James";

            System.out.println(newStudent1);




        }



    }

