import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    static Stack<Stage> stack = new Stack<>();

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        stack.add(new Stage(0, 0));
        display(stack.peek());
        while (true) {
            if (!stack.peek().isTamil()) System.out.print("Enter your choice:");
            else System.out.print("உங்கள் விருப்பத்தை உள்ளிடவும்:");

            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice == 9) {
                if (stack.isEmpty()) break;
                stack.pop();
                display(stack.peek());
            } else {
                stack.add(new Stage(stack.peek().getLevel() + 1, choice));
                display(stack.peek());
            }
        }
        sc.close();
    }

    public static void display(Stage s) {
        for (String option : getOptions(s)) {
            System.out.println(option);
        }
    }

    public static List<String> getOptions(Stage s) {
        List<String> op = new ArrayList<>();
        if (s.getLevel() == 0) {
            op.add("1. ENGLISH");
            op.add("2. தமிழ்");
        } else if (s.getLevel() == 1) {
            switch (s.getChoice()) {
                case 1:
                    s.setTamil(false);
                    op.add("1. Recharge");
                    op.add("2. Caller Tune");
                    op.add("3. Special Offer");
                    op.add("9. Back");
                    op.add("0. Exit");
                    break;
                case 2:
                    s.setTamil(true);
                    op.add("1. ரீசார்ஜ்");
                    op.add("2. அழைப்பாளர் டியூன்");
                    op.add("3. சிறப்பு சலுகை");
                    op.add("9. பின்னால் செல்ல");
                    op.add("0. வெளியேறு");
                    break;
            }
        } else if (s.getLevel() == 2) {
            if (!s.isTamil()) {
                switch (s.getChoice()) {
                    case 1:
                        op.add("1. 265=UL call+1GB/D,28D");
                        op.add("2. 479=UL call+1.5GB/D,56D");
                        op.add("3. 299=UL call+1.5GB/D28D");
                        op.add("4. 549=UL call+25GB/D,56D");
                        op.add("5. 777=UL call+2.0GB/D,70D");
                        op.add("9. Back");
                        op.add("0. Exit");
                        break;
                    case 2:
                        op.add("1. Arabic Kuthu");
                        op.add("2. Mudhal Nee Mudivu Nee");
                        op.add("3. Naaga Vera Maari");
                        op.add("4. Two Two Two");
                        op.add("9. Back");
                        op.add("0. Exit");
                        break;
                    case 3:
                        op.add("1. 265=UL call+1GB/D,28D");
                        op.add("2. 479=UL call+1.5GB/D,56D");
                        op.add("3. 299=UL call+1.5GB/D28D");
                        op.add("4. 549=UL call+25GB/D,56D");
                        op.add("9. Back");
                        op.add("0. Exit");
                }
            } else {
                switch (s.getChoice()) {
                    case 1:
                        op.add("1. 265=UL call+1GB/D,28D");
                        op.add("2. 479=UL call+1.5GB/D,56D");
                        op.add("3. 299=UL call+1.5GB/D28D");
                        op.add("4. 549=UL call+25GB/D,56D");
                        op.add("5. 777=UL call+2.0GB/D,70D");
                        op.add("9. பின்னால் செல்ல");
                        op.add("0. வெளியேறு");
                        break;
                    case 2:
                        op.add("1. அரபு குத்து");
                        op.add("2. முதல் நீ முடிவு நீ");
                        op.add("3. நாக வேர மாரி");
                        op.add("4. டு டு டு");
                        op.add("9. பின்னால் செல்ல");
                        op.add("0. வெளியேறு");
                        break;
                    case 3:
                        op.add("1. 265=UL call+1GB/D,28D");
                        op.add("2. 479=UL call+1.5GB/D,56D");
                        op.add("3. 299=UL call+1.5GB/D28D");
                        op.add("4. 549=UL call+25GB/D,56D");
                        op.add("9. பின்னால் செல்ல");
                        op.add("0. வெளியேறு");
                }
            }
        } else if (s.getLevel() == 3) {
            if (!s.isTamil()) {
                op.add("Thanks You");
                op.add("9. Back");
                op.add("0. Exit");
            } else {
                op.add("நன்றி");
                op.add("9. பின்னால் செல்ல");
                op.add("0. வெளியேறு");
            }
        }
        return op;
    }
}


