
// ShellCommandHandler.java
// מחלקה זו אחראית לטיפול בפקודות הקלט מהמשתמש

import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("לא ניתן לקרוא את התיקייה.");
        }
    }

    public void changeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir;
        } else {
            System.out.println("התיקייה לא קיימת.");
        }
    }

    public void makeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (newDir.mkdir()) {
            System.out.println("התיקייה נוצרה.");
        } else {
            System.out.println("לא ניתן ליצור את התיקייה.");
        }
    }

    public void createFile(String name) {
        File newFile = new File(currentDirectory, name);
        try {
            if (newFile.createNewFile()) {
                System.out.println("הקובץ נוצר.");
            } else {
                System.out.println("לא ניתן ליצור את הקובץ.");
            }
        } catch (IOException e) {
            System.out.println("שגיאה ביצירת הקובץ: " + e.getMessage());
        }
    }

    public void printHelp() {
        System.out.println("פקודות זמינות:");
        System.out.println("pwd - הדפסת הנתיב הנוכחי");
        System.out.println("ls - הצגת תוכן התיקייה");
        System.out.println("cd <שם> - שינוי תיקייה");
        System.out.println("mkdir <שם> - יצירת תיקייה");
        System.out.println("touch <שם> - יצירת קובץ");
        System.out.println("help - הדפסת עזרה");
        System.out.println("exit - יציאה");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}
