package com.example.effectivejava.etc;

public class ErrorTest {
    public static void main(String args[]) throws ArithmeticException {
        try {
            install();
        } catch (Exception e) {
            System.out.println(3);
            e.printStackTrace();
        } finally {
            System.out.println("종료");
        }
    }

    static void install() throws InstallException {
        try {
            System.out.println(1);
            startInstall();
            System.out.println(9);
            copyFiles();
        } catch (SpaceException | MemoryException se) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(se);
            System.out.println("Space error handling");
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            System.out.println(2);
            throw new SpaceException("Not enough space");
        }

        if (!enoughMemory()) {
            throw new MemoryException("Not enough memoery");
        }

    }

    static void copyFiles() {
        System.out.println("Copy files");
    }

    static void deleteTempFiles() {
        System.out.println("Delete temp files");
    }

    static boolean enoughSpace() {
        System.out.println("Space check");
        return true;
    }

    static boolean enoughMemory() {
        System.out.println("Memory check");
        return true;
    }

    static class InstallException extends Exception {
        InstallException(String message) {
            super(message);
        }
    }

    static class SpaceException extends Exception {
        SpaceException(String message) {
            super(message);
        }
    }

    static class MemoryException extends Exception {
        MemoryException(String message) {
            super(message);
        }
    }
    void chained() {
        ArithmeticException arithmeticException = new ArithmeticException();
        StringIndexOutOfBoundsException boundsException = new StringIndexOutOfBoundsException();

        Throwable throwable = boundsException.initCause(arithmeticException);

        System.out.println(boundsException + " is caused by " + boundsException.getCause());

    }


}
