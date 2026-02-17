package sem4day1;
import java.util.Scanner;

public class Task1 {
	    private String patientName;
	    private int patientAge;
	    private String patientId;

	    private String hospitalName;
	    private String location;
	    private String pincode;

	    public  Task1(String patientName, int patientAge, String patientId,
	                            String hospitalName, String location, String pincode) {

	        this.patientName = patientName;
	        this.patientAge = patientAge;
	        this.patientId = patientId;
	        this.hospitalName = hospitalName;
	        this.location = location;
	        this.pincode = pincode;
	    }

	    public void displayDetails() {

	        System.out.println("\n Summary ");

	        System.out.println("\n Hospital Details");
	        System.out.println("Hospital Name :" +hospitalName);
	        System.out.println("Location      :" + location);
	        System.out.println("Pincode       :" +pincode);

	        System.out.println("\nPatient Details");
	        System.out.println("Patient Name  :" + patientName);
	        System.out.println("Patient Age   :" + patientAge);
	        System.out.println("Patient ID    :" + patientId);
	    }

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println(" Healthcare Patient Portal");

	        // Hospital Input
	        System.out.print("Enter Hospital Name: ");
	        String hospitalName = scanner.nextLine();

	        System.out.print("Enter Hospital Location: ");
	        String location = scanner.nextLine();

	        System.out.print("Enter Hospital Pincode: ");
	        String pincode = scanner.nextLine();

	        System.out.print("Enter Patient Name: ");
	        String patientName = scanner.nextLine();

	        System.out.print("Enter Patient Age: ");
	        int patientAge = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter Patient ID: ");
	        String patientId = scanner.nextLine();


	        Task1 portal = new  Task1(
	                patientName, patientAge, patientId,
	                hospitalName, location, pincode
	        );

	        portal.displayDetails();

	       
	    }
	}


