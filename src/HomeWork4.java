

import java.util.Scanner;

public class HomeWork4 {
   static String mainText = "Witch task do you want to run? Enter from 1 to 6 or exit to finish.";

    public static void main(String[] args)  {

        System.out.println(mainText);
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        while(exit) {
            switch (in.nextLine()) {
                case "1":
                    MultiplicationTableOneWay();
                    break;
                case "2":
                    MultiplicationTableAnotherWay();
                    break;
                case "3":
                    theWord();
                    break;
                case "4":
                    theReversWord();
                    break;
                case "5":
                    letterReplacing();
                    break;
                case "6":
                    reversArea();
                    break;
                case "EXIT":
                case "Exit":
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Unknown option. Try again.");
                    break;
            }
        }
    }

    static void MultiplicationTableOneWay() {
        System.out.println("First Task: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d %s %d %s %-6d ", j, "x", i, "=", (i * j));
            }
            System.out.println();
        }
        System.out.println(mainText);
    }

    static void MultiplicationTableAnotherWay() {
        System.out.println("Second Task: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d %s %d %s %-6d ", i, "x", j, "=", (i * j));
            }
            System.out.println();
        }
        System.out.println(mainText);
    }


    static void theWord() {
        System.out.println("Third Task: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word or print next to continue");
        boolean next = true;
        while (next) {
            if (input.equals("next")) {
                next = false;
                break;
            }

                if (input.hasNextInt()) {
                    System.out.println("Please enter a word not a number");
                    break;
                } else {
                    String word = input.next();
                    System.out.println("It has - " + word.length() + " symbols. Enter the symbol position you want to display.");
                    try {
                        int position = Integer.parseInt(input.next());
                        if (position > word.length()) {
                            System.out.println("You entered out of bound position. Enter new word");

                        } else {
                            position--;
                            System.out.println("Result: " + word.charAt(position));
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("You type a letter not a number.Please enter new word.");
                    }
                }
            }
            System.out.println(mainText);
        }


    static void theReversWord()  {
        System.out.println("Fourth Task: ");
        String word = "cappuccino";
        System.out.println("Original: " + word);
        StringBuilder reversWord = new StringBuilder();
        reversWord.append(word);
        System.out.println("Result: " + reversWord.reverse());
        System.out.println(mainText);
    }
        static void letterReplacing() {
            System.out.println("Fifth Task: ");
            String sentence = "Дано предложение. Заменить в предложении все буквы е на и. Вывести на печать";
            System.out.println("Original: " + sentence);
            System.out.println("Result: " + sentence.replace('е','и'));
            System.out.println(mainText);
        }
        static void reversArea() {
            System.out.println("Sixth Task: ");
            String longWord = "acknowledgement";
            System.out.println("Original: " + longWord);

            Scanner range = new Scanner(System.in);
            System.out.println("Enter the first letter of the revers area");

            try {
            char fromTheLetter = range.next().charAt(0);
            char s = choice(fromTheLetter);
            System.out.println("Enter the last letter of the revers area");
            char toTheLetter = range.next().charAt(0);
            char e = choice(toTheLetter);
            int start = longWord.indexOf(s);
            int end = longWord.lastIndexOf(e);
            end++;
            String extractArea = longWord.substring(start, end);
            StringBuilder reverseArea = new StringBuilder(extractArea);
            reverseArea.reverse();
            String replaceArea = reverseArea.toString();
            String result = longWord.replaceAll(extractArea, replaceArea);
            System.out.println("Result: " + result);
            System.out.println(mainText);

            } catch (Exception e) {
                System.out.println("You type the letters that don't exist." + mainText);
            }
        }
        public static char choice(char letter) {

                switch (letter) {
                    case 'a':
                        letter = 'a';
                        break;
                    case 'c':
                        letter = 'c';
                        break;
                    case 'k':
                        letter = 'k';
                        break;
                    case 'n':
                        letter = 'n';
                        break;
                    case 'o':
                        letter = 'o';
                        break;
                    case 'w':
                        letter = 'w';
                        break;
                    case 'l':
                        letter = 'l';
                        break;
                    case 'e':
                        letter = 'e';
                        break;
                    case 'd':
                        letter = 'd';
                        break;
                    case 'g':
                        letter = 'g';
                        break;
                    case 'm':
                        letter = 'm';
                        break;
                    case 't':
                        letter = 't';
                        break;
                    default:
                        System.out.println("There is no such letter.");
                        break;
                }
                return letter;
            }
    }

