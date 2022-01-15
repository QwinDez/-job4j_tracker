package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println(active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Страница не найдена");
        error.printError();
        Error err = new Error();
        err.printError();
    }
}
