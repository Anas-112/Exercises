
# MiniShell – תיעוד הפרויקט

## תיאור כללי

MiniShell היא תוכנה פשוטה בשפת Java המדמה מסוף (Terminal) בסיסי. המשתמש יכול להריץ פקודות כמו:
- `pwd` – הדפסת הנתיב הנוכחי
- `ls` – הצגת תוכן התיקייה
- `cd` – שינוי תיקייה
- `mkdir` – יצירת תיקייה
- `touch` – יצירת קובץ
- `help` – הצגת עזרה
- `exit` – יציאה מהתוכנית

## הוראות לקימפול והרצה

1. ודא שקבצי המקור (`MiniShell.java`, `ShellCommandHandler.java`) נמצאים באותה תיקייה.
2. קומפילציה:
```bash
javac MiniShell.java ShellCommandHandler.java
```
3. הרצה:
```bash
java MiniShell
```

## דוגמה לשימוש

```
/home/user > pwd
/home/user

/home/user > mkdir projects

/home/user > cd projects

/home/user/projects > touch notes.txt

/home/user/projects > ls
notes.txt

/home/user/projects > help
פקודות זמינות:
pwd - הדפסת הנתיב הנוכחי
ls - הצגת תוכן התיקייה
cd <שם> - שינוי תיקייה
mkdir <שם> - יצירת תיקייה
touch <שם> - יצירת קובץ
help - הדפסת עזרה
exit - יציאה
```

## תיעוד לקוד

### קובץ ShellCommandHandler.java

- `ShellCommandHandler()` – בנאי שמאתחל את התיקייה הנוכחית לפי מערכת ההפעלה
- `printWorkingDirectory()` – מציג את הנתיב המלא של התיקייה הנוכחית
- `listDirectory()` – מדפיס את שמות כל הקבצים והתיקיות בתיקייה הנוכחית
- `changeDirectory(String name)` – מחליף את התיקייה לתיקיית-בן לפי שם
- `makeDirectory(String name)` – יוצר תיקייה חדשה בתיקייה הנוכחית
- `createFile(String name)` – יוצר קובץ חדש
- `printHelp()` – מדפיס את רשימת הפקודות הזמינות
- `getCurrentDirectory()` – מחזיר את האובייקט של התיקייה הנוכחית

### קובץ MiniShell.java

- `main()` – לולאת הפקודות שמקבלת קלט מהמשתמש, מנתחת את הפקודה ומבצעת את הפעולה דרך המחלקה `ShellCommandHandler`
