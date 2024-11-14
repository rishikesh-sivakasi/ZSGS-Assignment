import java.time.LocalDate;

public class EmployeeDTO {

    private static final String DEFAULT_COMPANY_NAME = "ZOHO";

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private double salary;
    private String companyName;

    public EmployeeDTO() {
        this.companyName = DEFAULT_COMPANY_NAME; 
    }

    public EmployeeDTO(int id, String firstName, String lastName, LocalDate dateOfBirth, double salary, String email, String phoneNumber, String companyName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        setEmail(email);
        setPhoneNumber(phoneNumber);
        this.companyName = companyName != null ? companyName : DEFAULT_COMPANY_NAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getEmail() {
        return email != null ? "****" + email.substring(email.indexOf('@')) : null; // Masked display for privacy
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber != null ? "*****" + phoneNumber.substring(phoneNumber.length() - 4) : null; // Masked display
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static String getDefaultCompanyName() {
        return DEFAULT_COMPANY_NAME;
    }

    public void displayBasicInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Salary: $" + salary);
        System.out.println("Company: " + companyName);
    }
}

