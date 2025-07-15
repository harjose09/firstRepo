package Tutorials;

public class School {


    String name, location;
    int nOofStudent;
    int noOfFaculty;
    long worth;


        @Override
        public String toString() {
            return "The name of the school is " + name
                    + " with " + noOfFaculty + " faculties, accomodating about "
                    + nOofStudent + " students" +
                    " and a net worth of " + worth +
                    " billion naira, "
                    + "located at " + location + ".";
        }

    public static void main(String[] args) {

        School newSchool = new School();
        newSchool.name = "Fuoye";
        newSchool.noOfFaculty = 15;
        newSchool.worth = 200_000_000_000L;
        newSchool.location = "Oye_Ekiti";
        newSchool.nOofStudent = 56_000;


        System.out.println(newSchool);

    }


}
