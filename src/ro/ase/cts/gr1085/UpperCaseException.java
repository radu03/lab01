package ro.ase.cts.gr1085;

public class UpperCaseException extends Exception {

    @Override
    public String getMessage() {
        return "All letters cannot be upper case";
    }
}
