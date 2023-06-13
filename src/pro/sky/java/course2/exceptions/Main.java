package pro.sky.java.course2.exceptions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {


        printDef();
        System.out.println("Тест 1");
        toLogin("Ffsadf23","a-sdfgh","a-sdfgh");
        printDef();
        System.out.println("Тест 2");
        toLogin("Ffsadf23","a_sdfgh","a_sdfgh");
        printDef();
        System.out.println("Тест 3");
        toLogin("Ffsыафпadf23","a_sdfgh","a_sdfgh");
        printDef();
        System.out.println("Тест 4");
        toLogin("Ffsadf23","S_sdfgh","a_sdfgh");
        printDef();

    }

    private static void printDef() {
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public static void toLogin(String login, String password, String confirmPassword) {

        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
            System.out.println("Авторизация выполнена!");
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Логин может содержать только английские символы, цифры и подчеркивания");
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Пароли не совпадают либо содержат символы отличные от латиницы, цифр и нижнего подчеркивания");
        }
        finally {
            System.out.println("Тестирование авторизации завершено");
        }

    }

    private static void checkLogin(String login) {
        String template = "([0-9A-Za-z_])";
        if (login.length() > 20 || !Arrays.asList(login.split("")).stream().allMatch(text -> isMatchingRegexp(text, template))) {
            throw new WrongLoginException("Логин не может быть длиннее 20 символов и может содержать только английские символы, цифры и подчеркивания");
        }
    }

    private static void checkPassword(String password, String confirmPassword) {
        String template = "([0-9A-Za-z_])";
        if (password.length() > 20 || !Arrays.asList(password.split("")).stream().allMatch(text -> isMatchingRegexp(text, template))) {
            throw new WrongPasswordException("Пароль не может быть длиннее 20 символов и может содержать только английские символы, цифры и подчеркивания");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }

    private static boolean isMatchingRegexp(final String text, final String template)
    {
        Pattern pattern = null;
        try
        {
            pattern = Pattern.compile(template);
        }
        catch(PatternSyntaxException e)
        {
            e.printStackTrace();
        }
        if(pattern == null)
        {
            return false;
        }
        final Matcher regexp = pattern.matcher(text);
        return regexp.matches();
    }

}
