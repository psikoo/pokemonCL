package com.pokemon;

import java.util.Scanner;

public class Util {

    public static void clearCL() {
        System.out.print("\033c"); //\033[2J
        System.out.flush();
    }

    public static void waitForEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Press enter to continue ...");
        scanner.nextLine();
    }

    public static void banner() {
        Util.clearCL();
        System.out.println("██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗     ██████╗██╗     "); 
        System.out.println("██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║    ██╔════╝██║     "); 
        System.out.println("██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║    ██║     ██║     "); 
        System.out.println("██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║    ██║     ██║     "); 
        System.out.println("██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║    ╚██████╗███████╗"); 
        System.out.println("╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═════╝╚══════╝"); 
        System.out.println("                                                                               v1.0");
        System.out.println("                                                                                   ");
        System.out.println(">----------------------[ Welcome to Pokemon Command & Line ]----------------------<");
        Util.waitForEnter();
    }
}
