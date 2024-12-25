import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InterviewPreparation {
    public static ArrayDeque<Candidate> queue = new ArrayDeque<>();
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int totalNoOfCandidates = 0, noOfCandidatesCompletedInterview = 0;
        boolean isInterviewStarted = false;
        System.out.println("Welcome to the Interview Process");
        int choice;
        do {
            System.out.println("\n1. Add a Candidate");
            System.out.println("2. Start the Interview");
            System.out.println("3. Complete the Interview for the Current Candidate");
            System.out.println("4. View the Next Candidate to be Interviewed");
            System.out.println("5. Number of Candidates Yet to Complete the Interview");
            System.out.println("6. Number of Candidates Who Have Completed the Interview");
            System.out.println("7. View the Currently Interviewing Candidate");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter the candidate ID: ");
                    String id = sc.next();
                    System.out.print("Enter the candidate name: ");
                    String name = sc.next();
                    System.out.print("Enter the years of experience: ");
                    String yoe = sc.next();
                    System.out.print("Enter the topic the candidate is strong in: ");
                    String str = sc.next();
                    queue.offer(new Candidate(id, name, yoe, str));
                    totalNoOfCandidates++;
                    System.out.println("Candidate added successfully.");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No candidates are remaining for the interview.");
                    } else {
                        isInterviewStarted = true;
                        System.out.println("The interview has started for " + queue.peek().getName());
                    }
                    break;

                case 3:
                    if (isInterviewStarted) {
                        System.out.println("Interview finished for " + queue.peek().getName());
                        noOfCandidatesCompletedInterview++;
                        queue.poll();
                        isInterviewStarted = false;
                    } else {
                        System.out.println("The interview has not started yet.");
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("No more candidates are in the interview queue.");
                    } else if(isInterviewStarted){
                        Candidate current = queue.poll();
                        System.out.println(queue.peek());
                        queue.offerFirst(current);
                    }else{
                        System.out.println(queue.isEmpty() ?"No more candidates are in the interview queue.":"The next candidate is " + queue.peek());
                    }
                    break;

                case 5:
                    System.out.println("There are " + (totalNoOfCandidates - noOfCandidatesCompletedInterview) + " candidates yet to complete the interview.");
                    break;

                case 6:
                    System.out.println("There are " + noOfCandidatesCompletedInterview + " candidates who have completed the interview.");
                    break;

                case 7:
                    if (isInterviewStarted) {
                        System.out.println(queue.peek().getName() + " is the currently interviewing candidate.");
                    } else {
                        System.out.println("The interview has not started yet.");
                    }
                    break;

                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice. Please try again.");
                    }
            }
        } while (choice != 0);
        sc.close();
    }
}
