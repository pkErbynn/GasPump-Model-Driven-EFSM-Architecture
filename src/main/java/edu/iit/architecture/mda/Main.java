package edu.iit.architecture.mda;

import edu.iit.architecture.mda.AbstractFactory.GasPumpFactory1;
import edu.iit.architecture.mda.AbstractFactory.GasPumpFactory2;
import edu.iit.architecture.mda.Models.GasPump1;
import edu.iit.architecture.mda.Models.GasPump2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");

        int pumpType;

        try{
            pumpType = Integer.parseInt(scan.readLine());
            switch (pumpType){
                case 1:
                    GasPumpFactory1 f1 = new GasPumpFactory1();
                    GasPump1 gp1 = new GasPump1(f1);

                    System.out.println(
                            "GasPump-1 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) Activate(int a) " +
                                    "\n(1) Start() " +
                                    "\n(2) PayCredit() " +
                                    "\n(3) Reject()" +
                                    "\n(4) Cancel() " +
                                    "\n(5) Approved() " +
                                    "\n(6) PayCash(int) " +
                                    "\n(7) StartPump() " +
                                    "\n(8) Pump() " +
                                    "\n(9) StopPump" +
                                    "\n(q). Quit the program" +
                                    "\n-------------------------"
                    );
                    char ch ='1';
                    Scanner sc = new Scanner(System.in);

                    while (ch != 'q') {
//                        gp1.printOperations();

                        System.out.print("Select Operation: ");
                        System.out.print("\n");
                        System.out.print("0-Activate," +
                                "\n1-Start," +
                                "\n2-PayCredit," +
                                "\n3-Reject," +
                                "\n4-Cancel," +
                                "\n5-Approved," +
                                "\n6-PayCash," +
                                "\n7-StartPump, " +
                                "\n8-Pump, " +
                                "\n9-StopPump, " +
                                "\nq-quit");
                        System.out.print("\n");

                        ch = sc.next().charAt(0);

//                        input = scan.readLine();
                        switch (ch) {
                            case '0': { // Activate
                                System.out.print("  Operation:  Activate(int a)");
                                System.out.print("\n");
                                System.out.print("  Enter value of the parameter a:");
                                System.out.print("\n");
                                int a = sc.nextInt();
                                gp1.activate(a);

                                break;
                            }

                            case '1': { // Start
                                System.out.print("  Operation:  Start()");
                                System.out.print("\n");
                                gp1.start();
                                break;
                            }

                            case '2': { // PayCredit
                                System.out.print("  Operation:  PayCredit()");
                                System.out.print("\n");
                                gp1.payCredit();
                                break;
                            }

                            case '3': { // Reject
                                System.out.print("  Operation:  Reject()");
                                System.out.print("\n");
                                gp1.reject();
                                break;
                            }

                            case '4': { // Cancel
                                System.out.print("  Operation:  Cancel()");
                                System.out.print("\n");
                                gp1.cancel();
                                break;
                            }

                            case '5': { // Approved
                                System.out.print("  Operation:  Approved()");
                                System.out.print("\n");
                                gp1.approved();
                                break;
                            }

                            case '6':
                            { //PayCash
                                System.out.print("  Operation:  PayCash(int c)");
                                System.out.print("\n");
                                System.out.print("  Enter value of the parameter c:");
                                System.out.print("\n");
                                int c =  sc.nextInt();
                                gp1.payCash(c);
                                break;
                            }

                            case '7':
                            { //StartPump
                                System.out.print("  Operation:  StartPump()");
                                System.out.print("\n");
                                gp1.startPump();
                                break;
                            }


                            case '8':
                            { //Pump
                                System.out.print("  Operation: Pump()");
                                System.out.print("\n");
                                gp1.pump();
                                break;
                            }

                            case '9':
                            { //StopPump
                                System.out.print("  Operation:  StopPump()");
                                System.out.print("\n");
                                gp1.stopPump();
                                break;
                            }


                            default: { // Anything else: unknown / unsupported operation
                                System.out.println("Unknown operation.");
                                break;
                            }

                        } // endswitch
                    }

                    System.out.println("Ended");
                    break;




                case 2:

                    GasPumpFactory2 f2 = new GasPumpFactory2();
                    GasPump2 gp2 = new GasPump2(f2);

                    System.out.println(
                            "GasPump-1 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) Activate(int a) " +
                                    "\n(1) Start() " +
                                    "\n(2) PayCredit() " +
                                    "\n(3) Reject()" +
                                    "\n(4) Cancel() " +
                                    "\n(5) Approved() " +
                                    "\n(6) PayCash(int) " +
                                    "\n(7) StartPump() " +
                                    "\n(8) Pump() " +
                                    "\n(9) StopPump" +
                                    "\n(q). Quit the program" +
                                    "\n-------------------------"
                    );
                    char ch2 ='1';
                    Scanner sc2 = new Scanner(System.in);

                    while (ch2 != 'q') {
//                        gp1.printOperations();

                        System.out.print("Select Operation: ");
                        System.out.print("\n");
                        System.out.print("0-Activate," +
                                "\n1-Start," +
                                "\n2-PayCash," +
                                "\n3-Cancel," +
                                "\n4-Premium," +
                                "\n5-Regular," +
                                "\n6-Diesel," +
                                "\n7-StartPump, " +
                                "\n8-PumpGallon, " +
                                "\n9-Stop, " +
                                "\nx-Receipt, " +
                                "\ny-NoReceipt, " +
                                "\nq-quit");
                        System.out.print("\n");

                        ch = sc2.next().charAt(0);

                        switch (ch) {
                            case '0': { // Activate
                                System.out.print("  Operation:  Activate(float, f, f)");
                                System.out.print("\n");
                                System.out.print("  Enter value of the parameter a:");
                                System.out.print("\n");
                                float a = sc2.nextFloat();
                                System.out.print("  Enter value of the parameter b:");
                                System.out.print("\n");
                                float b = sc2.nextFloat();
                                System.out.print("  Enter value of the parameter c:");
                                System.out.print("\n");
                                float c = sc2.nextFloat();
                                gp2.activate(a, b, c);

                                break;
                            }

                            case '1': { // Start
                                System.out.print("  Operation:  Start()");
                                System.out.print("\n");
                                gp2.start();
                                break;
                            }

                            case '2': { // PayCash
                                System.out.print("  Operation:  PayCash()");
                                System.out.print("\n");
                                int c = sc2.nextInt();
                                System.out.print("  Enter cash:");
                                gp2.payCash(c);
                                break;
                            }

                            case '3': { // Cancel
                                System.out.print("  Operation:  Cancel()");
                                System.out.print("\n");
                                gp2.cancel();
                                break;
                            }

                            case '4': { // Premium
                                System.out.print("  Operation:  Premium()");
                                System.out.print("\n");
                                gp2.premium();
                                break;
                            }

                            case '5': { // Premium
                                System.out.print("  Operation:  Regular()");
                                System.out.print("\n");
                                gp2.regular();
                                break;
                            }

                            case '6': { // Diesel
                                System.out.print("  Operation:  Diesel()");
                                System.out.print("\n");
                                gp2.diesel();
                                break;
                            }

                            case '7':
                            { //StartPump
                                System.out.print("  Operation:  StartPump()");
                                System.out.print("\n");
                                gp2.startPump();
                                break;
                            }

                            case '8': { // PumpGallon
                                System.out.print("  Operation:  PumpGallon()");
                                System.out.print("\n");
                                gp2.pumpGallon();
                                break;
                            }

                            case '9': { // Stop
                                System.out.print("  Operation:  Stop()");
                                System.out.print("\n");
                                gp2.stop();
                                break;
                            }

                            case 'x': { // Receipt
                                System.out.print("  Operation:  Receipt()");
                                System.out.print("\n");
                                gp2.receipt();
                                break;
                            }

                            case 'y': { // NoReceipt
                                System.out.print("  Operation:  NoReceipt()");
                                System.out.print("\n");
                                gp2.noReceipt();
                                break;
                            }

                            default: { // Anything else: unknown / unsupported operation
                                System.out.println("Unknown operation.");
                                break;
                            }

                        } // endswitch
                    }

                    System.out.println("Ended");

                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        }
        catch (Exception ex)
        {
            System.out.println("Error occurred. Ending program...");
            System.exit(1);
        }
    }
}