import java.util.Scanner;
public class TextBasedGame {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Gargantuan Cave! We are standing at the entrance. In this game, you will have to figure out which commands the program can follow. We'll give" + "\nyou a hint: the program responds to two-word commands such as 'Go forward.' You cannot go backwards or redo your steps. The aim is to get out of the cave. Good luck" + "\nand enjoy!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("Go forward")) {
            String safeResult = safeSpace();
            String safeInput = scanner.nextLine();
            if(safeResult.equals("wrong answer")) {
                youLose();
                return;
            }
            if(safeInput.equals("Go forward")) {
                String katieResult = katieSpace();
                String katieInput = scanner.nextLine();
                if(katieResult.equals("wrong answer")) {
                    youLose();
                    return;
                }
                if (katieResult.equals("answer") && katieInput.equals("Go forward")) {
                    String foodResult = foodSpace();
                    String foodInput = scanner.nextLine();
                    if(foodResult.equals("wrong answer")) {
                        youLose();
                        return;
                    }
                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                        String waterResult = waterSpace();
                        String waterInput = scanner.nextLine();
                        if(waterResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                            endingPoint();
                            return;
                        }
                        if(waterResult.equals("answer") && waterInput.equals("Go right")) {
                            foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                String bearResult = bearSpace();
                                if(bearResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String bearInput = scanner.nextLine();
                                if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;

                    }
                    if(foodResult.equals("answer") && foodInput.equals("Go right")) {
                        safeResult = safeSpace();
                        if(safeResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        safeInput = scanner.nextLine();
                        if(safeInput.equals("Go forward")) {
                            foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                String bearResult = bearSpace();
                                if(bearResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String bearInput = scanner.nextLine();
                                if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                String waterResult = waterSpace();
                                String waterInput = scanner.nextLine();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    inputError();
                    return;
                }
                if(katieResult.equals("answer") && katieInput.equals("Go right")) {
                    String waterResult = waterSpace();
                    String waterInput = scanner.nextLine();
                    if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                        safeResult = safeSpace();
                        if(safeResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        safeInput = scanner.nextLine();
                        if(safeResult.equals("answer") && safeInput.equals("Go left")) {
                            String foodResult = foodSpace();
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                waterInput = scanner.nextLine();
                                if(waterResult.equals("Go right")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    inputError();
                    return;
                }
                inputError();
                return;
            }
            if(safeInput.equals("Go right")) {
                String rhinoResult = rhinoSpace();
                String rhinoInput = scanner.nextLine();
                if(rhinoResult.equals("answer") && rhinoInput.equals("Go forward")) {
                    String waterResult = waterSpace();
                    String waterInput = scanner.nextLine();
                    if(waterResult.equals("wrong answer")) {
                        youLose();
                        return;
                    }
                    if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                        safeResult = safeSpace();
                        if(safeResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        safeInput = scanner.nextLine();
                        if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                            String foodResult = foodSpace();
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                String bearResult = bearSpace();
                                if(bearResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String bearInput = scanner.nextLine();
                                if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                    endingPoint();

                                    return;
                                }
                                inputError();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        if(safeInput.equals("Go left")) {
                            String foodResult = foodSpace();
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                               String bearResult = bearSpace();
                               if(bearResult.equals("wrong answer")) {
                                   youLose();
                                   return;
                               }
                               String bearInput = scanner.nextLine();
                               if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                   endingPoint();
                                   return;
                               }
                               inputError();
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    if(waterResult.equals("answer") && waterInput.equals("Go left")) {
                        String katieResult = katieSpace();
                        String katieInput = scanner.nextLine();
                        if(katieResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        if(katieResult.equals("answer") && katieInput.equals("Go forward")) {
                            String foodResult = foodSpace();
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                endingPoint();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go right")) {
                                safeResult = safeSpace();
                                if(safeResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                safeInput = scanner.nextLine();
                                if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                        waterResult = waterSpace();
                                        if(waterResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        waterInput = scanner.nextLine();
                                        if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    inputError();
                    return;
                }
                inputError();
                return;
            }
            inputError();
            return;
        }
        if(input.equals("Go right")) {
            String tigerResult = tigerSpace();
            if(tigerResult.equals("wrong answer")) {
                youLose();
                return;
            }
            String tigerInput = scanner.nextLine();
            if(tigerResult.equals("answer") && tigerInput.equals("Go forward")) {
                String rhinoResult = rhinoSpace();
                if(rhinoResult.equals("wrong answer")) {
                    youLose();
                    return;
                }
                String rhinoInput = scanner.nextLine();
                if(rhinoResult.equals("answer") && rhinoInput.equals("Go forward")) {
                    String waterResult = waterSpace();
                    if(waterResult.equals("wrong answer")) {
                        youLose();
                        return;
                    }
                    String waterInput = scanner.nextLine();
                    if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                        String safeResult = safeSpace();
                        if(safeResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        String safeInput = scanner.nextLine();
                        if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                            String foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                String bearResult = bearSpace();
                                if(bearResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String bearInput = scanner.nextLine();
                                if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                waterInput = scanner.nextLine();
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        if(safeResult.equals("answer") && safeInput.equals("Go left")) {
                            String foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                waterInput = scanner.nextLine();
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go right")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    if (waterResult.equals("answer") && waterInput.equals("Go left")) {
                        String katieResult = katieSpace();
                        if(katieResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        String katieInput = scanner.nextLine();
                        if(katieResult.equals("answer") && katieInput.equals("Go forward")) {
                            String foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                waterInput = scanner.nextLine();
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go right")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go right")) {
                                String safeResult = safeSpace();
                                if (safeResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String safeInput = scanner.nextLine();
                                if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                        waterResult = waterSpace();
                                        if(waterResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        waterInput = scanner.nextLine();
                                        if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    inputError();
                    return;
                }
                if(rhinoResult.equals("answer") && rhinoInput.equals("Go left")) {
                    String safeResult = safeSpace();
                    if(safeResult.equals("wrong answer")) {
                        youLose();
                        return;
                    }
                    String safeInput = scanner.nextLine();
                    if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                        String katieResult = katieSpace();
                        if(katieResult.equals("wrong answer")) {
                            youLose();
                            return;
                        }
                        String katieInput = scanner.nextLine();
                        if(katieResult.equals("answer") && katieInput.equals("Go forward")) {
                            String foodResult = foodSpace();
                            if(foodResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            String foodInput = scanner.nextLine();
                            if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                String waterResult = waterSpace();
                                if(waterResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                String waterInput = scanner.nextLine();
                                if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                    endingPoint();
                                    return;
                                }
                                if(waterResult.equals("answer") && waterInput.equals("Go right")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if(foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            if(foodResult.equals("answer") && foodInput.equals("Go right")) {
                                safeResult = safeSpace();
                                if(safeResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                safeInput = scanner.nextLine();
                                if(safeResult.equals("answer") && safeInput.equals("Go forward")) {
                                    foodResult = foodSpace();
                                    if(foodResult.equals("wrong answer")) {
                                        youLose();
                                        return;
                                    }
                                    foodInput = scanner.nextLine();
                                    if (foodResult.equals("answer") && foodInput.equals("Go forward")) {
                                        String bearResult = bearSpace();
                                        if(bearResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String bearInput = scanner.nextLine();
                                        if(bearResult.equals("answer") && bearInput.equals("Go left")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    if(foodResult.equals("answer") && foodInput.equals("Go left")) {
                                        String waterResult = waterSpace();
                                        if(waterResult.equals("wrong answer")) {
                                            youLose();
                                            return;
                                        }
                                        String waterInput = scanner.nextLine();
                                        if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                            endingPoint();
                                            return;
                                        }
                                        inputError();
                                        return;
                                    }
                                    inputError();
                                    return;
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        if(katieResult.equals("answer") && katieInput.equals("Go right")) {
                            String waterResult = waterSpace();
                            if(waterResult.equals("wrong answer")) {
                                youLose();
                                return;
                            }
                            String waterInput = scanner.nextLine();
                            if(waterResult.equals("answer") && waterInput.equals("Go forward")) {
                                safeResult = safeSpace();
                                if(safeResult.equals("wrong answer")) {
                                    youLose();
                                    return;
                                }
                                safeInput = scanner.nextLine();
                                if(safeResult.equals("answer") && safeResult.equals("Go forward")) {
                                    String foodResult = foodSpace();
                                }
                                if(safeResult.equals("answer") && safeResult.equals("Go left")) {
                                    String foodResult = foodSpace();
                                }
                                inputError();
                                return;
                            }
                            inputError();
                            return;
                        }
                        inputError();
                        return;
                    }
                    inputError();
                    return;
                }
                inputError();
                return;
            }
            inputError();
            return;
        }
        inputError();
        return;
    }

    // 1. losing message!
    public static void youLose() {
        System.out.println("You lost, sorry! Try again by rerunning the program.");
    }

    //2. can't understand input
    public static void inputError() {
        System.out.println("Sorry, the compiler can't process your command. Try again by rerunning the program.");
    }

    // 3. ending point
    public static String endingPoint() {
        System.out.println("Congratulations! You have successfully escaped the cave and won the game. To play again, rerun the program!");
        return "answer";
    }

    // 3. safe space
    public static String safeSpace() {
        System.out.println("Great! You are in a safe space. Please enter your next command.");
        return "answer";
    }

    // 4. tiger number
    public static String tigerSpace() {
        System.out.println("Oh no! You have reached a tiger. The tiger has designated a two-digit number between 25 and 50. Please guess the number.");
        Scanner tigerScanner = new Scanner(System.in);
        int input = tigerScanner.nextInt();
        if (input == 49) {
            System.out.println("Good job! You have successfully passed the tiger challenge. Please enter a new command.");
            return "answer";
        }
        return "wrong answer";
    }

    // 5. rhino challenge
    public static String rhinoSpace() {
        System.out.println("Oh dear! You have encountered a rhino. The rhino's horn is capable of moving up to 68,000 kilograms and you want to build a rock big enough to block you from getting" + "\nhit. We will do this by multiplying two numbers. Please input the first number.");
        Scanner rhinoScanner = new Scanner(System.in);
        int a = rhinoScanner.nextInt();
        System.out.println("Please input the next number.");
        int b = rhinoScanner.nextInt();
        if (a * b > 68000) {
            System.out.println("Congratulations! The rock you made is heavier than the rhino can lift. Please enter your next command.");
            return "answer";
        }
        return "wrong answer";
    }

    // 6. katie challenge
    public static String katieSpace() {
        System.out.println("Yikes! You have reached Katie. She loves crunching numbers, so give her a few numbers to play with. If your result falls in the range of 100 to 150 (inclusive), you" + "\nlose! Please enter the first number.");
        Scanner katieScanner = new Scanner(System.in);
        int a = katieScanner.nextInt();
        System.out.println("Please input the next number.");
        int b = katieScanner.nextInt();
        System.out.println("Please input the last number.");
        int c = katieScanner.nextInt();
        int abc = (a + b) / c;
        if (abc >= 100 && abc <= 150) {
            return "wrong answer";
        }
        System.out.println("Congratulations! Your answer was " + abc + ", so you have passed Katie! Please enter your next command.");
        return "answer";
    }
    // 7. bear challenge
    public static String bearSpace() {
        System.out.println("Oh my! You have reached a bear. It is growling at you and you think that it is hungry. What will you feed him? Choose between a jar of honey and a salmon fish. Type" + "\n'honey' or 'salmon'.");
        Scanner bearScanner = new Scanner(System.in);
        String bearFoodChoice = bearScanner.nextLine();
        if (bearFoodChoice.equals("honey")) {
            System.out.println("Good job! The bear is now your companion. Please enter your next command.");
            return "answer";
        }
        return "wrong answer";
    }
    // 8. water well
    public static String waterSpace(){
        System.out.println("Hooray! You have reached a water well. To access this well, please enter a four-digit passcode. Hint: the passcode includes two 5s and two 0s.");
        Scanner waterScanner = new Scanner(System.in);
        int passcode = waterScanner.nextInt();
        if(passcode == 5050) {
            System.out.println("Congratulations! You have unlocked the well and accessed the water. Please enter your next command.");
            return "answer";
        }
        youLose();
        return "wrong answer";
    }
    // 9. food bank
    public static String foodSpace(){
        System.out.println("Hooray! You have reached a food bank. We have five total types of food available: biscuits, fish, chicken, oysters, and a lobster. However, one of the choices has" + "\nbeen poisoned and two of them have expired. Please make a choice and type in lowercase.");
        Scanner foodScanner = new Scanner (System.in);
        String foodChoice = foodScanner.nextLine();
        if(foodChoice.equals("fish")) {
            System.out.println("Unfortunately, the fish has been poisoned. Sorry!");
            youLose();
            return null;
        }
        if(foodChoice.equals("biscuits") || foodChoice.equals("chicken")) {
            System.out.println("You have consumed the food, but it was expired and you got food poisoning. Sorry!");
            youLose();
        }
        if(foodChoice.equals("lobster")) {
            System.out.println("Great! You have devoured the lobster and it was delicious. Please enter your next command.");
            return "answer";
        }
        if(foodChoice.equals("oysters")) {
            System.out.println("Great! You have devoured the oysters and they were delicious. Please enter your next command.");
            return "answer";
        }
        return "wrong answer";
    }
}
